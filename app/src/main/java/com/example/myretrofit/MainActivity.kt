package com.example.myretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
   private fun iniRecyclerView(recyclerView: RecyclerView){

        recyclerView.apply {
            layoutManager= LinearLayoutManager(this@MainActivity)
            val decoration = DividerItemDecoration(this@MainActivity)
            addItemDecoration(decoration)
        }
   }
}