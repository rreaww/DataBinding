package com.example.databinding.Remote

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {

    fun retrofit(): Service {
        val gson = GsonBuilder().setLenient().create()
        var retrofit = Retrofit
            .Builder()
            .baseUrl("https://reqres.in/api/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
        return retrofit.create(Service::class.java)
    }
}