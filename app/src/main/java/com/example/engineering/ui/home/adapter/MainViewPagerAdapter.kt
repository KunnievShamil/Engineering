package com.example.engineering.ui.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.example.engineering.R

class MainViewPagerAdapter(private val imgUrlList:List<String>) : RecyclerView.Adapter<MainViewPagerAdapter.ViewPagerViewHolder>() {

    inner class ViewPagerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun setData(imageUrl: String) {

            Glide.with(itemView.context)
                .load(imageUrl)
                .error(R.drawable.ic_baseline_error_24)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(itemView.findViewById(R.id.ivImage))
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main_view_pager2,parent,false)
        return ViewPagerViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {

        holder.setData(imgUrlList.get(position))
    }
    override fun getItemCount(): Int =
    imgUrlList.size
}