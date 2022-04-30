package com.lnmcode.galleryapp.presentation.binding

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.lnmcode.galleryapp.presentation.extensions.gone
import com.lnmcode.galleryapp.presentation.glide.GlideApp

object ViewBinding {

    @JvmStatic
    @BindingAdapter("loadImage")
    fun bindLoadImage(view: ImageView, url: String?) {
        GlideApp.with(view.context)
            .load(url)
            .into(view)
    }

    @JvmStatic
    @BindingAdapter("gone")
    fun bindGone(view: View, shouldBeGone: Boolean?) {
        if (shouldBeGone == true) {
            view.gone(true)
        } else {
            view.gone(false)
        }
    }

}