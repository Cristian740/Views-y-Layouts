package com.example.hp.proyecto1

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProfileActivity : AppCompatActivity() {
    companion object {
        fun startactivity (context: Context){
            val intent = Intent(context , ProfileActivity::class.java)
            context.startActivity(intent)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    fun salir(view: View){
        val intent = Intent(this , MainActivity::class.java)
        this.startActivity(intent)
    }
}
