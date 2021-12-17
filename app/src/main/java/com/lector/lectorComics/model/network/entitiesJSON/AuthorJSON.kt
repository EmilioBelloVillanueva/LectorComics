package com.lector.lectorComics.model.network.entitiesJSON

data class AuthorJSON(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val description: String,
    val listComic: List<ComicJSON>
)
