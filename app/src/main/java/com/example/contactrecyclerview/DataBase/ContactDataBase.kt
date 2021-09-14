package com.example.contactrecyclerview.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.contactrecyclerview.Models.Contact
import com.example.contactrecyclerview.Models.Note

@Database(entities = arrayOf(Contact::class,Note::class),version = 1)
abstract class ContactDataBase:RoomDatabase() {
     abstract fun contactDao():ContactDao
     abstract fun notesDao():NotesDao

     companion object{
         var database: ContactDataBase?=null
         fun getDataBase(context: Context): ContactDataBase {
             if (database ==null){
                 database =Room.databaseBuilder(context, ContactDataBase::class.java,"contactsDB")
                     .fallbackToDestructiveMigration()
                     .build()
             }
             return database as ContactDataBase
         }
     }
}