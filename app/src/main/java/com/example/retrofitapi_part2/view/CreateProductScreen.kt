package com.example.retrofitapi_part2.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.retrofitapi_part2.model.Product
import com.example.retrofitapi_part2.viewmodel.ProductViewModel

@Composable
fun CreateProdScreen(productViewModel: ProductViewModel = viewModel(), modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var prix by remember { mutableStateOf("") }
    var image by remember { mutableStateOf("") }
    val productresponse by remember{productViewModel.prodUiState}

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = name,
            onValueChange = { name= it },
            label = { Text("Name") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = description,
            onValueChange = { description = it },
            label = { Text("Email") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = prix,
            onValueChange = { prix= it },
            label = { Text("Prix") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = image,
            onValueChange = { image= it },
            label = { Text("Image") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            val user = Product(name, description,prix.toInt(), listOf(image))
            productViewModel.createProduct(user)
        }) {
            Text("Create Product")
        }
        Spacer(modifier = Modifier.height(16.dp))

        productresponse?.let {
            Text("product Created: ${it.id}")
        }
    }
}