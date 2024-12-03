package com.example.assiette_pto

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.assiette_pto.databinding.ActivityMainBinding
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize Firebase
        FirebaseApp.initializeApp(this)
        initializeFirebase()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up the Toolbar as the ActionBar
        setSupportActionBar(binding.toolbar)
       
      // Initialize NavController
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
        navController = navHostFragment.navController

        // Define top-level destinations
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_favorites
            )
        )

        // Set up ActionBar with NavController
        setupActionBarWithNavController(navController, appBarConfiguration)

        // Set up BottomNavigationView with NavController
        val navView: BottomNavigationView = binding.navView
        navView.setupWithNavController(navController)
    }

    private fun initializeFirebase() {
        try {
            FirebaseApp.initializeApp(this)
            FirebaseFirestore.getInstance() // Optional: Ensures Firestore is initialized
            println("Firebase successfully initialized.")
        } catch (e: Exception) {
            println("Error initializing Firebase: ${e.message}")
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        // Handle back arrow functionality
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}
