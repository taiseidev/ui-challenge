package com.example.uichallenge.ui.muji.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uichallenge.ui.DefaultPreviews
import com.example.uichallenge.ui.muji.components.TrendingWord
import com.example.uichallenge.ui.theme.UIChallengeTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun TrendingWordsSection(words: List<String>, onChipClick: (String) -> Unit) {
    FlowRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 24.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        Text("注目ワード：", modifier = Modifier.alignByBaseline(), fontWeight = FontWeight.Bold)
        words.forEach { word ->
            TrendingWord(
                modifier = Modifier.alignByBaseline(),
                word,
                onChipClick = onChipClick,
            )
        }
    }
}

@DefaultPreviews
@Composable
fun TrendingWordsSectionPreview() {
    val words = listOf(
        "春の新生活", "新学期・新入学", "収納", "桜の季節", "花粉対策", "アウトドア", "エンジニア"
    )
    UIChallengeTheme {
        TrendingWordsSection(words, onChipClick = {})
    }
}