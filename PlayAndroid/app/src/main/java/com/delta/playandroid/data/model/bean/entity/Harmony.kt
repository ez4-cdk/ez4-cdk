package com.delta.playandroid.data.model.bean.entity

/**
 * 鸿蒙专栏
 */
data class Harmony (
    //常用链接
    val links:List<obj>,
    //开源项目
    val open_sources:List<obj>,
    //常用工具
    val tools:List<obj>
) {
    data class obj (
        val articleList:List<Article>,
        val author: String,
        val children: List<child>,
        val courseId: Int,
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
    ) {
        data class child(
            val cid:Int
        )
    }
}