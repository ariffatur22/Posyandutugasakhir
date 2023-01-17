package com.posyandu.chrisnaputra.posyandu.api

import com.posyandu.chrisnaputra.posyandu.data_anak.DataAnakMdl
import com.posyandu.chrisnaputra.posyandu.login.DataLogin

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {


    //signup
    @FormUrlEncoded
    @POST("login.php")
    fun login(
            @Field("username") username: String,
            @Field("password") password: String
    ): Call<DataLogin>

    @GET("get_anak.php")
    fun getAnak(
    ): Call<List<DataAnakMdl>>
}
