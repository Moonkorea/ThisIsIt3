package com.jungsoo.thisisit

import  java.io.Serializable

data class UserProfile(
    val email: String? = null,
    val age: String? = null,
    val sex: ArrayList<String>? = null,
    val allergy: ArrayList<Int>? = null
) : Serializable
