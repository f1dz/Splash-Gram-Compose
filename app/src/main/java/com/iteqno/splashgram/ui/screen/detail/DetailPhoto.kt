package com.iteqno.splashgram.ui.screen.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.iteqno.splashgram.ui.components.UserInfo
import com.iteqno.splashgram.ui.theme.SplashGramTheme

@Composable
fun DetailPhotoScreen(
    photoId: String
){
    Column(
    )
    {
        UserInfo(
            image = "https://randomuser.me/api/portraits/men/75.jpg",
            name = "Dave Mustaine",
            location = "Los Santos"
        )
        AsyncImage(
            model = "https://images.unsplash.com/photo-1613625995925-7f9224a71bf7?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwxNzA1Nzd8MHwxfHJhbmRvbXx8fHx8fHx8&ixlib=rb-1.2.1&q=80&w=400",
            contentDescription = null,
            modifier = Modifier
                .height(250.dp)
                .background(Color.Gray)
        )
        Text("123 likes")
        Text("The most beautiful beach I have ever visited")
    }
}

@Preview(showBackground = true)
@Composable
fun DetailPhotoScreenPreview(){
    SplashGramTheme {
        DetailPhotoScreen(photoId = "aa")
    }
}