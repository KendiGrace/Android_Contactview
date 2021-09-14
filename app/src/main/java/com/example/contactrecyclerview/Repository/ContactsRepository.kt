package com.example.contactrecyclerview.Repository

import androidx.lifecycle.LiveData
import com.example.contactrecyclerview.DataBase.ContactDataBase
import com.example.contactrecyclerview.DataBase.ContactsApp
import com.example.contactrecyclerview.Models.Contact
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
        val database=ContactDataBase.getDataBase(ContactsApp.appContext)

        suspend fun saveContact(contact:Contact){
            withContext(Dispatchers.IO){
                database.contactDao().insertContact(contact)
            }
        }
        fun getAllContacts(): LiveData<List<Contact>> {
          return database.contactDao().getAllContacts()
        }
fun getContactsById(contactId:Int):LiveData<Contact>{
    return database.contactDao().getContactById(contactId)
}}
