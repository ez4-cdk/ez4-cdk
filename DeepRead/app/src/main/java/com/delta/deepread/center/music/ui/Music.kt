package com.delta.deepread.center.music.ui

import android.animation.ObjectAnimator
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.net.Uri
import android.os.IBinder
import android.widget.FrameLayout
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import com.delta.deepread.R
import com.delta.deepread.center.music.data.Song
import com.delta.deepread.center.music.MusicViewModel
import com.delta.deepread.center.music.MusicViewModel.Companion.NO_SONG_EXCEPTION
import com.delta.deepread.center.music.component.MusicService
import com.delta.deepread.common.BaseFragment
import com.delta.deepread.databinding.MusicBinding
import com.delta.deepread.util.file.MP3Helper
import com.delta.deepread.util.file.Selector
import com.google.android.material.bottomsheet.BottomSheetBehavior

class Music : BaseFragment<MusicBinding>(R.layout.music, MusicBinding::inflate),
    SongAdapter.onSongClickInterface, Selector.onHandleUri {

    private val selector = Selector(this, this)
    private lateinit var viewModel: MusicViewModel
    private lateinit var bsb: BottomSheetBehavior<FrameLayout>
    private val adapter = SongAdapter(this)
    private var objectAnimator: ObjectAnimator? = null
    private var musicService: MusicService? = null
    private var isBound = false

    private val serviceConnection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            musicService = (service as MusicService.LocalBinder).getService()
            isBound = true
            viewModel.getAllSongs(requireContext())
        }

        override fun onServiceDisconnected(name: ComponentName?) {
            isBound = false
            musicService = null
        }
    }

    override fun loading() {
    }

    override fun loaded() {
    }

    override fun initView() {
        viewModel = MusicViewModel()
        setUpBottomSheetBehavior()
        viewModel.currentSong.observe(viewLifecycleOwner){
            if (it == null){
                binding.musicSongDetail.text = OVER
                stopMusic()
            }else{
                binding.musicSongDetail.text = it.name
                playMusic()
                musicService?.play(it)
            }
        }

        binding.musicBnv.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.music_opt_mode -> {
                    togglePlaybackMode()
                    true
                }
                R.id.music_opt_last -> {
                    viewModel.prev()
                    true
                }
                R.id.music_opt_stop -> {
                    togglePlayPause()
                    true
                }
                R.id.music_opt_next -> {
                    viewModel.next()
                    true
                }
                R.id.music_opt_list -> {
                    toggleBottomSheet()
                    true
                }
                else -> false
            }
        }

        viewModel.exception.observe(viewLifecycleOwner){
            when(it){
                NO_SONG_EXCEPTION -> {
                    Toast.makeText(requireContext(), "当前列表没有歌曲，请添加...", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.musicListRv.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(requireContext())
        binding.musicListRv.adapter = adapter
        viewModel.songs.observe(viewLifecycleOwner) { songs ->
            adapter.initSongs(songs)
        }

        musicService?.getMediaPlayer()?.setOnCompletionListener {
            if (!viewModel.isLoop.value!!){
                viewModel.next()
            }else{
                viewModel.loop()
            }
        }

        requireActivity().bindService(Intent(requireContext(), MusicService::class.java), serviceConnection, Context.BIND_AUTO_CREATE)
        selector.requestPermissions()
    }

    private fun setUpBottomSheetBehavior() {
        bsb = BottomSheetBehavior.from(binding.musicBsb).apply {
            peekHeight = (activity?.resources?.displayMetrics?.heightPixels ?: 0) / 2
            skipCollapsed = true
            isHideable = true
            isFitToContents = true
        }
        bsb.state = BottomSheetBehavior.STATE_HIDDEN
    }

    private fun togglePlaybackMode() {


        val nextMode = when(binding.musicBnv.menu.findItem(R.id.music_opt_mode).title){
            MODE_SEQUENCE -> MODE_SHUFFLE
            MODE_SHUFFLE -> MODE_SINGLE_LOOP
            MODE_SINGLE_LOOP -> MODE_LIST_LOOP
            else -> MODE_SEQUENCE
        }

        val nextModeIcon = when (nextMode) {
            MODE_SEQUENCE -> R.drawable.mode_sequence
            MODE_SHUFFLE -> R.drawable.mode_shuffle
            MODE_SINGLE_LOOP -> R.drawable.mode_single_loop
            else -> R.drawable.mode_list_loop
        }

        val nextModeInt = when (nextMode) {
            MODE_SEQUENCE -> MODE_SEQUENCE_INT
            MODE_SHUFFLE -> MODE_SHUFFLE_INT
            MODE_SINGLE_LOOP -> MODE_SINGLE_LOOP_INT
            MODE_LIST_LOOP -> MODE_LIST_LOOP_INT
            else -> MODE_SEQUENCE_INT
        }

        if (nextMode == MODE_SINGLE_LOOP){
            viewModel.setLoop(true)
        }else{
            viewModel.setLoop(false)
        }


        viewModel.setMode(nextModeInt)

        binding.musicBnv.menu.findItem(R.id.music_opt_mode).setTitle(nextMode)
        binding.musicBnv.menu.findItem(R.id.music_opt_mode).setIcon(ResourcesCompat.getDrawable(resources, nextModeIcon, null))
    }

    private fun toggleBottomSheet() {
        bsb.state = if (bsb.state == BottomSheetBehavior.STATE_HIDDEN || bsb.state == BottomSheetBehavior.STATE_COLLAPSED) {
            BottomSheetBehavior.STATE_EXPANDED
        } else {
            BottomSheetBehavior.STATE_HIDDEN
        }
    }

    private fun togglePlayPause() {
        if (viewModel.currentSong.value != null){
            if (isPlaying()){
                playMusic()
            }else{
                stopMusic()
            }
        }else{
            viewModel.next()
            runAnimation()
        }
    }

    private fun isPlaying() = binding.musicBnv.menu.findItem(R.id.music_opt_stop).title == "暂停"

    private fun runAnimation() {
        objectAnimator?.cancel()
        objectAnimator = ObjectAnimator.ofFloat(binding.musicSongImg, "rotation", 0f, 360f).apply {
            duration = 2000
            repeatCount = ObjectAnimator.INFINITE
            start()
        }
    }

    private fun stopAnimation() {
        objectAnimator?.end()
        objectAnimator = null
    }

    private fun playMusic(){
        val title = "播放"
        val iconResId = R.drawable.music_opt_run
        binding.musicBnv.menu.findItem(R.id.music_opt_stop).apply {
            setTitle(title)
            setIcon(ResourcesCompat.getDrawable(resources, iconResId, null))
        }

        musicService?.resume()

        runAnimation()
        hideBottomSheetIfExpanded()
    }

    private fun stopMusic(){
        val title = "暂停"
        val iconResId = R.drawable.music_opt_stop
        binding.musicBnv.menu.findItem(R.id.music_opt_stop).apply {
            setTitle(title)
            setIcon(ResourcesCompat.getDrawable(resources, iconResId, null))
        }

        musicService?.pause()

        stopAnimation()
    }

    private fun hideBottomSheetIfExpanded() {
        if (bsb.state == BottomSheetBehavior.STATE_EXPANDED) {
            bsb.state = BottomSheetBehavior.STATE_HIDDEN
        }
    }

    override fun onSongClick(song: Song) {
        viewModel.setCurrentSong(song)
    }

    override fun onFooterClick() {
        selector.requestForMP3File()
    }

    override fun onSongRemove(index: Int) {
        viewModel.removeSong(requireContext(),index)
    }

    override fun onHandle(fileName: String?, uri: Uri) {
        fileName?.let {
            if (adapter.contains(it)) {
                Toast.makeText(requireContext(), "$fileName 已存在,无法再次添加", Toast.LENGTH_SHORT).show()
            } else {
                val song = Song(
                    id = adapter.itemCount,
                    name = fileName,
                    uri = uri,
                    duration = MP3Helper.getMp3Duration(requireContext(), uri),
                    size = MP3Helper.getMp3FileSize(requireContext(), uri)
                )
                adapter.addSong(song)
                viewModel.addSong(song)
                viewModel.writeMP3ToFile(requireContext(), song)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (isBound) {
            requireActivity().unbindService(serviceConnection)
            isBound = false
        }
    }

    companion object {
        private const val MODE_SEQUENCE = "顺序播放"
        private const val MODE_SEQUENCE_INT = 0
        private const val MODE_SHUFFLE = "随机播放"
        private const val MODE_SHUFFLE_INT = 1
        private const val MODE_SINGLE_LOOP = "单曲循环"
        private const val MODE_SINGLE_LOOP_INT = 3
        private const val MODE_LIST_LOOP = "列表循环"
        private const val MODE_LIST_LOOP_INT = 2
        private const val OVER = "已经播放完毕，请重新选曲"
    }
}
