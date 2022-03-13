package com.example.grid_layout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso

class adapter(val values  :Array<String>,val imagevalues :Array<String>): RecyclerView.Adapter<adapter.ViewHolder>() {

    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        val imagevalues : ImageView = itemView.findViewById(R.id.image)
        val title : TextView = itemView.findViewById(R.id.hed)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.photos_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = values[position]
        Picasso.get().load(imagevalues[position]).into(holder.imagevalues);


    }

    override fun getItemCount(): Int {
        return imagevalues.size
    }

}