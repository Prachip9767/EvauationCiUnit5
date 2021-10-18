package com.example.myapplication.Reposetory

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.myapplication.PagingClass.PagingSource

class PagingRepo {
    fun getPageList()= Pager(config = PagingConfig(pageSize = 20),
        pagingSourceFactory = { PagingSource() }).liveData
}