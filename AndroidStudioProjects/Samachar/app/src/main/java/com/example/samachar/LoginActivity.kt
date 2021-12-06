package com.example.samachar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.security.KeyStore

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val button : Button = findViewById(R.id.activity_login_button)
        var emailField : EditText=findViewById(R.id.activity_login_email)
        var passwordField:EditText=findViewById(R.id.activity_login_password)
        var registerRedirect:TextView=findViewById(R.id.activity_login_register)
        button.setOnClickListener{
           if(validate(emailField,passwordField)){
               Toast.makeText(this,"Congrats!You have successfully logged in!",Toast.LENGTH_SHORT).show()
           }
        }
        registerRedirect.setOnClickListener{
            var registerintent= Intent(this,RegisterActivity::class.java)
            startActivity(registerintent)
        }
    }
    fun validate(emailField:EditText,passwordField:EditText) : Boolean{
        var check=true
        if(emailField.text.isBlank()){
            check=false
            emailField.error="Enter an email!!!"
            emailField.requestFocus()

        }
        if(passwordField.text.isBlank()){
            check=false
            emailField.error="Enter a password!!!"
            emailField.requestFocus()

        }
        return check




    }
}