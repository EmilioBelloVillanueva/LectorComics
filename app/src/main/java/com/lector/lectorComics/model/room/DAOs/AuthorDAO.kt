package com.lector.lectorComics.model.room.DAOs

import androidx.room.*
import com.lector.lectorComics.model.room.entitiesRoom.AuthorRoom
import com.lector.lectorComics.model.room.entitiesRoom.onetomany.AuthorWithComics

@Dao
interface AuthorDAO {
    @Transaction
    @Query("SELECT * FROM author")
    fun getAll(): List<AuthorWithComics>

    @Transaction
    @Query("SELECT * FROM author WHERE authorId IN (:ids)")
    fun loadAllByIds(ids: IntArray): List<AuthorWithComics>

    @Transaction
    @Query("SELECT * FROM author WHERE authorId IN (:id) LIMIT 1")
    fun loadById(id: Int): AuthorWithComics

    @Query("SELECT * FROM author WHERE name LIKE :name")
    fun findByName(name: String): List<AuthorRoom>

    @Transaction
    @Query("SELECT * FROM author WHERE name LIKE :name")
    fun findByNameWithComics(name: String): List<AuthorWithComics>

    @Query("SELECT * FROM author WHERE listComicId In (:listComicId)")
    fun findByComicId(listComicId: Long): List<AuthorRoom>

    @Insert
    fun insertAll(vararg authors: AuthorRoom)

    @Delete
    fun delete(author: AuthorRoom)
}
