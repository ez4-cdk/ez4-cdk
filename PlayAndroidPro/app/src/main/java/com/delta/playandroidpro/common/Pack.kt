package com.delta.playandroidpro.common

/**
 * @description 文章列表
 * @author delta
 * @date 2025/2/8 16:54
 */
data class Pack<T> (
    val curPage:Int,
    val datas:ArrayList<T>,
    val offset:Int,
    val over:Boolean,
    val pageCount:Int,
    val size:Int,
    val total:Int
)