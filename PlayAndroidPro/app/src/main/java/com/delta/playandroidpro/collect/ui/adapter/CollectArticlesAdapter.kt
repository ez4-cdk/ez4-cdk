package com.delta.playandroidpro.center.home.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.delta.playandroidpro.R
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.databinding.ArticleBinding
import com.delta.playandroidpro.databinding.EditArticleBinding
import com.delta.playandroidpro.databinding.FooterBinding
import com.delta.playandroidpro.login.bean.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * 首页文章
 * 点击标题时跳转到文章详情页面
 * 点击作者时展示作者的文章
 * 点击Tag时展示该标签下的文章
 * 点击♥时收藏或取消收藏文章
 * 收藏页面
 * 长按可以编辑
 */

/**
 * @description 收藏文章页面的适配器
 * @author delta
 * @date 2025/3/3 11:36
 */

class CollectArticlesAdapter(
    val user: User?,
    private val onArticleClick: onArticleClickInterFace
) : PagingDataAdapter<Article, RecyclerView.ViewHolder>(COMPARATOR) {
    interface onArticleClickInterFace {
        suspend fun onCollectArticle(article: Article): Boolean
        suspend fun onDiscollectArticle(article: Article): Boolean
        suspend fun onShowArticleInWeb(article: Article)
        suspend fun editArticle(article: Article): Boolean
        suspend fun addOutsideArticle(article: Article): Boolean
    }

    companion object {
        const val TYPE_ARTICLE = 0
        const val TYPE_FOOTER = 1

        private val COMPARATOR = object : DiffUtil.ItemCallback<Article>() {
            override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem.id == newItem.id &&
                        oldItem.title == newItem.title &&
                        oldItem.author == newItem.author &&
                        oldItem.link == newItem.link &&
                        oldItem.collect == newItem.collect
            }

            override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem == newItem
            }

        }
    }

    inner class CollectArticleViewHolder(private val articleItemBinding: ArticleBinding) :
        RecyclerView.ViewHolder(articleItemBinding.root) {
        fun bind(article: Article) {
            articleItemBinding.title.text = article.title
            articleItemBinding.author.text = article.author
            articleItemBinding.uploadTime.text = article.niceShareDate
            articleItemBinding.collect.setImageResource(R.drawable.my_collect)

            val onShowArticle = View.OnClickListener {
                CoroutineScope(Dispatchers.IO).launch {
                    onArticleClick.onShowArticleInWeb(article)
                }
            }
            articleItemBinding.title.setOnClickListener(onShowArticle)
            articleItemBinding.root.setOnClickListener(onShowArticle)
            articleItemBinding.collect.setOnClickListener {
                if (user!!.collectIds!!.contains(article.originId)) {
                    CoroutineScope(Dispatchers.IO).launch {
                        val res = async {
                            onArticleClick.onDiscollectArticle(article)
                        }
                        if (res.await()) {
                            // 取消收藏成功
                            withContext(Dispatchers.Main) {
                                articleItemBinding.collect.setImageResource(R.drawable.collect)
                                user.collectIds?.remove(article.originId)
                            }
                        }
                    }
                } else {
                    CoroutineScope(Dispatchers.IO).launch {
                        val res = async {
                            onArticleClick.onCollectArticle(article)
                        }
                        if (res.await()) {
                            // 收藏成功
                            withContext(Dispatchers.Main) {
                                articleItemBinding.collect.setImageResource(R.drawable.my_collect)
                                user.collectIds?.add(article.originId)
                            }
                        }
                    }
                }
            }

        }

        fun onEditArticle(root: Article, context: Context, adapterPosition: Int) {
            val dialogBinding = EditArticleBinding.inflate(LayoutInflater.from(context))
            dialogBinding.titleInput.setText(root.title)
            dialogBinding.authorInput.setText(root.author)
            dialogBinding.linkInput.setText(root.link)
            val dialogBuilder = AlertDialog.Builder(context)
            dialogBuilder
                .setView(dialogBinding.root)
                .setPositiveButton("确定") { _, _ ->
                    CoroutineScope(Dispatchers.IO).launch {
                        val article = Article(
                            id = root.id,
                            title = dialogBinding.titleInput.text.toString(),
                            link = dialogBinding.linkInput.text.toString(),
                            author = dialogBinding.authorInput.text.toString()
                        )
                        val res = async {
                            onArticleClick.editArticle(article)
                        }

                        if (res.await()) {
                            withContext(Dispatchers.Main) {
                                getItem(adapterPosition)?.title = article.title
                                getItem(adapterPosition)?.author = article.author
                                getItem(adapterPosition)?.link = article.link
                                notifyItemChanged(adapterPosition)
                            }
                        }
                    }
                }
                .setNeutralButton("取消") { dialog, _ ->
                    dialog.dismiss()
                }

            dialogBuilder.create().show()
        }
    }

    inner class FooterViewHolder(footerBinding: FooterBinding) :
        RecyclerView.ViewHolder(footerBinding.root)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is CollectArticleViewHolder) {
            holder.bind(getItem(position)!!)
            holder.itemView.setOnLongClickListener {
                holder.onEditArticle(getItem(position)!!, holder.itemView.context, position)
                true
            }
        } else {
            (holder as FooterViewHolder).itemView.setOnClickListener {
                val binding =
                    EditArticleBinding.inflate(LayoutInflater.from(holder.itemView.context))
                AlertDialog.Builder(holder.itemView.context)
                    .setView(binding.root)
                    .setPositiveButton("确定") { _, _ ->
                        val article = Article(
                            title = binding.titleInput.text.toString(),
                            link = binding.linkInput.text.toString(),
                            author = binding.authorInput.text.toString()
                        )
                        CoroutineScope(Dispatchers.IO).launch {
                            onArticleClick.addOutsideArticle(article)
                        }
                    }
                    .setNegativeButton("取消") { dialog, _ ->
                        dialog.dismiss()
                    }.create().show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            TYPE_ARTICLE -> {
                val articleItemBinding =
                    ArticleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return CollectArticleViewHolder(articleItemBinding)
            }

            TYPE_FOOTER -> {
                val footerBinding =
                    FooterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return FooterViewHolder(footerBinding)
            }

            else -> {
                throw IllegalArgumentException("Invalid view type")
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (getItem(position)!!.id == -1) {
            TYPE_FOOTER
        } else {
            TYPE_ARTICLE
        }
    }


}