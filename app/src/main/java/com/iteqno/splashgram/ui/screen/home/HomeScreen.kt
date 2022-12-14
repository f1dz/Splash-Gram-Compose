package com.iteqno.splashgram.ui.screen.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iteqno.splashgram.domain.model.Photo
import com.iteqno.splashgram.ui.common.UiState
import com.iteqno.splashgram.ui.components.CardItem
import com.iteqno.splashgram.ui.components.UserItem
import com.iteqno.splashgram.ui.theme.SplashGramTheme
import org.koin.androidx.compose.get

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = get(),
    navigateToDetail: (String) -> Unit
) {
//    val viewModel = get<HomeViewModel>()
    Column(
        modifier = modifier
    ) {
        UserRow()

        viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
            when (uiState) {
                is UiState.Loading -> {
                    viewModel.getAllPhotos()
                }
                is UiState.Success -> {
                    uiState.data?.let {
                        PhotosList(
                            photos = it,
                            navigateToDetail = navigateToDetail
                        )
                    }
                }
                is UiState.Error -> {}
            }
        }



//        PhotosList(
//            modifier = modifier,
//            navigateToDetail = navigateToDetail)
    }
}

@Composable
fun UserRow(
    modifier: Modifier = Modifier
) {
    val images = mutableListOf<String>()
    images.add("https://randomuser.me/api/portraits/men/70.jpg")
    images.add("https://randomuser.me/api/portraits/men/71.jpg")
    images.add("https://randomuser.me/api/portraits/men/72.jpg")
    images.add("https://randomuser.me/api/portraits/men/73.jpg")
    images.add("https://randomuser.me/api/portraits/men/74.jpg")
    images.add("https://randomuser.me/api/portraits/men/75.jpg")
    images.add("https://randomuser.me/api/portraits/men/76.jpg")
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier.padding(16.dp)
    ) {
        items(images, key = { it }) { image ->
            UserItem(image = image)
        }
    }
}

@Composable
fun PhotosList(
    photos: List<Photo>,
    modifier: Modifier = Modifier,
    navigateToDetail: (String) -> Unit
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
    ) {
        items(photos) { photo ->
            CardItem(photo = photo,
                modifier = Modifier.clickable {
                    navigateToDetail(photo.id)
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    SplashGramTheme {
        HomeScreen(navigateToDetail = {

        })
    }
}