package com.delta.playandroidpro.center.coin.bean

import com.delta.playandroidpro.center.coin.bean.entity.CoinDetail
import com.delta.playandroidpro.common.BasePagingDataSource
import com.delta.util.net.ServiceBuilder

/**
 * @description 积分获取详情数据源
 * @author delta
 * @date 2025/3/5 10:44
 */
class CoinDetailDataSource(
    netProxy: CoinService
):BasePagingDataSource<CoinDetail>(
    {
        val response = netProxy.getMyCoinDetailInfo(it)
        Result.success(response.body()?.data?.datas.orEmpty())
    }, CoinDetail::class.java
)