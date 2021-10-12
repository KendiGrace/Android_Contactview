package com.example.contactrecyclerview.Repository

import androidx.lifecycle.LiveData
import com.example.contactrecyclerview.DataBase.ContactDao
import com.example.contactrecyclerview.DataBase.ContactsApp
import com.example.contactrecyclerview.Models.Contact
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ContactsRepository @Inject constructor(val contactsDao: ContactDao) {
//    val database = ContactDataBase.getDatabase(ContactsApp.appContext)
    //    To switch functions from the main
//    Livedata in asynchronous you cannot use room database in the main thread so you have to create a new coroutine
    suspend fun saveContact(contact: Contact) {
        withContext(Dispatchers.IO) {
            contactsDao.insertContact(contact)
        }
    }
    fun getAllContacts(): LiveData<List<Contact>> {
        return contactsDao.getAllContacts()
    }
    fun getContactById(contactId: Int): LiveData<Contact> {
        return contactsDao.getContactById(contactId)
    }
}