package com.iteqno.splashgram.data

import com.iteqno.splashgram.data.model.*

class DummyData {
    companion object {
        val photo = Photo(
            id = "abc123",
            color = "",
            createdAt = "2000-01-01 01:01:01",
            description = "Photo from nature",
            likedByUser = true,
            downloads = 712,
            width = 1024,
            location = Location(country = "Singapore", city = "Singapore", name = "Marina Bay the Bay", title = "Marina Bay the Bay"),
            user = User(lastName = "Loureiro", bio = "All is well", profileImage = ProfileImage(
                small = "https://randomuser.me/api/portraits/men/75.jpg",
                medium = "https://randomuser.me/api/portraits/men/75.jpg",
                large = "https://randomuser.me/api/portraits/men/75.jpg"
            ), name = "Kiko Loureiro", firstName = "Kiko", username = "kloureiro"),
            views = 7223,
            height = 1024,
            likes = 972,
            urls = Urls(
                small = "https://images.unsplash.com/photo-1613625995925-7f9224a71bf7?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwxNzA1Nzd8MHwxfHJhbmRvbXx8fHx8fHx8&ixlib=rb-1.2.1&q=80&w=400",
                thumb = "https://images.unsplash.com/photo-1613625995925-7f9224a71bf7?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwxNzA1Nzd8MHwxfHJhbmRvbXx8fHx8fHx8&ixlib=rb-1.2.1&q=80&w=400",
                raw = "https://images.unsplash.com/photo-1613625995925-7f9224a71bf7?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwxNzA1Nzd8MHwxfHJhbmRvbXx8fHx8fHx8&ixlib=rb-1.2.1&q=80&w=400",
                regular = "https://images.unsplash.com/photo-1613625995925-7f9224a71bf7?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwxNzA1Nzd8MHwxfHJhbmRvbXx8fHx8fHx8&ixlib=rb-1.2.1&q=80&w=400",
                full = "https://images.unsplash.com/photo-1613625995925-7f9224a71bf7?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwxNzA1Nzd8MHwxfHJhbmRvbXx8fHx8fHx8&ixlib=rb-1.2.1&q=80&w=400"
            ),
            isLoved = true
        )
    }
}