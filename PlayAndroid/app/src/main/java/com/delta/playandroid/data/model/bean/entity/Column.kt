package com.delta.playandroid.data.model.bean.entity

/**
 * 首页最受欢迎板块-路线
 * 体系数据
 */
data class Column(
    val articleList: List<Article>,
    val author: String,
    val children: List<Column>,
    val courseId: Int, //本id用于查找当前id下的文章
    val cover: String,
    val desc: String,
    val id: Int,
    val lisense: String,
    val lisenseLink: String,
    val name: String,
    val order: Int,
    val parentChapterId: Int,
    val type: Int,
    val userControlSetTop: Boolean,
    val visible: Int
)
