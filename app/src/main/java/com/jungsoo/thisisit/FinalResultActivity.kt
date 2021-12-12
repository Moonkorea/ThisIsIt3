package com.jungsoo.thisisit

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import org.json.JSONArray
import java.util.*

class FinalResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_result)

        val shareBtn = findViewById<Button>(R.id.shareBtn)
        val restaurantBtn = findViewById<Button>(R.id.restaurantBtn)

        // 음식 결과 받아오기
        val finalFood = intent.getStringExtra("finalresult").toString()

        val finalFoodPrintq: String = "<<오이거 질문 식사 추천 결과>>\n"

        // 받아온 음식 결과 보여주기
        val finalFoodName = findViewById(R.id.foodResult) as TextView
        finalFoodName.text = finalFood

        shareBtn.setOnClickListener {
            val Sharing_intent = Intent(Intent.ACTION_SEND)

            Sharing_intent.addCategory(Intent.CATEGORY_DEFAULT)
            Sharing_intent.setPackage("com.kakao.talk")
            Sharing_intent.putExtra(Intent.EXTRA_TITLE, "오늘은 이거다 추천결과")
            Sharing_intent.setType("text/plain")
            Sharing_intent.putExtra(Intent.EXTRA_TEXT, finalFoodPrintq.plus(finalFood))
            startActivity(Intent.createChooser(Sharing_intent, "앱을 선택해 주세요"))
        }

        restaurantBtn.setOnClickListener {
            val Sharing_intent = Intent(Intent.ACTION_SEND)

            Sharing_intent.addCategory(Intent.CATEGORY_DEFAULT)
            Sharing_intent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.jungsoo.thisisit")
            val path = "image/png"
            Sharing_intent.putExtra(Intent.EXTRA_STREAM, Uri.parse(path))
            Sharing_intent.setPackage("com.google.android.apps.maps")
            Sharing_intent.putExtra(Intent.EXTRA_TITLE, "제목")
            Sharing_intent.setType("image/png")
            startActivity(Intent.createChooser(Sharing_intent, "앱을 선택해 주세요"))
        }


    }
}