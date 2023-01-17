package com.posyandu.chrisnaputra.posyandu.api

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.posyandu.chrisnaputra.posyandu.api.ApiHelper.Companion.retrofit

import java.util.concurrent.TimeUnit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by akira on 14/11/17.
 */

class ApiHelper {
    companion object {

        var BASE_URL = "http://10.5.48.206/posyandu/api/"
        internal var retrofit: Retrofit? = null

        fun init(): Retrofit? {

            val builder = OkHttpClient.Builder()
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            builder.networkInterceptors().add(httpLoggingInterceptor)
            builder.readTimeout(2000000, TimeUnit.MILLISECONDS)
            builder.retryOnConnectionFailure(true)

            val client = builder.build()


            val gson = GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                    .create()

            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                        .client(client)
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .build()
            }
            return retrofit
        }

        fun initService(): ApiService {
            if (retrofit == null) retrofit = init()
            return retrofit!!.create(ApiService::class.java)
        }
    }
}
