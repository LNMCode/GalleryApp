package com.lnmcode.galleryapp.presentation.binding

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.lnmcode.galleryapp.presentation.extensions.gone

object ViewBinding {

    @JvmStatic
    @BindingAdapter("loadImage")
    fun bindLoadImage(view: AppCompatImageView, url: String) {
        Glide.with(view.context)
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