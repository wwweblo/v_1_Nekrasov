package com.example.nekrasov_v_1_

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Switch

class Settings : AppCompatActivity() {

    lateinit var switch1: Switch
    lateinit var switch2: Switch
    lateinit var switch3: Switch
    lateinit var settingsButton: Button
    lateinit var backBtn1: ImageButton
    lateinit var backBtn2: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)

        backBtn1 = findViewById(R.id.backButton1)
        backBtn1.setOnClickListener {
            val intent = Intent(this, PersonalArea::class.java)
            startActivity(intent)
        }

        backBtn2 = findViewById(R.id.backButton2)
        backBtn2.setOnClickListener {
            val intent = Intent(this, Autorisation::class.java)
            startActivity(intent)
        }

        switch1 = findViewById(R.id.switch1)
        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // Если Switch включен
                buttonView.setTextColor(Color.BLACK)
            } else {
                // Если Switch выключен
                buttonView.setTextColor(Color.GRAY)
            }
        }

        switch2 = findViewById(R.id.switch2)
        switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // Если Switch включен
                buttonView.setTextColor(Color.BLACK)
            } else {
                // Если Switch выключен
                buttonView.setTextColor(Color.GRAY)
            }
        }

        switch3 = findViewById(R.id.switch2)
        switch3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // Если Switch включен
                buttonView.setTextColor(Color.BLACK)
            } else {
                // Если Switch выключен
                buttonView.setTextColor(Color.GRAY)
            }
        }

        settingsButton = findViewById(R.id.settingsButton)
        settingsButton.setOnClickListener {
            switch1.isChecked = true
            switch2.isChecked = true
            switch3.isChecked = true
        }
    }
}