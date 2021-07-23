package com.example.simplerequestapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SearchView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.simplerequestapi.adapter.HeroAdapter
import com.example.simplerequestapi.model.HeroResult
import com.example.simplerequestapi.repository.Repository

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView : RecyclerView = findViewById(R.id.recycleView);

        recyclerView.layoutManager = LinearLayoutManager(this);

        var adapter = HeroAdapter {}
        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)

        var results : List<HeroResult> = listOf()

        viewModel = ViewModelProvider(this,viewModelFactory).
        get(MainViewModel::class.java)

        recyclerView.adapter = adapter

        var searchBar : SearchView = findViewById(R.id.searchView)

        searchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String): Boolean {
                if(newText != "")viewModel.getPost(newText)
                return false
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }
        })

        viewModel.myResponse.observe(this, Observer { response ->
            adapter.updateList(response.results)

        })
    }
}