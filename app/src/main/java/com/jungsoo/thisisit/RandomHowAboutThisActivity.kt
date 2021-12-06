package com.jungsoo.thisisit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import org.json.JSONArray
import java.util.*
//import androidx.databinding.DataBindingUtil
//import com.jungsoo.thisisit.databinding.ActivityRandomHowAboutThisBinding
import kotlin.random.Random

class RandomHowAboutThisActivity : AppCompatActivity() {

   // private lateinit var binding: ActivityRandomHowAboutThisBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_how_about_this)

       val userallergy = arrayOf(0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

       val jsonString = assets.open("fooddata.json").reader().readText()
       val jsonArray = JSONArray(jsonString)
       val foodarray = arrayOfNulls<String>(jsonArray.length())// 알레르기정보를 제외한 음식 정보 배열로 저장, 제외된 음식자리는 NULL로 대체
       for(index in 0 until jsonArray.length()){
           val jsonObject = jsonArray.getJSONObject(index)
           val allergy = jsonObject.getJSONArray("allergy")
           var j = 0
           for (i in 0 until 21) {
               if((allergy[i] == userallergy[i])&&(allergy[i]==1)){
                   j += 1
               }
           }
           if(j==0){
               foodarray[index] = jsonObject.toString()
           }
       }
       Log.d("foodarray", Arrays.toString(foodarray))



       // binding = DataBindingUtil.setContentView(this, R.layout.activity_random_how_about_this)

       // val foodImage =binding.foodImage

/*        binding.randomSelectBtn.setOnClickListener {

            Toast.makeText(this, "성공", Toast.LENGTH_LONG).show()

            val num = Random.nextInt(1, 4)

            if (num == 1) {
                foodImage.setImageResource(R.drawable.food1)
            }

            else if (num == 2) {
                foodImage.setImageResource(R.drawable.food2)
            }

            else if (num == 3) {
                foodImage.setImageResource(R.drawable.food3)
            }
        }
         */
    }


}