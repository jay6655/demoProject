package com.example.loginapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CustomAdapter(var arrayOfRegisterData: Array<RegisterData>, var context: Context) :
    BaseAdapter() {

    override fun getCount(): Int {
        return arrayOfRegisterData.size
    }

    override fun getItem(p0: Int): Any {
        return arrayOfRegisterData.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_line_item, p2, false)

        view.findViewById<TextView>(R.id.txt_email).text = arrayOfRegisterData[p0].email
        view.findViewById<TextView>(R.id.txt_username).text = arrayOfRegisterData[p0].userName
        view.findViewById<TextView>(R.id.txt_password).text = arrayOfRegisterData[p0].password

        return view
    }
}