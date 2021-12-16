package com.lector.lectorComics.model.entities

data class Comic(
    val id: Int,
    val name: String,
    val author: Author,
    val imageUrl: String,
    val description: String,
    val listChapter: List<Chapter>
)
