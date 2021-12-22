package com.lector.lectorComics.model.room.entitiesRoom.onetoone

import androidx.room.Embedded
import androidx.room.Relation
import com.lector.lectorComics.model.room.entitiesRoom.AuthorRoom
import com.lector.lectorComics.model.room.entitiesRoom.ComicRoom

data class ComicWithAuthor (
    @Embedded val comic: ComicRoom,
    @Relation(
        parentColumn = "comicId",
        entityColumn = "authorId"
    )
    val author: AuthorRoom
)