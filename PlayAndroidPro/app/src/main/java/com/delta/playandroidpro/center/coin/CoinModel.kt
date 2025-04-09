package com.delta.playandroidpro.center.coin

import androidx.lifecycle.MutableLiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.delta.playandroidpro.center.coin.bean.CoinDetailDataSource
import com.delta.playandroidpro.center.coin.bean.CoinService
import com.delta.playandroidpro.center.coin.bean.entity.Coin
import com.delta.playandroidpro.center.coin.bean.entity.CoinDetail
import com.delta.util.net.ServiceBuilder
import kotlinx.coroutines.flow.Flow

/**
 * @description 积分模块MODEL
 * @author delta
 * @date 2025/3/5 10:45
 */
class CoinModel {
    suspend fun getCoinInfo(_coin: MutableLiveData<Coin>, _cookie: MutableLiveData<String>) {
        val response = ServiceBuilder.buildService(CoinService::class.java, _cookie.value)
            .getMyCoinInfo()
        if (response.isSuccessful && response.body() != null) {
            _coin.postValue(response.body()!!.data)
        }
    }

    fun getCoinDetailInfo(
        _coinDetail: MutableLiveData<Flow<PagingData<CoinDetail>>>,
        _cookie: MutableLiveData<String>
    ) {
        _coinDetail.postValue(Pager(
            config = PagingConfig(
                pageSize = 20,
                enablePlaceholders = true
            ), pagingSourceFactory = {
                CoinDetailDataSource(
                    _cookie.value!!
                )
            }).flow
        )
    }
}