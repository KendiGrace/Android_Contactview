package com.example.contactsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.contactrecyclerview.R
import com.squareup.picasso.Picasso

class ContactDetailsActivity : AppCompatActivity() {
    lateinit var cvcontact:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)

        var name=intent.getStringExtra("name")
        var phoneNumber=intent.getStringExtra("phone")
        var email=intent.getStringExtra("email")
        var imageUrl=intent.getStringExtra("image")

        var intentName = findViewById<TextView>(R.id.tvname1)
        var phone2=findViewById<TextView>(R.id.tvphone1)
        var email2=findViewById<TextView>(R.id.tvemail1)
        var image=findViewById<ImageView>(R.id.ivcontacts1)
        Picasso.get()
            .load(imageUrl)
            .resize(80,80)
            .centerCrop()
            .into(image)
        intentName.text = name
        phone2.text=phoneNumber
        email2.text=email



        Toast.makeText(baseContext,"These are your contact details",Toast.LENGTH_LONG).show()
    }



}