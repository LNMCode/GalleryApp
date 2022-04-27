package com.lnmcode.galleryapp.di

import android.content.Context
import androidx.room.Room
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.business.datasource.cache.AppDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val persistenceModule = module {

    single { roomDatabaseBuilder(androidApplication()) }

    //single { get<AppDatabase>().posterDao() }

}

internal fun roomDatabaseBuilder(
    context: Context
): AppDatabase {
    return Room.databaseBuilder(context, AppDatabase::class.java,
        context.getString(R.string.database_name)
    ).fallbackToDestructiveMigration().build()
}