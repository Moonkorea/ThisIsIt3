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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        auth = Firebase.auth
        database = Firebase.database.reference

        val joinBtn = findViewById<Button>(R.id.btnRegister)
        joinBtn.setOnClickListener {
            val email = findViewById<EditText>(R.id.editId)
            val password = findViewById<EditText>(R.id.editPw)
            // val age = findViewById<EditText>(R.id.editAge)

            Log.d("MAIN", email.text.toString())
            Log.d("MAIN", password.text.toString())

            auth.createUserWithEmailAndPassword(email.text.toString(), password.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(baseContext, "회원가입 성공",
                            Toast.LENGTH_SHORT).show()
                    }
                    else {
                        Toast.makeText(baseContext, "회원가입 실패.",
                            Toast.LENGTH_SHORT).show()
                    }
                }
        }

    }
}