package com.example.simplerequestapi.adapter.binding

import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.example.simplerequestapi.R
import com.squareup.picasso.Picasso

@BindingAdapter("imageUrl")
fun loadImage(imageView: ImageView, imageUrl: String?) {
        Picasso.get().load(imageUrl).error(ContextCompat.getDrawable(imageView.context, R.drawable.ic_flower)!!).into(imageView)
        imageView.alpha = 1f
}