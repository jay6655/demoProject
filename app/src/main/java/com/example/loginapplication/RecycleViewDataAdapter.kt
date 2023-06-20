package com.example.loginapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecycleViewDataAdapter(var users: Array<RegisterData>, var onItemCLick: OnItemCLick) :
    RecyclerView.Adapter<DatViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.custom_line_item, parent, false)
        return DatViewHolder(view, onItemCLick)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: DatViewHolder, position: Int) {
        val registerData = users[position]
        holder.emailTxt.text = registerData.email
        holder.userNameTxt.text = registerData.userName
        holder.passwordTxt.text = registerData.password
    }
}

class DatViewHolder(itemView: View, var onItemCLick: OnItemCLick) :
    RecyclerView.ViewHolder(itemView) {
    var emailTxt = itemView.findViewById<TextView>(R.id.txt_email)
    var userNameTxt = itemView.findViewById<TextView>(R.id.txt_username)
    var passwordTxt = itemView.findViewById<TextView>(R.id.txt_password)

    init {
        itemView.setOnClickListener {
            onItemCLick.onItemClickPosition(layoutPosition)
        }
    }

}

open interface OnItemCLick {
    fun onItemClickPosition(position: Int);
}