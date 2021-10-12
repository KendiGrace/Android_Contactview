package com.example.contactrecyclerview.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contactrecyclerview.Models.Contact
import com.example.contactrecyclerview.Repository.ContactsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContactsViewModel @Inject constructor(val contactsRepository: ContactsRepository):ViewModel(){
    lateinit var contactLiveData:LiveData<Contact>
    lateinit var contactsLiveData:LiveData<List<Contact>>


    fun saveContact(contact: Contact){
       viewModelScope.launch{
            contactsRepository.saveContact(contact)
        }}
    fun getAllContacts(){
        contactsLiveData=contactsRepository.getAllContacts()
    }
    fun getContactsById(contactId:Int){
        contactLiveData=contactsRepository.getContactById(contactId)
    }


    }


