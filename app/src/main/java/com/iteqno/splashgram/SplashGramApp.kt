package com.iteqno.splashgram

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.iteqno.splashgram.ui.components.BottomBar
import com.iteqno.splashgram.ui.navigation.Screen
import com.iteqno.splashgram.ui.screen.detail.DetailPhotoScreen
import com.iteqno.splashgram.ui.screen.favorite.FavoriteScreen
import com.iteqno.splashgram.ui.screen.home.HomeScreen
import com.iteqno.splashgram.ui.screen.profile.ProfileScreen
import com.iteqno.splashgram.ui.theme.SplashGramTheme

@Composable
fun SplashGramApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentState = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentState != Screen.DetailPhoto.route) {
                BottomBar(navController)
            }
        },
        modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(
                    navigateToDetail = { photoId ->
                        navController.navigate(Screen.DetailPhoto.createRoute(photoId))
                    }
                )
            }
            composable(Screen.Favorite.route) {
                FavoriteScreen()
            }
            composable(Screen.Profile.route) {
                ProfileScreen()
            }
            composable(
                route = Screen.DetailPhoto.route,
                arguments = listOf(navArgument("photoId") { type = NavType.StringType })
            ) {
                val photoId = it.arguments?.getString("photoId") ?: ""
                print(photoId)
                DetailPhotoScreen(photoId = photoId)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SplashGramAppPreview() {
    SplashGramTheme {
        SplashGramApp()
    }
}