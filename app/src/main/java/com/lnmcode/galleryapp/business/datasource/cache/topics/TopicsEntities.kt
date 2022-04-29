package com.lnmcode.galleryapp.business.datasource.cache.topics

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.lnmcode.galleryapp.business.domain.cache.TopicsCacheDomain

@Entity(tableName = "topics")
class TopicsEntities(

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    val id: String,

    @ColumnInfo(name = "slug")
    val slug: String,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "description")
    val description: String,

)

fun TopicsEntities.toTopicsCacheDomain(): TopicsCacheDomain{
    return TopicsCacheDomain(
        id = id,
        slug = slug,
        title = title,
        description = description,
    )
}