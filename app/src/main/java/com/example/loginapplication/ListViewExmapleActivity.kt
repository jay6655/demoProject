package com.example.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.loginapplication.databinding.ActivityListViewExmapleBinding

class ListViewExmapleActivity : AppCompatActivity() {

    lateinit var binding: ActivityListViewExmapleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewExmapleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val users = arrayOf(
            RegisterData(email = "abc@gmail.com", userName = "abc", password = "1234"),
            RegisterData(email = "xyz@gmail.com", userName = "xyz", password = "1234"),
            RegisterData(email = "mno@gmail.com", userName = "mno", password = "1234"),
        )


        val arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, resources.getStringArray(R.array.languages)
        )
//
//        val arrayAdapter1 = ArrayAdapter(
//            this,
//            android.R.layout.simple_list_item_1, arrayData
//        )

        val customAdapter = CustomAdapter(users, this)

        binding.listView.adapter = arrayAdapter
        binding.listView.setOnItemClickListener({ adapterView, view, i, l ->

            Toast.makeText(
                this,
                resources.getStringArray(R.array.languages).get(i),
                Toast.LENGTH_SHORT
            ).show()
//            Toast.makeText(this, users.get(i).userName, Toast.LENGTH_SHORT).show()
        })
    }
}