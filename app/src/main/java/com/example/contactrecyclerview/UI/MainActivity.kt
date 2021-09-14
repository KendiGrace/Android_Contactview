package com.example.contactrecyclerview.UI
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contactrecyclerview.Models.Contact
import com.example.contactrecyclerview.ContactRVAdapter
import com.example.contactrecyclerview.R
import com.example.contactrecyclerview.ViewModel.ContactsViewModel
import com.example.contactrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var rvcontacts:RecyclerView
    val contactViewModel:ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        contactViewModel.getAllContacts()
        contactViewModel.getContactsById(contactId = 1)
    }

    override fun onResume() {
        super.onResume()
        contactViewModel.contactsLiveData.observe(this,{contacts ->
            displayContacts(contacts)
        })
    }
    fun displayContacts(contactsList:List<Contact>){

        rvcontacts=findViewById(R.id.rvContacts)
        var contactsAdapter= ContactRVAdapter(contactsList,baseContext)
        rvcontacts.apply {
            layoutManager=LinearLayoutManager(baseContext)
            rvcontacts.adapter=contactsAdapter
        }
    }
}
