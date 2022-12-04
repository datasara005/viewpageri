package com.example.fragmentapp.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fragmentapp.fragments.*

class ViewPagerFragmentAdapter2(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        if (position == 0) {
            return axali1()
        } else if(position == 1) {
            return axali2()
        }else {
            return axali3()
        }

    }
}