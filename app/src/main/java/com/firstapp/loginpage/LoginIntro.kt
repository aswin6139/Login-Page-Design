package com.firstapp.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginIntro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_intro)

        var btn=findViewById<Button>(R.id.btnGetStarted)

        btn.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }

    }
}