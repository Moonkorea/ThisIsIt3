package com.jungsoo.thisisit

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.jungsoo.thisisit.databinding.ActivityMypageBinding
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_mypage.*
import kotlinx.android.synthetic.main.activity_mypage.toolbar
import org.w3c.dom.Text
import android.content.Intent as Intent

class MypageActivity : AppCompatActivity() {

    // 뭐 아무튼 FIREBASE 선언
    private var auth: FirebaseAuth? = null
    private lateinit var db: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)

        setSupportActionBar(toolbar) //커스텀한 toolbar를 액션바로 사용
        supportActionBar?.setDisplayShowTitleEnabled(false) //액션바에 표시되는 제목의 표시유무를 설정합니다. false로 해야 custom한 툴바의 이름이 화면에 보이게 됩니다.


        // 홈 버튼 눌러서 홈화면으로 가기
        backHomeButton.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        // 로그아웃 버튼 눌러서 메인 액티비티로 이동
        logoutBtn.setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // 뭐 아무튼 데이터 가져올라고 선언
        auth = FirebaseAuth.getInstance()
        val uid = auth!!.currentUser?.uid.toString()
        db = FirebaseDatabase.getInstance().reference.child("users")

        db.child(uid).get().addOnCompleteListener{
            if (it.isSuccessful){
                    val userData = it.result?.getValue(UserProfile::class.java)
                    if (userData != null) {
                        val uEmail = userData.email
                        val uNickname = userData.nickname
                        val uAge = userData.age
                        val uSex = userData.sex
                        val uAllergy = userData.allergy

                        val allergy = arrayOf("우유", "소", "계란", "대두", "밀", "돼지", "닭", "조개", "오징어",
                            "게", "새우", "깨", "생선", "복숭아", "토마토", "호두", "잣", "땅콩", "굴", "전복", "홍합", "메밀")

                        // 알레르기 정보 숫자에서 재료로 변경
                        var uAllergyName = ArrayList<String>()
                        var cnt = 0
                        for(i in 0 until 22) {
                            if(uAllergy!![i] == 1){
                                uAllergyName.add(allergy[i])
                                cnt += 1
                            }
                        }

                        // 읽어온 데이터 입력
                        val e = findViewById(R.id.userEmail) as TextView
                        e.text = uEmail
                        val n = findViewById(R.id.privacy) as TextView
                        n.text = uNickname
                        val a = findViewById(R.id.userAge) as TextView
                        a.text = uAge
                        val s = findViewById(R.id.userSex) as TextView
                        s.text = uSex.toString()
                        val al = findViewById(R.id.userAllergy) as TextView
                        if(cnt == 0) {
                            al.text = "알레르기 없음"
                        }
                        else {
                            al.text = uAllergyName.toString()
                        }
                    }
                }
            }


    }

}
