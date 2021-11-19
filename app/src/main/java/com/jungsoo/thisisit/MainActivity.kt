package com.jungsoo.thisisit

import android.content.Intent
import android.net.Uri
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

        val btn1 = findViewById<Button>(R.id.btn1)

        btn1.setOnClickListener {
            val Sharing_intent = Intent(Intent.ACTION_SEND)

            Sharing_intent.addCategory(Intent.CATEGORY_DEFAULT)
            Sharing_intent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.jungsoo.thisisit")
            val path = "image/png"
            Sharing_intent.putExtra(Intent.EXTRA_STREAM, Uri.parse(path))
            Sharing_intent.setPackage("com.kakao.talk")
            Sharing_intent.putExtra(Intent.EXTRA_TITLE, "제목")
            Sharing_intent.setType("image/png")
            startActivity(Intent.createChooser(Sharing_intent, "앱을 선택해 주세요"))
        }


    }
}