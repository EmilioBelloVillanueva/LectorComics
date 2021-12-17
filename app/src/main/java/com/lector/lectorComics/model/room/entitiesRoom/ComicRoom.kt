package com.lector.lectorComics.model.room.entitiesRoom

data class ComicRoom(
    val id: Int,
    val name: String,
    val author: AuthorRoom,
    val imageUrl: String,
    val description: String,
    val listChapter: List<ChapterRoom>,
    var favourite: Boolean,
    var seen: Boolean
)
