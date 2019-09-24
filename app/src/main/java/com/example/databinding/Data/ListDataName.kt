package com.example.databinding.Data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ListDataName(
    @SerializedName("first_name")
    val name: String,
    @SerializedName("last_name")
    val last: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("avatar")
    val image: String,
    @SerializedName("email")
    val email: String
): Serializable