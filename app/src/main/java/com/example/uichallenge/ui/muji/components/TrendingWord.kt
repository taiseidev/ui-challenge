package com.example.uichallenge.ui.muji.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uichallenge.ui.theme.UIChallengeTheme

@Composable
fun TrendingWord(
    modifier: Modifier = Modifier, word: String, onChipClick: (String) -> Unit
) {
    AssistChip(
        modifier = modifier.padding(start = 8.dp),
        onClick = { onChipClick(word) },
        label = { Text(word, color = Color.Black, fontWeight = FontWeight.Bold) },
        border = null,
        colors = AssistChipDefaults.assistChipColors(
            containerColor = Color(0xFFE2D4B9),
            labelColor = Color.Black,
        )
    )
}

@Preview(showBackground = true)
@Composable
fun TrendingWordPreview() {
    UIChallengeTheme {
        TrendingWord(word = "春の新生活", onChipClick = { })
    }
}