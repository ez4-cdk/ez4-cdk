package com.delta.playandroidpro.center.home.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.delta.playandroidpro.R
import com.delta.playandroidpro.center.home.bean.entity.Banner

/**
 * @description 轮播图适配器
 * @author delta
 * @date 2025/2/8 11:08
 */
class BannerAdapter(
    private val onBannerClickListener: onBannerClick
):RecyclerView.Adapter<BannerAdapter.BannerViewHolder>(){
    interface onBannerClick{
        fun onBannerClick(url:String)
    }
    inner class BannerViewHolder(view:View):RecyclerView.ViewHolder(view){
        private val bannerImageText = view.findViewById<TextView>(R.id.bannerText)
        private val bannerImageView = view.findViewById<ImageView>(R.id.bannerView)
        fun bind(banner: Banner){
            // 图片点击事件监听
            itemView.setOnClickListener {
                onBannerClickListener.onBannerClick(banner.url)
            }

            // 图片底部文字说明
            bannerImageText.text = banner.desc

            // 图片
            Glide
                .with(itemView.context)
                .load(banner.imagePath)
                .into(bannerImageView)
        }
    }

    private var bannerList= ArrayList<Banner>()
    fun setBannerList(bannerList:List<Banner>){
        this.bannerList.addAll(bannerList)
        notifyItemInserted(0)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        return BannerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.banner_item, parent, false))
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        holder.bind(bannerList[position])
    }

    override fun getItemCount(): Int  = bannerList.size
}