package com.example.myapplication.Api

import retrofit2.http.GET
import retrofit2.http.Query

interface APICalling {
@GET ("people")
suspend fun getInstance(@Query("page") page: Int):ResponseDTO

}
