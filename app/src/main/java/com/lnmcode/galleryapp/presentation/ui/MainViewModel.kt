package com.lnmcode.galleryapp.presentation.ui

import androidx.databinding.Bindable
import com.lnmcode.galleryapp.bindables.BindingViewModel
import com.lnmcode.galleryapp.bindables.bindingProperty

class   MainViewModel(): BindingViewModel() {

    @get:Bindable
    var isLoading: Boolean by bindingProperty(false)
        private set

    fun setShowLoading(boolean: Boolean) {
        isLoading = boolean
    }
}