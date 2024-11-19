package com.delta.playandroid.common

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB:ViewBinding>(
    @LayoutRes layoutID:Int,
    private val bindingInflater: (View)->VB
) :Fragment(layoutID) {
    private var _databinding:VB ?=null
    protected val databinding get() = _databinding!!
    override val defaultViewModelCreationExtras: CreationExtras
        get() = super.defaultViewModelCreationExtras

    override fun onDestroyView() {
        super.onDestroyView()
        _databinding = null
    }

    abstract fun initView()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _databinding = bindingInflater(view)
        initView()
    }
}