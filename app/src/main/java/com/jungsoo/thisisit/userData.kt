package com.jungsoo.thisisit

// 유저 데이터 클래스 만들어봤는데 이것도 수정 필요할듯 일단 있어도 코드는 돌아가서 냅두고 푸쉬햇음
data class userData(
    val userId : String,
    val age : Int,
    val sex : String,
    val allergy : List<Int>
)
