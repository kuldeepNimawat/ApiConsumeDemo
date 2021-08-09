package com.kuldeep.apiconsumedemo.network

import com.kuldeep.apiconsumedemo.models.RecyclerList
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {
    @GET("repositories")
    suspend fun getDataFromApi(@Query("q") query : String): RecyclerList
}