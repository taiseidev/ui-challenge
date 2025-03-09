package com.example.uichallenge.ui.muji

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.uichallenge.ui.theme.UIChallengeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KeywordSearchScreen() {
    val words = listOf(
        "春の新生活", "新学期・新入学", "収納", "桜の季節", "花粉対策", "アウトドア", "エンジニア"
    )
    val searchHistories = listOf(
        "ホワイトデー", "バレンタイン", "クリスマス", "ハロウィン", "お盆", "お正月"
    )
    var fieldValue by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(title = { }, navigationIcon = { }, actions = { })
        },
        containerColor = Color(0xFFFFFFFF),
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            SearchInputSection(fieldValue = fieldValue, onFieldValueChange = {
                fieldValue = it
            }, onIconClick = {
                // TODO: スキャンボタンが押された時の処理
            })
            TrendingWordsSection(words = words, onChipClick = {
                // TODO: キーワードが押された時の処理
            })
            SearchHistorySection(searchWords = searchHistories, onItemClick = {
                // TODO: 検索履歴をタップした時の処理
            })
        }
    }
}


@Preview(showBackground = true)
@Composable
fun KeywordSearchScreenPreview() {
    UIChallengeTheme {
        KeywordSearchScreen()
    }
}