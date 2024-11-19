package com.delta.playandroid.ui.fragment.system

import android.annotation.SuppressLint
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.delta.playandroid.R
import com.delta.playandroid.common.BaseFragment
import com.delta.playandroid.databinding.DirRvBinding
import com.delta.playandroid.ui.adapter.CardsAdapter
import com.delta.playandroid.viewmodel.CardsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Cards:BaseFragment<DirRvBinding>(R.layout.dir_rv,DirRvBinding::bind),
    CardsAdapter.onDirClickListener {

    private lateinit var cardsAdapter: CardsAdapter
    private val cardsViewModel:CardsViewModel by viewModels()

    @SuppressLint("NotifyDataSetChanged")
    override fun initView() {
        cardsViewModel.fetchData()
        cardsAdapter = CardsAdapter(this)
        databinding.cardContainer.layoutManager = LinearLayoutManager(requireContext())
        databinding.cardContainer.adapter = cardsAdapter
        cardsViewModel.cards.observe(viewLifecycleOwner){ data->
            cardsAdapter.addInfo(data)
        }
    }

    override fun onDirClick(columnId:Int,childId: Int) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.tree_page_container, PageInCards(columnId,childId))
            .addToBackStack(null)
            .commit()
    }
}