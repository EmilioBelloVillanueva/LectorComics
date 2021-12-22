package com.lector.lectorComics.model.room.DAOs

import androidx.room.*
import com.lector.lectorComics.model.room.entitiesRoom.ChapterRoom
import com.lector.lectorComics.model.room.entitiesRoom.onetoone.ChapterWithComic

@Dao
interface ChapterDAO {
    @Query("SELECT * FROM chapter")
    fun getAll(): List<ChapterRoom>

    @Transaction
    @Query("SELECT * FROM chapter")
    fun getAllWithComic(): List<ChapterWithComic>

    @Query("SELECT * FROM chapter WHERE comicId = (:comicId)")
    fun getAllByComicId(comicId: Int): List<ChapterRoom>

    @Transaction
    @Query("SELECT * FROM chapter WHERE comicId = (:comicId)")
    fun getAllByComicIdWithComic(comicId: Int): ChapterRoom

    @Query("SELECT * FROM chapter WHERE chapterId = (:chapterId)")
    fun loadAllById(chapterId: Int): ChapterRoom

    @Transaction
    @Query("SELECT * FROM chapter WHERE chapterId = (:chapterId)")
    fun loadAllByIdWithComic(chapterId: Int): ChapterWithComic

    @Insert
    fun insertAll(vararg chapters: ChapterRoom)

    @Delete
    fun delete(author: ChapterRoom)
}