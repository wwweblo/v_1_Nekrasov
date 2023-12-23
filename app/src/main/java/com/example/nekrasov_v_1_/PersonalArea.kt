package com.example.nekrasov_v_1_

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.TextView

class PersonalArea : AppCompatActivity() {

    private val REQUEST_IMAGE_CAPTURE = 1
    lateinit var loginTv: TextView
    lateinit var ExitBtn: Button
    lateinit var SettingsButton: Button
    lateinit var btnOpenCamera: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.personal_area)

        val login:String = intent.getStringExtra("login").toString()
        loginTv = findViewById(R.id.loginTV)
        loginTv.text = login

        ExitBtn = findViewById(R.id.ExitButton)
        ExitBtn.setOnClickListener {
            val intent = Intent(this, Autorisation::class.java)
            startActivity(intent)
        }

        SettingsButton = findViewById(R.id.SettingsButton)
        SettingsButton.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

        btnOpenCamera = findViewById(R.id.btnOpenCamera)
        btnOpenCamera.setOnClickListener {
            dispatchTakePictureIntent()
        }

    }
    private fun dispatchTakePictureIntent() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (takePictureIntent.resolveActivity(packageManager) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageUri: Uri? = data?.data
            // Здесь можно обработать полученное изображение
        }
    }
}