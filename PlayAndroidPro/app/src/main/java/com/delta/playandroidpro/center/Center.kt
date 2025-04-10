package com.delta.playandroidpro.center

import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.delta.playandroidpro.PlayAndroidPro
import com.delta.playandroidpro.R
import com.delta.playandroidpro.center.coin.CoinActivity
import com.delta.playandroidpro.center.coin.CoinViewModel
import com.delta.playandroidpro.center.system.ui.fragment.System
import com.delta.playandroidpro.center.home.ui.Home
import com.delta.playandroidpro.center.project.ui.Project
import com.delta.playandroidpro.collect.Collect
import com.delta.playandroidpro.search.Search
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class Center : AppCompatActivity() {
    private var centerAdapter: CenterAdapter? = null

    private lateinit var galleryLauncher:ActivityResultLauncher<Intent>
    private lateinit var requestPermissionLauncher:ActivityResultLauncher<String>
    private lateinit var viewModel: CoinViewModel

    init {
        centerAdapter = CenterAdapter(this, arrayListOf(Home(), System(), Project()))
    }

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.center)

        // 申请打开相册
        requestPermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()){
            isGranted->
            if (isGranted){
                openGallery()
            }else{
                // 拒绝授权
                Toast.makeText(this,"拒绝授权,无法设置头像.",Toast.LENGTH_SHORT).show()
            }
        }

        galleryLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result ->
            if (result.resultCode == RESULT_OK){
                val data:Intent? = result.data
                val selectedImageUri = data?.data
                if (selectedImageUri != null){
                    lifecycleScope.launch {
                        // 图片转base64编码
                        val base64Image = uriToBase64(selectedImageUri)
                        if (base64Image != null){
                            (application as PlayAndroidPro).getUser()?.avatar = base64Image

                            // 保存
                            withContext(Dispatchers.IO){
                                (application as PlayAndroidPro).saveUser()
                            }

                            // 加载
                            withContext(Dispatchers.Main){
                                val bytes = android.util.Base64.decode(base64Image, android.util.Base64.DEFAULT)
                                val bitmap = android.graphics.BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
                                findViewById<ImageView>(R.id.user_avatar).setImageBitmap(bitmap)
                            }
                        }
                    }
                }
            }
        }

        initView()
    }

    private fun uriToBase64(selectedImageUri: Uri): String? {
        return try {
            val inputStream = contentResolver.openInputStream(selectedImageUri)
            val bytes = inputStream?.readBytes()
            inputStream?.close()
            if(bytes !=null){
                android.util.Base64.encodeToString(bytes, android.util.Base64.DEFAULT)
            }else{
                null
            }
        }catch (e: Exception){
            e.printStackTrace()
            Log.d("Center", "图片转base64失败:${e.message}")
            null
        }
    }

    private fun initView() {

        viewModel = ViewModelProvider(this).get(CoinViewModel::class.java).also {
            it.setCookie((application as PlayAndroidPro).getCookie().toString())
            it.setUser((application as PlayAndroidPro).getUser()!!)
        }

        // 侧滑菜单栏
        // 侧滑主体
        val sideMenu = findViewById<DrawerLayout>(R.id.drawer_layout)
        findViewById<NavigationView>(R.id.nav_view).setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_settings -> {
                }

                R.id.nav_collectArticle -> {
                    startActivity(
                        Intent(
                            this@Center,
                            Collect::class.java
                        ).apply { putExtra("START_PAGE", 0) })
                }

                R.id.nav_collectWebsite -> {
                    startActivity(
                        Intent(
                            this@Center,
                            Collect::class.java
                        ).apply { putExtra("START_PAGE", 1) })
                }

                R.id.nav_about -> {
                }

                R.id.nav_mySharedArticle -> {
                }

                else -> {
                }
            }
            sideMenu.closeDrawers()
            true
        }
        // 侧滑头部
        // 头像以及用户名
        val headView = findViewById<NavigationView>(R.id.nav_view).getHeaderView(0)
        viewModel.user.observe(this){
            headView.findViewById<TextView>(R.id.user_name).setText(
                viewModel.user.value?.username
            )
            val bytes = android.util.Base64.decode(
                viewModel.user.value?.avatar,
                android.util.Base64.DEFAULT
            )
            val bitmap = android.graphics.BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
            headView.findViewById<ImageView>(R.id.user_avatar).setImageBitmap(bitmap)
        }

        headView.findViewById<ImageView>(R.id.user_avatar).setOnClickListener {
            openGallery()
        }

        // 请求积分以及积分排行
        viewModel.getCoinInfo()
        viewModel.coinInfo.observe(this){
            headView.findViewById<TextView>(R.id.user_coin_count).setText(it.coinCount.toString())
            headView.findViewById<TextView>(R.id.user_coin_count_rank).setText(it.rank.toString())
        }
        val onShowCoinDetails = object :View.OnClickListener{
            override fun onClick(p0: View?) {
                sideMenu.closeDrawers()
                startActivity(Intent(this@Center, CoinActivity::class.java))
            }
        }
        headView.findViewById<TextView>(R.id.user_coin_count).setOnClickListener(onShowCoinDetails)
        headView.findViewById<TextView>(R.id.user_coin_count_rank).setOnClickListener(onShowCoinDetails)

        // toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        supportActionBar?.setDisplayShowHomeEnabled(false)

        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_menu)

        toolbar.setNavigationOnClickListener {
            sideMenu.openDrawer(GravityCompat.START)
        }


        // 主体部分
        val viewpager = findViewById<androidx.viewpager2.widget.ViewPager2>(R.id.viewpager)
        viewpager.orientation = androidx.viewpager2.widget.ViewPager2.ORIENTATION_HORIZONTAL
        viewpager.isUserInputEnabled = false
        viewpager.adapter = centerAdapter

        // 底部导航栏
        val navigation = findViewById<BottomNavigationView>(R.id.navigation)
        navigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.navigateToHome -> {
                    viewpager.currentItem = 0
                    return@setOnItemSelectedListener true
                }

                R.id.navigateToSystem -> {
                    viewpager.currentItem = 1
                    return@setOnItemSelectedListener true
                }

                R.id.navigateToProject -> {
                    viewpager.currentItem = 2
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }

    private fun openGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        galleryLauncher.launch(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toobar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_open_drawer -> {
                findViewById<DrawerLayout>(R.id.drawer_layout).openDrawer(GravityCompat.START)
                return true
            }

            R.id.action_search -> {
                startActivity(Intent(this@Center, Search::class.java))
                return true
            }

            else -> return super.onOptionsItemSelected(item)
        }
    }

}