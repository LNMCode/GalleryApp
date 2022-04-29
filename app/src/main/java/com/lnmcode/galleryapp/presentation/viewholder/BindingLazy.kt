package com.lnmcode.galleryapp.presentation.viewholder

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.lnmcode.galleryapp.presentation.adapter.BaseViewHolder

inline fun <reified T : ViewDataBinding> BaseViewHolder.bindings(): Lazy<T> =
    lazy(LazyThreadSafetyMode.NONE) {
        requireNotNull(DataBindingUtil.bind(itemView)) { "cannot find the matched view to layout." }
    }
