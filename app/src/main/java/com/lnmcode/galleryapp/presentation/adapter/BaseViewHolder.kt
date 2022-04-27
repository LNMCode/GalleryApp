package com.lnmcode.galleryapp.presentation.adapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlin.jvm.Throws

abstract class BaseViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {

    val context: Context = view.context

    init {
        view.setOnClickListener(this)
    }

    /**
     * binds data to view holder class
     * */
    @Throws(Exception::class)
    abstract fun bindData(data: Any)
}