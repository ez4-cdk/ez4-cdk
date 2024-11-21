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
import com.google.android.flexbox.FlexboxLayout
import kotlin.random.Random

class CardsAdapter(private val listener: onDirClickListener):RecyclerView.Adapter<CardsAdapter.TreePageDirAdapterViewHolder>() {


    interface onDirClickListener{
        fun onDirClick(columnId:Int,childId:Int):Unit
    }

    private var cardInfoList = ArrayList<Column>()

    //布局属性参数
    private val textviewParams = FlexboxLayout.LayoutParams(
        FlexboxLayout.LayoutParams.WRAP_CONTENT,
        FlexboxLayout.LayoutParams.WRAP_CONTENT
    )
    init {
        textviewParams.setMargins(20,20,20,20)
    }

    //添加数据的方法
    fun addInfo(dirList:List<Column>){
        cardInfoList.addAll(dirList)
        notifyItemInserted(cardInfoList.size-dirList.size)
    }

    inner class TreePageDirAdapterViewHolder(view: View):RecyclerView.ViewHolder(view){
        val view = view
        val container = view.findViewById<FlexboxLayout>(R.id.card_container)
        val title = view.findViewById<TextView>(R.id.card_title)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardsAdapter.TreePageDirAdapterViewHolder {
        return TreePageDirAdapterViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.dir_card,parent,false)
        )
    }

    override fun onBindViewHolder(holder: CardsAdapter.TreePageDirAdapterViewHolder, position: Int) {
        for(i in 0 until cardInfoList.get(position).children.size){
            val cardTextview = TextView(holder.itemView.context)

            //字体效果
            cardTextview.text = cardInfoList.get(position).children.get(i).name
            cardTextview.textSize = 20f

            //背景颜色
            cardTextview.setBackgroundColor(Color.parseColor("#0D000000"))

            //随机颜色
            val colorRGB = List(3){Random.nextInt(0,200)}
            cardTextview.setTextColor(Color.rgb(colorRGB[0],colorRGB[1],colorRGB[2]))

            //布局属性参数
            cardTextview.layoutParams = textviewParams

            //点击事件
            cardTextview.setOnClickListener{
                listener.onDirClick(cardInfoList.get(position).id,cardInfoList.get(position).children.get(i).id)
            }
            //添加到容器
            holder.container.addView(cardTextview)
        }
        holder.title.text = cardInfoList.get(position).name

    }

    override fun getItemCount(): Int = cardInfoList.size

}