package com.delta.playandroidpro.center.home.ui.adapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.delta.playandroidpro.R
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.databinding.ArticleBinding
import com.delta.playandroidpro.databinding.FooterBinding
import com.delta.playandroidpro.login.bean.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

/**
 * 首页文章
 * 点击标题时跳转到文章详情页面
 * 点击作者时展示作者的文章
 * 点击Tag时展示该标签下的文章
 * 点击♥时收藏或取消收藏文章
 * 收藏页面
 * 长按可以编辑
 */

class ArticleAdapter(
    val user: User?,
    private val onArticleClick: onArticleClickInterFace
) :PagingDataAdapter<Article, RecyclerView.ViewHolder>(COMPARATOR){
    interface onArticleClickInterFace{
        suspend fun onCollectArticle(article: Article):Boolean
        suspend fun onDiscollectArticle(article: Article):Boolean
        suspend fun onShowArticleInWeb(article: Article)
    }
    companion object{
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
    inner class ArticleViewHolder(val articleItemBinding: ArticleBinding) :
        RecyclerView.ViewHolder(articleItemBinding.root) {
        fun bind(article: Article) {
            articleItemBinding.title.text = article.title
            articleItemBinding.author.text = article.author
            articleItemBinding.uploadTime.text = article.niceShareDate

            val onShowArticle = View.OnClickListener {
                CoroutineScope(Dispatchers.IO).launch {
                    onArticleClick.onShowArticleInWeb(article)
                }
            }
            articleItemBinding.title.setOnClickListener(onShowArticle)
            articleItemBinding.root.setOnClickListener(onShowArticle)
            if (user?.collectIds?.contains(article.id) == true){
                articleItemBinding.collect.setImageResource(R.drawable.my_collect)
            }else{
                articleItemBinding.collect.setImageResource(R.drawable.collect)
            }
            articleItemBinding.collect.setOnClickListener {
                if (user?.collectIds?.contains(article.id) == true){
                    CoroutineScope(Dispatchers.IO).launch {
                        val res = async {
                            onArticleClick.onDiscollectArticle(article)
                        }
                        if (res.await()){
                            // 取消收藏成功
                            articleItemBinding.collect.setImageResource(R.drawable.collect)
                            user.collectIds.remove(article.originId)
                        }
                    }
                }else{
                    CoroutineScope(Dispatchers.IO).launch {
                        val res = async {
                            onArticleClick.onCollectArticle(article)
                        }
                        if (res.await()){
                            // 收藏成功
                            articleItemBinding.collect.setImageResource(R.drawable.my_collect)
                            user?.collectIds?.add(article.originId)
                        }
                    }
                }
            }

            
        }
    }

    inner class FooterViewHolder(val footerBinding:FooterBinding) :
        RecyclerView.ViewHolder(footerBinding.root){
            @SuppressLint("SetTextI18n")
            fun bind(){
                footerBinding.footerTag.setText("加载完毕，已经没有更多了")
            }
        }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ArticleViewHolder){
            if (getItem(position) !=null){
                holder.bind(getItem(position)!!)
            }
        }else{
            (holder as FooterViewHolder).bind()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType){
            TYPE_ARTICLE -> {
                val articleItemBinding = ArticleBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                return ArticleViewHolder(articleItemBinding)
            }
            TYPE_FOOTER -> {
                val footerBinding = FooterBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                return FooterViewHolder(footerBinding)
            }
            else -> {
                throw IllegalArgumentException("Invalid view type")
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if(getItem(position)?.id == -1){
            TYPE_FOOTER
        }else{
            TYPE_ARTICLE
        }
    }
}