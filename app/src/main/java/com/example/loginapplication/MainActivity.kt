package com.example.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.room.Room
import com.example.loginapplication.databinding.ActivityMainBinding
import com.example.loginapplication.model.User

open class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityMainBinding
    lateinit var appDataBase: AppDataBase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        appDataBase = Room.databaseBuilder(
            this,
            AppDataBase::class.java, "demo_db.db"
        ).allowMainThreadQueries().build()

    }

    override fun onStart() {
        super.onStart()
        binding.fatch?.setOnClickListener {
            var listUser = appDataBase.userDao().fetchAllData()

            for (user in listUser) {
                println("First name  ${user?.firstName}")
                println("Last  name  ${user?.lastName}")
                println("Unique id  ${user?.uniqueId}")

                println("--------------------------------------")
            }
        }

        binding.insert?.setOnClickListener {
            val user = User()
            user.firstName = "JAY"
            user.lastName = "MISTRY"

            appDataBase.userDao().insertUserData(user)

        }

        binding.fetchSpecificRecord?.setOnClickListener {
            val user =
                appDataBase.userDao().fetchPerticularData(binding.edtUniqueId?.text.toString())

            println("First name  ${user?.firstName}")
            println("Last  name  ${user?.lastName}")
            println("Unique id  ${user?.uniqueId}")
        }
    }


    override fun onClick(p0: View?) {

    }
}