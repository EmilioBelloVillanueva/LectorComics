package com.lector.lectorComics.model.room.entitiesRoom.maytomany

import androidx.room.Entity

@Entity(primaryKeys = ["comidId", "authorId"])
data class AuthorWithComicRef(
    val comidId: Long,
    val authorId: Long
)
