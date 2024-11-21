package com.delta.playandroid.ui.fragment.system

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.delta.playandroid.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SystemRoot: Fragment(R.layout.dir_container){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        parentFragmentManager.beginTransaction()
            .replace(R.id.tree_page_container, Cards())
            .addToBackStack(null)
            .commit()
    }

    override fun onResume() {
        super.onResume()
        requireActivity().title = "知识树"
        parentFragmentManager.beginTransaction()
            .replace(R.id.tree_page_container, Cards())
            .addToBackStack(null)
            .commit()
    }
}

