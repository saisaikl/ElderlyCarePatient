package com.sai.testing.elderlycarepatient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.view.View
import android.widget.Toast

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val navigationView = findViewById<View>(R.id.nav) as BottomNavigationView

        navigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home ->
                        Toast.makeText(application, "Home is Clicked", Toast.LENGTH_SHORT).show()
                R.id.caretaker ->
                        Toast.makeText(application, "It is clicked", Toast.LENGTH_SHORT).show()
                R.id.medicine ->
                        Toast.makeText(application, "Medicine is clicked", Toast.LENGTH_SHORT).show()
                R.id.exercise ->
                        Toast.makeText(application, "Exercise is clicked", Toast.LENGTH_SHORT).show()

            }
            true
        }
    }
}
