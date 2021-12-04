package com.jungsoo.thisisit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.IgnoreExtraProperties
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_join.*

class JoinActivity : AppCompatActivity() {

    var auth: FirebaseAuth? = null
    private lateinit var db: DatabaseReference


    // 이메일 양식 확인 함수
    fun isValidEamil(email: String): Boolean {
        val emailPattern = "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$".toRegex()
        return email.matches(emailPattern)
    }

    // 패스워드 양식 확인 함수
    fun isValidPassword(password: String): Boolean {
        val passwordPattern = "^(?=.*[a-zA-Z])((?=.*\\d)|(?=.*\\W)).{4,12}$".toRegex()
        return password.matches(passwordPattern)
    }

    // 패스워드 체크 함수
    fun passwordCheck(password: EditText, passwordre: EditText): Boolean {
        return (password == passwordre)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        auth = FirebaseAuth.getInstance()
        db = Firebase.database.reference

        @IgnoreExtraProperties
        data class User(val email: String? = null, val age: String? = null) {
            // Null default values create a no-argument default constructor, which is needed
            // for deserialization from a DataSnapshot.
        }

        fun writeNewUser(userId: String, email: String, age: String, sex: ArrayList<String>, allergy: ArrayList<Int>) {
            val user = UserProfile(email, age, sex, allergy)

            db.child("users").child(userId).setValue(user)
        }

        val joinBtn = findViewById<Button>(R.id.btnRegister)

        joinBtn.setOnClickListener {

            val email = findViewById<EditText>(R.id.editId)
            val password = findViewById<EditText>(R.id.editPw)
            val passwordre = findViewById<EditText>(R.id.editPwRe)
            val age = findViewById<EditText>(R.id.editAge)

            // 성별
            var sex = ArrayList<String>()

            if (editMan.isChecked)
                sex.add("남자")
            if (editWoman.isChecked)
                sex.add("여자")

            // 체크박스
            var allergyArray = ArrayList<Int>()

            if (allergy1.isChecked)
                allergyArray.add(1)
            if (!allergy1.isChecked)
                allergyArray.add(0)
            if (allergy2.isChecked)
                allergyArray.add(1)
            if (!allergy2.isChecked)
                allergyArray.add(0)
            if (allergy3.isChecked)
                allergyArray.add(1)
            if (!allergy3.isChecked)
                allergyArray.add(0)
            if (allergy4.isChecked)
                allergyArray.add(1)
            if (!allergy4.isChecked)
                allergyArray.add(0)
            if (allergy5.isChecked)
                allergyArray.add(1)
            if (!allergy5.isChecked)
                allergyArray.add(0)
            if (allergy6.isChecked)
                allergyArray.add(1)
            if (!allergy6.isChecked)
                allergyArray.add(0)
            if (allergy7.isChecked)
                allergyArray.add(1)
            if (!allergy7.isChecked)
                allergyArray.add(0)
            if (allergy8.isChecked)
                allergyArray.add(1)
            if (!allergy8.isChecked)
                allergyArray.add(0)
            if (allergy9.isChecked)
                allergyArray.add(1)
            if (!allergy9.isChecked)
                allergyArray.add(0)
            if (allergy10.isChecked)
                allergyArray.add(1)
            if (!allergy10.isChecked)
                allergyArray.add(0)
            if (allergy11.isChecked)
                allergyArray.add(1)
            if (!allergy11.isChecked)
                allergyArray.add(0)
            if (allergy12.isChecked)
                allergyArray.add(1)
            if (!allergy12.isChecked)
                allergyArray.add(0)
            if (allergy13.isChecked)
                allergyArray.add(1)
            if (!allergy13.isChecked)
                allergyArray.add(0)
            if (allergy14.isChecked)
                allergyArray.add(1)
            if (!allergy14.isChecked)
                allergyArray.add(0)
            if (allergy15.isChecked)
                allergyArray.add(1)
            if (!allergy15.isChecked)
                allergyArray.add(0)
            if (allergy16.isChecked)
                allergyArray.add(1)
            if (!allergy16.isChecked)
                allergyArray.add(0)
            if (allergy17.isChecked)
                allergyArray.add(1)
            if (!allergy17.isChecked)
                allergyArray.add(0)
            if (allergy18.isChecked)
                allergyArray.add(1)
            if (!allergy18.isChecked)
                allergyArray.add(0)
            if (allergy19.isChecked)
                allergyArray.add(1)
            if (!allergy19.isChecked)
                allergyArray.add(0)
            if (allergy20.isChecked)
                allergyArray.add(1)
            if (!allergy20.isChecked)
                allergyArray.add(0)
            if (allergy21.isChecked)
                allergyArray.add(1)
            if (!allergy21.isChecked)
                allergyArray.add(0)
            if (allergy22.isChecked)
                allergyArray.add(1)
            if (!allergy22.isChecked)
                allergyArray.add(0)

            Log.d("MAIN", "value"+email)
            Log.d("MAIN", "value"+age)
            Log.d("MAIN", "value"+sex)
            Log.d("MAIN", "value"+allergyArray)
            // 이메일이 없는 경우
            if(email.length() == 0){
                Toast.makeText(baseContext, "아이디를 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }



            //if(isValidEamil(email.toString()) && isValidPassword(password.toString()) && (passwordCheck(password, passwordre))){
                auth!!.createUserWithEmailAndPassword(email.text.toString(), password.text.toString())
                    .addOnCompleteListener(this) { task ->

                        if (task.isSuccessful) {

                            writeNewUser(auth?.uid.toString(),
                                email.toString(), age.toString(), sex, allergyArray)

                            //가입이 이루어져을시 가입 화면을 빠져나감.
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                            Toast.makeText(baseContext, "회원가입 성공", Toast.LENGTH_SHORT).show()
                        }
                        else {
                            Toast.makeText(baseContext, "회원가입 실패.", Toast.LENGTH_SHORT).show()
                            return@addOnCompleteListener
                        }
                    }
            // } // 이메일, 비밀번호 맞은 경우 회원가입 시작

        } // 회원 가입 버튼 누름

    }

}