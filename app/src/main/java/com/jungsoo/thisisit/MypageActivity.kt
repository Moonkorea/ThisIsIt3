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
import kotlinx.android.synthetic.main.activity_mypage.*
import org.w3c.dom.Text
import android.content.Intent as Intent

class MypageActivity : AppCompatActivity() {

    // 뭐 아무튼 FIREBASE 선언
    private var auth: FirebaseAuth? = null
    private lateinit var db: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)

        // 홈 버튼 눌러서 메인화면으로 가기
        backHomeButton.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
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
                        val uAge = userData.age
                        val uSex = userData.sex
                        val uAllergy = userData.allergy

                        // 읽어온 데이터 입력
                        val e = findViewById(R.id.userEmail) as TextView
                        e.text = uEmail
                        val a = findViewById(R.id.userAge) as TextView
                        a.text = uAge
                        val s = findViewById(R.id.userSex) as TextView
                        s.text = uSex.toString()
                        val al = findViewById(R.id.userAllergy) as TextView
                        al.text = uAllergy.toString()

                        Log.d("MAIN", "email" + uEmail)
                        Log.d("MAIN", "age" + uAge)
                        Log.d("MAIN", "sex" + uSex)
                    }
                }
            }


    }

}
