package com.example.test.connection.model

import com.google.gson.annotations.SerializedName

data class Hero(
    val response: String,
    val results: List<Result>,
    @SerializedName("results-for")val resultsFor: String
)