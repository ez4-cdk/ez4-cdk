package com.delta.playandroid.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import com.delta.playandroid.R
import com.delta.playandroid.WanAndroidApp
import com.delta.playandroid.databinding.HomeRootBinding
import com.delta.playandroid.databinding.MyInfoBinding
import com.delta.playandroid.ui.adapter.ViewpagerAdapter
import com.delta.playandroid.ui.fragment.home.HomeRoot
import com.delta.playandroid.ui.fragment.project.ProjectRoot
import com.delta.playandroid.ui.fragment.system.SystemRoot
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    private lateinit var binding: HomeRootBinding
    private lateinit var myInfoBinding: MyInfoBinding
    private lateinit var viewpageAdapter: ViewpagerAdapter
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toobar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_open_drawer ->{
                binding.drawerLayout.openDrawer(GravityCompat.START)
                return true
            }
            R.id.action_search ->{
                startActivity(Intent(this,SearchActivity::class.java))
                return true
            }
            else ->return super.onOptionsItemSelected(item)
        }
    }

    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }


    fun initView() {
        //初始化页面数据
        viewpageAdapter = ViewpagerAdapter(
            this, arrayListOf(
                HomeRoot(),
                SystemRoot(),
                ProjectRoot(),
            )
        )
        binding.viewpager.adapter = viewpageAdapter

        //初始页面
        binding.viewpager.setCurrentItem(0, false)

        //点击切换页面
        binding.viewpager.isUserInputEnabled = false
        binding.homeNavigation.setOnItemSelectedListener { itemSelected ->
            when (itemSelected.itemId) {
                R.id.head_page_navigation -> binding.viewpager.setCurrentItem(0, true)
                R.id.tree_page_navigation -> binding.viewpager.setCurrentItem(1, true)
                R.id.project_page_navigation -> binding.viewpager.setCurrentItem(2, true)
                else -> binding.viewpager.setCurrentItem(0, true)
            }
            true
        }

        binding.navView.setNavigationItemSelectedListener{menuItem->
            when(menuItem.itemId){
                R.id.nav_collectArticle->{
                    // 收藏文章页面
                    startActivity(Intent(this, CollectActivity::class.java).apply {
                        putExtra("START_PAGE",0)
                    })
                }
                R.id.nav_collectWebsite->{
                    // 收藏文章页面
                    startActivity(Intent(this, CollectActivity::class.java).apply {
                        putExtra("START_PAGE",1)
                    })
                }
                R.id.nav_mySharedArticle->{
                    Log.d("delta","click mySharedArticle")
                }
                R.id.nav_settings->{
                    Log.d("delta","click settings")
                }
                R.id.nav_about->{
                    Log.d("delta","click about")
                }
                else ->{
                    binding.drawerLayout.closeDrawer(GravityCompat.START)
                }
            }
            binding.drawerLayout.closeDrawer(GravityCompat.START)
            true
        }


        // toolbar
        setSupportActionBar(binding.toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        supportActionBar?.setDisplayShowHomeEnabled(false)

        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_menu)

        binding.toolbar.setNavigationOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }

        myInfoBinding.userName.text = (application as WanAndroidApp).user.value?.username

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //初始化binding
        binding = DataBindingUtil.setContentView(this, R.layout.home_root)

        val headerView = binding.navView.getHeaderView(0)
        myInfoBinding = MyInfoBinding.bind(headerView)

        //初始化页面
        initView()

    }
}