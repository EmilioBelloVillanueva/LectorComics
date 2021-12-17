package com.lector.lectorComics.model.room.entitiesRoom

data class AuthorRoom(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val description: String,
    val listComic: List<ComicRoom>,
    var favourite: Boolean
)
