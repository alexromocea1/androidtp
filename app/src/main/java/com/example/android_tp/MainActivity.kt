package com.example.android_tp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_tp.adapter.HeroAdapter
import com.example.android_tp.databinding.ActivityMainBinding
import com.example.android_tp.model.HeroResult

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView : RecyclerView = findViewById(R.id.recycleView);

        recyclerView.layoutManager = LinearLayoutManager(this);

        var adapter = HeroAdapter()
        val heroes : MutableList<HeroResult>  = mutableListOf<HeroResult>()
        heroes.add(HeroResult("1","test",null))
        heroes.add(HeroResult("1","test2",null))
        heroes.add(HeroResult("1","test3",null))
        heroes.add(HeroResult("1","test4",null))


        adapter.updateList(heroes);

        recyclerView.adapter = adapter
    }
}