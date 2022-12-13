package com.iteqno.splashgram.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.iteqno.splashgram.ui.theme.SplashGramTheme

@Composable
fun UserInfo(
    image: String,
    name: String,
    location: String,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clickable {}
    ) {
        AsyncImage(
            model = image,
            contentDescription = name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(8.dp)
                .size(60.dp)
                .clip(CircleShape)
                .background(Color.Gray)
        )
        Column(
            modifier = Modifier
                .height(76.dp)

        ) {
            Text(
                text = name,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .weight(1F)
            )
            Text(
                text = location,
                modifier = Modifier.weight(1F)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UserInfoPreview() {
    SplashGramTheme {
        UserInfo(
            image = "https://randomuser.me/api/portraits/men/75.jpg",
            name = "Jack Reacher",
            location = "Hidden Lake, New Jersey"
        )
    }
}