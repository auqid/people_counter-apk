package com.example.eu.tutorials.myfirstapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.MyButton)
        val txtClickMe = findViewById<TextView>(R.id.textView1)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked += 1
            txtClickMe.text= timesClicked.toString()
            Toast.makeText(this,"Naveed can suck on deez nuts", Toast.LENGTH_LONG).show()
        }





    }
}