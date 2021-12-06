package com.jungsoo.thisisit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_how_about_this.*
import org.json.JSONArray
import java.util.*
import kotlin.random.Random.Default.nextInt
import java.util.Random

class HowAboutThisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_about_this)

        val assetManager = resources.assets
        val inputStream= assetManager.open("fooddata.json")
        val jsonString = inputStream.bufferedReader().use { it.readText() }
        val jsonArray = JSONArray(jsonString)
        val foodAllergyArray = arrayOfNulls<String>(jsonArray.length())// 알레르기정보를 제외한 음식 정보 배열로 저장, 제외된 음식자리는 NULL로 대체
        val foodQuestionArray = arrayOfNulls<String>(jsonArray.length())

        val test = intent.getIntExtra("111111", 0)

        val userallergy = arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

        var userAnswer = arrayOf(0, 0, 0, 0, 0, 0)

        /*if (test == 111111) {
            val userallergy = arrayOf(0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        }*/

        /*for(index in 0 until jsonArray.length()){
            val jsonObject = jsonArray.getJSONObject(index)
            val allergy = jsonObject.getJSONArray("allergy")
            var j = 0
            for (i in 0 until 21) {
                if((allergy[i] == userallergy[i])&&(allergy[i]==1)){
                    j += 1
                }
            }
            if(j==0){
                foodAllergyArray[index] = jsonObject.toString()
            }
        }
        Log.d("foodallergyarray", Arrays.toString(foodarray))*/

        if (test == 111111) {
            userAnswer = arrayOf(1, 1, 1, 1, 1, 1)

        }

        for(index in 0 until jsonArray.length()){
            val jsonObject = jsonArray.getJSONObject(index)
            val questionFood = jsonObject.getJSONArray("question")
            var j = 0
            for (i in 0 until 6) {
                if((questionFood[i] == userAnswer[i])){
                    j += 1
                }
            }
            if(j==6){
                foodQuestionArray[index] = jsonObject.toString()
            }
        }
        Log.d("foodquestionarray", Arrays.toString(foodQuestionArray))


        var nullCnt = 0
        var finalFoodArrayIndex = 0


        for(index in 0 until jsonArray.length()){

            if (foodQuestionArray[index] == null) {
                nullCnt++
            }
        }

        var remainFoodCnt = jsonArray.length() - nullCnt



        val finalFoodArray = arrayOfNulls<String>(remainFoodCnt)

        for(index in 0 until jsonArray.length()){

            if (foodQuestionArray[index] != null) {
                finalFoodArray[finalFoodArrayIndex] = foodQuestionArray[index]
                finalFoodArrayIndex++
            }
        }

        Log.d("test2", Arrays.toString(finalFoodArray))

        // 선별된 음식 화면에 출력

        if (remainFoodCnt == 0) {
            var howAboutThis = findViewById<TextView>(R.id.howAboutThis) as TextView
            howAboutThis.setText("조건에 맞는 음식이 \n없습니다.")

        } else {
            //var randomNum = Random().nextInt(remainFoodCnt) + 1
            val range = (0..remainFoodCnt-1)

            var randomNum = range.random()

            howAboutThis.setText(finalFoodArray[randomNum])

            val anotherBtn = findViewById<Button>(R.id.anotherBtn)

            anotherBtn.setOnClickListener {
                var randomNum = range.random()
                howAboutThis.setText(finalFoodArray[randomNum])


            }
        }











            val chooseBtn = findViewById<Button>(R.id.chooseBtn)
        chooseBtn.setOnClickListener {
            val intent = Intent(this, FinalResultActivity::class.java)
            //intent.putExtra("111111", 111111)
            startActivity(intent)
        }
    }
}