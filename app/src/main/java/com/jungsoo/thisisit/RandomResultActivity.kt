package com.jungsoo.thisisit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RandomResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_result)

        val resultAcceptBtn = findViewById<Button>(R.id.resultAcceptBtn)
        resultAcceptBtn.setOnClickListener {
            val intent = Intent(this, FinalResultActivity::class.java)
            startActivity(intent)
        }

        val retryBtn = findViewById<Button>(R.id.retryBtn)

    }
}