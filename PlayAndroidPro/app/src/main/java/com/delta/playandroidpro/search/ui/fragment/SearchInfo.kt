package com.delta.playandroidpro.search.ui.fragment

import androidx.fragment.app.activityViewModels
import com.delta.playandroidpro.PlayAndroidPro
import com.delta.playandroidpro.R
import com.delta.playandroidpro.common.BaseFragment
import com.delta.playandroidpro.databinding.SearchInfoBinding
import com.delta.playandroidpro.search.Search
import com.delta.playandroidpro.search.SearchViewModel
import com.delta.playandroidpro.search.bean.entity.Hotkey
import com.delta.playandroidpro.search.ui.adapter.SearchInfoAdapter
import com.delta.playandroidpro.search.ui.adapter.SearchInfoAdapter.OnQueryTextClickListener
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * @description
 * @author delta
 * @date 2025/2/27 19:02
 */
class SearchInfo() : BaseFragment<SearchInfoBinding>(R.layout.search_info, SearchInfoBinding::inflate),
    OnQueryTextClickListener {
    private val hotkeyAdapter by lazy { SearchInfoAdapter<Hotkey>(this) }
    private val historyAdapter by lazy { SearchInfoAdapter<String>(this) }
    private val viewModel :SearchViewModel by activityViewModels()
    override fun loading() {
    }

    override fun loaded() {
    }

    override fun initView() {

        viewModel.initViewModel(requireContext(), (requireActivity().application as PlayAndroidPro).getUser()!!)

        viewModel.getHotKey()
        viewModel.getLocalHistory()
        viewModel.hotkey.observe(viewLifecycleOwner) {
            if (it.isNotEmpty()) {
                hotkeyAdapter.addInfo(it, binding.hotkeyCardContainer)
            }
        }
        viewModel.history.observe(viewLifecycleOwner) {
            if (it!!.isNotEmpty()) {
                historyAdapter.addInfo(it, binding.historyCardContainer)
                CoroutineScope(Dispatchers.IO).launch{
                    viewModel.saveLocalHistory()
                }
            }
        }

    }

    override fun onSearchTextClick(text: String) {
        (requireActivity() as Search).onSearchTextClick(text)
    }
}