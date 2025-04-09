package com.delta.deepread.center.read.bookshelf.ui

import android.net.Uri
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.delta.deepread.R
import com.delta.deepread.center.CenterActivity
import com.delta.deepread.center.read.ReadViewModel
import com.delta.deepread.center.read.bookshelf.data.Novel
import com.delta.deepread.common.BaseFragment
import com.delta.deepread.databinding.BookstoreBinding
import com.delta.deepread.util.file.Selector
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class Bookshelf : BaseFragment<BookstoreBinding>(R.layout.bookstore, BookstoreBinding::inflate),
    BookshelfAdapter.OnItemClickListener, Selector.onHandleUri {
    private val viewModel: ReadViewModel by activityViewModels()
    private lateinit var bookshelfAdapter: BookshelfAdapter
    private val selector = Selector(this,this)
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())

    override fun loading() {
    }

    override fun loaded() {
    }

    override fun initView() {
        bookshelfAdapter = BookshelfAdapter(this)
        binding.booksRv.layoutManager =
            androidx.recyclerview.widget.LinearLayoutManager(requireContext())
        binding.booksRv.adapter = bookshelfAdapter

        // 获取书架内容
        viewModel.novelList.observe(viewLifecycleOwner){
            bookshelfAdapter.addBooks(it)
        }
        viewModel.getAllNovels(requireContext())

        // 保存阅读进度
        viewModel.novel.observe(viewLifecycleOwner){
            bookshelfAdapter.bookChange(it)
        }

        // 请求读写权限
        selector.requestPermissions()
    }

    override fun onBookClick(novel: Novel) {
        viewModel.readNovelContent(requireContext(), novel)
        (requireActivity() as CenterActivity).switchToDeskBook()
    }

    override fun onFooterClick() {
        selector.requestForTXTFile()
    }

    override fun onDeleteNovel(novel: Novel) {
        viewModel.deleteNovel(requireContext(),novel)
    }

    override fun onHandle(fileName: String?, uri: Uri) {
        fileName?.let {
            val cleanFileName = it.replace(".txt","")
            val formattedName = "《$cleanFileName》"

            if (bookshelfAdapter.containsNovel(formattedName)){
                Toast.makeText(requireContext(), "书架中已有同名文件", Toast.LENGTH_SHORT).show()
                return@let
            }else{
                val novel = Novel(
                    id = bookshelfAdapter.itemCount,
                    name = formattedName,
                    uploadTime = dateFormat.format(Date()),
                    uri = uri,
                    process = 0
                )

                // 将选中的文件添加至书架上
                bookshelfAdapter.addBooks(
                    listOf(
                        novel
                    )
                )

                // 将路径保存到本地
                viewModel.addNovel(requireContext(), novel)
            }
        }
    }
}