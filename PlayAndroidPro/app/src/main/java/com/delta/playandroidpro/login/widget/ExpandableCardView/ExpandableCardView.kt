package com.delta.playandroidpro.login.widget.ExpandableCardView

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.delta.playandroidpro.R
import com.delta.playandroidpro.login.bean.User

class ExpandableCardView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0,
):LinearLayout(context, attrs, defStyleAttr){
    private var button:ImageButton
    private var textView: TextView
    private var recyclerView: RecyclerView? = null
    private var mOnClickListener: onClickListener? = null

    interface onClickListener {
        fun onClick(user: User)
    }

    init {
        orientation = VERTICAL
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.expandable_card_view, this, true)

        button = findViewById<ImageButton?>(R.id.ecv_image).apply {
            this.setImageResource(R.drawable.avatar)
            this.setOnClickListener {
                if (recyclerView?.visibility == GONE){
                    recyclerView?.visibility = VISIBLE
                }else{
                    recyclerView?.visibility = GONE
                }
            }
        }
        textView = findViewById(R.id.ecv_text)
    }

    fun setData(data: List<User>) {
        recyclerView?.adapter?.let {
            (it as ECVAdapter).setData(data)
        }
    }


    fun setOnItemClickListener(onClickListener: onClickListener){
        mOnClickListener = onClickListener
        recyclerView = findViewById<RecyclerView?>(R.id.ecv_rv).apply {
            if (this != null) {
                this.layoutManager = LinearLayoutManager(context)
                this.adapter = ECVAdapter(mOnClickListener!!)
            }
        }
    }

}