package com.iteqno.splashgram.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Favorite : Screen("favorite")
    object Profile : Screen("profile")
    object DetailPhoto : Screen("home/{photoId}") {
        fun createRoute(photoId: String) = "home/$photoId"
    }
}