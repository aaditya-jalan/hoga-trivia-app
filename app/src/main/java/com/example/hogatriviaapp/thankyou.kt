package com.example.hogatriviaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class thankyou : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thankyou)
        val restartbttn=findViewById<Button>(R.id.restartbtn)
        restartbttn.setOnClickListener {
            val intent64= Intent(this, MainActivity::class.java)
            startActivity(intent64)
        }
    }
    

}