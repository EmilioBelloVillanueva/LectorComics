package com.lector.lectorComics.model.room.entitiesRoom.onetomany

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.lector.lectorComics.model.room.entitiesRoom.AuthorRoom
import com.lector.lectorComics.model.room.entitiesRoom.ChapterRoom
import com.lector.lectorComics.model.room.entitiesRoom.ComicRoom
import com.lector.lectorComics.model.room.entitiesRoom.maytomany.AuthorWithComicRef
import com.lector.lectorComics.model.room.entitiesRoom.maytomany.ComicWithChapterRef

data class ComicWithChapters(
    @Embedded val comic: ComicRoom,
    @Relation(
        parentColumn = "comicId",
        entityColumn = "chapterId",
        associateBy = Junction(ComicWithChapterRef::class)
    )
    val chapter: List<ChapterRoom>
)