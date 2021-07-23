package com.example.simplerequestapi.api

import com.example.simplerequestapi.model.Data
import retrofit2.http.GET

interface SimpleAPI {
    @GET("search/iron")
    suspend fun getPost(): Data
}