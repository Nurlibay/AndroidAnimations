package com.example.animations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fade.setOnClickListener {
            val intent = Intent(this, FadeActivity::class.java)
            startActivity(intent)
        }

        zoom.setOnClickListener {
            val intent = Intent(this, ZoomActivity::class.java)
            startActivity(intent)
        }

        rotate.setOnClickListener {
            val intent = Intent(this, RotateActivity::class.java)
            startActivity(intent)
        }

        move.setOnClickListener {
            val intent = Intent(this, MoveActivity::class.java)
            startActivity(intent)
        }

        slide.setOnClickListener {
            val intent = Intent(this, SlideActivity::class.java)
            startActivity(intent)
        }

        bounce.setOnClickListener {
            val intent = Intent(this, BounceActivity::class.java)
            startActivity(intent)
        }

        blink.setOnClickListener {
            val intent = Intent(this, BlinkActivity::class.java)
            startActivity(intent)
        }

        sequential.setOnClickListener {
            val intent = Intent(this, SequentialActivity::class.java)
            startActivity(intent)
        }

        together.setOnClickListener {
            val intent = Intent(this, TogetherActivity::class.java)
            startActivity(intent)
        }

    }
}