package com.example.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_bounce.*

class BounceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bounce)

        idBtnBounce.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            //animation.repeatCount = 3
            idImageView.startAnimation(animation)
        }

    }
}