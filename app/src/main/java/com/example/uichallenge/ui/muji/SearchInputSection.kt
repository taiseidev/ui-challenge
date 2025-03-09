package com.example.uichallenge.ui.muji

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.sharp.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uichallenge.ui.components.IconTextButton
import com.example.uichallenge.ui.muji.components.SearchInputField
import com.example.uichallenge.ui.theme.UIChallengeTheme

@Composable
fun SearchInputSection(
    modifier: Modifier = Modifier,
    fieldValue: String,
    onFieldValueChange: (String) -> Unit = {},
    onIconClick: () -> Unit = {}
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xFFF1F1F1))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        SearchInputField(
            modifier = Modifier.weight(10f),
            value = fieldValue,
            onValueChange = onFieldValueChange
        )
        IconTextButton(
            modifier = Modifier.weight(3f),
            icon = Icons.AutoMirrored.Sharp.ExitToApp,
            text = "スキャン",
            onClick = onIconClick,
        )
    }
}


@Preview(showBackground = true)
@Composable
fun SearchInputSectionPreview() {
    UIChallengeTheme {
        SearchInputSection(
            fieldValue = "Search",
            onFieldValueChange = { },
            onIconClick = { }
        )
    }
}