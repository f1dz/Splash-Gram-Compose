package com.iteqno.splashgram.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.iteqno.splashgram.ui.theme.SplashGramTheme

@Composable
fun DetailPhotoScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text("Detail photo")
    }
}

@Preview(showBackground = true)
@Composable
fun DetailPhotoScreenPreview(){
    SplashGramTheme {
        DetailPhotoScreen()
    }
}