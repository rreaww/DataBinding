package com.example.databinding.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.databinding.Adapter
import com.example.databinding.ItemViewModel
import com.example.databinding.R
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: Adapter
    private lateinit var model: ItemViewModel
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addData()
    }

    fun addData() {
        model = ViewModelProviders.of(this)[ItemViewModel::class.java]//ViewModel
        val liveData = model.getModel()
        Log.d(TAG, "${liveData.value?.page}")
        adapter = Adapter()
        rrc_items.layoutManager = GridLayoutManager(this, 2)
        rrc_items.adapter = adapter//Set Adapter
        liveData.observe(this, Observer { it ->
            it.let { model ->
                adapter.list = model.data
                adapter.notifyDataSetChanged()//Observe Data
            }
        })
    }
}
