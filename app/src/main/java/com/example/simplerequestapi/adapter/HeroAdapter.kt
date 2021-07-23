package com.example.simplerequestapi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.simplerequestapi.databinding.HeroItemBinding
import com.example.simplerequestapi.model.HeroResult

class HeroAdapter ( val onHeroSelected : (hero : HeroResult) -> Unit ) : RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    private val heroes = mutableListOf<HeroResult>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        return HeroViewHolder(
            HeroItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    fun updateList(newHeroes: List<HeroResult>){
        heroes.clear()
        heroes.addAll(newHeroes)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.bind(heroes[position])

    }

    inner class HeroViewHolder(private val binding: HeroItemBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(hero: HeroResult) {
            binding.hero = hero

            binding.root.setOnClickListener {
            onHeroSelected(hero)
        }

        }

    }

    override fun getItemCount() = heroes.size

}