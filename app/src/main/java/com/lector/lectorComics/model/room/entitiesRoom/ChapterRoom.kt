package com.lector.lectorComics.model.room.entitiesRoom

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ChapterRoom(
    @PrimaryKey val id: Int,
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
