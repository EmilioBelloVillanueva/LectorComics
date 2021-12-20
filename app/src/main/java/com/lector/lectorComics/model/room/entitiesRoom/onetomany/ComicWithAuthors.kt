package com.lector.lectorComics.model.room.entitiesRoom.onetomany

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.lector.lectorComics.model.room.entitiesRoom.AuthorRoom
import com.lector.lectorComics.model.room.entitiesRoom.ComicRoom
import com.lector.lectorComics.model.room.entitiesRoom.maytomany.AuthorWithComicRef

data class ComicWithAuthors(
    @Embedded val comic: ComicRoom,
    @Relation(
        parentColumn = "comicId",
        entityColumn = "authorId",
        associateBy = Junction(AuthorWithComicRef::class)
    )
    val authors: List<AuthorRoom>
)
