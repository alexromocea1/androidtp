package com.example.simplerequestapi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.simplerequestapi.model.Data
import com.example.simplerequestapi.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository): ViewModel() {

    val myResponse : MutableLiveData<Data> = MutableLiveData()

    fun getPost(name:String) {
        viewModelScope.launch {
            val response = repository.getPost(name)
            myResponse.value = response
        }
    }
}