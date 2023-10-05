package com.example.relative_image

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttomNavigation=findViewById<BottomNavigationView>(R.id.bottom_nav)

        loadFragment(Recent_Fragment())

        buttomNavigation.setOnItemSelectedListener{

            when(it.itemId)
            {
                R.id.Recents->loadFragment(Recent_Fragment())
                R.id.Favorites->loadFragment(Favorite_Fragment())
                R.id.Nearby->loadFragment(Nearby_Fragment())
            }
            true
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.framelayout,fragment).commit()
    }
}