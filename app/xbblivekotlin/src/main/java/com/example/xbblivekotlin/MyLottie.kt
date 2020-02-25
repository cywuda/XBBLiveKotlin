package com.example.xbblivekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_lottie.*

import com.airbnb.lottie.LottieAnimationView


class MyLottie : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_lottie)

        lottie_likeanim.playAnimation()
    }
}
