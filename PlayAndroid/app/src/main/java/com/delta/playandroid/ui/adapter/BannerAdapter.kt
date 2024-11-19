package com.delta.playandroid.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.delta.playandroid.R
import com.delta.playandroid.data.model.bean.entity.Banner

class BannerAdapter(private val clickListener: onBannerClickListener):RecyclerView.Adapter<BannerAdapter.viewHoder>(){

    interface onBannerClickListener{
        fun onBannerClick(url:String)
    }

    inner class viewHoder(view:View):RecyclerView.ViewHolder(view){
        val underText = view.findViewById<TextView>(R.id.bannerText)
        val upImage = view.findViewById<ImageView>(R.id.bannerView)
        init {
            view.setOnClickListener{
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION){
                    clickListener.onBannerClick(bannerInfoList[position].url)
                }
            }
        }
    }
    private var bannerInfoList = ArrayList<Banner>()

    fun addIt(bannerInfoList:List<Banner>){
        this.bannerInfoList.addAll(bannerInfoList)
        notifyItemInserted(this.bannerInfoList.size - bannerInfoList.size)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHoder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.banner_item,parent,false)
        return viewHoder(view)
    }

    override fun onBindViewHolder(holder: viewHoder, position: Int) {

        val bannerItem = bannerInfoList[position]

        //图片底部说明
        holder.underText.text = bannerItem.title

        //图片
        Glide.with(holder.itemView.context)
            .load(bannerItem.imagePath)
            .into(holder.upImage)

    }

    override fun getItemCount(): Int = bannerInfoList.size
}