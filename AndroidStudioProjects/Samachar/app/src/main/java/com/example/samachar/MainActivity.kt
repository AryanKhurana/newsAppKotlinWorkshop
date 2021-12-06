package com.example.samachar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var loggedIn=false
        if(!loggedIn){
            var loginintent= Intent(this,LoginActivity::class.java)
            startActivity(loginintent)
        }
    }
}