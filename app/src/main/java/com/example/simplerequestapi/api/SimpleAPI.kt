package com.example.simplerequestapi.api

import com.example.simplerequestapi.model.Data
import retrofit2.http.GET
import retrofit2.http.Path

interface SimpleAPI {
    @GET("search/{name}")
    suspend fun getPost(@Path("name")name:String): Data
}