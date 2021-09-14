package com.example.contactrecyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.contactrecyclerview.Models.Contact
import com.example.contactrecyclerview.UI.ContactDetailsActivity
import com.squareup.picasso.Picasso

class ContactRVAdapter (var contactsList:List<Contact>, var context: Context):RecyclerView.Adapter <ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
      val itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact=contactsList.get(position)
        val intent=  Intent(context,ContactDetailsActivity::class.java)
        context.startActivity(intent)
//        holder.tvname.text=currentContact.name
//        holder.tvphone.text=currentContact.phoneNumber
//        holder.tvemail.text=currentContact.email
//        holder.cvcontact.setOnClickListener {
//            var intent=Intent(context, ContactDetailsActivity::class.java)
//            intent.putExtra("name",currentContact.name)
//            intent.putExtra("phone",currentContact.phoneNumber)
//            intent.putExtra("email",currentContact.email)
//            intent.putExtra("image",currentContact.imageUrl)



//        }
//        Picasso.get().load(currentContact.imageUrl).resize(80,80).centerCrop().into(holder.ivcontact)
    }

    override fun getItemCount(): Int {
      return contactsList.size
    }
}
class ContactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvname)
    var tvphone=itemView.findViewById<TextView>(R.id.tvphone)
    var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
    var ivcontact=itemView.findViewById<ImageView>(R.id.ivcontact)
    var cvcontact=itemView.findViewById<CardView>(R.id.cvcontact)



}