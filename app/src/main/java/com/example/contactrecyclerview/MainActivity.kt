package com.example.contactsapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contactrecyclerview.Contact
import com.example.contactrecyclerview.ContactRVAdapter
import com.example.contactrecyclerview.R

class MainActivity : AppCompatActivity() {
    lateinit var rvcontacts:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContacts()
    }
    fun displayContacts(){
        var contactsList= listOf<Contact>(
            Contact("Lavington Mugendi","0728422795","lavignmendi@gmail.com"),
            Contact("Jackline Samba","0713310371","jacklinesamba@gmail.com"),
            Contact("Mike Allen Imani","0745346696","allenimani@gmail.com"),
            Contact("Winnie Grace","0706529004","winniegrace@gmail.com"),
            Contact("Melannie Tamara","0739520062","tamarmelannie@gmail.com","https://cdn.pixabay.com/photo/2015/08/05/04/25/people-875617__340.jpg"),
        Contact("Meshack Kimani","0703777237","kimanigitu@gmail.com","https://cdn.pixabay.com/photo/2015/03/26/09/41/tie-690084__340.jpg"),
        Contact("Wincate Nyawira","0740305875","catenyawira@gmail.com","https://cdn.pixabay.com/photo/2015/07/17/22/43/student-849825__340.jpg"),
        Contact("Milley Mickey","0702057229","melliyzighe@@gmail.com","https://cdn.pixabay.com/photo/2017/07/31/21/04/people-2561053__340.jpg")
        )
        rvcontacts=findViewById(R.id.rvContacts)
        var contactsAdapter=ContactRVAdapter(contactsList,baseContext)
        rvcontacts.apply {
            layoutManager=LinearLayoutManager(baseContext)
            rvcontacts.adapter=contactsAdapter
        }
    }
}
