package com.example.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_fade.*

class FadeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fade)

        idBtnFadeIn.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            //animation.repeatCount = 3
            idImageView.startAnimation(animation)
        }

        idBtnFadeOut.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            //animation.repeatCount = 3
            //animation.startOffset = 1000
            idImageView.startAnimation(animation)
        }

    }
}