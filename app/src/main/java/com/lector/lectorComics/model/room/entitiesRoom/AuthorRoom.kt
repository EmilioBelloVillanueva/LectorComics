package com.lector.lectorComics.model.room.entitiesRoom

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AuthorRoom(
    @PrimaryKey val id: Int,
    val name: String,
    val imageUrl: String,
    val description: String,
    val listComic: List<ComicRoom>,
    var favourite: Boolean
)
