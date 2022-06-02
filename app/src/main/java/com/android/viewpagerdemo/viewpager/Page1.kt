package com.android.viewpagerdemo.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL
import androidx.recyclerview.widget.RecyclerView
import com.android.viewpagerdemo.R
import com.android.viewpagerdemo.recycler_view.Contact
import com.android.viewpagerdemo.recycler_view.MyContactAdapter

class Page1 : Fragment() {

    // Step 1. Get Hold of Recyclerview from xml
    // Step 2: Create Adapter
    // Step 3: Set adapter to rv
    // Step 4: Set layout manager to rv

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_page1, container, false)
        // Step 1:
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvContacts)

        // Step 2:
        val contactList = listOf(
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Aumaid","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
            Contact("Rahil","7679696969","https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"),
        )
        val myAdapter = MyContactAdapter(contactList)

        // Step 3:
        recyclerView.adapter = myAdapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Inflate the layout for this fragment
        return view
    }

}