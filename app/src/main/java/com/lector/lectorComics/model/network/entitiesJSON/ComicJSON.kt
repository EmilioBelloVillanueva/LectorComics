package com.lector.lectorComics.model.network.entitiesJSON

data class ComicJSON(
    val id: Int,
    val name: String,
    val author: AuthorJSON,
    val imageUrl: String,
    val description: String,
    val listChapter: List<ChapterJSON>
)
