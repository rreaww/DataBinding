package com.example.databinding

import android.content.Intent
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.databinding.Activity.DetailActivity
import com.example.databinding.Data.ListDataName

object BindingAdapter {

    @BindingAdapter("imageUrl")
    @JvmStatic
    fun ImageView.loadImage(url: String) {
        url.let {
            Glide.with(context)
                .load(it)
                .into(this)
        }
    }

    @BindingAdapter("onClickListener")
    @JvmStatic
    fun CardView.onClick(item: ListDataName) {
        setOnClickListener {
            val intent = Intent(it.context, DetailActivity::class.java)
            intent.putExtra("item", item)
            it.context.startActivity(intent)
        }
    }
}