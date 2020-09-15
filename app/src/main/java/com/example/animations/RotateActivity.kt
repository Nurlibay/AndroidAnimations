package com.example.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_rotate.*

class RotateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rotate)

        idBtnRotateClock.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.rotate_clockwise)
            //animation.repeatCount = 3
            idImageView.startAnimation(animation)
        }

        idBtnRotateAntiClock.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.rotate_anticlockwise)
            //animation.repeatCount = 3
            //animation.startOffset = 1000
            idImageView.startAnimation(animation)
        }

    }
}