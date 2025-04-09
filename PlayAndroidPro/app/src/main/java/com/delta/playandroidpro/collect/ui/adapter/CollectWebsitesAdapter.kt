package com.delta.playandroidpro.collect.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.delta.playandroidpro.center.home.bean.entity.Website
import com.delta.playandroidpro.databinding.EditWebsiteBinding
import com.delta.playandroidpro.databinding.FooterBinding
import com.delta.playandroidpro.databinding.WebsiteBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * @description 收藏网站页面的适配器
 * @author delta
 * @date 2025/3/3 11:34
 */

class CollectWebsitesAdapter(
    private val onWebsiteOperations: onWebsiteOperationsInterFace
) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    interface onWebsiteOperationsInterFace {
        suspend fun onCollectWebsite(website: Website): Boolean
        suspend fun onDiscollectWebsite(website: Website): Boolean
        fun onShowWebContents(website: Website)
        suspend fun onEditWebsite(website: Website): Boolean
        suspend fun onReloadData()
    }

    private var websiteList = ArrayList<Website>()
    @SuppressLint("NotifyDataSetChanged")
    fun setWebsiteList(websiteList: ArrayList<Website>) {
        this.websiteList.clear()
        this.websiteList.addAll(websiteList)
        notifyDataSetChanged()
    }

    companion object {
        const val TYPE_WEBSITE = 0
        const val TYPE_FOOTER = 1
    }

    inner class FooterViewHolder(footerBinding: FooterBinding) :
        RecyclerView.ViewHolder(footerBinding.root)

    inner class WebsiteViewHolder(private val websiteItemBinding: WebsiteBinding) :
        RecyclerView.ViewHolder(websiteItemBinding.root) {
        fun bind(website: Website) {
            websiteItemBinding.webUrl.text = website.link
            websiteItemBinding.webId.text = website.name
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is WebsiteViewHolder) {
            holder.bind(websiteList[position])
            holder.itemView.setOnLongClickListener {
                val binding = EditWebsiteBinding.inflate(LayoutInflater.from(holder.itemView.context))
                binding.webAlias.setText(websiteList[position].name)
                binding.webUrl.setText(websiteList[position].link)
                AlertDialog.Builder(holder.itemView.context).setView(binding.root)
                    .setPositiveButton("确定") { _, _ ->
                        CoroutineScope(Dispatchers.IO).launch {
                            val website = Website(
                                id = websiteList[position].id,
                                link = binding.webUrl.text.toString(),
                                name = binding.webAlias.text.toString()
                            )
                            val res = async {
                                onWebsiteOperations.onEditWebsite(
                                    website
                                )
                            }
                            if (res.await()) {
                                withContext(Dispatchers.Main) {
                                    websiteList[position] = website
                                    notifyItemChanged(position)
                                }
                            }
                        }
                    }.setNegativeButton("取消") { dialog, _ ->
                        dialog.dismiss()
                    }.setNeutralButton("删除") { _, _ ->
                        CoroutineScope(Dispatchers.IO).launch {
                            val website = Website(id = websiteList[position].id)
                            val res = async {
                                onWebsiteOperations.onDiscollectWebsite(
                                    website
                                )
                            }
                            if (res.await()) {
                                // 取消收藏成功
                                websiteList.removeAt(position)
                                withContext(Dispatchers.Main) {
                                    notifyItemRemoved(position)
                                }
                            }
                        }
                    }.create().show()
                true
            }
            holder.itemView.setOnClickListener {
                onWebsiteOperations.onShowWebContents(websiteList[position])
            }
        } else {
            (holder as FooterViewHolder).itemView.setOnClickListener {
                val binding = EditWebsiteBinding.inflate(LayoutInflater.from(holder.itemView.context))
                AlertDialog.Builder(holder.itemView.context).setView(binding.root)
                    .setPositiveButton("确定") { _, _ ->
                        val website = Website(
                            link = binding.webUrl.text.toString(),
                            name = binding.webAlias.text.toString()
                        )
                        CoroutineScope(Dispatchers.IO).launch {
                            val res = async {
                                onWebsiteOperations.onCollectWebsite(
                                    website
                                )
                            }
                            if (res.await()) {
                                onWebsiteOperations.onReloadData()
                            }
                        }
                    }.setNegativeButton("取消") { dialog, _ ->
                        dialog.dismiss()
                    }.create().show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            TYPE_WEBSITE -> {
                return WebsiteViewHolder(
                    WebsiteBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

            TYPE_FOOTER -> {
                return FooterViewHolder(
                    FooterBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

            else -> {
                throw IllegalArgumentException("Invalid view type")
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == websiteList.size) {
            TYPE_FOOTER
        } else {
            TYPE_WEBSITE
        }
    }

    override fun getItemCount(): Int = websiteList.size + 1
}