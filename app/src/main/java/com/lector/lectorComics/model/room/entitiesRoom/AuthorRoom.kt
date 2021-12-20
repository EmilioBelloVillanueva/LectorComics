package com.lector.lectorComics.model.room.entitiesRoom

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "author")
data class AuthorRoom(
    @PrimaryKey val authorId: Long,
    val name: String,
    val imageUrl: String,
    val description: String,
    val listComicId: List<Long>,
    var favourite: Boolean
)
