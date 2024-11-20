package com.delta.playandroid.ui.adapter

import android.annotation.SuppressLint
import android.media.Image
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.delta.playandroid.R
import com.delta.playandroid.data.model.bean.entity.User

class FastLogInUserAdapter(
    private val onLogInPosition: onUserClickListener
):RecyclerView.Adapter<FastLogInUserAdapter.viewHolder>(){

    interface onUserClickListener{
        fun login(position: Int)
    }

    private var userList = ArrayList<User>()
    inner class viewHolder(view: View):RecyclerView.ViewHolder(view){
        val username = view.findViewById<TextView>(R.id.username)
        val avatar = view.findViewById<ImageView>(R.id.avatar)
    }

    /**
     * @Date 2024/11/19
     * @Description 修复了进入游客模式后点击收藏时闪退的BUG
     */
    @SuppressLint("NotifyDataSetChanged")
    fun initUserList(users:ArrayList<User>){
        userList.clear()
        userList.addAll(users)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(View.inflate(parent.context,R.layout.fast_login_user,null))
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.username.text = userList.get(position).username
        holder.itemView.setOnClickListener {
            onLogInPosition.login(position)
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}