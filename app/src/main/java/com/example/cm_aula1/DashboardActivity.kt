package com.example.cm_aula1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash)

        setTitle("Dashboard")

        val parametro=intent.getStringExtra("PARAM_NAME")
        val textView = findViewById<TextView>(R.id.tv1Dashboard)
    }
}