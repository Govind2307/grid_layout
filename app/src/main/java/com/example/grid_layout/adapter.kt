package com.example.grid_layout

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class adapter(var context : Context): RecyclerView.Adapter<adapter.ViewHolder>() {

    var datalist = emptyList<DataModel>()

    class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView) {

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: adapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }



}