package com.jungsoo.thisisit
// 알레르기 정보는 리스트 순서대로 1우유, 2소, 3땅콩, 4대두, 5밀, 6돼지, 7닭, 8조개, 9오징어, 10게, 11새우, 12깨, 13고등어, 14복숭아, 15토마토, 16호두, 17잣, 18키위, 19굴, 20전복, 21홍합, 22메밀
@Food.Parcelize
data class Food(val name: String, val taste: List<String>, val classify: String, val allergy: List<Int>) {
    annotation class Parcelize
}

fun main(){
    val kimchistew = Food("김치찌개", listOf("SPICY", "SALTY"),  "한식", listOf(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val misostew = Food("된장찌개", listOf("SALTY"),  "한식", listOf(0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val bagstew = Food("부대찌개", listOf("SPICY", "SALTY"),  "한식", listOf(0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val tofustew = Food("순두부찌개", listOf("SPICY", "SALTY"),  "한식", listOf(0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val soybeanstew = Food("비지찌개", listOf("SPICY", "SALTY"),  "한식", listOf(0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val bonestew = Food("뼈해장국", listOf("SPICY", "SALTY"),  "한식", listOf(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val seonjistew = Food("선짓국", listOf("SPICY", "SALTY"),  "한식", listOf(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val sundaegukbap = Food("순대국밥", listOf("SALTY", "UMAMI"),  "한식", listOf(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val beansproutsoup = Food("콩나물국밥", listOf("SALTY", "UMAMI"),  "한식", listOf(0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val porkstew = Food("돼지국밥", listOf("SALTY", "UMAMI"),  "한식", listOf(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val tteokguk = Food("떡국", listOf("SALTY", "UMAMI"),  "한식", listOf(0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val tteokdumplingsoup = Food("떡만두국", listOf("SALTY", "UMAMI"),  "한식", listOf(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val seaweedsoup = Food("미역국", listOf("SALTY", "UMAMI"),  "한식", listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val cheonggukjang = Food("청국장", listOf("SALTY", "UMAMI"),  "한식", listOf(0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val galbitang = Food("갈비탕", listOf("SALTY", "UMAMI"),  "한식", listOf(0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val gamjatang = Food("감자탕", listOf("SPICY", "SALTY"),  "한식", listOf(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val oxtailsoup = Food("곰탕", listOf("SALTY", "UMAMI"),  "한식", listOf(0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val chickengomtang = Food("닭곰탕", listOf("SALTY", "UMAMI"),  "한식", listOf(0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val chickentang = Food("닭볶음탕", listOf("SPICY", "SALTY"),  "한식", listOf(0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val spicysoup = Food("매운탕", listOf("SPICY", "SALTY"),  "한식", listOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0))
    val samgyetang = Food("삼계탕", listOf("SALTY", "UMAMI"),  "한식", listOf(0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val sullungtang = Food("설렁탕", listOf("SALTY", "UMAMI"),  "한식", listOf(0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val fishroesoup = Food("알탕", listOf("SPICY", "SALTY"),  "한식", listOf(0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val yukgaejang = Food("육개장", listOf("SPICY", "SALTY"),  "한식", listOf(0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val clamsoup = Food("조개탕", listOf("SALTY", "UMAMI"),  "한식", listOf(0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0))
    val chueotang = Food("추어탕", listOf("SPICY", "UMAMI"),  "한식", listOf(0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val steamedagu = Food("아구찜", listOf("SPICY", "SALTY"),  "한식", listOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0))
    val seafoodstew = Food("해물찜", listOf("SPICY", "SALTY"),  "한식", listOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0))
    val galbijjim = Food("갈비찜", listOf("SPICY", "UMAMI"),  "한식", listOf(0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val gopchangstew = Food("곱창전골", listOf("SPICY", "SALTY"),  "한식", listOf(0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val bulgogi = Food("불고기", listOf("SWEET", "SALTY"),  "한식", listOf(0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val rawmeat = Food("육회", listOf("UMAMI"),  "한식", listOf(0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val porkgalbi = Food("돼지갈비", listOf("SWEET", "SALTY"), "한식", listOf(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val porkbelly = Food("삼겹살", listOf("SALTY", "UMAMI"), "한식", listOf(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val jeyugbokkeum = Food("제육볶음", listOf("SPICY", "SALTY"), "한식", listOf(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val duluchigi = Food("돼지두루치기", listOf("SPICY", "SALTY"), "한식", listOf(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val bossam = Food("보쌈", listOf("SALTY", "UMAMI"), "한식", listOf(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val cutmeat = Food("편육", listOf("SALTY", "UMAMI"), "한식", listOf(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val porkfeet = Food("족발", listOf("SALTY", "UMAMI"), "한식", listOf(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val chickenrib = Food("닭갈비", listOf("SPICY", "SALTY"), "한식", listOf(0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val chickenfeet = Food("닭발", listOf("SPICY", "SALTY"), "한식", listOf(0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val duck = Food("오리고기", listOf("SALTY", "UMAMI"), "한식", listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val beef = Food("소고기", listOf("SALTY", "UMAMI"), "한식", listOf(0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    val grilledshrimp = Food("대하구이", listOf("SALTY", "UMAMI"), "한식", listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))








}