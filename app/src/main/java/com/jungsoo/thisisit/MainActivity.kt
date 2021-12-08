package com.jungsoo.thisisit

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import org.json.JSONArray
import java.util.*


class MainActivity : AppCompatActivity() {

    private var auth: FirebaseAuth? = null
    private lateinit var db: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()
        db = FirebaseDatabase.getInstance().getReference().child("users")

        // 비회원으로 시작
        val btnNoLogin = findViewById<Button>(R.id.btnNoLogin)
        btnNoLogin.setOnClickListener {
            Toast.makeText(this, "비회원으로 시작합니다.", Toast.LENGTH_LONG)
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        // 회원가입
        val btnJoin = findViewById<Button>(R.id.btnRegister)
        btnJoin.setOnClickListener {
            Toast.makeText(this, "회원가입 페이지로 이동합니다.", Toast.LENGTH_LONG)
            val intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)
        }

        // 로그인
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {

            val id = findViewById<EditText>(R.id.editId)
            val password = findViewById<EditText>(R.id.editPw)


            if(id.length() == 0  || password.length() == 0){
                Toast.makeText(this, "아이디 또는 패스워드를 입력해주세요.", Toast.LENGTH_LONG)
            }
            if(id.length() != 0 && password.length() != 0){
                auth!!.signInWithEmailAndPassword(id.text.toString(), password.text.toString())
                    .addOnCompleteListener(this) { task ->
                        if(task.isSuccessful) {
                            Toast.makeText(this, "로그인 성공", Toast.LENGTH_LONG)
                            val user = auth!!.currentUser
                            val intent = Intent(this, HomeActivity::class.java)
                            if (user != null) {
                                intent.putExtra("uid", user.uid)
                            }
                            startActivity(intent)
                        }
                        else {
                            Toast.makeText(this, "아이디 또는 패스워드를 다시 입력해주세요.", Toast.LENGTH_LONG)
                        }
                    }
            }
        }
    }
}