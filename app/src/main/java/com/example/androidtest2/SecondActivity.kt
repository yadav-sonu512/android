package com.example.androidtest2

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//
        val button = findViewById<Button>(R.id.submit)

            button.setOnClickListener {

       showCustomDialog()
//
            }
            val shimpleDialog = findViewById<Button>(R.id.ShimpleDialog)
            shimpleDialog.setOnClickListener {
                showDialog()
            }


        }
      fun showDialog(){
          val alertDialog=AlertDialog.Builder(this)
          alertDialog.setPositiveButton("yes",DialogInterface.OnClickListener { dialogInterface, i ->
              Toast.makeText(this, "Sucessfully", Toast.LENGTH_SHORT).show()
          })
          alertDialog.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
              Toast.makeText(this, "Welcome to my page", Toast.LENGTH_SHORT).show()
          })
          val dialog=alertDialog.create()
          dialog.setMessage("Are You Sure hat you want to go back")
          dialog.setTitle("Gravity")
          dialog.show()
      }

    @SuppressLint("MissingInflatedId")
    private fun showCustomDialog(){
        val alertBuilder = AlertDialog.Builder(this)
        val view = LayoutInflater.from(this).inflate(R.layout.costomdialog,null,false)
    alertBuilder.setNeutralButton("yes",DialogInterface.OnClickListener{dialogInterface, i ->

        val alert=AlertDialog.Builder(this)
        alert.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "Welcome to my page", Toast.LENGTH_SHORT).show()
        })
        alert.setPositiveButton("yes",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "Sucessfully", Toast.LENGTH_SHORT).show()
        })
        val dialog=alert.create()
        dialog.setMessage("Are You Sure hat you want to go back")
        dialog.setTitle("Gravity")
        dialog.show()


    })

        var ram = intent.extras?.getString("name")
        var mohan = intent.extras?.getString("email")
        var rama = intent.extras?.getString("phone")
        var rama1 = intent.extras?.getString("password")

        val tex =view.findViewById<TextView>(R.id.text)
        val text2 =view.findViewById<TextView>(R.id.text1)
        val text3 =view.findViewById<TextView>(R.id.text2)
        val text4 =view.findViewById<TextView>(R.id.text3)

        tex.text = ram
        text2.text = mohan
        text3.text = rama
        text4.text = rama1


        alertBuilder.create()
        alertBuilder.setView(view)
        alertBuilder.show()


    }

    }






