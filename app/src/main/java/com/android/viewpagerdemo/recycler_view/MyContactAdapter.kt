package com.android.viewpagerdemo.recycler_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.viewpagerdemo.R
import com.bumptech.glide.Glide

// Make this adapter inherit from RecyclerView.Adapter
class MyContactAdapter(
    val contactList: List<Contact>
): RecyclerView.Adapter<MyContactAdapter.ContactViewHolder>() {


    // Inherit from RecyclerView.ViewHolder
    class ContactViewHolder(view: View):RecyclerView.ViewHolder(view){
        // Binding Name
        val nameTv = itemView.findViewById<TextView>(R.id.tvName)
        // Binding Phone
        val phoneTv = itemView.findViewById<TextView>(R.id.tvPhone)
        // Binding Image
        val imageIv = itemView.findViewById<ImageView>(R.id.ivContactImage)
        // Function used for binding each item to the layout
        fun bind(contact: Contact){
            // Setting Name
            nameTv.text = contact.name

            // Setting Number
            phoneTv.text = contact.number

            // Setting image
            Glide.with(itemView.context)
                .load(contact.imageUrl)
                .into(imageIv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        // 1. Making a view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_contact_item,parent,false)
        // 2. Creating a ContactViewHolder
        val contactViewHolder = ContactViewHolder(view)
        // 3. Returning the ContactViewHolder
        return contactViewHolder
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact = contactList[position]
        holder.bind(currentContact)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}