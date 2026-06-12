package com.example.scene9_102_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class mainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserProfileScreen()


        }
    }
}

// Challenge 1

fun main() {
    val fullName: String = "Ramone Hayes"
    val birthday: String = "January 30, 1981"
    val age: Int = 45
    val address: String = "123 Main Street"
    val username: String = "rhayes1981"
    val isVerified: Boolean = true

    println(fullName)
    println(birthday)
    println(age)
    println(address)
    println(username)
    println(isVerified)
}

// Challenge 2

