package com.firstapp.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var btnGotoLogin = findViewById<TextView>(R.id.btnGototLogin)

        btnGotoLogin.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }

    }
}