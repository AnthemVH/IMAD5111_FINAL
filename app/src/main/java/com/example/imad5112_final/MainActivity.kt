package com.example.imad5112_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnFirstScreen = findViewById<Button>(R.id.btnSwitchFirst)
        val btnFirstQuit = findViewById<Button>(R.id.btnQuitFirst)
        val intent = Intent(this, MainScreen::class.java)
        //Buttons to switch to Main Screen and to Quit App
        btnFirstScreen.setOnClickListener()
        {
            startActivity(intent)
        }
        btnFirstQuit.setOnClickListener()
        {
            System.exit(0)
        }



    }
}