package com.delta.playandroid.data.model.bean.entity

/**
 * 首页文章列表
 * 知识体系下的文章
 */
data class ArticlePack (
    val curPage:Int,
    val datas:ArrayList<Article>,
    val offset:Int,
    val over:Boolean,
    val pageCount:Int,
    val size:Int,
    val total:Int
)