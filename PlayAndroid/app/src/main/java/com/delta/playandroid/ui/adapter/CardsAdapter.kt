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

    override fun onViewAttachedToWindow(holder: TreePageDirAdapterViewHolder) {
        super.onViewAttachedToWindow(holder)
        holder.itemView.postDelayed({
            holder.itemView.animate()
                .scaleY(1f)
                .scaleX(1f)
                .setDuration(200)
                .setInterpolator(AccelerateInterpolator())
                .start()
        },50L)
    }

    override fun onBindViewHolder(holder: CardsAdapter.TreePageDirAdapterViewHolder, position: Int) {
        for(i in 0 until cardInfoList.get(position).children.size){
            val cardTextview = TextView(holder.itemView.context)

            // 设置初始透明度和缩放
            cardTextview.alpha = 0f
            cardTextview.scaleX = 0.5f
            cardTextview.scaleY = 0.5f

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

            //动画效果
            cardTextview.postDelayed({
                cardTextview.animate()
                    .alpha(1f)
                    .scaleX(1f)
                    .scaleY(1f)
                    .setDuration(200)
                    .setInterpolator(AccelerateInterpolator())
                    .start()
            }, (i * 50).toLong())

            //点击事件
            cardTextview.setOnClickListener{
                listener.onDirClick(cardInfoList.get(position).id,cardInfoList.get(position).children.get(i).id)
            }

            //添加到容器
            holder.container.addView(cardTextview)
        }
        holder.title.text = cardInfoList.get(position).name

        holder.itemView.scaleX = 0.5f
        holder.itemView.scaleY = 0.5f
    }

    override fun getItemCount(): Int = cardInfoList.size

}