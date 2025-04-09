package com.delta.deepread.util.file

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.provider.OpenableColumns
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class Selector(
    private val fragment:Fragment,
    private val uriHandler: onHandleUri
) {

    interface onHandleUri{
        fun onHandle(fileName:String?,uri: Uri)
    }

    /**
     * 发起文件选择请求
     */
    fun requestForTXTFile(){
        selectFileLauncher.launch("text/plain")
    }
    fun requestForMP3File(){
        selectFileLauncher.launch("audio/*")
    }

    /**
     * 文件选择器
     */
    private val selectFileLauncher = fragment.registerForActivityResult(
        ActivityResultContracts.GetContent()
    ){
        // 获取到文件的uri
        it?.let {
            uriHandler.onHandle(getFileNameFromUri(fragment.requireContext(),it),it)
        }
    }

    /**
     * 权限请求器
     */
    private val requestPermissionLauncher = fragment.registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        for ((permission, isGranted) in permissions) {
            if (isGranted) {
                Log.d("BookStore", "Permission granted: $permission")
            } else {
                Log.d("BookStore", "Permission denied: $permission")
            }
        }
    }


    // 从 Uri 获取文件名称
    private fun getFileNameFromUri(context: Context, uri: Uri): String? {
        val cursor = context.contentResolver.query(uri, null, null, null, null)
        cursor?.use {
            val columnIndex = it.getColumnIndex(OpenableColumns.DISPLAY_NAME)
            if (it.moveToFirst()) {
                return it.getString(columnIndex)
            }
        }
        return null
    }

    /*
    * 请求读写权限
    * */
    fun requestPermissions() {
        val permissions = mutableListOf<String>()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            permissions.add(Manifest.permission.READ_MEDIA_AUDIO)
            permissions.add(Manifest.permission.READ_MEDIA_VIDEO)
            permissions.add(Manifest.permission.READ_MEDIA_IMAGES)
        } else {
            permissions.add(Manifest.permission.READ_EXTERNAL_STORAGE)
            permissions.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }

        val ungrantedPermissions = permissions.filter {
            ContextCompat.checkSelfPermission(
                fragment.requireContext(),
                it
            ) != PackageManager.PERMISSION_GRANTED
        }

        if (ungrantedPermissions.isNotEmpty()) {
            requestPermissionLauncher.launch(ungrantedPermissions.toTypedArray())
        }
    }

}