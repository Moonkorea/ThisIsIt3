package com.jungsoo.thisisit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class JoinActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var database: DatabaseReference

    val dataUserList = mutableListOf<userData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        auth = Firebase.auth
        database = Firebase.database.reference

        val database = Firebase.database
       // val myRef = database.getReference("UserData").child(Firebase.auth.currentUser!!.uid)

        val joinBtn = findViewById<Button>(R.id.btnRegister)

        joinBtn.setOnClickListener {
            val email = findViewById<EditText>(R.id.editId)
            val password = findViewById<EditText>(R.id.editPw)
            val age = findViewById<EditText>(R.id.editAge)
            // 성별 체크박스를 두개 다 누르면 안되는거 코드를 썻는데 인식이 걍 안돼서 이건 지우고 올렸음
            val man = findViewById<CheckBox>(R.id.editMan)
            val woman = findViewById<CheckBox>(R.id.editWoman)
            // 알레르기 체크박스 설정해야되는데 이거 일단은 진성이형이 올린 데이터 파일이랑 맞게 리스트로 1, 0 으로 구현할 예정.


            Log.d("MAIN", email.text.toString())
            Log.d("MAIN", password.text.toString())
            Log.d("MAIN", age.text.toString())
            Log.d("MAIN", man.text.toString())

            auth.createUserWithEmailAndPassword(email.text.toString(), password.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(baseContext, "회원가입 성공", Toast.LENGTH_SHORT).show()
                    }
                    else {
                        Toast.makeText(baseContext, "회원가입 실패.", Toast.LENGTH_SHORT).show()
                    }
                }
        }

    }
}