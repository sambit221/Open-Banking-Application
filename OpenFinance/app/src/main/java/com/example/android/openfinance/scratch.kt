package com.example.android.openfinance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.scratch.*

class scratch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scratch)


        //     support button
        support.setOnClickListener {
            val intent = Intent(this, support::class.java)
            startActivity(intent)
        }

    }
}