package com.android.viewpagerdemo.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

const val NUMBER_OF_TABS = 3
class ViewPagerAdapter(
    private val fragmentManager: FragmentManager,
    private val lifecycle: Lifecycle
): FragmentStateAdapter(fragmentManager,lifecycle){

    override fun getItemCount(): Int {
        return NUMBER_OF_TABS
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {Page1()}
            1 -> {Page2()}
            else -> {Page3()}
        }
    }

}