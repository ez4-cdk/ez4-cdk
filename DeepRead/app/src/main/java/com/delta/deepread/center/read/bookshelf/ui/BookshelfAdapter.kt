package com.delta.deepread.center.read.bookshelf.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.delta.deepread.center.read.bookshelf.data.Novel
import com.delta.deepread.databinding.BookBinding
import com.delta.deepread.databinding.NovelFooterBinding

class BookshelfAdapter(
    private val listener: OnItemClickListener
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var Novels: ArrayList<Novel> = arrayListOf()

    companion object {
        private const val TYPE_BOOK = 0
        private const val TYPE_FOOTER = 1
    }
    interface OnItemClickListener {
        fun onBookClick(novel: Novel)
        fun onFooterClick()
        fun onDeleteNovel(novel: Novel)
    }

    fun addBooks(Novels: List<Novel>) {
        this.Novels.addAll(Novels)
        notifyItemRangeInserted(this.Novels.size-Novels.size,this.Novels.size)
    }

    inner class BookViewHolder(private val binding:BookBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(novel: Novel) {
            binding.bookName.text = novel.name
            binding.bookReadProgress.text = novel.process.toString().plus("%")
            binding.bookUploadTime.text = novel.uploadTime.toString()

            binding.root.setOnClickListener{
                listener.onBookClick(novel)
            }

            binding.root.setOnLongClickListener {
                showDeleteDialog(novel)
                true
            }
        }

        private fun showDeleteDialog(novel: Novel) {
            val builder = AlertDialog.Builder(binding.root.context)
            builder.setTitle("确认删除")
            builder.setMessage("你确定要删除 ${novel.name} 吗？")
            builder.setPositiveButton("删除") { dialog, _ ->
                listener.onDeleteNovel(novel)
                notifyItemRemoved(Novels.indexOf(novel))
                Novels.remove(novel)
                dialog.dismiss()
            }
            builder.setNegativeButton("取消") { dialog, _ ->
                dialog.dismiss()
            }
            builder.show()
        }
    }

    inner class FooterViewHolder(private val binding: NovelFooterBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            binding.footerTag.setOnClickListener {
                listener.onFooterClick()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            TYPE_BOOK -> {
                BookViewHolder(BookBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            }

            TYPE_FOOTER -> {
                FooterViewHolder(NovelFooterBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            }

            else -> {
                BookViewHolder(BookBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is BookViewHolder -> {
                holder.bind(Novels[position])
            }
            is FooterViewHolder -> {
                holder.bind()
            }
        }
    }

    override fun getItemViewType(position: Int): Int = if (position == Novels.size) {
        TYPE_FOOTER
    } else {
        TYPE_BOOK
    }

    override fun getItemCount(): Int = Novels.size+1
    fun bookChange(it: Novel?){
        if (it != null){
            for (i in Novels){
                if (i.id == it.id){
                    i.process = it.process
                    notifyItemChanged(Novels.indexOf(i))
                    break
                }
            }
        }
    }

    fun containsNovel(novelName: String): Boolean {
        for (novel in Novels){
            if (novel.name == novelName){
                return true
            }
        }
        return false
    }

}