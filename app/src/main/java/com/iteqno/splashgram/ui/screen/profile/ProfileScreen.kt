package com.iteqno.splashgram.ui.screen.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.iteqno.splashgram.ui.theme.SplashGramTheme

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        AsyncImage(
            model = "https://lh3.googleusercontent.com/ogw/AOh-ky1kJCl64DHDET1VTk9j_CYKhGS1WFt7Mw3VD26kkcs",
            contentDescription = "About image",
            modifier = Modifier
                .height(160.dp)
                .width(160.dp)
                .clip(CircleShape)
                .background(Color.Gray)
        )
        Text(text = "KHOFIDIN", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Text(text = "offiedz@gmail.com")
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    SplashGramTheme {
        ProfileScreen()
    }
}