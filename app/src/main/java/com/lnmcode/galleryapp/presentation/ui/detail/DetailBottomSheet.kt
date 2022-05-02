package com.lnmcode.galleryapp.presentation.ui.detail

import android.view.View
import com.google.android.material.bottomsheet.BottomSheetBehavior

interface DetailBottomSheet {

    fun getBottomSheetBehavior(bottomSheet: View): BottomSheetBehavior<View>

    fun showAndHideBottomSheet()
}