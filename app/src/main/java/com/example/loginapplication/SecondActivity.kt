package com.example.loginapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapplication.databinding.RegiPageActivityBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: RegiPageActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RegiPageActivityBinding.inflate(layoutInflater)
//        println("Second  :  Protected : $protectedValue")
//        println("Second  :  Public : $value")

//        var registerData =
//            RegisterData(userName = "DEMO", email = "abc@gmail.com", password = "1234")

//        registerData.userEmailId = ""
//        println("UserName : ${registerData.userName}")
//        println("Email : ${registerData.email}")
//        println("Password : ${registerData.password}")


        val emailId = intent.extras?.getString("EMAIL_ID")
        val number  = intent.extras?.getInt("number")
//        intent.extras.getBundle("")
        println("Second Activity : Email Id: $emailId")
        println("Second Activity : Number : $number")
    }
}