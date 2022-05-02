package com.lnmcode.galleryapp.presentation.ui.boards

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.bindables.BindingFragment
import com.lnmcode.galleryapp.business.domain.cache.TopicsCacheDomain
import com.lnmcode.galleryapp.business.domain.models.topic.Topic
import com.lnmcode.galleryapp.business.domain.models.topics.Topics
import com.lnmcode.galleryapp.databinding.FragmentBoardsBinding
import com.lnmcode.galleryapp.presentation.ui.OnChangeLayout
import org.koin.androidx.viewmodel.ext.android.viewModel

class BoardsFragment(
) : BindingFragment<FragmentBoardsBinding>(R.layout.fragment_boards), OnChangeLayout,
    BoardsActionCacheEvent {

    private val viewModel: BoardsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return binding {
            adapter = BoardsAdapter(this@BoardsFragment, this@BoardsFragment)
            adapterTopics = BoardTopicsAdapter(this@BoardsFragment)
            vm = viewModel
        }.root
    }

    override fun onChangeSharedWithParameters(data: Any, viewItemShare: ImageView) {

    }

    override fun onChangeWithParameters(data: Any) {
        findNavController().navigate(
            BoardsFragmentDirections.actionBoardsFragmentToGalleryFragment(data as String)
        )
    }

    override fun insertTopicsCache(topicsCacheDomain: TopicsCacheDomain) {
        viewModel.insertTopicsCache(topicsCacheDomain)
    }

    override fun deleteTopicsCache(topicsCacheDomain: TopicsCacheDomain) {
        viewModel.deleteTopicsCache(topicsCacheDomain)
    }

}