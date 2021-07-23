package com.example.simplerequestapi.repository

import com.example.simplerequestapi.api.RetrofitInstance
import com.example.simplerequestapi.model.Data


class Repository {

    suspend fun getPost(): Data {
        return RetrofitInstance.api.getPost()
    }
}