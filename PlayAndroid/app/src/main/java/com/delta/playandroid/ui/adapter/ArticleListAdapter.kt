package com.delta.playandroid.ui.adapter

import android.app.Activity
import android.app.Application
import android.content.Context
import android.graphics.drawable.TransitionDrawable
import android.provider.ContactsContract.Data
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.content.res.AppCompatResources
import androidx.databinding.DataBindingUtil
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.delta.playandroid.R
import com.delta.playandroid.WanAndroidApp
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.databinding.ArticleItemBinding
import com.delta.playandroid.databinding.EditCollectArticleBinding
import com.delta.playandroid.databinding.FooterItemBinding
import com.delta.playandroid.ui.activity.WebViewActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ArticleListAdapter(
    private val collectedArticles: ArrayList<Article>,
    private val isCollectPage:Boolean,
    private val onClickListener: clickInterface,
) : PagingDataAdapter<Article, RecyclerView.ViewHolder>(COMPARATOR) {

    companion object {

        private const val VIEW_TYPE_ITEM = 0
        private const val VIEW_TYPE_FOOTER = 1

        private val COMPARATOR = object : DiffUtil.ItemCallback<Article>() {
            override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem.id == newItem.id &&
                        oldItem.title == newItem.title &&
                        oldItem.author == newItem.author &&
                        oldItem.link == newItem.link
            }

            override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem == newItem
            }

        }
    }

    interface clickInterface {
        fun onArticleItemClick(url: String)
        suspend fun onArticleCollect(article: Article): Boolean
    }

    interface uncollectedClickListener : clickInterface {
        suspend fun onArticleUnCollect(article: Article): Boolean
    }

    interface collectedClickListener : clickInterface {
        fun onFooterClick()


        suspend fun onArticleUnCollect(article: Article): Boolean

        suspend fun editCollectArticle(
            id: Int,
            title: String,
            link: String,
            author: String
        ): Boolean
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            VIEW_TYPE_FOOTER -> {
                val binding =
                    FooterItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                return FooterViewHolder(binding)
            }

            else -> {
                val binding =
                    ArticleItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                val viewHolder = ItemViewHolder(binding)
                return viewHolder
            }
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.setOnLongClickListener {
            if (isCollectPage) {
                 showInputDialog(holder.itemView.context, position)
            }
            return@setOnLongClickListener true
        }
        if (holder is ItemViewHolder) {
            val article = getItem(position)
            if (article != null) {
                holder.bind(article)
            } else {
                // 空数据，显示占位符
            }
        }else{
            holder.itemView.setOnClickListener {
                (onClickListener as collectedClickListener).onFooterClick()
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (getItem(position)?.id != -1) {
            VIEW_TYPE_ITEM
        } else {
            VIEW_TYPE_FOOTER
        }
    }

    // 弹出编辑输入框
    private fun showInputDialog(context: Context, position: Int) {
        val builder = AlertDialog.Builder(context)
        val inflater = LayoutInflater.from(context)

        // 获取 R.layout.edit_collect_article的binding
        val binding = DataBindingUtil
            .inflate<EditCollectArticleBinding>(
                inflater,
                R.layout.edit_collect_article,
                null,
                false
            )

        binding.article = getItem(position)

        builder.setView(binding.root)
            .setTitle("编辑文章")
            .setPositiveButton("确定") { _, _ ->
                val newTitle = binding.article!!.title
                val newLink = binding.article!!.link
                val newAuthor = binding.article!!.author
                CoroutineScope(Dispatchers.IO).launch {
                    val result: Deferred<Boolean> = async {
                        (onClickListener as collectedClickListener).editCollectArticle(
                            binding.article!!.id,
                            newTitle,
                            newLink,
                            newAuthor
                        )
                    }
                    if (result.await()) {
                        withContext(Dispatchers.Main) {
                            // 编辑成功，同步显示数据
                            notifyItemChanged(position)
                            Toast.makeText(context, "编辑成功,刷新界面即可生效", Toast.LENGTH_SHORT)
                                .show()
                        }
                    } else {
                        withContext(Dispatchers.Main) {
                            // 编辑失败,提示错误
                            Toast.makeText(context, "编辑失败，请重试", Toast.LENGTH_SHORT).show()
                        }
                    }
                }

            }
            .setNegativeButton("取消") { dialog, _ -> dialog.dismiss() }

        val dialog = builder.create()
        dialog.show()
    }

    inner class FooterViewHolder(binding: FooterItemBinding) : RecyclerView.ViewHolder(binding.root)

    inner class ItemViewHolder(private val binding: ArticleItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private var collect = false
        private lateinit var transitionDrawable: TransitionDrawable

        // 绑定文章数据
        fun bind(article: Article) {
            binding.author.text = article.author
            binding.uploadTime.text = article.niceShareDate
            binding.title.text = article.title

            collect = isCollect(article.id)

            // 文章网页
            binding.title.setOnClickListener {
                CoroutineScope(Dispatchers.Main).launch {
                    onClickListener.onArticleItemClick(article.link)
                }
            }
            // 收藏动画效果
            val drawableLayers = arrayOf(
                AppCompatResources.getDrawable(itemView.context, R.drawable.collect),
                AppCompatResources.getDrawable(itemView.context, R.drawable.my_collect)
            )
            transitionDrawable = TransitionDrawable(drawableLayers)
            binding.collect.setImageDrawable(transitionDrawable)

            if (collect) {
                transitionDrawable.startTransition(0)
            }

            //收藏与取消收藏
            binding.collect.setOnClickListener {
                CoroutineScope(Dispatchers.IO).launch {
                    //防止重复操作--不可点击
                    withContext(Dispatchers.Main) {
                        binding.collect.isClickable = false
                    }
                    val result: Deferred<Boolean> = async {
                        if (onClickListener is collectedClickListener) {
                            // 收藏页面--实现了收藏页面的接口
                            if (collect){
                                // 收藏了就取消收藏
                                return@async onClickListener.onArticleUnCollect(article)
                            }else{
                                // 未收藏就收藏
                                return@async onClickListener.onArticleCollect(article)
                            }
                        } else if (onClickListener is uncollectedClickListener) {
                            // 未收藏页面--实现了未收藏页面的接口
                            if (!collect){
                                // 未收藏就收藏
                                return@async onClickListener.onArticleCollect(article)
                            }else{
                                // 收藏了就取消收藏
                                return@async onClickListener.onArticleUnCollect(article)
                            }
                        } else {
                            throw IllegalArgumentException("收藏失败，请重试.")
                        }
                    }

                    if (result.await()) {
                        //恢复点击
                        withContext(Dispatchers.Main) {
                            if (!collect) {
                                transitionDrawable.startTransition(200)
                            } else {
                                transitionDrawable.reverseTransition(200)
                            }
                            binding.collect.isClickable = true
                        }
                        collect = !collect
                    }
                }
            }
        }
    }

    private fun isCollect(id: Int): Boolean {
        if (isCollectPage){
            return true
        }
        for (article in collectedArticles){
            if (article.id == id || article.originId == id){
                return true
            }
        }
        return false
    }
}
