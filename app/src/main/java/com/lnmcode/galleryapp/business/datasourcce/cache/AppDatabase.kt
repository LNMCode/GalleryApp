package com.lnmcode.galleryapp.business.datasourcce.cache

import androidx.room.Database
import androidx.room.RoomDatabase
import com.lnmcode.galleryapp.business.datasourcce.cache.topic.TopicDao
import com.lnmcode.galleryapp.business.datasourcce.cache.topic.TopicEntities

@Database(entities = [TopicEntities::class], version = 1, exportSchema = true)
abstract class AppDatabase: RoomDatabase() {

    abstract fun topicDao(): TopicDao

}