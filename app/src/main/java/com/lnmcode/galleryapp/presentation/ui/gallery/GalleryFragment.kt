package com.lnmcode.galleryapp.presentation.ui.gallery

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.view.ViewCompat
import androidx.core.view.doOnPreDraw
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.transition.TransitionInflater
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.bindables.BindingFragment
import com.lnmcode.galleryapp.business.domain.models.topicphoto.TopicPhoto
import com.lnmcode.galleryapp.databinding.FragmentGalleryBinding
import com.lnmcode.galleryapp.presentation.ui.OnChangeLayout
import com.lnmcode.galleryapp.presentation.ui.detail.DetailFragmentArgs
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf
import timber.log.Timber

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        postponeEnterTransition()
        binding.root.viewTreeObserver.addOnPreDrawListener {
            startPostponedEnterTransition()
            true
        }
    }

    override fun onChangeSharedWithParameters(data: Any, viewItemShare: ImageView) {
        val dataTopicPhoto = data as TopicPhoto
        val actions = GalleryFragmentDirections.actionGalleryFragmentToDetailFragment(dataTopicPhoto)
        val extras = FragmentNavigatorExtras(viewItemShare to "image_transition_detail")
        findNavController().navigate(actions, extras)
    }

    override fun onChangeWithParameters(data: Any) {
        TODO("Not yet implemented")
    }
}