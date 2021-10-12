package com.example.contactrecyclerview.Repository

import com.example.contactrecyclerview.DataBase.ContactsDataBase
import com.example.contactrecyclerview.DataBase.ContactsApp
import com.example.contactrecyclerview.DataBase.NotesDao
import com.example.contactrecyclerview.Models.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class NotesRepository(){
    var dataBase=ContactsDataBase.getDataBase(ContactsApp.appContext)
    suspend fun saveNote(note: Note){
        withContext(Dispatchers.IO){
            dataBase.notesDao().insertNote(note)
        }
    }

}