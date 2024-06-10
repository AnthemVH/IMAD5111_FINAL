package com.example.imad5112_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.stream.IntStream.range
import com.example.imad5112_final.ExtraInfoScreen.*

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
        //All Declarations
        val edtMin = findViewById<EditText>(R.id.edtMin)
        val edtMax = findViewById<EditText>(R.id.edtMax)
        val txtAverage = findViewById<TextView>(R.id.txtAverage)
        val txtMondayAVG = findViewById<TextView>(R.id.txtMondayAVG)
        val txtTuesdayAVG = findViewById<TextView>(R.id.txtTuesdayAVG)
        val txtWednesdayAVG = findViewById<TextView>(R.id.txtWednesdayAVG)
        val txtThursdayAVG = findViewById<TextView>(R.id.txtThursdayAVG)
        val txtFridayAVG = findViewById<TextView>(R.id.txtFridayAVG)
        val btnExtraInfo = findViewById<Button>(R.id.btnExtraInfo)
        val btnQuit = findViewById<Button>(R.id.btnQuitSecond)
        val btnMondayInfo = findViewById<Button>(R.id.btnMonday)
        val btnTuesdayInfo = findViewById<Button>(R.id.btnTuesday)
        val btnWednesdayInfo = findViewById<Button>(R.id.btnWednesday)
        val btnThursdayInfo = findViewById<Button>(R.id.btnThursday)
        val btnFridayInfo = findViewById<Button>(R.id.btnFriday)
        //Daily average checker/calculator
        btnMondayInfo.setOnClickListener()
        {
            if (edtMax.text.toString() != "" && edtMin.text.toString() != "") {
                var tempint1 = (edtMax.text.toString().toInt())
                var tempint2 = (edtMin.text.toString().toInt())
                var avgtemp = (tempint2 + tempint1) / 2
                txtMondayAVG.setText("Monday Average:" + avgtemp.toString())
            }else
            {
                txtMondayAVG.setText("Mon: Invalid Input")
            }
        }

        btnTuesdayInfo.setOnClickListener()
        {
            if (edtMax.text.toString() != "" && edtMin.text.toString() != "") {
                var tempint1 = (edtMax.text.toString().toInt())
                var tempint2 = (edtMin.text.toString().toInt())
                var avgtemp = (tempint2 + tempint1) / 2
                txtTuesdayAVG.setText("Tuesday Average" + avgtemp.toString())
            }else
            {
                txtTuesdayAVG.setText("Mon: Invalid Input")
            }
        }
        btnWednesdayInfo.setOnClickListener()
        {
            if (edtMax.text.toString() != "" && edtMin.text.toString() != "") {
                var tempint1 = (edtMax.text.toString().toInt())
                var tempint2 = (edtMin.text.toString().toInt())
                var avgtemp = (tempint2 + tempint1) / 2
                txtWednesdayAVG.setText("Wednesday Average" + avgtemp.toString())
            }else
            {
                txtWednesdayAVG.setText("Mon: Invalid Input")
            }
        }
        btnThursdayInfo.setOnClickListener()
        {
            if (edtMax.text.toString() != "" && edtMin.text.toString() != "") {
                var tempint1 = (edtMax.text.toString().toInt())
                var tempint2 = (edtMin.text.toString().toInt())
                var avgtemp = (tempint2 + tempint1) / 2
                txtThursdayAVG.setText("Thursday Average:" + avgtemp.toString())
            }else
            {
                txtThursdayAVG.setText("Mon: Invalid Input")
            }
        }
        btnFridayInfo.setOnClickListener()
        {
            if (edtMax.text.toString() != "" && edtMin.text.toString() != "") {
                var tempint1 = (edtMax.text.toString().toInt())
                var tempint2 = (edtMin.text.toString().toInt())
                var avgtemp = (tempint2 + tempint1) / 2
                txtFridayAVG.setText("Friday Average :" + avgtemp.toString())
                // This is commented out wether you want to use it or not
                //var tempint = txtMondayAVG.text.toString().toInt() + txtTuesdayAVG.text.toString().toInt() + txtWednesdayAVG.text.toString().toInt() + txtThursdayAVG.text.toString().toInt() + txtFridayAVG.text.toString().toInt()
               // txtAverage.setText((tempint/5).toString())
            }else
            {
                txtFridayAVG.setText("Mon: Invalid Input")
            }

        }
        //Buttons to change screen and quit app
        val intent = Intent(this, ExtraInfoScreen::class.java)
        btnExtraInfo.setOnClickListener()
        {
            startActivity(intent)
        }
        btnQuit.setOnClickListener()
        {
            System.exit(0)
        }
    }


}