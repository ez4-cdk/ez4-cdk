package com.delta.playandroidpro.center.coin.bean.entity

/**
 * @description 积分获取详情
 * @author delta
 * @date '2025/3/5' 10:44
 */
data class CoinDetail(
    val coinCount: Int,
    val date: Long,
    val desc: String,
    val id: Int,
    val reason: String,
    val type: Int,
    val userId: Int,
    val userName: String
)