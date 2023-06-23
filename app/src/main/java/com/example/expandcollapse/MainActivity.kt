package com.example.expandcollapse

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.expandcollapse.droid.home.HomeActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val homeIntent = Intent(this@MainActivity, HomeActivity::class.java)
        startActivity(homeIntent)
        finish()

    }
}
