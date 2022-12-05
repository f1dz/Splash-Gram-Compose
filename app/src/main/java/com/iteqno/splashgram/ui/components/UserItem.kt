package com.iteqno.splashgram.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.iteqno.splashgram.ui.theme.SplashGramTheme

@Composable
fun UserItem(
    image: String
) {
    AsyncImage(
        model = image,
        contentDescription = null,
        modifier = Modifier
            .height(60.dp)
            .width(60.dp)
            .clip(CircleShape)
            .background(color = Color.Gray)
    )
}

@Preview(showBackground = true)
@Composable
fun UserItemPreview() {
    SplashGramTheme {
        UserItem(image = "https://randomuser.me/api/portraits/men/75.jpg")
    }
}