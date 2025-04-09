package com.delta.playandroidpro.common

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.delta.playandroidpro.center.coin.bean.entity.CoinDetail
import com.delta.playandroidpro.center.home.bean.entity.Article
import com.delta.playandroidpro.center.home.bean.entity.Website

import kotlin.Result
/**
 * @description 一个通用的PagingDataSource基类
 * @author delta
 * @date 2025/2/3 10:51
 */
abstract class BasePagingDataSource<item:Any>(
    private val loadData: suspend (Int) ->Result<List<item>>,
    private val CLASS_TYPE:Class<item>
):PagingSource<Int,item>(){
    override fun getRefreshKey(state: PagingState<Int, item>): Int? {
        return state.anchorPosition?.let {
            val anchorPage = state.closestPageToPosition(it)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, item> {
        return try {
            val page = params.key ?: 0
            val pagingData = loadData(page)
            pagingData.getOrNull()?.let {
                if (it.isEmpty()){
                    val lastItem:List<item> = when (CLASS_TYPE){
                        Article::class.java -> {
                            listOf(Article(id = -1) as item)
                        }
                        Website::class.java -> {
                            listOf(Website(id = -1) as item)
                        }
                        CoinDetail::class.java -> {
                            listOf(CoinDetail(id = -1, userId = -1, userName = "", coinCount = -1, date = -1, desc = "", reason = "", type = -1) as item)
                        }
                        else -> {
                            throw IllegalArgumentException("Unknown class type: ${CLASS_TYPE.name}")
                        }
                    }
                    LoadResult.Page(
                        data = lastItem,
                        prevKey = if (page == 0) null else page - 1,
                        nextKey = null
                    )
                }else{
                    LoadResult.Page(
                        data = it,
                        prevKey = if (page == 0) null else page - 1,
                        nextKey = if (it.isEmpty()) null else page + 1
                    )
                }
            }?:LoadResult.Error(Exception("Cannot get item list,check the network."))
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}