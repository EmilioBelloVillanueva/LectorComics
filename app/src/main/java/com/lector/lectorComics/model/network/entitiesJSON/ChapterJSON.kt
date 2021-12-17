package com.lector.lectorComics.model.network.entitiesJSON

data class ChapterJSON(
    val id: Int,
    val numberChapter: Int,
    val name: String,
    val imageUrl: String,
    val author: AuthorJSON,
    val comic: ComicJSON,
    val description: String,
    val listImages: List<String>
)
