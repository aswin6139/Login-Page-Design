package com.firstapp.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btnGotoSignUp=findViewById<TextView>(R.id.btnGotoSignUp)

        btnGotoSignUp.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }
    }
}