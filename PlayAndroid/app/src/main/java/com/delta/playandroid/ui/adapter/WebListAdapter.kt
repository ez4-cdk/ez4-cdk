package com.delta.playandroid.ui.adapter

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.paging.LOG_TAG
import androidx.paging.PagingDataAdapter
import androidx.paging.log
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.delta.playandroid.R
import com.delta.playandroid.data.model.bean.entity.Website
import com.delta.playandroid.databinding.AddCollectWebBinding
import com.delta.playandroid.databinding.FooterItemBinding
import com.delta.playandroid.databinding.WebsiteItemBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class WebListAdapter(
    private val context: Context,
    private val onClickListener: clickInterface
):RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var webList = ArrayList<Website>()

    interface clickInterface{
        fun onItemClick(url:String)
        suspend fun onWebAdd(title:String,link:String):Boolean
        suspend fun onWebEdit(id:Int,title:String,link:String):Boolean
        suspend fun onWebDelete(id:Int):Boolean
        suspend fun onRefresh()
    }
    @SuppressLint("NotifyDataSetChanged")
    fun submitList(list: List<Website>) {
        webList.clear()
        webList.addAll(list)
        Log.d("submitList", "submitList: $list")
        notifyDataSetChanged()
    }
    private val VIEW_TYPE_ITEM = 0
    private val VIEW_TYPE_FOOTER = 1

    inner class FooterViewHolder(binding: FooterItemBinding) : RecyclerView.ViewHolder(binding.root)

    inner class ItemViewHolder(private val binding: WebsiteItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(website: Website){
            binding.webId.text = website.name
            binding.webUrl.text = website.link
            binding.root.setOnClickListener {
                onClickListener.onItemClick(website.link)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType){
            VIEW_TYPE_ITEM->{
                return ItemViewHolder(
                    WebsiteItemBinding
                        .inflate(
                            LayoutInflater.from(parent.context)
                            ,parent
                            ,false)
                )
            }
            VIEW_TYPE_FOOTER->{
                return FooterViewHolder(FooterItemBinding.inflate(
                    LayoutInflater.from(parent.context),parent,false)
                )
            }
            else->{
                throw IllegalArgumentException("Invalid view type")
            }
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is FooterViewHolder) {
            holder.itemView.setOnClickListener {
                buildAddWebDialog()
            }
        }

        if (holder is ItemViewHolder){
            holder.bind(webList.get(position))
            holder.itemView.setOnLongClickListener {
                buildEditWebDialog(holder.bindingAdapterPosition)
                return@setOnLongClickListener true
            }
        }else{
            return
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position < webList.size) {
            VIEW_TYPE_ITEM
        } else {
            VIEW_TYPE_FOOTER
        }
    }

    fun buildAddWebDialog() {
        AlertDialog.Builder(context).also {
            val inflater = LayoutInflater.from(context)
            val binding = DataBindingUtil.inflate<AddCollectWebBinding>(
                inflater, R.layout.add_collect_web, null, false
            )
            it.setView(binding.root)
                .setTitle("添加网站")
                .setPositiveButton("确定") { _, _ ->
                    CoroutineScope(Dispatchers.IO).launch {
                        val res: Deferred<Boolean> = async {
                            onClickListener.onWebAdd(
                                binding.titleInput.text.toString(),
                                binding.linkInput.text.toString()
                            )
                        }
                        if (res.await()) {
                            withContext(Dispatchers.Main) {
                                Toast.makeText(context, "添加成功", Toast.LENGTH_SHORT).show()
                                onClickListener.onRefresh()
                            }
                        } else {
                            withContext(Dispatchers.Main) {
                                Toast.makeText(context, "添加失败", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }

                }
                .setNegativeButton("取消") { dialog, _ -> dialog.dismiss() }
        }.create().show()
    }

    fun buildEditWebDialog(position: Int){
        AlertDialog.Builder(context).also {
            val inflater = LayoutInflater.from(this.context)
            val binding = DataBindingUtil.inflate<AddCollectWebBinding>(
                inflater,
                R.layout.add_collect_web, null, false
            )

            binding.titleInput.setText(webList.get(position).name)
            binding.linkInput.setText(webList.get(position).link)

            it.setView(binding.root)
                .setTitle("编辑网站")
                .setPositiveButton("确定") { _, _ ->
                    val title = binding.titleInput.text.toString()
                    val link = binding.linkInput.text.toString()
                    CoroutineScope(Dispatchers.IO).launch {
                        val res: Deferred<Boolean> = async {
                            onClickListener.onWebEdit(webList.get(position).id, title, link)
                        }

                        if (res.await()) {
                            withContext(Dispatchers.Main) {
                                Toast.makeText(context, "修改成功", Toast.LENGTH_SHORT).show()
                                onClickListener.onRefresh()
                            }
                        } else {
                            withContext(Dispatchers.Main) {
                                Toast.makeText(context, "修改失败", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                }
                .setNeutralButton("删除") { _, _ ->
                    CoroutineScope(Dispatchers.IO).launch {
                        val res: Deferred<Boolean> = async {
                            onClickListener.onWebDelete(webList.get(position).id)
                        }
                        if (res.await()) {
                            withContext(Dispatchers.Main) {
                                Toast.makeText(context, "删除成功", Toast.LENGTH_SHORT).show()
                                onClickListener.onRefresh()
                            }
                        } else {
                            withContext(Dispatchers.Main) {
                                Toast.makeText(context, "删除失败", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                }
                .setNegativeButton("取消") { dialog, _ ->
                    dialog.dismiss()
                }
        }.create().show()
    }

    override fun getItemCount(): Int = webList.size+1

}
