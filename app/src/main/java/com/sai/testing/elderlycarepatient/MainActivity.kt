package com.sai.testing.elderlycarepatient

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.sai.testing.elderlycarepatient.R.id.tv_register
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val register = findViewById(R.id.tv_register) as TextView
        register.setOnClickListener{
            val intent = Intent(this@MainActivity,BasisInfo::class.java)
            startActivity(intent)
        }

        btn_login.setOnClickListener {
            val intent = Intent(this,HomePageActivity::class.java)
            startActivity(intent)
        }
    }

}
