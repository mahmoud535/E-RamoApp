package com.example.e_ramoapp.presentation.ui.activity

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.e_ramoapp.R
import com.example.e_ramoapp.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
        navController = navHostFragment.navController

        val bottomNavigationView: BottomNavigationView = binding.bottomView
        bottomNavigationView.setupWithNavController(navController)

        binding.mainFloatingButton.setOnClickListener {
            navController.navigate(R.id.navigation_dashboard)
        }
        val fab: FloatingActionButton = binding.mainFloatingButton
        fab.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.homeicon))
        fab.drawable.setTint(ContextCompat.getColor(this, android.R.color.white))
    }
}