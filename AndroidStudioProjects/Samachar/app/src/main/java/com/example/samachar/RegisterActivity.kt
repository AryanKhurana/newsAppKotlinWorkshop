package com.example.samachar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val button : Button = findViewById(R.id.activity_register_button)
        var emailField : EditText =findViewById(R.id.activity_register_email)
        var passwordField: EditText =findViewById(R.id.activity_register_password)
        var loginField: TextView =findViewById(R.id.activity_register_login)
        button.setOnClickListener{
            if(validate(emailField,passwordField)){
                Toast.makeText(this,"Congrats!You have successfully registered!", Toast.LENGTH_SHORT).show()
            }

        }
        loginField.setOnClickListener{
            var loginintent= Intent(this,LoginActivity::class.java)
            startActivity(loginintent)
            this.finish()
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