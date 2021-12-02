package com.jungsoo.thisisit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.jungsoo.thisisit.databinding.ActivityRandomHowAboutThisBinding
import kotlin.random.Random

class RandomHowAboutThisActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRandomHowAboutThisBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_how_about_this)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_random_how_about_this)

        val foodImage =binding.foodImage

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