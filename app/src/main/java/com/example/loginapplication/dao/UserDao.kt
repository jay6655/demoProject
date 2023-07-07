package com.example.loginapplication.dao

import androidx.room.*
import com.example.loginapplication.model.User

@Dao
interface UserDao {

    @Insert
    fun insertUserData(user: User)

    @Delete
    fun deleteUserData(user: User)

    @Update
    fun updateUserData(user: User)

    @Query("SELECT * FROM tbl_user")
    fun fetchAllData(): List<User?>

    @Query("SELECT * from tbl_user WHERE first_name = :uniqueId  limit 1")
    fun fetchPerticularData(uniqueId: String): User?
}