package com.example.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_zoom.*

class ZoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zoom)

        idBtnZoomIn.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            //animation.repeatCount = 3
            idImageView.startAnimation(animation)
        }

        idBtnZoomOut.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            //animation.repeatCount = 3
            //animation.startOffset = 1000
            idImageView.startAnimation(animation)
        }

    }
}