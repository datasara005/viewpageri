package com.example.fragmentapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.fragmentapp.adapters.ViewPagerFragmentAdapter
import com.example.fragmentapp.adapters.ViewPagerFragmentAdapter2

import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout:TabLayout
    private lateinit var viewPager2:ViewPager2
    private lateinit var viewPager3:ViewPager2
    private lateinit var tabLayout2:TabLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout=findViewById(R.id.TabLayout)
        tabLayout2=findViewById(R.id.TabLayout2)
        viewPager2=findViewById(R.id.viewPager2)
        viewPager3=findViewById(R.id.viewPager3)

        val adapter = ViewPagerFragmentAdapter(this)
        val adapter2 = ViewPagerFragmentAdapter2(this)

        viewPager2.adapter=adapter
        viewPager3.adapter=adapter2

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = "freagmenti ${position +1}"
        } .attach()
        TabLayoutMediator(tabLayout2, viewPager3) { tab, position ->
            tab.text = "axali ${position +1}"
        } .attach()
    }
}
