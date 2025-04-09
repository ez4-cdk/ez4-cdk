package com.delta.playandroidpro.center.coin.bean

import com.delta.playandroidpro.center.coin.bean.entity.Coin
import com.delta.playandroidpro.center.coin.bean.entity.CoinDetail
import com.delta.playandroidpro.common.BaseResponse
import com.delta.playandroidpro.common.Pack
import com.delta.util.net.WebConstant
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @description 积分模块API
 * @author delta
 * @date 2025/3/5 10:44
 */
interface CoinService {
    @GET(WebConstant.coinAPI.API_GET_MY_INFO)
    suspend fun getMyCoinInfo(): Response<BaseResponse<Coin>>

    @GET(WebConstant.coinAPI.API_GET_MY_DETAIL_INFO)
    suspend fun getMyCoinDetailInfo(
        @Path("page")page:Int
    ):Response<BaseResponse<Pack<CoinDetail>>>
}