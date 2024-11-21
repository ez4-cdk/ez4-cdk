package com.delta.playandroid.ui.activity
import android.os.Bundle
import android.widget.SearchView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.paging.PagingData
import com.delta.playandroid.R
import com.delta.playandroid.databinding.SearchRootBinding
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.ui.adapter.SearchAdapter
import com.delta.playandroid.ui.fragment.search.SearchResult
import com.delta.playandroid.ui.fragment.search.Searching
import com.delta.playandroid.viewmodel.SearchViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


@AndroidEntryPoint
class SearchActivity : AppCompatActivity(){
    private lateinit var binding: SearchRootBinding
    private lateinit var searchInfoFragment:Searching

    private val searchViewModel: SearchViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.search_root)

        initView()
    }

    override fun onResume() {
        super.onResume()
        supportFragmentManager.beginTransaction()
            .replace(R.id.search_container,searchInfoFragment)
            .commit()
    }

    private fun initView() {
        binding.searchViewModel = searchViewModel
        binding.lifecycleOwner = this

        // SearchView
        val searchViewOnClickListener = object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                searchViewModel.search()
                binding.svSearch.clearFocus()
                return true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                searchViewModel.onSearchTextChange(p0)
                return true
            }
        }

        binding.btnAction.setOnClickListener {
            val queryText = binding.svSearch.query.toString()
            searchViewOnClickListener.onQueryTextSubmit(queryText)
            binding.svSearch.clearFocus()
        }

        binding.svSearch.setOnQueryTextFocusChangeListener { _, p1 ->
            if (p1) {
                searching()
            }
        }

        binding.svSearch.setOnQueryTextListener(searchViewOnClickListener)


        // SearchResult  --  recyclerview
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {
                    searchViewModel.searchResults.collectLatest {
                        showResultFragment(searchViewModel,it)
                    }
                }
            }
        }

        // searchView get focus
        binding.searchContainer.setOnClickListener {
            binding.svSearch.clearFocus()
        }

        binding.back.setOnClickListener {
            finish()
        }

        searchInfoFragment = Searching(searchViewModel,object : SearchAdapter.onSearchTextClickListener {
            override fun onSearchTextClick(text: String) {
                binding.svSearch.setQuery(text,false)
                searchViewOnClickListener.onQueryTextSubmit(text)
            }
        })
    }

    private fun showResultFragment(searchViewModel: SearchViewModel,pagingData: PagingData<Article>) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.search_container, SearchResult(searchViewModel,pagingData))
            .commit()
    }

    private fun searching() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.search_container, searchInfoFragment)
            .commit()
    }
}