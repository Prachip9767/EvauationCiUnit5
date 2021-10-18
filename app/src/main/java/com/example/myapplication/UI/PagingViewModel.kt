package com.example.myapplication.UI

import androidx.lifecycle.ViewModel
import com.example.myapplication.PagingClass.PagingSource
import com.example.myapplication.Reposetory.PagingRepo

class PagingViewModel:ViewModel() {
    private val repo=PagingRepo()
    fun getPage(){
        repo.getPageList()
    }
}