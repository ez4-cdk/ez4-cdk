package com.delta.playandroid.common

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import androidx.paging.log
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.data.model.bean.entity.Website
import javax.annotation.meta.When
import kotlin.Result

abstract class BasePagingDataSource<Object:Any>(
    private val loadData: suspend (Int)->Result<List<Object>>,
    private val CLASS_TYPE:Class<Object>
): PagingSource<Int, Object>() {
    override fun getRefreshKey(state: PagingState<Int,Object>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

    private fun getLastItem():List<Object>{

        when (CLASS_TYPE) {
            Article::class.java -> {
                val lastItemSignal = Article(id = -1) as Object
                return listOf(lastItemSignal)
            }
            Website::class.java -> {
                val lastItemSignal = Website(id = -1) as Object
                return listOf(lastItemSignal)
            }
            else -> {
                throw IllegalArgumentException("Unknown class type: ${CLASS_TYPE.name}")
            }
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Object> {
        val page = params.key ?: 0
        return try {
            val result = loadData(page)
            result.getOrNull()?.let { items ->
                if (items.isEmpty()){
                    LoadResult.Page(
                        data = getLastItem(),
                        prevKey = null,
                        nextKey = null
                    )
                }else{
                    LoadResult.Page(
                        data = items,
                        prevKey = if (page == 0) null else page - 1,
                        nextKey = if (items.isEmpty()) null else page + 1
                    )
                }
            } ?: LoadResult.Error(Exception("Error in fetching items."))
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }
    }

}