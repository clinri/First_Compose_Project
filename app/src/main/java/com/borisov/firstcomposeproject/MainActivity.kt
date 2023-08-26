package com.borisov.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserInfo("Andrei", 36)
        }
    }
}

@Composable
fun UserInfo(name: String, age: Int) {
    Text(
        text = "I'm $name. My age $age years old."
    )
}