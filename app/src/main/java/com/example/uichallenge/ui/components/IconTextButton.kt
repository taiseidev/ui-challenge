package com.example.uichallenge.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.sharp.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.uichallenge.ui.theme.UIChallengeTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun IconTextButton(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    text: String,
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    Column(
        modifier = modifier
            .clickable(
                interactionSource = interactionSource,
                indication = null,
            ) {
                onClick()
            }
            .width(IntrinsicSize.Min),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = icon,
            // TODO: カラーはThemeで管理する
            tint = Color(0xFF383838),
            contentDescription = null
        )
        Text(
            text, fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            // TODO: カラーはThemeで管理する
            color = Color(0xFF383838)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun IconTextButtonPreview() {
    UIChallengeTheme {
        IconTextButton(
            icon = Icons.AutoMirrored.Sharp.ExitToApp,
            text = "スキャン",
            onClick = { },
        )
    }
}