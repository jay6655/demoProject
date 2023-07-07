package com.example.loginapplication

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.loginapplication.dao.UserDao
import com.example.loginapplication.model.User

@Database(entities = [User::class], version = 1)
abstract class AppDataBase : RoomDatabase() {

   abstract fun userDao(): UserDao

}