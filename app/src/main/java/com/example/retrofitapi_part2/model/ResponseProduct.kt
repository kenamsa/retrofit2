package com.example.retrofitapi_part2.model

import com.google.gson.annotations.SerializedName

data class ResponseProduct(

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("images")
	val images: List<String?>? = null,

	@field:SerializedName("condition")
	val condition: List<String?>? = null,

	@field:SerializedName("price")
	val price: Int? = null,

	@field:SerializedName("__v")
	val v: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("location")
	val location: String? = null,

	@field:SerializedName("model")
	val model: String? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("brand")
	val brand: String? = null
)
