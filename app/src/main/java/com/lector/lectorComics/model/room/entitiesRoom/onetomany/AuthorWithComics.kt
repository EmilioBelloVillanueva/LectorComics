package com.lector.lectorComics.model.room.entitiesRoom.onetomany

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.lector.lectorComics.model.room.entitiesRoom.AuthorRoom
import com.lector.lectorComics.model.room.entitiesRoom.ComicRoom

data class AuthorWithComics(
    @Embedded val author: AuthorRoom,
    @Relation(
        parentColumn = "authorId",
        entityColumn = "comicId"
    )
    val comics: List<ComicRoom>
)
