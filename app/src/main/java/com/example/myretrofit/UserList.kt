package com.example.myretrofit

data class UserList(val data:List<User>)
data class User(val id: String?,val name:String?,val seat:String?,val session:String?)
data class userRespone(val code:Int?,val meta:String?,val data:User?  )