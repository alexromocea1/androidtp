package com.example.simplerequestapi.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("response")
    val response: String,
    @SerializedName("results")
    val results: List<Result>,
    @SerializedName("results-for")
    val resultsFor: String
)