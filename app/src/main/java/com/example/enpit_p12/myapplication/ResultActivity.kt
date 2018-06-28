package com.example.enpit_p12.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        gu.setOnClickListener { onJanKenButtonTapped(it) }
        choki.setOnClickListener { onJanKenButtonTapped(it) }
        pa.setOnClickListener { onJanKenButtonTapped(it) }
    }
}
