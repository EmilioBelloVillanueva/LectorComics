package com.lector.lectorComics.model.room.entitiesRoom

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "comic")
data class ComicRoom(
    @PrimaryKey val comicId: Long,
    val name: String,
    val authorId: Long,
    val imageUrl: String,
    val description: String,
    val listChapterId: List<Long>,
    var favourite: Boolean,
    var seen: Boolean
)
