package com.delta.playandroid.data.model.bean.entity

/**
 * 首页最受欢迎板块-专栏
 */
data class Chapter(
    val chapterId: Int,
    val chapterName: String,
    val columnId: Int,
    val id: Int,
    val name: String,
    val subChapterId: Int,
    val subChapterName: String,
    val url: String,
    val userId: Int
)
