package com.example.databinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.Data.ListDataName
import com.example.databinding.databinding.ItemBinding

class Adapter() : RecyclerView.Adapter<Adapter.ViewHolder>() {

    var list: List<ListDataName> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding =
            DataBindingUtil.inflate<ItemBinding>(layoutInflater, R.layout.item, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindItems(data: ListDataName) {
//            binding.item = data
//            binding.executePendingBindings()
        }
    }
}

