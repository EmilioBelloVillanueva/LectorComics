package com.lector.lectorComics.model.room.entitiesRoom

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "chapter")
data class ChapterRoom(
    @PrimaryKey val chapterId: Long,
    val numberChapter: Int,
    val name: String,
    val imageUrl: String,
    val authorId: Long,
    val comicId: Long,
    val description: String,
    val listImages: List<String>,
    var favourite: Boolean,
    var seen: Boolean
)
