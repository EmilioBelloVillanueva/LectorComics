package com.lector.lectorComics.model.room.entitiesRoom

data class ChapterRoom(
    val id: Int,
    val numberChapter: Int,
    val name: String,
    val imageUrl: String,
    val author: AuthorRoom,
    val comic: ComicRoom,
    val description: String,
    val listImages: List<String>,
    var favourite: Boolean,
    var seen: Boolean
)
