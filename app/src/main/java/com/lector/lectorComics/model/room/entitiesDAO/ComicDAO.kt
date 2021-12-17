package com.lector.lectorComics.model.room.entitiesDAO

data class ComicDAO(
    val id: Int,
    val name: String,
    val author: AuthorDAO,
    val imageUrl: String,
    val description: String,
    val listChapter: List<ChapterDAO>,
    var favourite: Boolean,
    var seen: Boolean
)
