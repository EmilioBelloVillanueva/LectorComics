package com.lector.lectorComics.model.room.DAOs

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.lector.lectorComics.model.room.entitiesRoom.ChapterRoom

@Dao
interface ChapterDAO {
    @Query("SELECT * FROM chapter")
    fun getAll(): List<ChapterRoom>

    @Query("SELECT * FROM chapter WHERE chapterId IN (:ids)")
    fun loadAllByIds(ids: IntArray): List<ChapterRoom>

    @Query("SELECT * FROM chapter WHERE chapterId IN (:id) LIMIT 1")
    fun loadById(id: Int): ChapterRoom

    @Query("SELECT * FROM chapter WHERE comicId IN (:comicId) AND numberChapter IN (:number) LIMIT 1")
    fun loadByNumberChapterAndComicId(comicId: Int, number: Int): ChapterRoom

    @Insert
    fun insertAll(vararg chapters: ChapterRoom)

    @Delete
    fun delete(author: ChapterRoom)
}