package com.lnmcode.galleryapp.bindables

import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import androidx.lifecycle.ViewModel
import kotlin.reflect.KFunction
import kotlin.reflect.KProperty
import androidx.databinding.library.baseAdapters.BR

abstract class BindingViewModel : ViewModel(), BindingObservable {

    private val lock: Any = Any()

    private var propertyCallbacks: PropertyChangeRegistry? = null


    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        synchronized(lock) lock@{
            val propertyCallbacks =
                propertyCallbacks ?: PropertyChangeRegistry().also { propertyCallbacks = it }
            propertyCallbacks.add(callback)
        }
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        synchronized(lock) lock@{
            val propertyCallbacks = propertyCallbacks ?: return@lock
            propertyCallbacks.remove(callback)
        }
    }

    override fun notifyPropertyChanged(property: KProperty<*>) {
        synchronized(lock) lock@{
            val propertyCallbacks = propertyCallbacks ?: return@lock
            propertyCallbacks.notifyCallbacks(this, property.bindingId(), null)
        }
    }

    override fun notifyPropertyChanged(function: KFunction<*>) {
        synchronized(lock) lock@{
            val propertyCallbacks = propertyCallbacks ?: return@lock
            propertyCallbacks.notifyCallbacks(this, function.bindingId(), null)
        }
    }

    override fun notifyPropertyChanged(bindingId: Int) {
        synchronized(lock) lock@{
            val propertyCallbacks = propertyCallbacks ?: return@lock
            propertyCallbacks.notifyCallbacks(this, bindingId, null)
        }
    }

    override fun notifyAllPropertiesChanged() {
        synchronized(lock) lock@{
            val propertyCallbacks = propertyCallbacks ?: return@lock
            propertyCallbacks.notifyCallbacks(this, BR._all, null)
        }
    }

    override fun clearAllProperties() {
        synchronized(lock) lock@{
            val propertyCallbacks = propertyCallbacks ?: return@lock
            propertyCallbacks.clear()
        }
    }

    override fun onCleared() {
        super.onCleared()
        clearAllProperties()
    }

}