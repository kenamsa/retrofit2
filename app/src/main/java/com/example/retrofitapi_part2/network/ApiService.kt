package com.example.retrofitapi_part2.network

import com.example.retrofitapi_part2.model.Product
import com.example.retrofitapi_part2.model.ResponseProduct
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

//Interface containing API
interface ApiService{
    @POST("products")
    suspend fun  createProduct(@Body product: Product): ResponseProduct
}

private var BASE_URL="http://192.168.1.59:8080/"
private val retrofit: Retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create()) // For JSON parsing
    .baseUrl(BASE_URL)
    .build()

object ProductApi {
    val retrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }}