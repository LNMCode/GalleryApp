package com.lnmcode.galleryapp.business.datasource.cache.topics

import androidx.room.*

@Dao
interface TopicsDao {

    @Query("SELECT * FROM topics")
    suspend fun getTopics(): List<TopicsEntities>

    @Query("SELECT * FROM topics WHERE id = :id")
    suspend fun getTopicsFromId(id: String): TopicsEntities

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAndReplace(topicsEntities: TopicsEntities): Long

    @Delete
    suspend fun deleteTopics(topicsEntities: TopicsEntities): Int
}