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
import org.json.JSONArray

class JoinActivity : AppCompatActivity() {

    var auth: FirebaseAuth? = null
    private lateinit var db: DatabaseReference

    // 이메일 양식 확인 함수
    fun isValidEamil(email: String): Boolean {
        val emailPattern =
            "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$".toRegex()
        return email.matches(emailPattern)
    }

    // 패스워드 양식 확인 함수
    fun isValidPassword(password: String): Boolean {
        val passwordPattern = "^(?=.*[a-zA-Z])((?=.*\\d)|(?=.*\\W)).{6,12}$".toRegex()
        return password.matches(passwordPattern)
    }

    // 패스워드 체크 함수
    fun passwordCheck(password: String, passwordre: String): Boolean {
        return (password == passwordre)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        auth = FirebaseAuth.getInstance()
        db = Firebase.database.reference

        fun writeNewUser(
            userId: String,
            email: String,
            nickname: String,
            age: String,
            sex: ArrayList<String>,
            allergy: ArrayList<Int>
        ) {
            val user = UserProfile(email, nickname, age, sex, allergy)

            db.child("users").child(userId).setValue(user)
        }

        val joinBtn = findViewById<Button>(R.id.btnRegister)
        joinBtn.setOnClickListener {

            val email = findViewById<EditText>(R.id.editId)
            val password = findViewById<EditText>(R.id.editPw)
            val passwordre = findViewById<EditText>(R.id.editPwRe)
            val nickname = findViewById<EditText>(R.id.editNickname)
            val age = findViewById<EditText>(R.id.editAge)

            // 성별
            var sex = ArrayList<String>()

            if (editMan.isChecked)
                sex.add("남자")
            if (editWoman.isChecked)
                sex.add("여자")

            // 알레르기
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

            // 이메일이 없는 경우
            if (email.length() == 0) {
                Toast.makeText(baseContext, "아이디를 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // 이메일이 형식에 맞지않는 경우
            if (!isValidEamil(email.text.toString())) {
                Toast.makeText(baseContext, "아이디는 이메일 형식으로 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // 비밀번호가 형식에 맞지않는 경우
            if (isValidEamil(email.text.toString()) && !isValidPassword(password.text.toString())) {
                Toast.makeText(baseContext, "비밀번호는 6~12자리의 영문 숫자의 조합으로 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // 비밀번호 확인이 틀린 경우
            if (isValidEamil(email.text.toString()) && isValidPassword(password.text.toString()) && !passwordCheck(password.text.toString(), passwordre.text.toString())) {
                Toast.makeText(baseContext, "입력한 비밀번호가 일치하지않습니다.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // 닉네임을 입력하지 않은 경우
            if (isValidEamil(email.text.toString()) && isValidPassword(password.text.toString()) && passwordCheck(password.text.toString(), passwordre.text.toString())
                && nickname.length() == 0) {
                Toast.makeText(baseContext, "사용할 닉네임을 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // 나이를 입력하지 않은 경우
            if(age.length()==0) {
                Toast.makeText(baseContext, "나이를 입력해주세요.", Toast.LENGTH_SHORT).show()
            }

            // 성별을 체크하지 않은 경우
            if(!editMan.isChecked && !editWoman.isChecked) {
                Toast.makeText(baseContext, "성별을 선택해주세요.", Toast.LENGTH_SHORT).show()
            }

            // 성별을 모두 체크한 경우
            if(editMan.isChecked && editWoman.isChecked) {
                Toast.makeText(baseContext, "성별은 하나만 선택해주세요.", Toast.LENGTH_SHORT).show()
            }

            // 알레르기 정보를 모두 체크한 경우
            if(allergy1.isChecked && allergy2.isChecked && allergy3.isChecked && allergy4.isChecked &&allergy5.isChecked && allergy6.isChecked && allergy7.isChecked &&
                allergy8.isChecked && allergy9.isChecked && allergy10.isChecked && allergy11.isChecked && allergy12.isChecked && allergy13.isChecked && allergy14.isChecked &&
                allergy15.isChecked && allergy16.isChecked && allergy17.isChecked && allergy18.isChecked && allergy19.isChecked && allergy20.isChecked && allergy21.isChecked &&
                allergy22.isChecked) {
                Toast.makeText(baseContext, "본 앱을 이용하는데 애로사항이 발생할 수 있습니다.", Toast.LENGTH_SHORT).show()
            }

            // 회원가입
            if ( isValidEamil(email.text.toString()) && isValidPassword(password.text.toString()) && passwordCheck(password.text.toString(), passwordre.text.toString())
                        && nickname.length() != 0 && age.length() != 0 && ((editMan.isChecked && !editWoman.isChecked) || (!editMan.isChecked && editWoman.isChecked))
                    ) {
                auth!!.createUserWithEmailAndPassword(
                    email.text.toString(),
                    password.text.toString()
                )
                    .addOnCompleteListener(this) { task ->

                        if (task.isSuccessful) {

                            writeNewUser(
                                auth?.uid.toString(),
                                email.text.toString(), nickname.text.toString(), age.text.toString(), sex, allergyArray
                            )

                            //가입이 이루어져을시 가입 화면을 빠져나감.
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                            Toast.makeText(baseContext, "회원가입 성공", Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(baseContext, "이미 사용중인 아이디입니다.", Toast.LENGTH_SHORT).show()
                            return@addOnCompleteListener
                        }
                    }
                // } // 이메일, 비밀번호 맞은 경우 회원가입 시작

            } // 회원 가입 버튼 누름

        }

    }
}

