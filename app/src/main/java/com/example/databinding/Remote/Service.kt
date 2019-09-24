package com.example.databinding.Remote

import com.example.databinding.Data.DataName
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {

    @GET("users")
    fun getModelData(@Query("page") page: Int): Call<DataName>
}