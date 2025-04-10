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

    private lateinit var netProxy: CoinService
    fun init(cookie:String) {
        netProxy = ServiceBuilder.buildService(CoinService::class.java,cookie)
    }
    suspend fun getCoinInfo(_coin: MutableLiveData<Coin>) {
        val response = netProxy.getMyCoinInfo()
        if (response.isSuccessful && response.body() != null) {
            _coin.postValue(response.body()!!.data)
        }
    }

    fun getCoinDetailInfo(
        _coinDetail: MutableLiveData<Flow<PagingData<CoinDetail>>>,
    ) {
        _coinDetail.postValue(Pager(
            config = PagingConfig(
                pageSize = 20,
                enablePlaceholders = true
            ), pagingSourceFactory = {
                CoinDetailDataSource(
                    netProxy
                )
            }).flow
        )
    }
}