package com.example.myapplication.Api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Network {
    val BASE_URL="https://api.tvmaze.com/"
    fun getRetrofit()= Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create()).build()

    fun getApiService()= getRetrofit().create(APICalling::class.java)
}