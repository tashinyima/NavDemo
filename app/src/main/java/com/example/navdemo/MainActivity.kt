package com.example.navdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavHost
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBottomNavigation()

    }

    private fun setupBottomNavigation() {

        val btmNav = findViewById<BottomNavigationView>(R.id.btmNavView)
        val navHost = supportFragmentManager.findFragmentById(R.id.fragNavHost) as NavHostFragment
        val navController = navHost.navController
        NavigationUI.setupWithNavController(btmNav, navController)
        val appBarConfiguration =
            AppBarConfiguration(setOf(
                R.id.homeFragment,
                R.id.favFragment,
                R.id.jokeFragment))

        setupActionBarWithNavController(navController,appBarConfiguration)

    }
}