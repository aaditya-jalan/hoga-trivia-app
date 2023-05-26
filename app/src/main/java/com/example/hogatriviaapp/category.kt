package com.example.hogatriviaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class category : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        val button1= findViewById<Button>(R.id.artsbutton)
        val button2= findViewById<Button>(R.id.filmbutton)
        val button3= findViewById<Button>(R.id.sportsbutton)
        val button4= findViewById<Button>(R.id.sciencebutton)
        button1.setOnClickListener {
            val intent2= Intent(this, art::class.java)
            startActivity(intent2)
        }
        button2.setOnClickListener {
            val intent3= Intent(this, film::class.java)
            startActivity(intent3)
        }
        button3.setOnClickListener {
            val intent4= Intent(this,sport::class.java)
            startActivity(intent4)
        }
        button4.setOnClickListener {
            val intent5= Intent(this, question::class.java)
            startActivity(intent5)
        }

    }
}