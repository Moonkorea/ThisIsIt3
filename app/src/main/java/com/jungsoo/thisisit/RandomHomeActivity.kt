package com.jungsoo.thisisit

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.jungsoo.thisisit.databinding.ActivityQuestionHomeBinding
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_random_home.*
import org.json.JSONArray
import java.util.*

class RandomHomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_home)

        setSupportActionBar(toolbar_random) //커스텀한 toolbar를 액션바로 사용
        supportActionBar?.setDisplayShowTitleEnabled(false) //액션바에 표시되는 제목의 표시유무를 설정합니다. false로 해야 custom한 툴바의 이름이 화면에 보이게 됩니다.

        val userallergy = arrayOf(0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

        val jsonString = assets.open("fooddata.json").reader().readText()
        val jsonArray = JSONArray(jsonString)
        val foodarray =
            arrayOfNulls<String>(jsonArray.length())// 알레르기정보를 제외한 음식 정보 배열로 저장, 제외된 음식자리는 NULL로 대체
        for (index in 0 until jsonArray.length()) {
            val jsonObject = jsonArray.getJSONObject(index)
            val allergy = jsonObject.getJSONArray("allergy")
            var j = 0
            for (i in 0 until 21) {
                if ((allergy[i] == userallergy[i]) && (allergy[i] == 1)) {
                    j += 1
                }
            }
            if (j == 0) {
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

    //액션버튼 메뉴 액션바에 집어 넣기
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    //액션버튼 클릭 했을 때
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.action_infoDeveloper -> {
                //개발자 정보
                Toast.makeText(applicationContext, "팀 소환사(기계정보공학과 17학번 김진성, 문정수, 주영훈)", Toast.LENGTH_LONG).show()
                return super.onOptionsItemSelected(item)
            }
            R.id.action_infoUser -> {
                //마이페이지 눌렀을 때
                val intent = Intent(this, MypageActivity::class.java)
                startActivity(intent)
                return super.onOptionsItemSelected(item)
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
