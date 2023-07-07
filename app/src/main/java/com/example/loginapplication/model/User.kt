package com.example.loginapplication.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_user")
class User {

    @ColumnInfo(name = "unique_id")
    @PrimaryKey(autoGenerate = true)
    var uniqueId: Int = 0

    @ColumnInfo(name = "first_name")
    var firstName: String? = null

    @ColumnInfo(name = "last_name")
    var lastName: String? = null


}