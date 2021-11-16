package com.jungsoo.thisisit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*초기화면에서 회원가입 버튼을 누르면 회원가입 화면으로 넘어간다.*/
        val joinBtn = findViewById<Button>(R.id.joinBtn)
        joinBtn.setOnClickListener {
            val intent =Intent(this, JoinActivity::class.java)
            startActivity(intent)
        }


    }
}