package com.jungsoo.thisisit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_how_about_this.*
import org.json.JSONArray
import java.util.*
import kotlin.random.Random.Default.nextInt
import java.util.Random

class HowAboutThisActivity : AppCompatActivity() {

    // 뭐 아무튼 FIREBASE 선언
    private var auth: FirebaseAuth? = null
    private lateinit var db: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_about_this)

        val homeBtn = findViewById<Button>(R.id.homeBtn)
        homeBtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val jsonString = assets.open("fooddata.json").reader().readText()
        val jsonArray = JSONArray(jsonString)
        val foodAllergyArray = arrayOfNulls<String>(jsonArray.length())// 알레르기정보를 제외한 음식 정보 배열로 저장, 제외된 음식자리는 NULL로 대체
        val foodQuestionArray = arrayOfNulls<String>(jsonArray.length())

        // 유저 알레르기 배열
        auth = FirebaseAuth.getInstance()
        val uid = auth!!.currentUser?.uid.toString()
        db = FirebaseDatabase.getInstance().reference.child("users")

        db.child(uid).get().addOnCompleteListener {
            if (it.isSuccessful) {
                val userData = it.result?.getValue(UserProfile::class.java)
                if (userData != null) {


                    for (index in 0 until jsonArray.length()) {
                        val jsonObject = jsonArray.getJSONObject(index)
                        val allergy = jsonObject.getJSONArray("allergy")
                        var j = 0
                        for (i in 0 until 21) {
                            if ((allergy[i] == userData.allergy!![i]) && (allergy[i] == 1)) {
                                j += 1
                            }
                        }
                        if (j == 0) {
                            foodAllergyArray[index] = jsonObject.get("name").toString()
                        }
                    }
                    Log.d("test1", Arrays.toString(foodAllergyArray))

                    // 질문 답변 받아오는 곳

                    var answerArray1 = arrayOfNulls<Int>(433)

                    answerArray1[0] = intent.getIntExtra("111111", 0)
                    answerArray1[1] = intent.getIntExtra("111112", 0)
                    answerArray1[2] = intent.getIntExtra("111121", 0)
                    answerArray1[3] = intent.getIntExtra("111122", 0)
                    answerArray1[4] = intent.getIntExtra("111131", 0)
                    answerArray1[5] = intent.getIntExtra("111132", 0)
                    answerArray1[6] = intent.getIntExtra("111211", 0)
                    answerArray1[7] = intent.getIntExtra("111212", 0)
                    answerArray1[8] = intent.getIntExtra("111222", 0)
                    answerArray1[9] = intent.getIntExtra("111231", 0)
                    answerArray1[10] = intent.getIntExtra("111232", 0)
                    answerArray1[11] = intent.getIntExtra("111311", 0)
                    answerArray1[12] = intent.getIntExtra("111312", 0)
                    answerArray1[13] = intent.getIntExtra("111321", 0)
                    answerArray1[14] = intent.getIntExtra("111322", 0)
                    answerArray1[15] = intent.getIntExtra("111331", 0)
                    answerArray1[16] = intent.getIntExtra("111332", 0)
                    answerArray1[17] = intent.getIntExtra("111411", 0)
                    answerArray1[18] = intent.getIntExtra("111412", 0)
                    answerArray1[19] = intent.getIntExtra("111421", 0)
                    answerArray1[20] = intent.getIntExtra("111422", 0)
                    answerArray1[21] = intent.getIntExtra("111431", 0)
                    answerArray1[22] = intent.getIntExtra("111432", 0)
                    answerArray1[23] = intent.getIntExtra("111511", 0)
                    answerArray1[24] = intent.getIntExtra("111512", 0)
                    answerArray1[25] = intent.getIntExtra("111521", 0)
                    answerArray1[26] = intent.getIntExtra("111522", 0)
                    answerArray1[27] = intent.getIntExtra("111531", 0)
                    answerArray1[28] = intent.getIntExtra("111532", 0)
                    answerArray1[29] = intent.getIntExtra("111611", 0)
                    answerArray1[30] = intent.getIntExtra("111612", 0)
                    answerArray1[31] = intent.getIntExtra("111621", 0)
                    answerArray1[32] = intent.getIntExtra("111622", 0)
                    answerArray1[33] = intent.getIntExtra("111631", 0)
                    answerArray1[34] = intent.getIntExtra("111632", 0)
                    answerArray1[35] = intent.getIntExtra("112111", 0)
                    answerArray1[36] = intent.getIntExtra("112112", 0)
                    answerArray1[37] = intent.getIntExtra("112121", 0)
                    answerArray1[38] = intent.getIntExtra("112122", 0)
                    answerArray1[39] = intent.getIntExtra("112131", 0)
                    answerArray1[40] = intent.getIntExtra("112132", 0)
                    answerArray1[41] = intent.getIntExtra("112211", 0)
                    answerArray1[42] = intent.getIntExtra("112212", 0)
                    answerArray1[43] = intent.getIntExtra("112221", 0)
                    answerArray1[44] = intent.getIntExtra("112222", 0)
                    answerArray1[45] = intent.getIntExtra("112231", 0)
                    answerArray1[46] = intent.getIntExtra("112232", 0)
                    answerArray1[47] = intent.getIntExtra("112311", 0)
                    answerArray1[48] = intent.getIntExtra("112312", 0)
                    answerArray1[49] = intent.getIntExtra("112321", 0)
                    answerArray1[50] = intent.getIntExtra("112322", 0)
                    answerArray1[51] = intent.getIntExtra("112331", 0)
                    answerArray1[52] = intent.getIntExtra("112332", 0)
                    answerArray1[53] = intent.getIntExtra("112411", 0)
                    answerArray1[54] = intent.getIntExtra("112412", 0)
                    answerArray1[55] = intent.getIntExtra("112421", 0)
                    answerArray1[56] = intent.getIntExtra("112422", 0)
                    answerArray1[57] = intent.getIntExtra("112431", 0)
                    answerArray1[58] = intent.getIntExtra("112432", 0)
                    answerArray1[59] = intent.getIntExtra("112511", 0)
                    answerArray1[60] = intent.getIntExtra("112512", 0)
                    answerArray1[61] = intent.getIntExtra("112521", 0)
                    answerArray1[62] = intent.getIntExtra("112522", 0)
                    answerArray1[63] = intent.getIntExtra("112531", 0)
                    answerArray1[64] = intent.getIntExtra("112532", 0)
                    answerArray1[65] = intent.getIntExtra("112611", 0)
                    answerArray1[66] = intent.getIntExtra("112612", 0)
                    answerArray1[67] = intent.getIntExtra("112621", 0)
                    answerArray1[68] = intent.getIntExtra("112622", 0)
                    answerArray1[69] = intent.getIntExtra("112631", 0)
                    answerArray1[70] = intent.getIntExtra("112632", 0)
                    answerArray1[71] = intent.getIntExtra("113111", 0)
                    answerArray1[72] = intent.getIntExtra("113112", 0)
                    answerArray1[73] = intent.getIntExtra("113121", 0)
                    answerArray1[74] = intent.getIntExtra("113122", 0)
                    answerArray1[75] = intent.getIntExtra("113131", 0)
                    answerArray1[76] = intent.getIntExtra("113132", 0)
                    answerArray1[77] = intent.getIntExtra("113211", 0)
                    answerArray1[78] = intent.getIntExtra("113212", 0)
                    answerArray1[79] = intent.getIntExtra("113221", 0)
                    answerArray1[80] = intent.getIntExtra("113222", 0)
                    answerArray1[81] = intent.getIntExtra("113231", 0)
                    answerArray1[82] = intent.getIntExtra("113232", 0)
                    answerArray1[83] = intent.getIntExtra("113311", 0)
                    answerArray1[84] = intent.getIntExtra("113312", 0)
                    answerArray1[85] = intent.getIntExtra("113321", 0)
                    answerArray1[86] = intent.getIntExtra("113322", 0)
                    answerArray1[87] = intent.getIntExtra("113331", 0)
                    answerArray1[88] = intent.getIntExtra("113332", 0)
                    answerArray1[89] = intent.getIntExtra("113411", 0)
                    answerArray1[90] = intent.getIntExtra("113412", 0)
                    answerArray1[91] = intent.getIntExtra("113421", 0)
                    answerArray1[92] = intent.getIntExtra("113422", 0)
                    answerArray1[93] = intent.getIntExtra("113431", 0)
                    answerArray1[94] = intent.getIntExtra("113432", 0)
                    answerArray1[95] = intent.getIntExtra("113511", 0)
                    answerArray1[96] = intent.getIntExtra("113512", 0)
                    answerArray1[97] = intent.getIntExtra("113521", 0)
                    answerArray1[98] = intent.getIntExtra("113522", 0)
                    answerArray1[99] = intent.getIntExtra("113531", 0)
                    answerArray1[100] = intent.getIntExtra("113532", 0)
                    answerArray1[101] = intent.getIntExtra("113611", 0)
                    answerArray1[102] = intent.getIntExtra("113612", 0)
                    answerArray1[103] = intent.getIntExtra("113621", 0)
                    answerArray1[104] = intent.getIntExtra("113622", 0)
                    answerArray1[105] = intent.getIntExtra("113631", 0)
                    answerArray1[106] = intent.getIntExtra("113632", 0)
                    answerArray1[107] = intent.getIntExtra("121111", 0)
                    answerArray1[108] = intent.getIntExtra("121112", 0)
                    answerArray1[109] = intent.getIntExtra("121121", 0)
                    answerArray1[110] = intent.getIntExtra("121122", 0)
                    answerArray1[111] = intent.getIntExtra("121131", 0)
                    answerArray1[112] = intent.getIntExtra("121132", 0)
                    answerArray1[113] = intent.getIntExtra("121211", 0)
                    answerArray1[114] = intent.getIntExtra("121212", 0)
                    answerArray1[115] = intent.getIntExtra("121221", 0)
                    answerArray1[116] = intent.getIntExtra("121222", 0)
                    answerArray1[117] = intent.getIntExtra("121231", 0)
                    answerArray1[118] = intent.getIntExtra("121232", 0)
                    answerArray1[119] = intent.getIntExtra("121311", 0)
                    answerArray1[120] = intent.getIntExtra("121312", 0)
                    answerArray1[121] = intent.getIntExtra("121321", 0)
                    answerArray1[122] = intent.getIntExtra("121322", 0)
                    answerArray1[123] = intent.getIntExtra("121331", 0)
                    answerArray1[124] = intent.getIntExtra("121332", 0)
                    answerArray1[125] = intent.getIntExtra("121411", 0)
                    answerArray1[126] = intent.getIntExtra("121412", 0)
                    answerArray1[127] = intent.getIntExtra("121421", 0)
                    answerArray1[128] = intent.getIntExtra("121422", 0)
                    answerArray1[129] = intent.getIntExtra("121431", 0)
                    answerArray1[130] = intent.getIntExtra("121432", 0)
                    answerArray1[131] = intent.getIntExtra("121511", 0)
                    answerArray1[132] = intent.getIntExtra("121512", 0)
                    answerArray1[133] = intent.getIntExtra("121521", 0)
                    answerArray1[134] = intent.getIntExtra("121522", 0)
                    answerArray1[135] = intent.getIntExtra("121531", 0)
                    answerArray1[136] = intent.getIntExtra("121532", 0)
                    answerArray1[137] = intent.getIntExtra("121611", 0)
                    answerArray1[138] = intent.getIntExtra("121612", 0)
                    answerArray1[139] = intent.getIntExtra("121621", 0)
                    answerArray1[140] = intent.getIntExtra("121622", 0)
                    answerArray1[141] = intent.getIntExtra("121631", 0)
                    answerArray1[142] = intent.getIntExtra("121632", 0)
                    answerArray1[143] = intent.getIntExtra("122111", 0)
                    answerArray1[144] = intent.getIntExtra("122112", 0)
                    answerArray1[145] = intent.getIntExtra("122121", 0)
                    answerArray1[146] = intent.getIntExtra("122122", 0)
                    answerArray1[147] = intent.getIntExtra("122131", 0)
                    answerArray1[148] = intent.getIntExtra("122132", 0)
                    answerArray1[149] = intent.getIntExtra("122211", 0)
                    answerArray1[150] = intent.getIntExtra("122212", 0)
                    answerArray1[151] = intent.getIntExtra("122221", 0)
                    answerArray1[152] = intent.getIntExtra("122222", 0)
                    answerArray1[153] = intent.getIntExtra("122231", 0)
                    answerArray1[154] = intent.getIntExtra("122232", 0)
                    answerArray1[155] = intent.getIntExtra("122311", 0)
                    answerArray1[156] = intent.getIntExtra("122312", 0)
                    answerArray1[157] = intent.getIntExtra("122321", 0)
                    answerArray1[158] = intent.getIntExtra("122322", 0)
                    answerArray1[159] = intent.getIntExtra("122331", 0)
                    answerArray1[160] = intent.getIntExtra("122332", 0)
                    answerArray1[161] = intent.getIntExtra("122411", 0)
                    answerArray1[162] = intent.getIntExtra("122412", 0)
                    answerArray1[163] = intent.getIntExtra("122421", 0)
                    answerArray1[164] = intent.getIntExtra("122422", 0)
                    answerArray1[165] = intent.getIntExtra("122431", 0)
                    answerArray1[166] = intent.getIntExtra("122432", 0)
                    answerArray1[167] = intent.getIntExtra("122511", 0)
                    answerArray1[168] = intent.getIntExtra("122512", 0)
                    answerArray1[169] = intent.getIntExtra("122521", 0)
                    answerArray1[170] = intent.getIntExtra("122522", 0)
                    answerArray1[171] = intent.getIntExtra("122531", 0)
                    answerArray1[172] = intent.getIntExtra("122532", 0)
                    answerArray1[173] = intent.getIntExtra("122611", 0)
                    answerArray1[174] = intent.getIntExtra("122612", 0)
                    answerArray1[175] = intent.getIntExtra("122621", 0)
                    answerArray1[176] = intent.getIntExtra("122622", 0)
                    answerArray1[177] = intent.getIntExtra("122631", 0)
                    answerArray1[178] = intent.getIntExtra("122632", 0)
                    answerArray1[179] = intent.getIntExtra("123111", 0)
                    answerArray1[180] = intent.getIntExtra("123112", 0)
                    answerArray1[181] = intent.getIntExtra("123121", 0)
                    answerArray1[182] = intent.getIntExtra("123122", 0)
                    answerArray1[183] = intent.getIntExtra("123131", 0)
                    answerArray1[184] = intent.getIntExtra("123132", 0)
                    answerArray1[185] = intent.getIntExtra("123211", 0)
                    answerArray1[186] = intent.getIntExtra("123212", 0)
                    answerArray1[187] = intent.getIntExtra("123221", 0)
                    answerArray1[188] = intent.getIntExtra("123222", 0)
                    answerArray1[189] = intent.getIntExtra("123231", 0)
                    answerArray1[190] = intent.getIntExtra("123232", 0)
                    answerArray1[191] = intent.getIntExtra("123311", 0)
                    answerArray1[192] = intent.getIntExtra("123312", 0)
                    answerArray1[193] = intent.getIntExtra("123321", 0)
                    answerArray1[194] = intent.getIntExtra("123322", 0)
                    answerArray1[195] = intent.getIntExtra("123331", 0)
                    answerArray1[196] = intent.getIntExtra("123332", 0)
                    answerArray1[197] = intent.getIntExtra("123411", 0)
                    answerArray1[198] = intent.getIntExtra("123412", 0)
                    answerArray1[199] = intent.getIntExtra("123421", 0)
                    answerArray1[200] = intent.getIntExtra("123422", 0)
                    answerArray1[201] = intent.getIntExtra("123431", 0)
                    answerArray1[202] = intent.getIntExtra("123432", 0)
                    answerArray1[203] = intent.getIntExtra("123511", 0)
                    answerArray1[204] = intent.getIntExtra("123512", 0)
                    answerArray1[205] = intent.getIntExtra("123521", 0)
                    answerArray1[206] = intent.getIntExtra("123522", 0)
                    answerArray1[207] = intent.getIntExtra("123531", 0)
                    answerArray1[208] = intent.getIntExtra("123532", 0)
                    answerArray1[209] = intent.getIntExtra("123611", 0)
                    answerArray1[210] = intent.getIntExtra("123612", 0)
                    answerArray1[211] = intent.getIntExtra("123621", 0)
                    answerArray1[212] = intent.getIntExtra("123622", 0)
                    answerArray1[213] = intent.getIntExtra("123631", 0)
                    answerArray1[214] = intent.getIntExtra("123632", 0)
                    answerArray1[215] = intent.getIntExtra("211111", 0)
                    answerArray1[216] = intent.getIntExtra("211112", 0)
                    answerArray1[217] = intent.getIntExtra("211121", 0)
                    answerArray1[218] = intent.getIntExtra("211122", 0)
                    answerArray1[219] = intent.getIntExtra("211131", 0)
                    answerArray1[220] = intent.getIntExtra("211132", 0)
                    answerArray1[221] = intent.getIntExtra("211211", 0)
                    answerArray1[222] = intent.getIntExtra("211212", 0)
                    answerArray1[223] = intent.getIntExtra("211221", 0)
                    answerArray1[224] = intent.getIntExtra("211222", 0)
                    answerArray1[225] = intent.getIntExtra("211231", 0)
                    answerArray1[226] = intent.getIntExtra("211232", 0)
                    answerArray1[227] = intent.getIntExtra("211311", 0)
                    answerArray1[228] = intent.getIntExtra("211312", 0)
                    answerArray1[229] = intent.getIntExtra("211321", 0)
                    answerArray1[230] = intent.getIntExtra("211322", 0)
                    answerArray1[231] = intent.getIntExtra("211331", 0)
                    answerArray1[232] = intent.getIntExtra("211332", 0)
                    answerArray1[233] = intent.getIntExtra("211411", 0)
                    answerArray1[234] = intent.getIntExtra("211412", 0)
                    answerArray1[235] = intent.getIntExtra("211421", 0)
                    answerArray1[236] = intent.getIntExtra("211422", 0)
                    answerArray1[237] = intent.getIntExtra("211431", 0)
                    answerArray1[238] = intent.getIntExtra("211432", 0)
                    answerArray1[239] = intent.getIntExtra("211511", 0)
                    answerArray1[240] = intent.getIntExtra("211512", 0)
                    answerArray1[241] = intent.getIntExtra("211521", 0)
                    answerArray1[242] = intent.getIntExtra("211522", 0)
                    answerArray1[243] = intent.getIntExtra("211531", 0)
                    answerArray1[244] = intent.getIntExtra("211532", 0)
                    answerArray1[245] = intent.getIntExtra("211611", 0)
                    answerArray1[246] = intent.getIntExtra("211612", 0)
                    answerArray1[247] = intent.getIntExtra("211621", 0)
                    answerArray1[248] = intent.getIntExtra("211622", 0)
                    answerArray1[249] = intent.getIntExtra("211631", 0)
                    answerArray1[250] = intent.getIntExtra("211632", 0)
                    answerArray1[251] = intent.getIntExtra("212111", 0)
                    answerArray1[252] = intent.getIntExtra("212112", 0)
                    answerArray1[253] = intent.getIntExtra("212121", 0)
                    answerArray1[254] = intent.getIntExtra("212122", 0)
                    answerArray1[255] = intent.getIntExtra("212131", 0)
                    answerArray1[256] = intent.getIntExtra("212132", 0)
                    answerArray1[257] = intent.getIntExtra("212211", 0)
                    answerArray1[258] = intent.getIntExtra("212212", 0)
                    answerArray1[259] = intent.getIntExtra("212221", 0)
                    answerArray1[260] = intent.getIntExtra("212222", 0)
                    answerArray1[261] = intent.getIntExtra("212231", 0)
                    answerArray1[262] = intent.getIntExtra("212232", 0)
                    answerArray1[263] = intent.getIntExtra("212311", 0)
                    answerArray1[264] = intent.getIntExtra("212312", 0)
                    answerArray1[265] = intent.getIntExtra("212321", 0)
                    answerArray1[266] = intent.getIntExtra("212322", 0)
                    answerArray1[267] = intent.getIntExtra("212331", 0)
                    answerArray1[268] = intent.getIntExtra("212332", 0)
                    answerArray1[269] = intent.getIntExtra("212411", 0)
                    answerArray1[270] = intent.getIntExtra("212412", 0)
                    answerArray1[271] = intent.getIntExtra("212421", 0)
                    answerArray1[272] = intent.getIntExtra("212422", 0)
                    answerArray1[273] = intent.getIntExtra("212431", 0)
                    answerArray1[274] = intent.getIntExtra("212432", 0)
                    answerArray1[275] = intent.getIntExtra("212511", 0)
                    answerArray1[276] = intent.getIntExtra("212512", 0)
                    answerArray1[277] = intent.getIntExtra("212521", 0)
                    answerArray1[278] = intent.getIntExtra("212522", 0)
                    answerArray1[279] = intent.getIntExtra("212531", 0)
                    answerArray1[280] = intent.getIntExtra("212532", 0)
                    answerArray1[281] = intent.getIntExtra("212611", 0)
                    answerArray1[282] = intent.getIntExtra("212612", 0)
                    answerArray1[283] = intent.getIntExtra("212621", 0)
                    answerArray1[284] = intent.getIntExtra("212622", 0)
                    answerArray1[285] = intent.getIntExtra("212631", 0)
                    answerArray1[286] = intent.getIntExtra("212632", 0)
                    answerArray1[287] = intent.getIntExtra("213111", 0)
                    answerArray1[288] = intent.getIntExtra("213112", 0)
                    answerArray1[289] = intent.getIntExtra("213121", 0)
                    answerArray1[290] = intent.getIntExtra("213122", 0)
                    answerArray1[291] = intent.getIntExtra("213131", 0)
                    answerArray1[292] = intent.getIntExtra("213132", 0)
                    answerArray1[293] = intent.getIntExtra("213211", 0)
                    answerArray1[294] = intent.getIntExtra("213212", 0)
                    answerArray1[295] = intent.getIntExtra("213221", 0)
                    answerArray1[296] = intent.getIntExtra("213222", 0)
                    answerArray1[297] = intent.getIntExtra("213231", 0)
                    answerArray1[298] = intent.getIntExtra("213232", 0)
                    answerArray1[299] = intent.getIntExtra("213311", 0)
                    answerArray1[301] = intent.getIntExtra("213312", 0)
                    answerArray1[302] = intent.getIntExtra("213321", 0)
                    answerArray1[303] = intent.getIntExtra("213322", 0)
                    answerArray1[304] = intent.getIntExtra("213331", 0)
                    answerArray1[305] = intent.getIntExtra("213332", 0)
                    answerArray1[306] = intent.getIntExtra("213411", 0)
                    answerArray1[307] = intent.getIntExtra("213412", 0)
                    answerArray1[308] = intent.getIntExtra("213421", 0)
                    answerArray1[309] = intent.getIntExtra("213422", 0)
                    answerArray1[310] = intent.getIntExtra("213431", 0)
                    answerArray1[311] = intent.getIntExtra("213432", 0)
                    answerArray1[312] = intent.getIntExtra("213511", 0)
                    answerArray1[313] = intent.getIntExtra("213512", 0)
                    answerArray1[314] = intent.getIntExtra("213521", 0)
                    answerArray1[315] = intent.getIntExtra("213522", 0)
                    answerArray1[316] = intent.getIntExtra("213531", 0)
                    answerArray1[317] = intent.getIntExtra("213532", 0)
                    answerArray1[318] = intent.getIntExtra("213611", 0)
                    answerArray1[319] = intent.getIntExtra("213612", 0)
                    answerArray1[320] = intent.getIntExtra("213621", 0)
                    answerArray1[321] = intent.getIntExtra("213622", 0)
                    answerArray1[322] = intent.getIntExtra("213631", 0)
                    answerArray1[323] = intent.getIntExtra("213632", 0)
                    answerArray1[324] = intent.getIntExtra("221111", 0)
                    answerArray1[325] = intent.getIntExtra("221112", 0)
                    answerArray1[326] = intent.getIntExtra("221121", 0)
                    answerArray1[327] = intent.getIntExtra("221122", 0)
                    answerArray1[328] = intent.getIntExtra("221131", 0)
                    answerArray1[329] = intent.getIntExtra("221132", 0)
                    answerArray1[330] = intent.getIntExtra("221211", 0)
                    answerArray1[331] = intent.getIntExtra("221212", 0)
                    answerArray1[332] = intent.getIntExtra("221221", 0)
                    answerArray1[333] = intent.getIntExtra("221222", 0)
                    answerArray1[334] = intent.getIntExtra("221231", 0)
                    answerArray1[335] = intent.getIntExtra("221232", 0)
                    answerArray1[336] = intent.getIntExtra("221311", 0)
                    answerArray1[337] = intent.getIntExtra("221312", 0)
                    answerArray1[338] = intent.getIntExtra("221321", 0)
                    answerArray1[339] = intent.getIntExtra("221322", 0)
                    answerArray1[340] = intent.getIntExtra("221331", 0)
                    answerArray1[341] = intent.getIntExtra("221332", 0)
                    answerArray1[342] = intent.getIntExtra("221411", 0)
                    answerArray1[343] = intent.getIntExtra("221412", 0)
                    answerArray1[344] = intent.getIntExtra("221421", 0)
                    answerArray1[345] = intent.getIntExtra("221422", 0)
                    answerArray1[346] = intent.getIntExtra("221431", 0)
                    answerArray1[347] = intent.getIntExtra("221432", 0)
                    answerArray1[348] = intent.getIntExtra("221511", 0)
                    answerArray1[349] = intent.getIntExtra("221512", 0)
                    answerArray1[350] = intent.getIntExtra("221521", 0)
                    answerArray1[351] = intent.getIntExtra("221522", 0)
                    answerArray1[352] = intent.getIntExtra("221531", 0)
                    answerArray1[353] = intent.getIntExtra("221532", 0)
                    answerArray1[354] = intent.getIntExtra("221611", 0)
                    answerArray1[355] = intent.getIntExtra("221612", 0)
                    answerArray1[356] = intent.getIntExtra("221621", 0)
                    answerArray1[357] = intent.getIntExtra("221622", 0)
                    answerArray1[358] = intent.getIntExtra("221631", 0)
                    answerArray1[359] = intent.getIntExtra("221632", 0)
                    answerArray1[360] = intent.getIntExtra("222111", 0)
                    answerArray1[361] = intent.getIntExtra("222112", 0)
                    answerArray1[362] = intent.getIntExtra("222121", 0)
                    answerArray1[363] = intent.getIntExtra("222122", 0)
                    answerArray1[364] = intent.getIntExtra("222131", 0)
                    answerArray1[365] = intent.getIntExtra("222132", 0)
                    answerArray1[366] = intent.getIntExtra("222211", 0)
                    answerArray1[367] = intent.getIntExtra("222212", 0)
                    answerArray1[368] = intent.getIntExtra("222221", 0)
                    answerArray1[369] = intent.getIntExtra("222222", 0)
                    answerArray1[370] = intent.getIntExtra("222231", 0)
                    answerArray1[371] = intent.getIntExtra("222232", 0)
                    answerArray1[372] = intent.getIntExtra("222311", 0)
                    answerArray1[373] = intent.getIntExtra("222312", 0)
                    answerArray1[374] = intent.getIntExtra("222321", 0)
                    answerArray1[375] = intent.getIntExtra("222322", 0)
                    answerArray1[376] = intent.getIntExtra("222331", 0)
                    answerArray1[377] = intent.getIntExtra("222332", 0)
                    answerArray1[378] = intent.getIntExtra("222411", 0)
                    answerArray1[379] = intent.getIntExtra("222412", 0)
                    answerArray1[380] = intent.getIntExtra("222421", 0)
                    answerArray1[381] = intent.getIntExtra("222422", 0)
                    answerArray1[382] = intent.getIntExtra("222431", 0)
                    answerArray1[383] = intent.getIntExtra("222432", 0)
                    answerArray1[384] = intent.getIntExtra("222511", 0)
                    answerArray1[385] = intent.getIntExtra("222512", 0)
                    answerArray1[386] = intent.getIntExtra("222521", 0)
                    answerArray1[387] = intent.getIntExtra("222522", 0)
                    answerArray1[388] = intent.getIntExtra("222531", 0)
                    answerArray1[389] = intent.getIntExtra("222532", 0)
                    answerArray1[390] = intent.getIntExtra("222611", 0)
                    answerArray1[391] = intent.getIntExtra("223111", 0)
                    answerArray1[392] = intent.getIntExtra("223112", 0)
                    answerArray1[393] = intent.getIntExtra("223121", 0)
                    answerArray1[394] = intent.getIntExtra("223122", 0)
                    answerArray1[395] = intent.getIntExtra("223131", 0)
                    answerArray1[396] = intent.getIntExtra("223132", 0)
                    answerArray1[397] = intent.getIntExtra("223211", 0)
                    answerArray1[398] = intent.getIntExtra("223212", 0)
                    answerArray1[399] = intent.getIntExtra("223221", 0)
                    answerArray1[400] = intent.getIntExtra("223222", 0)
                    answerArray1[401] = intent.getIntExtra("223231", 0)
                    answerArray1[402] = intent.getIntExtra("223232", 0)
                    answerArray1[403] = intent.getIntExtra("223311", 0)
                    answerArray1[404] = intent.getIntExtra("223312", 0)
                    answerArray1[405] = intent.getIntExtra("223321", 0)
                    answerArray1[406] = intent.getIntExtra("223322", 0)
                    answerArray1[407] = intent.getIntExtra("223331", 0)
                    answerArray1[408] = intent.getIntExtra("223332", 0)
                    answerArray1[409] = intent.getIntExtra("223411", 0)
                    answerArray1[410] = intent.getIntExtra("223412", 0)
                    answerArray1[411] = intent.getIntExtra("223421", 0)
                    answerArray1[412] = intent.getIntExtra("223422", 0)
                    answerArray1[413] = intent.getIntExtra("223431", 0)
                    answerArray1[414] = intent.getIntExtra("223432", 0)
                    answerArray1[415] = intent.getIntExtra("223511", 0)
                    answerArray1[416] = intent.getIntExtra("223512", 0)
                    answerArray1[417] = intent.getIntExtra("223521", 0)
                    answerArray1[418] = intent.getIntExtra("223522", 0)
                    answerArray1[419] = intent.getIntExtra("223531", 0)
                    answerArray1[420] = intent.getIntExtra("223532", 0)
                    answerArray1[421] = intent.getIntExtra("223611", 0)
                    answerArray1[422] = intent.getIntExtra("223612", 0)
                    answerArray1[423] = intent.getIntExtra("223621", 0)
                    answerArray1[424] = intent.getIntExtra("223622", 0)
                    answerArray1[425] = intent.getIntExtra("223631", 0)
                    answerArray1[426] = intent.getIntExtra("223632", 0)
                    answerArray1[427] = intent.getIntExtra("111221", 0)
                    answerArray1[428] = intent.getIntExtra("222612", 0)
                    answerArray1[429] = intent.getIntExtra("222621", 0)
                    answerArray1[430] = intent.getIntExtra("222622", 0)
                    answerArray1[431] = intent.getIntExtra("222631", 0)
                    answerArray1[432] = intent.getIntExtra("222632", 0)

                    var answer = 0

                    for (i in 0 until 433) {
                        if (answerArray1[i] != 0) {
                            answer = answerArray1[i]!!
                            break
                        }
                    }

                    var answerArray = arrayOf(
                        (answer % 1000000 - answer % 100000) / 100000,
                        (answer % 100000 - answer % 10000) / 10000,
                        (answer % 10000 - answer % 1000) / 1000,
                        (answer % 1000 - answer % 100) / 100,
                        (answer % 100 - answer % 10) / 10,
                        answer % 10
                    )

                    /*var answerArray = arrayOf(0,0,0,0,0,0)

                    if (answer == 111111) {
                        answerArray = arrayOf(1,1,1,1,1,1)
                    }*/

                    // 답변 반영 하는 곳
                    for (index in 0 until jsonArray.length()) {
                        val jsonObject = jsonArray.getJSONObject(index)
                        val question = jsonObject.getJSONArray("question")
                        var j = 0
                        for (i in 0 until 6) {
                            if (question[i] == answerArray[i]) {
                                j += 1
                            }
                        }
                        if (j == 6) {
                            foodQuestionArray[index] = jsonObject.get("name").toString()
                        }
                    }
                    Log.d("test2", Arrays.toString(foodQuestionArray))


                    // 남은 음식 개수 세는 곳
                    var ia = 0
                    var iq = 0
                    var nullCntA = 0
                    var nullCntQ = 0

                    for (ia in 0 until jsonArray.length()) {
                        if (foodAllergyArray[ia] == null) {
                            nullCntA++
                        }
                    }

                    for (iq in 0 until jsonArray.length()) {
                        if (foodQuestionArray[iq] == null) {
                            nullCntQ++
                        }
                    }

                    var remainFromAllergy = jsonArray.length() - nullCntA
                    var remainFromQuestion = jsonArray.length() - nullCntQ

                    var allergyFoodArray = arrayOfNulls<String>(remainFromAllergy)
                    var questionFoodArray = arrayOfNulls<String>(remainFromQuestion)
                    var allergyi = 0
                    var questioni = 0

                    for (i in 0 until jsonArray.length()) {
                        if (foodAllergyArray[i] != null) {
                            allergyFoodArray[allergyi] = foodAllergyArray[i]
                            allergyi++
                        }
                    }


                    for (i in 0 until jsonArray.length()) {
                        if (foodQuestionArray[i] != null) {
                            questionFoodArray[questioni] = foodQuestionArray[i]
                            questioni++
                        }
                    }

                    Log.d("test3", Arrays.toString(allergyFoodArray))
                    Log.d("test4", Arrays.toString(questionFoodArray))

                    // 최종 음식 배열 산출하는 곳
                    var finalFoodCnt = 0

                    for (iq in 0 until remainFromQuestion) {
                        for (ia in 0 until remainFromAllergy) {
                            if (questionFoodArray[iq] == allergyFoodArray[ia]) {
                                finalFoodCnt++
                            }
                        }
                    }

                    var finalFoodArray = arrayOfNulls<String>(finalFoodCnt)
                    var finali = 0

                    for (iq in 0 until remainFromQuestion) {
                        for (ia in 0 until remainFromAllergy) {
                            if (questionFoodArray[iq] == allergyFoodArray[ia]) {
                                finalFoodArray[finali] = questionFoodArray[iq]
                                finali++
                            }
                        }
                    }

                    Log.d("test5", Arrays.toString(finalFoodArray))


                    // 랜덤으로 음식 화면 출력하는 곳
                    val range = (0..finalFoodCnt - 1)
                    val howAboutThis = findViewById(R.id.choosedFood) as TextView


                    if (finalFoodCnt == 0) {
                        howAboutThis.text = "조건에 맞는 음식이 \n없습니다."
                    }
                    else {
                        var randomNum = range.random()
                        howAboutThis.text = finalFoodArray[randomNum]

                        val anotherBtn = findViewById<Button>(R.id.anotherBtn)
                        anotherBtn.setOnClickListener {
                            randomNum = range.random()
                            howAboutThis.text = finalFoodArray[randomNum]
                        }

                        val chooseBtn = findViewById<Button>(R.id.chooseBtn)
                        chooseBtn.setOnClickListener {
                            val intent = Intent(this, FinalResultActivity::class.java)
                            intent.putExtra("finalresult", finalFoodArray[randomNum])
                            startActivity(intent)
                        }
                    }
                }
            }
        }
    }
}