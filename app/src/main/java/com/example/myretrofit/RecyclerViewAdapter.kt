package com.example.myretrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myretrofit.R.layout.recucler_row_list

class RecyclerViewAdapter:RecyclerView.Adapter<RecyclerViewAdapter.myViewHolder>() {

    var userList = mutableListOf<User>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.myViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(recucler_row_list,parent,false)
        return myViewHolder(inflater)
    }

    override fun onBindViewHolder(holder:RecyclerViewAdapter.myViewHolder , position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return userList.size
    }
    class myViewHolder(view: View):RecyclerView.ViewHolder(view){

    fun bind(data : User){


            }

    }
}