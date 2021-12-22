package com.lector.lectorComics.model.room.entitiesRoom.onetoone

import androidx.room.Embedded
import androidx.room.Relation
import com.lector.lectorComics.model.room.entitiesRoom.ChapterRoom
import com.lector.lectorComics.model.room.entitiesRoom.ComicRoom

data class ChapterWithComic(
    @Embedded val chapter: ChapterRoom,
    @Relation(
        parentColumn = "comicId",
        entityColumn = "chapterId"
    )
    val comic: ComicRoom
)
