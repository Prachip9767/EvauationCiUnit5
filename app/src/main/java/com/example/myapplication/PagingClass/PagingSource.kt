package com.example.myapplication.PagingClass

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.myapplication.Api.Network
import com.example.myapplication.Api.ResponseDTO
import com.example.myapplication.Api.ResponseDTOItem

class PagingSource: PagingSource<Int, ResponseDTOItem>() {
    private val apiCall=Network.getApiService()
    override suspend fun load(params: PagingSource.LoadParams<Int>): PagingSource.LoadResult<Int,ResponseDTOItem > {
        val pageNumber=params.key ?: 1
        val responseDTO:ResponseDTO=apiCall.getInstance(pageNumber)
        val resultList:List<ResponseDTOItem> = responseDTO

        return try {
            PagingSource.LoadResult.Page(data = resultList, prevKey = null,nextKey = if (resultList.isEmpty()) null else pageNumber+1)
        }catch (e:Exception){
            PagingSource.LoadResult.Error(e)
        }

    }
    override fun getRefreshKey(state: PagingState<Int,ResponseDTOItem >): Int? {
        return state.anchorPosition
    }
}