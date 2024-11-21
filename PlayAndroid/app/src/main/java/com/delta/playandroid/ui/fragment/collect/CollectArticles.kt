package com.delta.playandroid.ui.fragment.collect

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.delta.playandroid.R
import com.delta.playandroid.WanAndroidApp
import com.delta.playandroid.common.BaseFragment
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.databinding.EditCollectArticleBinding
import com.delta.playandroid.databinding.RvPageBinding
import com.delta.playandroid.ui.activity.WebViewActivity
import com.delta.playandroid.ui.adapter.ArticleListAdapter
import com.delta.playandroid.viewmodel.CollectViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CollectArticles(
    private val collectViewModel: CollectViewModel
):BaseFragment<RvPageBinding>(R.layout.rv_page,RvPageBinding::bind)
,ArticleListAdapter.collectedClickListener{

    private lateinit var articleListAdapter: ArticleListAdapter

    private lateinit var addArticleDialogBuilder: AlertDialog.Builder

    override fun initView() {

        addArticleDialogBuilder = AlertDialog.Builder(requireContext()).also{
        val inflater = LayoutInflater.from(requireContext())
        val binding = DataBindingUtil.inflate<EditCollectArticleBinding>(
                inflater,
                R.layout.edit_collect_article, null, false
        )
        it.setView(binding.root)
            .setTitle("添加文章")
            .setPositiveButton("确定") { _, _ ->
                val title = binding.titleInput.text.toString()
                val link = binding.linkInput.text.toString()
                val author = binding.authorInput.text.toString()
                CoroutineScope(Dispatchers.IO).launch {
                    val res: Deferred<Boolean> = async {
                        collectViewModel.addCollectArticle(title,link,author)
                    }

                    if (res.await()){
                        withContext(Dispatchers.Main){
                            Toast.makeText(requireContext(), "添加成功", Toast.LENGTH_SHORT).show()
                        }
                    }else{
                        withContext(Dispatchers.Main){
                            Toast.makeText(requireContext(), "添加失败", Toast.LENGTH_SHORT).show()
                        }
                    }
                }

            }
            .setNegativeButton("取消") { dialog, _ -> dialog.dismiss() }
        }

        databinding.articleVM3 = collectViewModel

        articleListAdapter = ArticleListAdapter(
            (requireActivity().application as WanAndroidApp).collectArticles.value?:ArrayList(),
            true,
            this
        )

        databinding.rv.layoutManager = LinearLayoutManager(this.context)

        databinding.rv.adapter = articleListAdapter

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                collectViewModel.articles.collect{
                    articleListAdapter.submitData(it)
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        requireActivity().title = "收藏文章"
    }

    override fun onArticleItemClick(url: String) {
        val intentToWebView = Intent(requireContext(), WebViewActivity::class.java)
        intentToWebView.putExtra("url",url)
        startActivity(intentToWebView)
    }

    override suspend fun onArticleCollect(article: Article): Boolean {
        return if(collectViewModel.collect(article.id)){
            (requireActivity().application as WanAndroidApp).addCollectArticle(article)
            true
        }else{
            false
        }
    }

    override suspend fun onArticleUnCollect(article: Article): Boolean {
        return if(collectViewModel.uncollect(article.id,article.originId)){
            (requireActivity().application as WanAndroidApp).removeCollectArticle(article)
            true
        }else{
            false
        }
    }

    override suspend fun editCollectArticle(
        id: Int,
        title: String,
        link: String,
        author: String
    ): Boolean {
        return collectViewModel.editCollectArticle(id,title,link,author)
    }

    override fun onFooterClick() {
        addArticleDialogBuilder.create().show()
    }
}