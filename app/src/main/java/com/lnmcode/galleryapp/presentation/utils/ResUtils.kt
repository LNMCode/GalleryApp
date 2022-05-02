package com.lnmcode.galleryapp.presentation.utils

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.annotation.IntDef
import androidx.annotation.StringRes
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.snackbar.Snackbar
import com.lnmcode.galleryapp.R


object ResUtils {

    fun getResColor(context: Context, @ColorRes colorRes: Int) =
        ResourcesCompat.getColor(context.resources, colorRes, null)

    fun showToast(context: Context, message: String, @ToastDuration duration: Int = Toast.LENGTH_SHORT) =
        Toast.makeText(context, message, duration).show()

    fun showToast(context: Context, @StringRes messageRes: Int, @ToastDuration duration: Int = Toast.LENGTH_SHORT) =
        showToast(context, context.getString(messageRes), duration)

    fun showSnackBar(view: View, @StringRes messageRes: Int, @SnackBarDuration duration: Int = Snackbar.LENGTH_SHORT) =
        showSnackBar(view, view.resources.getString(messageRes), duration)

    fun showSnackBar(view: View, message: String, @SnackBarDuration duration: Int = Snackbar.LENGTH_SHORT) =
        Snackbar.make(view, message, duration)
            .setAnimationMode(Snackbar.ANIMATION_MODE_SLIDE)
            .setTextColor(getResColor(view.context, android.R.color.white))
            .setBackgroundTint(getResColor(view.context, R.color.black))
            .show()
}

@IntDef(Snackbar.LENGTH_SHORT, Snackbar.LENGTH_LONG, Snackbar.LENGTH_INDEFINITE)
annotation class SnackBarDuration

@IntDef(Toast.LENGTH_SHORT, Toast.LENGTH_LONG)
annotation class ToastDuration