package com.lnmcode.galleryapp.presentation.ui.gallery

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.bindables.BindingFragment
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhoto
import com.lnmcode.galleryapp.databinding.FragmentGalleryBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class GalleryFragment : BindingFragment<FragmentGalleryBinding>(R.layout.fragment_gallery) {
    private val viewModel: GalleryViewModel by viewModel()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return binding {
            adapterHead = GalleryHeadAdapter { onActionToDetailFragment(it) }
            adapterGrid = GalleryAdapter { onActionToDetailFragment(it) }
            vm = viewModel
        }.root
    }

    private fun onActionToDetailFragment(topicPhoto: TopicPhoto) {
        findNavController().navigate(
            GalleryFragmentDirections.actionGalleryFragmentToDetailFragment(topicPhoto)
        )
    }
}