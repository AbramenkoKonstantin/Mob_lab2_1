package com.example.lab2_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button : Button = findViewById(R.id.button_ok)
        button.setOnClickListener {
            val text = "Кнопка ОК"
            val time = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, time)
            toast.show()
        }
    }
}