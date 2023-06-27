package com.example.expandcollapse.droid.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.expandcollapse.R
import com.example.expandcollapse.databinding.ActivityHomeBinding
import com.example.expandcollapse.droid.home.fragments.HomeFragment
import com.example.expandcollapse.droid.home.fragments.PayFragment
import com.example.expandcollapse.droid.home.fragments.RewardsFragment

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadFragment(HomeFragment())
        handleBnvClicks()
    }

    private fun handleBnvClicks() {
        binding.bottomNav.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.bnv_home -> {
                    loadFragment(HomeFragment())
                    true
                }

                R.id.bnv_pay -> {
                    loadFragment(PayFragment())
                    true
                }

                R.id.bnv_rewards -> {
                    loadFragment(RewardsFragment())
                    true
                }

                else -> {
                    loadFragment(HomeFragment())
                    true
                }
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(binding.flTopFrag.id, fragment)
        transaction.commit()
    }
}