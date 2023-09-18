package com.example.androidtest2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list =findViewById<EditText>(R.id.list)
        val list2=findViewById<EditText>(R.id.list2)
        val list3=findViewById<EditText>(R.id.list2)
        val list4=findViewById<EditText>(R.id.list2)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name","${list.text}")
            intent.putExtra("email", "${list2.text}")
            intent.putExtra("phone", "${list3.text}")
            intent.putExtra("password", "${list4.text}")
            startActivity(intent)
        }
    }
}