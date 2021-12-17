package com.lector.lectorComics.model.room.entitiesRoom

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ComicRoom(
    @PrimaryKey val id: Int,
    val name: String,
    val author: AuthorRoom,
    val imageUrl: String,
    val description: String,
    val listChapter: List<ChapterRoom>,
    var favourite: Boolean,
    var seen: Boolean
)
