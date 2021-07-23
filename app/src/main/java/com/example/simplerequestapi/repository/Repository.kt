package com.example.simplerequestapi.repository

import com.example.simplerequestapi.api.RetrofitInstance
import com.example.simplerequestapi.model.Data


class Repository {

    suspend fun getPost(name:String): Data {
        return RetrofitInstance.api.getPost(name)
    }
}