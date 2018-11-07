package com.sai.testing.elderlycarepatient

import android.R.layout.simple_spinner_dropdown_item
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_basis_info.*

class BasisInfo : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basis_info)

        val adapter = ArrayAdapter.createFromResource(this,R.array.gender_list,android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spr_gender.adapter = adapter

        btn_next.setOnClickListener {
            val intent = Intent(this, MedicalInfoActivity::class.java)
            startActivity(intent)
        }
    }

    fun getValue(view: View) {
        Toast.makeText(this,spr_gender.selectedItem.toString(),Toast.LENGTH_LONG).show()
    }

}
