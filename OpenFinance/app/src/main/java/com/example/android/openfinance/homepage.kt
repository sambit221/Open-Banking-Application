package com.example.android.openfinance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.homepage.*

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

        //    reward button
        buttonrewards.setOnClickListener{
            val intent = Intent( this, rewards1::class.java)
            startActivity(intent)
        }

        //    offer button
        buttonoffers.setOnClickListener {
            val intent = Intent(this, offermap::class.java)
            startActivity(intent)
        }

        //     insights button
        stats.setOnClickListener {
            val intent = Intent(this, insights::class.java)
            startActivity(intent)
        }

        //     support button
        support.setOnClickListener {
            val intent = Intent(this, support::class.java)
            startActivity(intent)
        }
    }
}