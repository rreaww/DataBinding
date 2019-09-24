package com.example.databinding.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.databinding.Data.ListDataName
import com.example.databinding.R
import com.example.databinding.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private var TAG = "DetailActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityDetailBinding = DataBindingUtil.setContentView(this,R.layout.activity_detail)
//        val item = intent.getSerializableExtra("item") as ListDataName
        val item: ListDataName = ListDataName("reaw","rueang",13,"image","mail@gmail.com")
        Log.d(TAG, "item : $item")

        binding.lifecycleOwner = this
//        binding.detail = item
    }
}
