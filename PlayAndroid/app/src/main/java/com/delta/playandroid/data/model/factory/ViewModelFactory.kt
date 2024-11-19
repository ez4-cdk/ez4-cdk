package com.delta.playandroid.data.model.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/*
 *  创建ViewModel时需要传参构造时使用此工厂
 */

class ViewModelFactory<T:ViewModel>(
    private val viewModel:Class<T>,
):ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(!viewModel.isAssignableFrom(modelClass)){
            throw IllegalArgumentException("未知ViewModel的类!")
        }
        return when(viewModel){

            /*  用法如下：
            LoginViewModel::class.java -> {
                LoginViewModel(args:Any) as T
            }
            */
            else -> {
                throw IllegalArgumentException("未知ViewModel的类!")
            }
        }
    }
}

/*
* 在需要初始化ViewModel的地方
* loginViewModel = ViewModelProvider(
*            this,
*            ViewModelFactory(LoginViewModel::class.java)
*       ).get(LoginViewModel::class.java)
*/