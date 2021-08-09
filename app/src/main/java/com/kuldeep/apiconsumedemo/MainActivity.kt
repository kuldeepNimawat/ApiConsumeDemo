package com.kuldeep.apiconsumedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpFragment()
    }

    private fun setUpFragment(){
        val fragment= RecyclerListFragment.newInstance()
        val fragmentManager : FragmentManager=supportFragmentManager
        val fragmentTransation: FragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransation.replace(android.R.id.content,fragment)
        fragmentTransation.commit()
    }
}