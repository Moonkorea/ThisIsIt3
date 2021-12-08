package com.jungsoo.thisisit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import org.json.JSONArray

class RandomHowAboutThisActivity : AppCompatActivity() {

    private var auth: FirebaseAuth? = null
    private lateinit var db: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_how_about_this)

        val homeBtn = findViewById<Button>(R.id.homeBtn)
        homeBtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        auth = FirebaseAuth.getInstance()
        val uid = auth!!.currentUser?.uid.toString()
        db = FirebaseDatabase.getInstance().reference.child("users")

        val jsonString = assets.open("fooddata.json").reader().readText()
        val jsonArray = JSONArray(jsonString)
        val foodAllergyArray = arrayOfNulls<String>(jsonArray.length())// 알레르기정보를 제외한 음식 정보 배열로 저장, 제외된 음식자리는 NULL로 대체
        val foodRandomArray = arrayOfNulls<String>(jsonArray.length())// 알레르기정보를 제외한 음식 정보 배열로 저장, 제외된 음식자리는 NULL로 대체


        db.child(uid).get().addOnCompleteListener {
            if (it.isSuccessful) {
                val userData = it.result?.getValue(UserProfile::class.java)
                if (userData != null) {
                    for (index in 0 until jsonArray.length()) {
                        val jsonObject = jsonArray.getJSONObject(index)
                        val allergy = jsonObject.getJSONArray("allergy")
                        var j = 0
                        for (i in 0 until 21) {
                            if ((allergy[i] == userData.allergy!![i]) && (allergy[i] == 1)) {
                                j += 1
                            }
                        }
                        if (j == 0) {
                            foodAllergyArray[index] = jsonObject.get("name").toString()
                        }

                        var nullCntA = 0

                        for (ia in 0 until jsonArray.length()) {
                            if (foodAllergyArray[ia] == null) {
                                nullCntA++
                            }
                        }

                        var remainFromAllergy = jsonArray.length() - nullCntA

                        var allergyFoodArray = arrayOfNulls<String>(remainFromAllergy)

                        var allergyi = 0

                        for (i in 0 until jsonArray.length()) {
                            if (foodAllergyArray[i] != null) {
                                allergyFoodArray[allergyi] = foodAllergyArray[i]
                                allergyi++
                            }
                        }

                        val range = (0..remainFromAllergy - 1)

                        val howAboutThis = findViewById(R.id.choosedFood) as TextView


                        if (remainFromAllergy == 0) {
                            howAboutThis.text = "조건에 맞는 음식이 \n없습니다."
                        }
                        else {
                            var randomNum = range.random()
                            howAboutThis.text = allergyFoodArray[randomNum]

                            val anotherBtn = findViewById<Button>(R.id.anotherBtn)
                            anotherBtn.setOnClickListener {
                                randomNum = range.random()
                                howAboutThis.text = allergyFoodArray[randomNum]
                            }

                            val chooseBtn = findViewById<Button>(R.id.chooseBtn)
                            chooseBtn.setOnClickListener {
                                val intent = Intent(this, FinalResultActivity::class.java)
                                intent.putExtra("finalresult", allergyFoodArray[randomNum])
                                startActivity(intent)
                            }
                        }


                    }
                }
            }
        }

        for (index in 0 until jsonArray.length()) {
            val jsonObject = jsonArray.getJSONObject(index)
            foodRandomArray[index] = jsonObject.get("name").toString()
        }

        val range = (0..174 - 1)

        val howAboutThis = findViewById(R.id.choosedFood) as TextView


        var randomNum = range.random()
        howAboutThis.text = foodRandomArray[randomNum]

        val anotherBtn = findViewById<Button>(R.id.anotherBtn)
        anotherBtn.setOnClickListener {
            randomNum = range.random()
            howAboutThis.text = foodRandomArray[randomNum]
        }

        val chooseBtn = findViewById<Button>(R.id.chooseBtn)
        chooseBtn.setOnClickListener {
            val intent = Intent(this, FinalResultActivity::class.java)
            intent.putExtra("finalresult", foodRandomArray[randomNum])
            startActivity(intent)
        }

    }
}