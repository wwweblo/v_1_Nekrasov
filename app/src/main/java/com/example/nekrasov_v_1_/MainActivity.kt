package com.example.nekrasov_v_1_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

//    private lateinit var auth: FirebaseAuth
    lateinit var loginEditText: EditText
    lateinit var passwordEditText: EditText
    lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        auth = FirebaseAuth.getInstance()
//
        loginEditText = findViewById(R.id.editTextLogin)
//        passwordEditText = findViewById(R.id.editTextPassword)
        loginButton = findViewById(R.id.buttonLogin)

        loginButton.setOnClickListener {
//            loginUser()
            val intent = Intent(this, PersonalArea::class.java)
            intent.putExtra("login", loginEditText.text.toString())
            startActivity(intent)
        }


    }

//    private fun loginUser() {
//        val email = loginEditText.text.toString().trim() + "@gmail.com"
//        val password = passwordEditText.text.toString().trim()
//
//        if (email.isEmpty() || password.isEmpty()) {
//            Toast.makeText(this, "Введите адрес электронной почты и пароль", Toast.LENGTH_SHORT).show()
//            return
//        }
//
//        // Аутентификация пользователя в Firebase
//        auth.signInWithEmailAndPassword(email, password)
//            .addOnCompleteListener(this) { task ->
//                if (task.isSuccessful) {

//                    val user: FirebaseUser? = auth.currentUser
//                    if (user != null) {
//                        val intent = Intent(this, PersonalArea::class.java)
//                        startActivity(intent)
//                        finish()
//                    }
//                } else {

//                    registerUser(email, password)
//                }
//            }
//    }
//
//    private fun registerUser(email: String, password: String) {
//        auth.createUserWithEmailAndPassword(email, password)
//            .addOnCompleteListener(this) { task ->
//                if (task.isSuccessful) {
//                    val intent = Intent(this, PersonalArea::class.java)
//                    startActivity(intent)
//                    finish()
//                } else {
//                    Toast.makeText(this, "Ошибка при регистрации: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
//                }
//            }
//    }
}