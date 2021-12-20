package com.lector.lectorComics.model.room.DAOs

import androidx.room.*
import com.lector.lectorComics.model.room.entitiesRoom.AuthorRoom
import com.lector.lectorComics.model.room.entitiesRoom.ComicRoom
import com.lector.lectorComics.model.room.entitiesRoom.onetomany.ComicWithChapters

@Dao
interface ComicDAO {
    @Transaction
    @Query("SELECT * FROM comic")
    fun getAll(): List<ComicWithChapters>

    @Transaction
    @Query("SELECT * FROM comic WHERE comicId IN (:ids)")
    fun loadAllByIds(ids: IntArray): List<ComicRoom>

    @Transaction
    @Query("SELECT * FROM comic WHERE comicId IN (:id) LIMIT 1")
    fun loadById(id: Int): ComicRoom

    @Query("SELECT * FROM comic WHERE name LIKE :name")
    fun findByName(name: String): List<ComicRoom>

    @Query("SELECT * FROM comic WHERE listChapterId In (:authorId)")
    fun findByAuthorId(authorId: Long): List<ComicRoom>

    @Insert
    fun insertAll(vararg comics: ComicRoom)

    @Delete
    fun delete(author: ComicRoom)
}