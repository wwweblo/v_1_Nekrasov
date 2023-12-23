package com.example.nekrasov_v_1_

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch

class Settings : AppCompatActivity() {

    lateinit var switch1: Switch
    lateinit var switch2: Switch
    lateinit var switch3: Switch
    lateinit var settingsButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)


        settingsButton = findViewById(R.id.SettingsButton)
        settingsButton.setOnClickListener {
            switch1.isChecked = true
            switch2.isChecked = true
            switch3.isChecked = true
        }
        switch1 = findViewById(R.id.switch1)
        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // Если Switch включен
                buttonView.text = "Включен"
                buttonView.setTextColor(Color.BLACK)
            } else {
                // Если Switch выключен
                buttonView.text = "Выключен"
                buttonView.setTextColor(Color.GRAY)
            }
        }

        switch2 = findViewById(R.id.switch2)
        switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // Если Switch включен
                buttonView.text = "Включен"
                buttonView.setTextColor(Color.BLACK)
            } else {
                // Если Switch выключен
                buttonView.text = "Выключен"
                buttonView.setTextColor(Color.GRAY)
            }

        switch3 = findViewById(R.id.switch3)
            switch3.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    // Если Switch включен
                    buttonView.text = "Включен"
                    buttonView.setTextColor(Color.BLACK)
                } else {
                    // Если Switch выключен
                    buttonView.text = "Выключен"
                    buttonView.setTextColor(Color.GRAY)
                }

    }
}}}