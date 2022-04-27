package com.lnmcode.galleryapp.bindables

import androidx.databinding.PropertyChangeRegistry
import androidx.lifecycle.SavedStateHandle
import kotlin.reflect.KProperty

/**
 *
 * A property for notifying a specific has changed that matches in [PropertyChangeRegistry].
 * The getter for the property that changes should be marked with [androidx.databinding.Bindable].
 *
 * @param defaultValue A default value should be initialized.
 *
 * @return A delegation property [BindingPropertyIdWithDefaultValue].
 */
@BindingPropertyDelegate
fun <T> bindingProperty(defaultValue: T) =
    BindingPropertyIdWithDefaultValue(defaultValue)

/**
 *
 * A delegate class for holding value and notifying changed value on a property.
 *
 * @param value A default value should be initialized.
 */
class BindingPropertyIdWithDefaultValue<T>(
    private var value: T
) {
    operator fun getValue(bindingObservable: BindingObservable, property: KProperty<*>): T = value

    operator fun setValue(bindingObservable: BindingObservable, property: KProperty<*>, value: T) {
        if (this.value != value) {
            this.value = value
            bindingObservable.notifyPropertyChanged(property.bindingId())
        }
    }
}


/**
 *
 * A [SavedStateHandle] property for notifying a specific has changed that matches in [PropertyChangeRegistry].
 * We can set and get value that matches with [key] from the [SavedStateHandle].
 * Android associate the given value with the key. The value must have a type that could be stored in [android.os.Build].
 * The getter for the property that changes should be marked with [androidx.databinding.Bindable].
 *
 * @param key A key for finding saved value.
 *
 * @return A delegation property [SavedStateHandleBindingProperty].
 */
@BindingPropertyDelegate
fun <T> SavedStateHandle.asBindingProperty(key: String) =
    SavedStateHandleBindingProperty<T>(this, key)

/**
 *
 * A delegate class for persisting key-value map and notifying changed value on a property.
 *
 * @param savedStateHandle A handle to saved state passed down to [androidx.lifecycle.ViewModel].
 * @param key A key for finding saved value.
 */
class SavedStateHandleBindingProperty<T>(
    private val savedStateHandle: SavedStateHandle,
    private var key: String
) {
    operator fun getValue(bindingObservable: BindingObservable, property: KProperty<*>): T? = savedStateHandle.get<T?>(key)

    operator fun setValue(bindingObservable: BindingObservable, property: KProperty<*>, value: T?) {
        savedStateHandle.set(key, value)
        bindingObservable.notifyPropertyChanged(property.bindingId())
    }
}
