package com.example.contactrecyclerview.DataBase

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ContactsApp:Application() {
    companion object{
        lateinit var appContext:Context
    }

    override fun onCreate() {
        super.onCreate()
        appContext=applicationContext
    }

}