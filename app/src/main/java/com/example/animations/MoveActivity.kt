package com.example.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_move.*

class MoveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        idBtnMoveLeft.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.move_left)
            //animation.repeatCount = 3
            idImageView.startAnimation(animation)
        }

        idBtnMoveRight.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.move_right)
            //animation.repeatCount = 3
            //animation.startOffset = 1000
            idImageView.startAnimation(animation)
        }
        idBtnMoveUp.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.move_top)
            //animation.repeatCount = 3
            idImageView.startAnimation(animation)
        }

        idBtnMoveDown.setOnClickListener {
            val animation: Animation =
                AnimationUtils.loadAnimation(this, R.anim.move_bottom)
            //animation.repeatCount = 3
            //animation.startOffset = 1000
            idImageView.startAnimation(animation)
        }


    }
}