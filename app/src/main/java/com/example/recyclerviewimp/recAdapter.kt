package com.example.recyclerviewimp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecAdapter(private val items:ArrayList<item_data>) : RecyclerView.Adapter<RecViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecViewHolder{
        return RecViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false))
    }

    override fun onBindViewHolder(holder: RecViewHolder, position: Int) {
        holder.textV1.text = items[position].t1
        holder.textV2.text = items[position].t2
        holder.imgV.setImageResource(R.drawable.pokhu)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class RecViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textV1: TextView = itemView.findViewById(R.id.textView)
    val textV2: TextView = itemView.findViewById(R.id.textView2)
    val imgV: ImageView = itemView.findViewById(R.id.imageView)
}