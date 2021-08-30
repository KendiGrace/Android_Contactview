package com.example.contactrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvcontacts:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContacts()
    }
    fun displayContacts(){
        var contactsList= listOf<Contact>(
            Contact("Lavington Mugendi","0728422795","lavignmendi@gmail.com","https://media.istockphoto.com/photos/black-mature-businessman-working-on-laptop-picture-id1189302552?s=2048x2048"),
            Contact("Jackline Samba","0713310371","jacklinesamba@gmail.com","https://media.istockphoto.com/photos/when-learning-to-love-nobodys-a-greater-teacher-than-mom-picture-id947121644?s=612x612"),
            Contact("Mike Allen Imani","0745346696","allenimani@gmail.com","https://media.istockphoto.com/photos/portrait-of-handsome-afro-man-using-his-mobile-picture-id890698790?s=612x612"),
            Contact("Winnie Grace","0706529004","winniegrace@gmail.com","https://cdn.pixabay.com/photo/2016/11/29/10/10/girl-1868930_960_720.jpg"),
            Contact("Melannie Tamara","0739520062","tamarmelannie@gmail.com","https://cdn.pixabay.com/photo/2017/01/26/11/30/autumn-2010387_960_720.jpg"),
        Contact("Meshack Kimani","0703777237","kimanigitu@gmail.com","https://cdn.pixabay.com/photo/2017/08/01/00/38/man-2562325_960_720.jpg"),
        Contact("Wincate Nyawira","0740305875","catenyawira@gmail.com","https://cdn.pixabay.com/photo/2018/01/13/19/39/fashion-3080644_960_720.jpg"),
        Contact("Milley Mickey","0702057229","milleyzighe@@gmail.com","https://cdn.pixabay.com/photo/2016/06/06/17/05/woman-1439909_960_720.jpg"),
            Contact("Don Bosco","0711903809","donnjeru@gmail.com","https://cdn.pixabay.com/photo/2015/06/19/09/39/lonely-814631_960_720.jpg"),
            Contact("Doreen Nkatha","0715477329","doreenshan@gmail.com","https://cdn.pixabay.com/photo/2016/01/19/18/13/baby-1150109_960_720.jpg"),
            Contact("Loyce Velma","0706387923","velmaamondi@gmail.com","https://cdn.pixabay.com/photo/2017/09/16/14/10/girl-2755611_960_720.jpg"),
            Contact("Jamal Daniel","0706577406","jamaldaniel@gmail.com","https://cdn.pixabay.com/photo/2017/01/28/02/24/japan-2014619_960_720.jpg")
        )
        rvcontacts=findViewById(R.id.rvContacts)
        var contactsAdapter=ContactRVAdapter(contactsList,baseContext)
        rvcontacts.apply {
            layoutManager=LinearLayoutManager(baseContext)
            rvcontacts.adapter=contactsAdapter
        }
    }
}
