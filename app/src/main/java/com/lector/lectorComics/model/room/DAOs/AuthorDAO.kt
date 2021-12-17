package com.lector.lectorComics.model.room.DAOs

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.lector.lectorComics.model.room.entitiesRoom.AuthorRoom

@Dao
interface AuthorDAO {
    @Query("SELECT * FROM author")
    fun getAll(): List<AuthorRoom>

    @Query("SELECT * FROM author WHERE id IN (:ids)")
    fun loadAllByIds(ids: IntArray): List<AuthorRoom>

    @Query("SELECT * FROM author WHERE id IN (:id) LIMIT 1")
    fun loadById(id: Int): AuthorRoom

    @Query("SELECT * FROM author WHERE name LIKE :name")
    fun findByName(name: String): List<AuthorRoom>

    @Insert
    fun insertAll(vararg authors: AuthorRoom)

    @Delete
    fun delete(author: AuthorRoom)
}
