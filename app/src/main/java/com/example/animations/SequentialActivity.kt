package com.example.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_sequential.*

class SequentialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sequential)

        idBtnSequential.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.sequential)
            //animation.repeatCount = 3
            idImageView.startAnimation(animation)
        }

    }
}