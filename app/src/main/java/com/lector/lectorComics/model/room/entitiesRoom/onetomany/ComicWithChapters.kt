package com.lector.lectorComics.model.room.entitiesRoom.onetomany

import androidx.room.Embedded
import androidx.room.Relation
import com.lector.lectorComics.model.room.entitiesRoom.ChapterRoom
import com.lector.lectorComics.model.room.entitiesRoom.ComicRoom

data class ComicWithChapters(
    @Embedded val comic: ComicRoom,
    @Relation(
        parentColumn = "comicId",
        entityColumn = "chapterId"
    )
    val chapter: List<ChapterRoom>
)