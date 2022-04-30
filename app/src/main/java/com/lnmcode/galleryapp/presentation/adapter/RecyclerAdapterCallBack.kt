package com.lnmcode.galleryapp.presentation.adapter

import androidx.recyclerview.widget.ListUpdateCallback

class RecyclerAdapterCallBack<T>(
    private val adapter: BaseAdapter<T>
) : ListUpdateCallback {
    override fun onInserted(position: Int, count: Int) {
        adapter.notifyItemChanged(position, count)
    }

    override fun onRemoved(position: Int, count: Int) {
        adapter.notifyDataSetChanged()
    }

    override fun onMoved(fromPosition: Int, toPosition: Int) {
        adapter.notifyDataSetChanged()
    }

    override fun onChanged(position: Int, count: Int, payload: Any?) {
        adapter.notifyItemRangeChanged(position, count, payload)
    }
}