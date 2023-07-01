package com.example.loginapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.loginapplication.databinding.ActivityMainBinding

open class MainActivity : AppCompatActivity(), DemoInterface, View.OnClickListener {

    protected var protectedValue = "PROTECTED VARIABLE"
    private var privatedValue = "PRIVATE VARIABLE"
    var value = "OPEN/PUBLIC VARIABLE"

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        println("Main  :  njcfdj  : $protectedValue")
        println("Main  :  Public : $value")
        println("Main  :  Private : $privatedValue")

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(this)

        findViewById<Button>(R.id.buttonOpenGoogle).setOnClickListener(this)

        sum(2, 3)
        sum(2.5, 3.5)
    }


    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum(a: Double, b: Double): Double {
        return a + b
    }

    override fun demoInterfaceFun() {

    }

    override fun onClick(p0: View?) {
        if (p0 != null) {
            if (p0.id == R.id.button) {
//                var registerData = RegisterData(email = "ankita@gmail.com", password = "1234" , userName = "ankita")
//                var bundle = Bundle()
//                bundle.putParcelable()
                //Explicit Intent
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("EMAIL_ID", binding.edtEmailId?.text.toString())
                intent.putExtra("number", 5)
//                intent.putExtra("register" , bundle)
                startActivity(intent)
                println("Login Button click ")
            } else if (p0.id == R.id.buttonOpenGoogle) {
                //Implicit Intent
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:9898989898")
                startActivity(intent)
                println("Register Button click ")
            }
        } else {
            println("P0 null ")
        }
    }
}