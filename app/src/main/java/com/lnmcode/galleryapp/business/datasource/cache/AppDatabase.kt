package com.lnmcode.galleryapp.business.datasource.cache

import androidx.room.Database
import androidx.room.RoomDatabase
import com.lnmcode.galleryapp.business.datasource.cache.topics.TopicsDao
import com.lnmcode.galleryapp.business.datasource.cache.topics.TopicsEntities

@Database(entities = [TopicsEntities::class], version = 1, exportSchema = true)
abstract class AppDatabase: RoomDatabase() {

    abstract fun topicsDao(): TopicsDao

}