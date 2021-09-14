package com.example.contactrecyclerview.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.contactrecyclerview.Models.Contact
import com.example.contactrecyclerview.R
import com.example.contactrecyclerview.ViewModel.ContactsViewModel
import com.example.contactrecyclerview.databinding.ActivityAddContactBinding

class AddContactActivity : AppCompatActivity() {
    val contactsViewModel:ContactsViewModel by viewModels()
    lateinit var binding: ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnAddContact.setOnClickListener {
            validateContact()
        }
    }
     fun validateContact(){
        binding.etName3.error=null
        binding.etPhonenumber3.error=null
        binding.etEmail3.error=null
        var name=binding.etName3.text.toString()
        var phone=binding.etPhonenumber3.text.toString()
        var email=binding.etEmail3.text.toString()
        var error=false
        if (name.isEmpty() || name.isBlank()){
            error=true
            binding.etName3.error="Name is required"
    }
        if(phone.isEmpty()||name.isBlank()){
            error=true
            binding.etPhonenumber3.error="Phonenumber is required"
        }
        if(email.isEmpty()||email.isBlank()){
            error=true
            binding.etEmail3.error="Email is required"
        }
        if(!error){
            var contact= Contact(0,name,phone,email,"")
            contactsViewModel.saveContact(contact)
            binding.etName3.setText("")
            binding.etPhonenumber3.setText("")
            binding.etEmail3.setText("")
        }

    }    }
