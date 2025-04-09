package com.delta.playandroidpro.search.ui.adapter

import android.view.LayoutInflater
import android.widget.TextView
import com.delta.playandroidpro.R
import com.delta.playandroidpro.search.bean.entity.Hotkey
import com.google.android.flexbox.FlexboxLayout

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
class SearchInfoAdapter<T>(
    val onQueryTextClickListener:OnQueryTextClickListener
){
    interface OnQueryTextClickListener{
        fun onSearchTextClick(text:String)
    }
    fun addInfo(tags:List<T>,box:FlexboxLayout){
        box.removeAllViews()
        tags.forEach{
            if (!it!!.equals("")){
                val textView = LayoutInflater.from(box.context)
                    .inflate(R.layout.key_textview, box, false) as TextView

                when (it) {
                    is Hotkey -> {
                        textView.text = it.name
                    }

                    is String -> {
                        textView.text = it
                    }

                    else -> {
                        throw IllegalArgumentException("Unsupported type--SearchAdapter<T>")
                    }
                }

                textView.setOnClickListener {
                    onQueryTextClickListener.onSearchTextClick(textView.text.toString())
                }

                box.addView(textView)
            }
        }
    }
}