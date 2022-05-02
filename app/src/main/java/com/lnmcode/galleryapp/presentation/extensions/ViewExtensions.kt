package com.lnmcode.galleryapp.presentation.extensions

import android.view.View

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.gone(shouldBeGone: Boolean) {
    if (shouldBeGone) visibility = View.GONE
    else visible()
}