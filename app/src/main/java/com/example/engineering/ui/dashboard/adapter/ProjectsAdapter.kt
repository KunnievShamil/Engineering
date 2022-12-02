package com.example.engineering.ui.dashboard.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.example.engineering.R
import com.example.engineering.data.entitys.Project
import java.util.zip.Inflater

class ProjectsAdapter(val list: List<Project>) : RecyclerView.Adapter<ProjectsAdapter.ViewHolder>() {
    class ViewHolder(var itemView: View) : RecyclerView.ViewHolder(itemView){
        fun setData(project: Project) {

            Glide.with(itemView.context)
                .load(project.imgUrl)
                .error(R.drawable.ic_baseline_error_24)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(itemView.findViewById(R.id.imageView3))

            itemView.findViewById<TextView>(R.id.textView7).text = project.name
            itemView.findViewById<TextView>(R.id.description).text = project.description
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_project,parent,false)

        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.setData(list.get(position))
    }
    override fun getItemCount(): Int =
        list.size

}