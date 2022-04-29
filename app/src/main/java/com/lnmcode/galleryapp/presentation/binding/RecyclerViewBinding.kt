package com.lnmcode.galleryapp.presentation.binding

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.lnmcode.galleryapp.business.domain.models.topics.Topics
import com.lnmcode.galleryapp.presentation.adapter.BaseAdapter
import com.lnmcode.galleryapp.presentation.ui.boards.BoardsAdapter

object RecyclerViewBinding {

    @JvmStatic
    @BindingAdapter("adapter")
    fun bindAdapter(view: RecyclerView, baseAdapter: BaseAdapter) {
        view.adapter = baseAdapter
    }

    @JvmStatic
    @BindingAdapter("adapterTopicsList")
    fun bindAdapterPosterList(view: RecyclerView, topics: List<Topics>?) {
        if (!topics.isNullOrEmpty()) {
            val boardsAdapter = BoardsAdapter()
            boardsAdapter.addTopics(topics)
            view.adapter = boardsAdapter
        }
    }

}