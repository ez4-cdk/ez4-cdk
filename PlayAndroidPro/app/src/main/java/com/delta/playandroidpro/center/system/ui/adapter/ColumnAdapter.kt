package com.delta.playandroidpro.center.system.ui.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.delta.playandroidpro.R
import com.delta.playandroidpro.center.project.bean.entity.Column
import com.google.android.flexbox.FlexboxLayout
import kotlin.random.Random

/**
 * @description 标签适配器
 * @author delta
 * @date 2025/2/26 16:14
 */
class ColumnAdapter(
    private val listener: onColumnClickListener
):RecyclerView.Adapter<ColumnAdapter.ColumnAdapterViewHolder>() {


    interface onColumnClickListener{
        fun onColumnClick(column: Column,position: Int):Unit
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
    fun addInfo(columnList:List<Column>){
        cardInfoList.addAll(columnList)
        notifyItemInserted(cardInfoList.size-columnList.size)
    }

    inner class ColumnAdapterViewHolder(view: View):RecyclerView.ViewHolder(view){
        val view = view
        val container = view.findViewById<FlexboxLayout>(R.id.columnContents)
        val title = view.findViewById<TextView>(R.id.columnTitle)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ColumnAdapter.ColumnAdapterViewHolder {
        return ColumnAdapterViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.column,parent,false)
        )
    }

    override fun onBindViewHolder(holder: ColumnAdapter.ColumnAdapterViewHolder, position: Int) {
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
                listener.onColumnClick(cardInfoList.get(position),i)
            }
            //添加到容器
            holder.container.addView(cardTextview)
        }
        holder.title.text = cardInfoList.get(position).name

    }

    override fun getItemCount(): Int = cardInfoList.size

}