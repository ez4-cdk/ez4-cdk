package com.delta.playandroid.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.delta.playandroid.data.model.bean.entity.Article
import com.delta.playandroid.databinding.ProjectItemBinding

class ProjectListAdapter(
    private val onItemClickListener: onProjectItemClickListener
):PagingDataAdapter<Article,ProjectListAdapter.viewHolder>(COMPARATOR){

    companion object{
        private val COMPARATOR = object :DiffUtil.ItemCallback<Article>(){
            override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem == newItem
            }

        }
    }

    interface onProjectItemClickListener {
        fun onItemClick(url: String)
    }

    inner class viewHolder(private val binding:ProjectItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(project:Article){
            binding.author.text = project.author
            binding.uploadTime.text = project.niceShareDate
            binding.desc.text = project.desc
            binding.github.text = project.projectLink

            binding.desc.setOnClickListener {
                onItemClickListener.onItemClick(project.link)
            }

            Glide.with(binding.root.context).load(project.envelopePic).into(binding.pic)
        }
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val project = getItem(position)
        if (holder.itemView.scaleX == 0.1f){
            holder.itemView.postDelayed({
                holder.itemView.animate()
                    .scaleX(1f)
                    .scaleY(1f)
                    .setDuration(200)
                    .setInterpolator(AccelerateInterpolator())
                    .start()
            }, 50L)
        }
        if(project!=null){
            holder.bind(project)
        }else{
            //空数据，显示占位符
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val binding = ProjectItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        val viewHolder = viewHolder(binding)
        viewHolder.itemView.scaleX = 0.1f
        viewHolder.itemView.scaleY = 0.1f
        viewHolder.itemView.postDelayed({
            viewHolder.itemView.animate()
                .scaleX(1f)
                .scaleY(1f)
                .setDuration(200)
                .setInterpolator(AccelerateInterpolator())
                .start()
        }, 50L)
        return viewHolder
    }
}