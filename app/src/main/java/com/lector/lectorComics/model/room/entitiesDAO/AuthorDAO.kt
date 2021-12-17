package com.lector.lectorComics.model.room.entitiesDAO

data class AuthorDAO(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val description: String,
    val listComic: List<ComicDAO>,
    var favourite: Boolean
)
