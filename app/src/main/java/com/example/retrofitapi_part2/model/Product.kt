package com.example.retrofitapi_part2.model

import com.google.gson.annotations.SerializedName

data class Product(

	@SerializedName("name")
	val name: String? = null,

	@SerializedName("description")
	val description: String? = null,

	@SerializedName("price")
	val price: Int? = null,  // Assuming price is an integer, update to Double if necessary

	@SerializedName("images")
	val images: List<String>? = null  // List of image URLs

	// Optional fields like location, brand, model, condition can be added if needed
)
