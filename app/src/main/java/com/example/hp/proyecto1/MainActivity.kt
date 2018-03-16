package com.example.hp.proyecto1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun iniciar(view: View){
        //ProfileActivity.startactivity(this,8)
        ProfileActivity.startactivity(this)
    }
}
