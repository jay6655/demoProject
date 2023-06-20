package com.example.loginapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.loginapplication.databinding.ActivityRecycleViewBinding

class RecycleViewActivity : AppCompatActivity(), OnItemCLick {

    lateinit var binding: ActivityRecycleViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecycleViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val users = arrayOf(
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
        )

        val adapter = RecycleViewDataAdapter(users, this)
        binding.recycleView.layoutManager = LinearLayoutManager(this)
        binding.recycleView.adapter = adapter

    }

    override fun onItemClickPosition(position: Int) {
        println(position)
        var intent = Intent(this@RecycleViewActivity, MainActivity::class.java)
        startActivity(intent)
    }
}