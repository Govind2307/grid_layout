package com.example.grid_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagevalues :Array<String> = resources.getStringArray(R.array.cardImages)
        val heading :Array<String> = resources.getStringArray(R.array.photo)
        val gridlayout = GridLayoutManager(this,2)
        val adapter =adapter(heading,imagevalues)
        val recycler = findViewById<RecyclerView>(R.id.gridItems)

        recycler.layoutManager = gridlayout
        recycler.adapter
    }
}