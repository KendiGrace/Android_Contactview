package com.example.contactrecyclerview.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.contactrecyclerview.R
import com.example.contactrecyclerview.databinding.ActivityContactDetailsBinding
import com.squareup.picasso.Picasso

class ContactDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityContactDetailsBinding
    lateinit var cvcontact: CardView
    lateinit var btnBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            val intent1 = Intent(baseContext, MainActivity::class.java)
            startActivity(intent1)

            val contactId=intent1.getStringExtra("contactId")

//            var name = intent.getStringExtra("name")
//            var phoneNumber = intent.getStringExtra("phone")
//            var email = intent.getStringExtra("email")
//            var imageUrl = intent.getStringExtra("image")
//
//            var intentName = findViewById<TextView>(R.id.tvname1)
//            var phone2 = findViewById<TextView>(R.id.tvPhone1)
//            var email2 = findViewById<TextView>(R.id.tvEmail1)
//            var image = findViewById<ImageView>(R.id.ivcontact)
//            Picasso.get()
//                .load(imageUrl)
//                .resize(80, 80)
//                .centerCrop()
//                .into(image)
//            intentName.text = name
//            phone2.text = phoneNumber
//            email2.text = email
//
//
        val textView=binding.tvCont
            textView.text=contactId

            Toast.makeText(baseContext, "These are your contact details", Toast.LENGTH_LONG).show()
        }


    }
}