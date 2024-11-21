package com.delta.playandroid.data.local.Manager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.delta.playandroid.data.model.bean.entity.Article
import kotlinx.coroutines.flow.first

val Context.datastore: DataStore<Preferences> by preferencesDataStore(name = "app_preferences")

class DataStoreManager private constructor(context: Context) {
    private val dataStore: DataStore<Preferences> = context.datastore

    companion object{
        @Volatile
        private var instance:DataStoreManager ?=null

        fun getInstance(context: Context):DataStoreManager{
            return instance?: synchronized(this){
                instance?:DataStoreManager(context).also { instance = it }
            }
        }
    }


    suspend fun saveToDataStore(key: String, value: String){
        val dataStoreKey = stringPreferencesKey(key)
        val data = value
        dataStore.edit { it[dataStoreKey] = data }
    }

    suspend fun readFromDataStore(key: String): String?{
        val dataStoreKey = stringPreferencesKey(key)
        val result: String? = dataStore.data.first()[dataStoreKey]
        return result
    }
}