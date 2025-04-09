package com.delta.playandroidpro.login.widget.ExpandableCardView

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.delta.playandroidpro.databinding.AutoLoginUserBinding
import com.delta.playandroidpro.databinding.FooterBinding
import com.delta.playandroidpro.login.bean.User

class ECVAdapter(
    private val onItemClickListener: ExpandableCardView.onClickListener
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object{
        private const val TYPE_USER = 0
        private const val TYPE_FOOTER = 1
    }

    private var dataList: List<User> = emptyList()

    inner class UserViewHolder(val binding:AutoLoginUserBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: User) {
            val user = item
            binding.username.setText(user.username)
            binding.avatar.setImageBitmap(
                base64ToBitmap(user.avatar)
            )
        }
    }

    inner class FooterViewHolder(val binding: FooterBinding):RecyclerView.ViewHolder(binding.root){
        @SuppressLint("SetTextI18n")
        fun bind(){
            binding.footerTag.text = "没有更多了"
        }
    }


    private fun base64ToBitmap(base64String: String): Bitmap? {
        val decodedString: ByteArray = Base64.decode(base64String, Base64.DEFAULT)
        return BitmapFactory.decodeByteArray(decodedString, 0, decodedString.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == TYPE_USER){
            UserViewHolder(AutoLoginUserBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        }else{
            FooterViewHolder(FooterBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is UserViewHolder){
            holder.bind(dataList[position])
            holder.itemView.setOnClickListener {
                onItemClickListener.onClick(dataList[position])
            }
        }else{
            (holder as FooterViewHolder).bind()
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == dataList.size) TYPE_FOOTER else TYPE_USER
    }

    override fun getItemCount(): Int {
        return dataList.size+1
    }

    fun setData(data: List<User>) {
        dataList = data
        notifyDataSetChanged()
    }
}
