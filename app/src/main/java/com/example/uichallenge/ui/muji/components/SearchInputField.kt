package com.example.uichallenge.ui.muji.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uichallenge.ui.theme.UIChallengeTheme

@Composable
fun SearchInputField(
    modifier: Modifier = Modifier, value: String, onValueChange: (String) -> Unit
) {
    BasicTextField(value = value, onValueChange = onValueChange, modifier = modifier
        // TODO: カラーはThemeで管理する
        .background(Color.White, shape = RoundedCornerShape(8.dp)),
        // TODO: カラーはThemeで管理する
        cursorBrush = SolidColor(Color(0xFF820C0B)), decorationBox = { innerTextField ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Filled.Search, contentDescription = null,
                    // TODO: カラーはThemeで管理する
                    tint = Color(0xFF820C0B), modifier = Modifier.padding(8.dp)
                )
                innerTextField()
            }
        })
}

@Preview(showBackground = true)
@Composable
fun SearchInputFieldPreview() {
    UIChallengeTheme {
        SearchInputField(value = "アウトドア", onValueChange = {})
    }
}