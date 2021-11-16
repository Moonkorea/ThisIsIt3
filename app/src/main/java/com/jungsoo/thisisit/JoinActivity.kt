package com.jungsoo.thisisit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        /* 회원가입화면에서 회원가입 완료 버튼을 누르면 홈 화면으로 넘어간다.*/
        val joinCompleteBtn = findViewById<Button>(R.id.joinCompleteBtn)
        joinCompleteBtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}