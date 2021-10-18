package com.example.myapplication.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var pagingViewModel: PagingViewModel
    private lateinit var charecterAdapter: CharecterAdapter
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        pagingViewModel=ViewModelProvider(this).get(PagingViewModel::class.java)
        setAdapter()
        pagingViewModel.getPage().observe(this,{
            it?.let {
                CoroutineScope(Dispatchers.IO).launch {
                    charecterAdapter.submitData(it)
                }
            }
        })
}
private fun setAdapter(){
    charecterAdapter= CharecterAdapter()
    val linearLayoutManager=LinearLayoutManager(this)
    mainBinding.recyclerView.apply {
        adapter=charecterAdapter
        layoutManager=linearLayoutManager
    }
}
}