package com.tisiang.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val phone = findViewById<EditText>(R.id.editTextPhone)
        val email = findViewById<EditText>(R.id.editTextEmail)
        val password = findViewById<EditText>(R.id.editTextPassword)

        val goButtonClickListerner = View.OnClickListener {
            Toast.makeText(this,
                    "Phone ${phone.text}\n" +
                    "Email ${email.text}\n" +
                    "Password ${password.text}", Toast.LENGTH_LONG).show()
        }

        val goButton = findViewById<Button>(R.id.button_go)
        goButton.setOnClickListener(goButtonClickListerner)

    }


}
