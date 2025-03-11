package com.example.uichallenge.ui.muji.sections

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uichallenge.ui.DefaultPreviews
import com.example.uichallenge.ui.muji.components.SearchHistoryListItem
import com.example.uichallenge.ui.theme.UIChallengeTheme

@Composable
fun SearchHistorySection(
    modifier: Modifier = Modifier,
    searchWords: List<String> = emptyList(),
    onItemClick: (String) -> Unit = {}
) {
    Column(
        modifier = modifier.padding(horizontal = 16.dp)
    ) {
        Text(
            "検索履歴",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF383838)
        )
        Spacer(modifier = Modifier.padding(2.dp))
        HorizontalDivider(
            thickness = 2.dp, color = Color(0xFFE7E5E5)
        )
        LazyColumn {
            items(searchWords) {
                SearchHistoryListItem(
                    it,
                    onClick = {
                        onItemClick(it)
                    }
                )
            }
        }
    }
}

@DefaultPreviews
@Composable
fun SearchHistorySectionPreview() {
    UIChallengeTheme {
        SearchHistorySection(
            searchWords = listOf(
                "ホワイトデー", "バレンタイン", "クリスマス", "ハロウィン", "お盆", "お正月"
            )
        )
    }
}