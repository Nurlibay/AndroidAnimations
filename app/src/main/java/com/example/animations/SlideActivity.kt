package com.example.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_slide.*

class SlideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide)

        idBtnSlideUp.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.slide_top)
            //animation.repeatCount = 3
            idImageView.startAnimation(animation)
        }

        idBtnSlideLeft.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.slide_left)
            //animation.repeatCount = 3
            //animation.startOffset = 1000
            idImageView.startAnimation(animation)
        }
        idBtnSlideRight.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.slide_right)
            //animation.repeatCount = 3
            idImageView.startAnimation(animation)
        }

        idBtnSlideDown.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.slide_bottom)
            //animation.repeatCount = 3
            //animation.startOffset = 1000
            idImageView.startAnimation(animation)
        }

    }
}