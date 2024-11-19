package com.delta.playandroid.ui.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.delta.playandroid.R
import com.delta.playandroid.data.model.bean.entity.Column
import com.delta.playandroid.data.model.bean.entity.Hotkey
import com.google.android.flexbox.FlexboxLayout
import java.util.Queue
import kotlin.random.Random

class SearchAdapter<T>(
    private val onQueryTextClickListener: onSearchTextClickListener
) {
    private var tvItems: ArrayList<TextView>
    private var texts: ArrayList<String>

    init {
        texts = ArrayList()
        tvItems = ArrayList()
    }

    interface onSearchTextClickListener {
        fun onSearchTextClick(text: String)
    }

    fun addInfo(columnList: ArrayList<T>, flexboxLayout: FlexboxLayout) {
        flexboxLayout.removeAllViews()
        texts.clear()
        tvItems.clear()
        columnList.forEach { item ->
            val textView = LayoutInflater.from(flexboxLayout.context)
                .inflate(R.layout.key_textview, flexboxLayout, false) as TextView

            when (item) {
                is Hotkey -> {
                    textView.text = item.name
                }

                is String -> {
                    textView.text = item
                }

                else -> {
                    throw IllegalArgumentException("Unsupported type--SearchAdapter<T>")
                }
            }

            textView.setOnClickListener {
                onQueryTextClickListener.onSearchTextClick(textView.text.toString())
            }

            tvItems.add(textView)
            texts.add(textView.text.toString())
            flexboxLayout.addView(textView)
        }
    }
}