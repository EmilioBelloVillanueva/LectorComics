package com.lector.lectorComics.model.entities

data class Comic(
    val id: Long,
    val name: String,
    val author: Author,
    val imageUrl: String,
    val description: String,
    val listChapter: List<Chapter>,
    var favourite: Boolean,
    var seen: Boolean
)
