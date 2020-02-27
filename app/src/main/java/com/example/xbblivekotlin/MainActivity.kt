package com.example.xbblivekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.example.mylibrary.MyLottie
import android.content.Intent

import com.myxbb.Snake

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val intent = Intent()
//        intent.setClass(this, MyLottie::class.java)
//        startActivity(intent)

        var snakeM = Snake()
        var out = snakeM.omg("金城武")
        println("$out ***********************")
    }
}
