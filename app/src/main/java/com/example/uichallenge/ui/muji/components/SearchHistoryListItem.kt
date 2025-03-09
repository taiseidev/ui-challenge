package com.example.uichallenge.ui.muji.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uichallenge.ui.theme.UIChallengeTheme

@Composable
fun SearchHistoryListItem(word: String, onClick: (String) -> Unit) {
    Text(
        word,
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onClick(word)
            }
            .padding(vertical = 8.dp),
        fontSize = 16.sp,
        color = Color(0xFF383838)
    )
}

@Preview(showBackground = true)
@Composable
fun SearchHistoryListItemPreview() {
    UIChallengeTheme {
        SearchHistoryListItem(
            "ホワイトデー",
            onClick = { }
        )
    }
}