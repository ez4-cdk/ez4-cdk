package com.delta.playandroidpro.center.coin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.delta.playandroidpro.center.coin.bean.entity.CoinDetail
import com.delta.playandroidpro.databinding.CoinDetailBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * @description 积分详情适配器
 * @author delta
 * @date 2025/3/5 10:46
 */
class DetailInfoAdapter : PagingDataAdapter<CoinDetail, RecyclerView.ViewHolder>(COMPARATOR) {
    companion object {
        val COMPARATOR = object : DiffUtil.ItemCallback<CoinDetail>() {
            override fun areItemsTheSame(oldItem: CoinDetail, newItem: CoinDetail): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: CoinDetail, newItem: CoinDetail): Boolean {
                return oldItem == newItem
            }

        }
    }

    inner class DetailInfoViewHolder(private val coinDetailBinding: CoinDetailBinding) :
        RecyclerView.ViewHolder(coinDetailBinding.root) {
        fun bind(coinDetail: CoinDetail) {
            coinDetailBinding.tvCoinCount.text = coinDetail.coinCount.toString()
            coinDetailBinding.tvDate.text = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(
                Date(coinDetail.date)
            )
            coinDetailBinding.tvReason.text = coinDetail.reason
            coinDetailBinding.tvUsername.text = coinDetail.userName
            coinDetailBinding.tvDesc.text = coinDetail.desc
            coinDetailBinding.tvType.text = coinDetail.type.toString()
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as DetailInfoViewHolder).bind(getItem(position)!!)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return DetailInfoViewHolder(CoinDetailBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }
}