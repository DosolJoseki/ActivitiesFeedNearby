package com.home.joseki.activitiesfeednearby.adapters

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import com.home.joseki.activitiesfeednearby.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.gallery_item.view.*
import java.lang.StringBuilder

class ScrollViewAdapter : RecyclerView.Adapter<ScrollViewAdapter.ScrollViewHolder>() {
    private val items: ArrayList<String> = ArrayList()

    companion object{
        private const val RND_PIC_START = "https://picsum.photos/id/"
        private const val RND_PIC_END = "/200"
    }

    fun clearItems(){
        items.clear()
    }

    fun notifyScroll(){
        notifyDataSetChanged()
    }

    fun addItem(i: String){
        items.add(i)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScrollViewHolder =
        ScrollViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.gallery_item, parent, false))

    override fun onBindViewHolder(holder: ScrollViewHolder, position: Int) = holder.bind()

    inner class ScrollViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(){
            Picasso.get().load(StringBuilder()
                .append(RND_PIC_START).append((1..250).random().toString()).append(RND_PIC_END).toString()).into(itemView.acivImageElement)
        }
    }

    override fun getItemCount(): Int = items.size
}