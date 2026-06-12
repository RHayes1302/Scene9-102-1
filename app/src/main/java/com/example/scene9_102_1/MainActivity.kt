package com.example.scene9_102_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UserProfileScreen()
        }
    }
}

@Composable
fun UserProfileScreen() {
    var name by remember { mutableStateOf("Emit Smith") }
    val birthday by remember { mutableStateOf("January 1, 2004") }
    var age by remember { mutableStateOf(20) }
    var username by remember { mutableStateOf("@Emit") }
    var address by remember { mutableStateOf("123 Main Street") }
    var likes by remember { mutableStateOf(0) }
    var isVerified by remember { mutableStateOf(true) }

    val friends = remember {
        mutableStateListOf("Ethan", "Harley", "Rhys", "Leila", "Junior", "Laiza")
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
            friends = friends,                                    // added
            onLike = { likes++ },
            onChangeUsername = { newUsername -> username = newUsername }
        )
    }
}

@Composable
fun ProfileContent(
    name: String,
    age: Int,
    birthday: String,
    address: String,
    username: String,
    isVerified: Boolean,
    likesCount: Int,
    friends: List<String>,                                        // added
    onLike: () -> Unit,
    onChangeUsername: (String) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "User Profile", modifier = Modifier.padding(30.dp))
        Text(text = name, modifier = Modifier.padding(5.dp))
        Text(text = birthday, modifier = Modifier.padding(5.dp))
        Text(text = "Age: $age", modifier = Modifier.padding(5.dp))
        Text(text = username, modifier = Modifier.padding(5.dp))
        Text(text = address, modifier = Modifier.padding(5.dp))
        Text(text = "Likes: $likesCount", modifier = Modifier.padding(5.dp))
        Text(text = "Verified: $isVerified", modifier = Modifier.padding(5.dp))

        Text(text = "Friends:", modifier = Modifier.padding(5.dp))
        friends.forEach { friend ->
            Text(text = friend, modifier = Modifier.padding(5.dp))
        }
    }
}