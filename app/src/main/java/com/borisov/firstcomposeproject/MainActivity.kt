package com.borisov.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserInfo("Andrei", 36)
        }
    }
}

@Preview
@Composable
fun Greeting() {
    val name = "John"
    Text(text = "Hello $name!", color = Color.Blue)
}

@Preview
@Composable
fun UserInfoPreview() {
    UserInfo(name = "Vasya", age = 2)
}

@Composable
fun UserInfo(name: String, age: Int) {
    Column {
        var count = 0
        while (count<10) {
            Text(
                text = "Hello $name! Your are $age years old.",
                color = Color.Blue
            )
            count++
        }
    }
}