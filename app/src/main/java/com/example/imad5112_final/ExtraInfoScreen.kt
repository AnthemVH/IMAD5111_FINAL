package com.example.imad5112_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class ExtraInfoScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extra_info_screen)
        //Declaration and Init
        val btnMainScreenInfo = findViewById<Button>(R.id.btnMNScreen)
        val edtMin = findViewById<EditText>(R.id.edtMinInfo)
        val edtMax = findViewById<EditText>(R.id.edtMaxInfo)
        val edtCon = findViewById<EditText>(R.id.edtConInfo)
        val btnMondayInfo = findViewById<Button>(R.id.btnMondayInfo)
        val btnTuesdayInfo = findViewById<Button>(R.id.btnTuesdayInfo)
        val btnWednesdayInfo = findViewById<Button>(R.id.btnWednesdayInfo)
        val btnThursdayInfo = findViewById<Button>(R.id.btnThursdayInfo)
        val btnFridayInfo = findViewById<Button>(R.id.btnFridayInfo)
        val txtMondayInfo = findViewById<TextView>(R.id.txtMondayInfo)
        val txtTuesdayInfo = findViewById<TextView>(R.id.txtTuesdayInfo)
        val txtWednesdayInfo = findViewById<TextView>(R.id.txtWednesdayInfo)
        val txtThursdayInfo = findViewById<TextView>(R.id.txtThursdayInfo)
        val txtFridayInfo = findViewById<TextView>(R.id.txtFridayInfo)
        //Buttons for full information on weather per day
        btnMondayInfo.setOnClickListener()
        {
            if (edtMax.text.toString() != "" && edtMin.text.toString() != "") {
                var tempint1 = (edtMax.text.toString().toInt())
                var tempint2 = (edtMin.text.toString().toInt())
                var avgtemp = (tempint2 + tempint1) / 2
                txtMondayInfo.setText(tempint1.toString() + ':' + tempint2.toString() + ':' + edtCon.text.toString())
            }else
            {
                txtMondayInfo.setText("Invalid Input")
            }
        }
        btnTuesdayInfo.setOnClickListener()
        {
            if (edtMax.text.toString() != "" && edtMin.text.toString() != "") {

                var tempint1 = (edtMax.text.toString().toInt())
                var tempint2 = (edtMin.text.toString().toInt())
                var avgtemp = (tempint2 + tempint1) / 2
                txtTuesdayInfo.setText(tempint1.toString() + ':' + tempint2.toString() + ':' + edtCon.text.toString())
            } else
            {
                txtTuesdayInfo.setText("Invalid Input")
            }
        }
        btnWednesdayInfo.setOnClickListener()
        {
            if (edtMax.text.toString() != "" && edtMin.text.toString() != "") {

                var tempint1 = (edtMax.text.toString().toInt())
                var tempint2 = (edtMin.text.toString().toInt())
                var avgtemp = (tempint2 + tempint1) / 2
                txtWednesdayInfo.setText(tempint1.toString() + ':' + tempint2.toString() + ':' + edtCon.text.toString())
            }else
            {
                txtWednesdayInfo.setText("Invalid Input")
            }
        }
        btnThursdayInfo.setOnClickListener()
        {
            if (edtMax.text.toString() != "" && edtMin.text.toString() != "") {
                var tempint1 = (edtMax.text.toString().toInt())
                var tempint2 = (edtMin.text.toString().toInt())
                var avgtemp = (tempint2 + tempint1) / 2
                txtThursdayInfo.setText(tempint1.toString() + ':' + tempint2.toString() + ':' + edtCon.text.toString())
            }else
            {
                txtThursdayInfo.setText("Invalid Input")
            }
        }
        btnFridayInfo.setOnClickListener()
        {
            if (edtMax.text.toString() != "" && edtMin.text.toString() != "") {
                var tempint1 = (edtMax.text.toString().toInt())
                var tempint2 = (edtMin.text.toString().toInt())
                var avgtemp = (tempint2 + tempint1) / 2
                txtFridayInfo.setText(tempint1.toString() + ':' + tempint2.toString() + ':' + edtCon.text.toString())
            }else
            {
                txtFridayInfo.setText("Invalid Input")
            }
        }
        //Button to go back to main Screen
        val intent = Intent(this, MainScreen::class.java)
        btnMainScreenInfo.setOnClickListener()
        {
            startActivity(intent)
        }
    }
}