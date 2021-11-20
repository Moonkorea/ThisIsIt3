package com.jungsoo.thisisit

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private var auth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()

        // 비회원으로 시작
        val btnNoLogin = findViewById<Button>(R.id.btnNoLogin)
        btnNoLogin.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        // 회원가입
        val btnJoin = findViewById<Button>(R.id.btnRegister)
        btnJoin.setOnClickListener {

            val intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)
        }

        // 로그인
        val id = findViewById<EditText>(R.id.editId)
        val password = findViewById<EditText>(R.id.editPw)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            if(id.text.toString().isEmpty() || password.text.toString().isEmpty()){
                Toast.makeText(this, "아이디 또는 패스워드를 입력해주세요.", Toast.LENGTH_LONG)
            }
            else{
                auth!!.signInWithEmailAndPassword(id.text.toString(), password.text.toString())
                    .addOnCompleteListener(this) { task ->
                        if(task.isSuccessful) {
                            Toast.makeText(this, "로그인 성공", Toast.LENGTH_LONG)
                            val intent = Intent(this, HomeActivity::class.java)
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