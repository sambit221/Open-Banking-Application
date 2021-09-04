package com.example.android.openfinance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.login.*
//import com.sawolabs.androidsdk.Sawo
//
//import com.sawolabs.androidsdk.LOGIN_SUCCESS_MESSAGE
//
//val message = intent.getStringExtra(LOGIN_SUCCESS_MESSAGE)
//// continue with your implementation
//
//fun onClickLogin(view: View) {
//    Sawo(
//        this,
//        "9bfde587-cd78-457c-a7b1-e5bac8cf94fe", // your api key
//        "*********"  // your api key secret
//    ).login(
//        "email", // can be one of 'email' or 'phone_number_sms'
//        CallbackActivity::class.java.name // Callback class name
//    )
//}

class loginpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        loginbutton.setOnClickListener{
            val intent = Intent( this, homepage::class.java)
            startActivity(intent)
        }
    }
}