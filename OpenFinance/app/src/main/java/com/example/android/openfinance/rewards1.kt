package com.example.android.openfinance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.rewards1.*

class rewards1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rewards1)

        card1.setOnClickListener {
            val intent = Intent(this, scratch::class.java)
            startActivity(intent)
        }
    }
}