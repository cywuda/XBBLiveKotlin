package com.example.xbblivekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.xbblivekotlin.MyKotlin

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var test = MyKotlin()
        test.myTest()
    }
}
