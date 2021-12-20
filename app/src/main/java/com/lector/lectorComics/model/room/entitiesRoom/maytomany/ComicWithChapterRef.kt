package com.lector.lectorComics.model.room.entitiesRoom.maytomany

import androidx.room.Entity

@Entity(primaryKeys = ["comidId", "chapterId"])
data class ComicWithChapterRef(
    val comidId: Long,
    val chapterId: Long
)
