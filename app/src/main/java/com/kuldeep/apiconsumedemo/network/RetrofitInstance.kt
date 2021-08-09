package com.kuldeep.apiconsumedemo.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    companion object{
        val BaseUrl="https://api.github.com/search/"

        fun getRetrofitInstance(): Retrofit{
            return Retrofit.Builder()
                .baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }

}