package com.example.databinding

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.databinding.Data.DataName
import com.example.databinding.Remote.Retrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository: MutableLiveData<DataName>(){

    private val TAG = "AnimeLiveData"

    override fun onActive() {
        Retrofit().retrofit().getModelData(2).enqueue(object : Callback<DataName> {
            override fun onResponse(call: Call<DataName>, response: Response<DataName>) {
                Log.d(TAG, "onResponse : $response")
                response.body()?.also {
                    value = it
                }
            }

            override fun onFailure(call: Call<DataName>, t: Throwable) {
                Log.d(TAG, "onFailure : ${t.message}")
            }

        })
    }

    override fun onInactive() {
        super.onInactive()

    }
}

