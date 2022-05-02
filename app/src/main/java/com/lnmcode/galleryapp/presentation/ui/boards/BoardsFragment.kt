package com.lnmcode.galleryapp.presentation.ui.boards

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.bindables.BindingFragment
import com.lnmcode.galleryapp.business.domain.models.topics.Topics
import com.lnmcode.galleryapp.databinding.FragmentBoardsBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class BoardsFragment : BindingFragment<FragmentBoardsBinding>(R.layout.fragment_boards) {

    private val viewModel: BoardsViewModel by viewModel()
    lateinit var topics :Topics

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return binding {
            adapter = BoardsAdapter {viewModel.insertTopicsCache(it) }
            adapterTopics = BoardTopicsAdapter { viewModel.deleteTopicsCache(it); }
            vm = viewModel
        }.root
    }
    private fun onActionToGalleryFragment(topics : Topics){
        findNavController().navigate(
            BoardsFragmentDirections.actionBoardsFragmentToGalleryFragment(topics)
        )

    }

}