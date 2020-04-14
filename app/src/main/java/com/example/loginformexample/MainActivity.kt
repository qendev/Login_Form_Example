package com.example.loginformexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


/**
 * A Login Form Example in Kotlin Android
 * created by qendev on 14/04/2020
 */

class MainActivity : AppCompatActivity() {








    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to all views
        var et_user_name = findViewById(R.id.et_user_name) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        var btn_reset = findViewById(R.id.btn_reset) as Button
        var btn_submit = findViewById(R.id.btn_submit) as Button





        // clearing user_name and password edit text views on reset button click
        btn_reset.setOnClickListener {
            et_user_name.setText("")
            et_password.setText("")
        }

        // set on-click listener
        btn_submit.setOnClickListener {
            val user_name = et_user_name.text;
            val password = et_password.text;
            Toast.makeText(this@MainActivity, user_name, Toast.LENGTH_LONG).show()

            // your code to validate the user_name and password combination
            // and verify the same

        }

    }
}
