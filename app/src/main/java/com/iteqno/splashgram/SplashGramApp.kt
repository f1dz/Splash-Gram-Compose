package com.iteqno.splashgram

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.iteqno.splashgram.ui.screen.HomeScreen
import com.iteqno.splashgram.ui.theme.SplashGramTheme

@Composable
fun SplashGramApp(
) {
        HomeScreen()

}


@Preview(showBackground = true)
@Composable
fun SplashGramAppPreview() {
    SplashGramTheme {
        SplashGramApp()
    }
}