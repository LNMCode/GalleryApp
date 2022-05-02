package com.lnmcode.galleryapp.bindables

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import kotlin.reflect.KFunction
import kotlin.reflect.KProperty

/**
 *
 * A binding extension for inflating a [layoutRes] and returns a DataBinding type [T].
 *
 * @param layoutRes The layout resource ID of the layout to inflate.
 * @param attachToParent Whether the inflated hierarchy should be attached to the parent parameter.
 *
 * @return T A DataBinding class that inflated using the [layoutRes].
 */
@BindingOnly
fun <T : ViewDataBinding> ViewGroup.binding(
    @LayoutRes layoutRes: Int,
    attachToParent: Boolean = false
): T {
    return DataBindingUtil.inflate(
        LayoutInflater.from(context), layoutRes, this, attachToParent
    )
}

/**
 *
 * A binding extension for inflating a [layoutRes] and returns a DataBinding type [T] with a receiver.
 *
 * @param layoutRes The layout resource ID of the layout to inflate.
 * @param attachToParent Whether the inflated hierarchy should be attached to the parent parameter.
 * @param block A DataBinding receiver lambda.
 *
 * @return T A DataBinding class that inflated using the [layoutRes].
 */
@BindingOnly
fun <T : ViewDataBinding> ViewGroup.binding(
    @LayoutRes layoutRes: Int,
    attachToParent: Boolean = false,
    block: T.() -> Unit
): T {
    return binding<T>(layoutRes, attachToParent).apply(block)
}

/**
 *
 * Returns a binding ID by a [KProperty].
 *
 * @return A binding resource ID.
 */
internal fun KProperty<*>.bindingId(): Int {
    return BindingManager.getBindingIdByProperty(this)
}

/**
 *
 * Returns a binding ID by a [KFunction].
 *
 * @return A binding resource ID.
 */
internal fun KFunction<*>.bindingId(): Int {
    return BindingManager.getBindingIdByFunction(this)
}
