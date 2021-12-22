package com.lector.lectorComics.model.room.DAOs

import androidx.room.*
import com.lector.lectorComics.model.room.entitiesRoom.ComicRoom
import com.lector.lectorComics.model.room.entitiesRoom.onetomany.ComicWithChapters
import com.lector.lectorComics.model.room.entitiesRoom.onetoone.ComicWithAuthor

@Dao
interface ComicDAO {
    @Query("SELECT * FROM comic")
    fun getAll(): List<ComicRoom>

    @Transaction
    @Query("SELECT * FROM comic")
    fun getAllWithAuthor(): List<ComicWithAuthor>

    @Transaction
    @Query("SELECT * FROM comic")
    fun getAllWithChapters(): List<ComicWithChapters>

    @Query("SELECT * FROM comic WHERE listChapterId IN (:chapterId) LIMIT 1")
    fun loadByChapterId(chapterId: IntArray): ComicRoom

    @Query("SELECT * FROM comic WHERE name LIKE :name")
    fun findByName(name: String): List<ComicRoom>

    @Query("SELECT * FROM comic WHERE authorId = (:authorId)")
    fun loadByAuthorId(authorId: Long): ComicRoom

    @Query("SELECT * FROM comic WHERE favourite = (:isFavourite)")
    fun loadByFavourite(isFavourite: Boolean): ComicRoom

    @Query("SELECT * FROM comic WHERE seen = (:isSeen)")
    fun loadBySeen(isSeen: Boolean): ComicRoom

    @Insert
    fun insertAll(vararg comics: ComicRoom)

    @Delete
    fun delete(author: ComicRoom)
}