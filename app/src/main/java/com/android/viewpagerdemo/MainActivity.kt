package com.android.viewpagerdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.android.viewpagerdemo.viewpager.Page1
import com.android.viewpagerdemo.viewpager.Page2
import com.android.viewpagerdemo.viewpager.Page3
import com.android.viewpagerdemo.viewpager.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    // Step 1:
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentManager = supportFragmentManager
        val fragmentList = listOf(
            Page1(),
            Page2(),
            Page3()
        )
        val titles = listOf(
            "Page 1",
            "Page 2",
            "Page 3"
        )
        viewPagerAdapter = ViewPagerAdapter(fragmentManager,lifecycle)

        // Setting Adapter to the viewpager declared in xml file
        val viewpager = findViewById<ViewPager2>(R.id.viewPager)
        viewpager.adapter = viewPagerAdapter

        // Setting adapter to the tab layout declared in xml file
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        TabLayoutMediator(tabLayout,viewpager){ tab, position ->
            tab.text = when(position){
                0 -> "Page 1"
                1 -> "Page 2"
                else -> "Page 3"
            }
        }.attach()
    }
}