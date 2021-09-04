package com.example.android.openfinance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.offermap.*

class offermap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.offermap)

        ecommerce.setOnClickListener {
            val intent = Intent(this, offer2::class.java)
            startActivity(intent)
        }

    }
}