package com.lnmcode.galleryapp.presentation.ui.gallery

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.bindables.BindingFragment
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhoto
import com.lnmcode.galleryapp.databinding.FragmentGalleryBinding
import com.lnmcode.galleryapp.presentation.ui.OnChangeLayout
import com.lnmcode.galleryapp.presentation.ui.detail.DetailFragmentArgs
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class GalleryFragment : BindingFragment<FragmentGalleryBinding>(R.layout.fragment_gallery),
    OnChangeLayout {

    private val args by navArgs<GalleryFragmentArgs>()
    private val topicId by lazy { args.topicsId }

    private val viewModel: GalleryViewModel by viewModel { parametersOf(topicId) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return binding {
            adapterHead = GalleryHeadAdapter(this@GalleryFragment)
            adapterGrid = GalleryAdapter(this@GalleryFragment)
            vm = viewModel
        }.root
    }

    override fun onChangeWithParameters(data: Any) {
        val dataTopicPhoto = data as TopicPhoto
        findNavController().navigate(
            GalleryFragmentDirections.actionGalleryFragmentToDetailFragment(dataTopicPhoto)
        )
    }
}