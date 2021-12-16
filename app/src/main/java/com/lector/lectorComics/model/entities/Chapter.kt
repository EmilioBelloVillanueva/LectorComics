package com.lector.lectorComics.model.entities

data class Chapter(
    val id: Int,
    val numberChapter: Int,
    val name: String,
    val imageUrl: String,
    val author: Author,
    val comic: Comic,
    val description: String,
    val listImages: List<String>
)
