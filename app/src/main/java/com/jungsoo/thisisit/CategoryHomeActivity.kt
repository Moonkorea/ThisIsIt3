package com.jungsoo.thisisit

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.tabs.TabLayoutMediator
import com.jungsoo.thisisit.databinding.ActivityQuestionHomeBinding
import kotlinx.android.synthetic.main.activity_category_home.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.homeViewpager

class CategoryHomeActivity : AppCompatActivity() {

    private val tabTextList = arrayListOf("전체", "한식", "일식", "중식", "양식", "아시아", "술좋아", "디저트")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_home)
        init()

        setSupportActionBar(toolbar_category) //커스텀한 toolbar를 액션바로 사용
        supportActionBar?.setDisplayShowTitleEnabled(false) //액션바에 표시되는 제목의 표시유무를 설정합니다. false로 해야 custom한 툴바의 이름이 화면에 보이게 됩니다.

    }

    private fun init() {
        categoryViewpager.adapter = CategoryFragmentStateAdapter(this)
        TabLayoutMediator(categoryTabLayout, categoryViewpager) {
                tab, position ->
            // tab.setIcon(tabIconList[position])
            tab.text = tabTextList[position]
        }.attach()
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


