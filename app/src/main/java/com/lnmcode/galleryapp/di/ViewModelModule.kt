package com.lnmcode.galleryapp.di

import com.lnmcode.galleryapp.presentation.ui.MainViewModel
import com.lnmcode.galleryapp.presentation.ui.boards.BoardsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { MainViewModel() }

    viewModel { BoardsViewModel(get(), get()) }

}