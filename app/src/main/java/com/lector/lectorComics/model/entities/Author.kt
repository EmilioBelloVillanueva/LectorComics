package com.lector.lectorComics.model.entities

data class Author(
    val id: Long,
    val name: String,
    val imageUrl: String,
    val description: String,
    val listComic: List<Comic>,
    var favourite: Boolean
)
