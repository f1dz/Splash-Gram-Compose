package com.iteqno.splashgram.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.iteqno.splashgram.data.DummyData
import com.iteqno.splashgram.data.model.Photo
import com.iteqno.splashgram.ui.theme.SplashGramTheme

@Composable
fun CardItem(
    photo: Photo,
) {
    Box(
    ) {
        Column {
            UserInfo(
                image = photo.user.profileImage.medium,
                name = photo.user.name,
                location = photo.location?.name.orEmpty()
            )
            AsyncImage(
                model = photo.urls.thumb,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(250.dp)
                    .background(Color.Gray)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CarsItemPreview() {
    SplashGramTheme {
        CardItem(photo = DummyData.photo)
    }
}