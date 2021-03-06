package com.example.simplerequestapi.model

import com.google.gson.annotations.SerializedName

data class SearchResult(
    val response: String,
    val results: List<HeroResult>?,
    @SerializedName("results-for")val resultsFor: String?
)