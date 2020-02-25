package com.example.xbblivekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.xbblivekotlin.MyLottie
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent()
        intent.setClass(this, MyLottie::class.java)
        startActivity(intent)
    }
}
