package com.example.androidtest2

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val back=findViewById<Button>(R.id.back)
        back.setOnClickListener {
            showDialogBox()
        }
    }
    fun showDialogBox(){
        val alertDialog=AlertDialog.Builder(this)

        alertDialog.setNeutralButton("cancle",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "cancled", Toast.LENGTH_SHORT).show()
        })

        alertDialog.setPositiveButton("yes",DialogInterface.OnClickListener {dialogInterface, i ->
            onBackPressed()
            Toast.makeText(this, "successfully", Toast.LENGTH_SHORT).show()
        })
        alertDialog.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "welcome to my page", Toast.LENGTH_SHORT).show()
        })


        val dialog=alertDialog.create()
        dialog.setTitle("Gretting")
        dialog.setMessage("*You are soure*")
        dialog.show()
    }
}