package com.example.simplerequestapi.model


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("url")
    val url: String
)