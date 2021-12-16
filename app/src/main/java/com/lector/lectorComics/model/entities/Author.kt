package com.lector.lectorComics.model.entities

data class Author(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val description: String,
    val listComic: List<Comic>
)
