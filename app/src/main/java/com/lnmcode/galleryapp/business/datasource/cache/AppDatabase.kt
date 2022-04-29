package com.lnmcode.galleryapp.business.datasource.cache

import androidx.room.Database
import androidx.room.RoomDatabase
import com.lnmcode.galleryapp.business.datasource.cache.topic.TopicsDao
import com.lnmcode.galleryapp.business.datasource.cache.topic.TopicsEntities

@Database(entities = [TopicsEntities::class], version = 1, exportSchema = true)
abstract class AppDatabase: RoomDatabase() {

    abstract fun topicDao(): TopicsDao

}