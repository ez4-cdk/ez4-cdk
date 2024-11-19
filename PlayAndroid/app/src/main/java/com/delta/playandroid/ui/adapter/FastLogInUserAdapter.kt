package com.delta.playandroid.ui.adapter

import android.media.Image
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

    private val userList = ArrayList<User>()
    inner class viewHolder(view: View):RecyclerView.ViewHolder(view){
        val username = view.findViewById<TextView>(R.id.username)
        val avatar = view.findViewById<ImageView>(R.id.avatar)
    }
    fun initUserList(users:ArrayList<User>){
        userList.clear()
        userList.addAll(users)
        notifyItemInserted(0)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(View.inflate(parent.context,R.layout.fast_login_user,null))
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.username.text = userList.get(position).username
        holder.itemView.setOnClickListener {
            onLogInPosition.login(position)
        }
        //头像TODO
    }

    override fun getItemCount(): Int = userList.size
}