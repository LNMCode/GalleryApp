package com.lnmcode.galleryapp.presentation.ui

import android.view.View
import android.widget.ImageView

interface OnChangeLayout {

    fun onChangeSharedWithParameters(data: Any, viewItemShare: ImageView)

    fun onChangeWithParameters(data: Any)
}