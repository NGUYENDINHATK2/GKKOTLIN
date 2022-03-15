package com.example.nguyendinhat_20it536

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class RecyclerAdapter(private val mList: List<ItemsViewModel>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()  {


    fun randomColor(){

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)

        v.setBackgroundColor(Color.argb( Random.nextInt(0, 255),  Random.nextInt(0, 255),  Random.nextInt(0, 255),  Random.nextInt(0, 255)))
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {

        val ItemsViewModel=mList[position]
        holder.itemtitle.text=ItemsViewModel.title

    }

    override fun getItemCount(): Int {
        return mList.size
    }

    inner  class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {


        var itemtitle: TextView

        init {

            itemtitle = itemView.findViewById(R.id.item_title)

        }
    }

}