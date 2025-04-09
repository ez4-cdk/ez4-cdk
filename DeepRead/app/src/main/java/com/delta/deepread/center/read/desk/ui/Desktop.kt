package com.delta.deepread.center.read.desk.ui

import android.animation.ObjectAnimator
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.animation.doOnEnd
import androidx.fragment.app.activityViewModels
import com.delta.deepread.R
import com.delta.deepread.center.read.ReadViewModel
import com.delta.deepread.common.BaseFragment
import com.delta.deepread.databinding.ReadBinding

class Desktop : BaseFragment<ReadBinding>(R.layout.read, ReadBinding::inflate) {
    private lateinit var floatingViewRoot: View
    private lateinit var floatingView: View
    private lateinit var floatingMenu: LinearLayout
    private val viewModel: ReadViewModel by activityViewModels()
    private val lock = Any()
    override fun loading() {
    }

    override fun loaded() {
    }

    override fun initView() {
        if (!::floatingViewRoot.isInitialized || floatingViewRoot.parent == null) {
            floatingViewRoot = LayoutInflater.from(requireContext())
                .inflate(R.layout.floating_ball, binding.root, false)
            floatingView = floatingViewRoot.findViewById(R.id.floating_view)
            floatingMenu = floatingViewRoot.findViewById(R.id.floating_menu)
            floatingViewRoot.setOnTouchListener(FloatingViewDragListener())
            floatingViewRoot.elevation = 20f
            binding.root.addView(floatingViewRoot)
        }

        floatingMenu.findViewById<ImageView>(R.id.anchor_point).setOnClickListener {
            val process =
                (
                        (binding.readScrollView.scrollY.toDouble() + binding.readScrollView.height.toDouble())
                                / binding.readScrollView.getChildAt(0).height * 100
                        ).toInt()
            closeFloatingMenu()
            viewModel.saveNovelProcess(requireContext(), process, binding.readScrollView.scrollY)
            Toast.makeText(requireContext(), "保存成功", Toast.LENGTH_SHORT).show()
        }

        viewModel.height.observe(this) {
            it?.let {
                binding.readScrollView.post {
                    binding.readScrollView.smoothScrollTo(0, it)
                }
            }
        }

        viewModel.desktopNovel.observe(this) {
            val currentText = binding.novelContentTextView.text.toString()
            val newText = StringBuilder(currentText).append(it).toString()
            binding.novelContentTextView.text = newText
            viewModel.getHeight()
        }

    }

    // 悬浮球
    inner class FloatingViewDragListener : View.OnTouchListener {
        private var x = 0
        private var y = 0
        private var isDragging = false
        private var rotationAnimator: ObjectAnimator? = null


        private fun startRotationAnimation() {
            rotationAnimator?.cancel() // 取消之前的动画，避免重复
            rotationAnimator = ObjectAnimator.ofFloat(floatingView, "rotation", 0f, 360f, 0f)
            rotationAnimator?.duration = 1000
            rotationAnimator?.repeatCount = ObjectAnimator.INFINITE
            rotationAnimator?.start()
        }

        private fun stopRotationAnimation() {
            rotationAnimator?.end()
            rotationAnimator = null
        }

        override fun onTouch(v: View?, event: MotionEvent?): Boolean {

            when (event?.action) {
                MotionEvent.ACTION_DOWN -> {
                    x = event.rawX.toInt()
                    y = event.rawY.toInt()
                    isDragging = false
                    return true
                }

                MotionEvent.ACTION_MOVE -> {
                    startRotationAnimation()
                    val dx = event.rawX.toInt()
                    val dy = event.rawY.toInt()
                    val sx = dx - x
                    val sy = dy - y
                    x = dx
                    y = dy
                    v?.let {
                        it.x += sx
                        it.y += sy
                    }
                    closeFloatingMenu()
                    isDragging = true
                    return true
                }

                MotionEvent.ACTION_UP -> {
                    stopRotationAnimation()
                    if (!isDragging) {
                        // 点击事件
                        v?.performClick()
                        if (floatingMenu.visibility == View.VISIBLE) {
                            closeFloatingMenu()
                        } else {
                            expandFloatingMenu()
                        }
                    }
                    return true
                }

                else -> {
                    return false
                }
            }
        }


    }

    // 展开悬浮球
    private fun expandFloatingMenu() {
        synchronized(lock) {
            if (floatingMenu.visibility == View.INVISIBLE) {
                floatingMenu.visibility = View.VISIBLE
                ObjectAnimator.ofFloat(
                    floatingMenu,
                    "translationX",
                    -floatingMenu.width.toFloat(),
                    0f
                ).apply {
                    duration = 300
                    start()
                }
            }
        }
    }

    // 收起悬浮球
    private fun closeFloatingMenu() {
        synchronized(lock) {
            if (floatingMenu.visibility == View.VISIBLE) {
                ObjectAnimator.ofFloat(
                    floatingMenu,
                    "translationX",
                    0f,
                    -floatingMenu.width.toFloat()
                ).apply {
                    duration = 300
                    doOnEnd {
                        floatingMenu.visibility = View.INVISIBLE
                    }
                    start()
                }
            }
        }
    }
}