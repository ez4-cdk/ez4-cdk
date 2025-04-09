package com.delta.deepread.center.music.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.delta.deepread.center.music.data.Song
import com.delta.deepread.databinding.SongBinding
import com.delta.deepread.databinding.SongFooterBinding

class SongAdapter(
    private val onSongClickImpl: onSongClickInterface
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        private const val TYPE_SONG = 0
        private const val TYPE_FOOTER = 1
    }

    private var songs = ArrayList<Song>()
    private val songNamesSet = mutableSetOf<String>()
    fun initSongs(songs: List<Song>) {
        this.songs.clear()
        this.songs.addAll(songs)
        for (song in songs){
            songNamesSet.add(song.name!!)
        }
        notifyItemRangeInserted(0, songs.size)
    }

    fun addSong(song: Song){
        songs.add(song)
        songNamesSet.add(song.name!!)
        notifyItemInserted(songs.size)
    }

    interface onSongClickInterface{
        fun onSongClick(song: Song)
        fun onFooterClick()
        fun onSongRemove(index: Int)
    }

    inner class SongViewHolder(private val binding: SongBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(song: Song) {
            binding.musicSongName.text = song.name

            binding.root.setOnClickListener {
                onSongClickImpl.onSongClick(song)
            }

            binding.root.setOnLongClickListener {
                showDeleteDialog(song)
                true
            }
        }

        private fun showDeleteDialog(song: Song) {
            val builder = AlertDialog.Builder(binding.root.context)
            builder.setTitle("确认删除")
            builder.setMessage("你确定要删除 ${song.name} 吗？")
            builder.setPositiveButton("删除") { dialog, _ ->
                val index = songs.indexOf(song)
                onSongClickImpl.onSongRemove(index)
                notifyItemRemoved(index)
                songs.removeAt(index)
                dialog.dismiss()
            }
            builder.setNegativeButton("取消") { dialog, _ ->
                dialog.dismiss()
            }
            builder.show()
        }
    }

    inner class FooterViewHolder(private val binding: SongFooterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            binding.root.setOnClickListener {
                onSongClickImpl.onFooterClick()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == TYPE_SONG) {
            return SongViewHolder(
                SongBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        } else {
            return FooterViewHolder(
                SongFooterBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
    }

    override fun getItemViewType(position: Int): Int = if (position == songs.size) {
        TYPE_FOOTER
    } else {
        TYPE_SONG
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is SongViewHolder) {
            holder.bind(songs[position])
        } else if (holder is FooterViewHolder) {
            holder.bind()
        }
    }

    override fun getItemCount(): Int = songs.size + 1

    fun contains(songName:String):Boolean = songNamesSet.contains(songName)

}