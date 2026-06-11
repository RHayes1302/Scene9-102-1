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

@Composable
fun UserProfileScreen() {
    var name by remember { mutableStateOf("Emit Smith") }
    val birthday by remember { mutableStateOf("January 1, 2004") }
    var age by remember { mutableStateOf(20) }
    var username by remember { mutableStateOf("@Emit") }
    var address by remember { mutableStateOf("123 Main Street") }
    var likes by remember { mutableStateOf(0) }
    var isVerified by remember { mutableStateOf(true) }

    // Challenge 3

    val friends = remember {
        mutableStateListOf(
            "Ethan",
            "Harley",
            "Rhys",
            "Leila",
            "Junior",
            "Laiza"
        )
    }

    Surface {
        ProfileContent(
            name = name,
            age = age,
            birthday = birthday,
            address = address,
            username = username,
            isVerified = isVerified,
            likesCount = likes,
            onLike = { likes++ },
            onChangeUsername = { newUsername -> username = newUsername }
        )
    }
}

// Challenge 4

@Composable
fun ProfileContent(
    name: String,
    age: Int,
    birthday: String,
    address: String,
    username: String,
    isVerified: Boolean,
    likesCount: Int,
    onLike: () -> Unit,
    onChangeUsername: (String) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "User Profile",
            modifier = Modifier.padding(30.dp)
        )

        Text(
            text = name,
            modifier = Modifier.padding(5.dp)
        )
    }
}