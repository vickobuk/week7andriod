package com.example.myretrofit

import retrofit2.Call
import retrofit2.http.*

interface RetroService {
    @GET("users")
    @Headers("https://ict-yep-backend.herokuapp.com/")
    fun getUsersList():Call<UserList>

    @GET("users")
    @Headers("https://ict-yep-backend.herokuapp.com/")
    fun searchUsers(@Query("name")searchText:String):Call<UserList>

    @GET("users/{user_id}")
    @Headers("https://ict-yep-backend.herokuapp.com/")
    fun getUsers(@Query("name")searchText:String):Call<UserList>

    @POST("users")
    @Headers("https://ict-yep-backend.herokuapp.com/")
    fun createUser(@Body params:User):Call<userRespone>

    @PATCH("users/{user_id}")
    @Headers("https://ict-yep-backend.herokuapp.com/")
    fun updateUser(@Path("user_id")user_id:String,@Body params: User):Call<userRespone>

    @DELETE("users/{user_id}")
    @Headers("https://ict-yep-backend.herokuapp.com/")
    fun deleteUser(@Path("user_id")user_id:String):Call<userRespone>


}