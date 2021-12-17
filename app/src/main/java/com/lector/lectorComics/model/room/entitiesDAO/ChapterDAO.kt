package com.lector.lectorComics.model.room.entitiesDAO

data class ChapterDAO(
    val id: Int,
    val numberChapter: Int,
    val name: String,
    val imageUrl: String,
    val author: AuthorDAO,
    val comic: ComicDAO,
    val description: String,
    val listImages: List<String>,
    var favourite: Boolean,
    var seen: Boolean
)
