package com.example.hogatriviaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class art : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_art)
        val backbttn=findViewById<Button>(R.id.backbtn)
        backbttn.setOnClickListener {
            val intent76= Intent(this, category::class.java)
            startActivity(intent76)
        }
        val submitbttn=findViewById<Button>(R.id.submitbtn)
        submitbttn.setOnClickListener {
            val intent764= Intent(this, thankyou::class.java)
            startActivity(intent764)
        }
    }
}