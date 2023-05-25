package com.example.hogatriviaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startbtn=findViewById<Button>(R.id.startbutton)
        startbtn.setOnClickListener {
            val intent= Intent(this, category::class.java)
            startActivity(intent)
        }

    }
}