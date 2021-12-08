package com.jungsoo.thisisit

import  java.io.Serializable

data class UserProfile(
    val email: String? = null,
    val nickname: String? = null,
    val age: String? = null,
    val sex: ArrayList<String>? = null,
    val allergy: ArrayList<Int>? = null
    // val point: ArrayList<Int> = [0, 0, ...... 0] : length of point array = Total foods
) : Serializable
