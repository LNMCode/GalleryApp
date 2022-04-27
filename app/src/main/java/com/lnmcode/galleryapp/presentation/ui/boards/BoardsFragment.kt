package com.lnmcode.galleryapp.presentation.ui.boards

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.bindables.BindingFragment
import com.lnmcode.galleryapp.databinding.FragmentBoardsBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class BoardsFragment : BindingFragment<FragmentBoardsBinding>(R.layout.fragment_boards) {

    private val viewModel: BoardsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return binding {
            vm = viewModel
        }.root
    }

}