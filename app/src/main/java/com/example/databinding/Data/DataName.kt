package com.example.databinding.Data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DataName (
    @SerializedName("data")
    var data: List<ListDataName>,
    @SerializedName("page")
    var page: Int,
    @SerializedName("per_page")
    var perpage: Int,
    @SerializedName("total")
    var total: Int,
    @SerializedName("total_pages")
    var totalPages: Int
): Serializable