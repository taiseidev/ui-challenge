package com.example.uichallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.uichallenge.ui.DefaultPreviews
import com.example.uichallenge.ui.muji.KeywordSearchScreen
import com.example.uichallenge.ui.theme.UIChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UIChallengeTheme {
                KeywordSearchScreen()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@DefaultPreviews
@Composable
fun GreetingPreview() {
    UIChallengeTheme {
        Greeting("Android")
    }
}