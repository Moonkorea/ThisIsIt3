package com.jungsoo.thisisit

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import org.json.JSONArray
import java.util.*


class MainActivity : AppCompatActivity() {

    private var auth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()

        // 비회원으로 시작 이 부분은 익명 로그인할까 말까 하다가 그냥 안햇음
        val btnNoLogin = findViewById<Button>(R.id.btnNoLogin)
        btnNoLogin.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        /*val userallergy = arrayOf(0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

        val jsonString = assets.open("fooddata.json").reader().readText()
        val jsonArray = JSONArray(jsonString)
        val foodarray = arrayOfNulls<String>(jsonArray.length())// 알레르기정보를 제외한 음식 정보 배열로 저장, 제외된 음식자리는 NULL로 대체
        for(index in 0 until jsonArray.length()){
            val jsonObject = jsonArray.getJSONObject(index)
            val allergy = jsonObject.getJSONArray("allergy")
            var j = 0
            for (i in 0 until 21) {
                if((allergy[i] == userallergy[i])&&(allergy[i]==1)){
                    j += 1
                }
            }
            if(j==0){
                foodarray[index] = jsonObject.toString()
            }
        }
        Log.d("foodarray", Arrays.toString(foodarray))*/




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
            // 이 부분은 저 메세지가 안 뜨더라 입력안해도 ㅠ 일단은 안 지우고 냅둠
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