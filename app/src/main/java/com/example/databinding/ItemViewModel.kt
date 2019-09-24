package com.example.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.databinding.Data.DataName

class ItemViewModel : ViewModel() {

    var itemData = Repository()

    fun getModel(): MutableLiveData<DataName> {
        return itemData
    }

}
