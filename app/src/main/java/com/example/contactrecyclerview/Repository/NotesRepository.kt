package com.example.contactrecyclerview.Repository

import com.example.contactrecyclerview.DataBase.ContactDataBase
import com.example.contactrecyclerview.DataBase.ContactsApp
import com.example.contactrecyclerview.Models.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NotesRepository {
    var dataBase=ContactDataBase.getDataBase(ContactsApp.appContext)
    suspend fun saveNote(note: Note){
        withContext(Dispatchers.IO){
            dataBase.notesDao()
        }
    }

}