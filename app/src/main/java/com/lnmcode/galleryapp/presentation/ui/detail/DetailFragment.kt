package com.lnmcode.galleryapp.presentation.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.bindables.BindingFragment
import com.lnmcode.galleryapp.databinding.FragmentDetailBinding
import timber.log.Timber

class DetailFragment : BindingFragment<FragmentDetailBinding>(R.layout.fragment_detail),
    DetailBottomSheet {

    private val viewModel: DetailViewModel by viewModels()
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<View>
    private val args by navArgs<DetailFragmentArgs>()
    private val topicPhoto by lazy { args.topicPhoto }

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.setTopicPhotoArgs(topicPhoto)
        binding {
            bottomSheetBehavior = getBottomSheetBehavior(bottomSheet)
            btnClose.setOnClickListener { backPopNav() }
            textView2.setOnClickListener {
                showAndHideBottomSheet()
            }
        }
    }

    private fun backPopNav() {
        findNavController().popBackStack(R.id.galleryFragment, true)
    }

    override fun getBottomSheetBehavior(bottomSheet: View): BottomSheetBehavior<View> {
        return BottomSheetBehavior.from(bottomSheet).apply {
            state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }

    override fun showAndHideBottomSheet() {
        Timber.d("${bottomSheetBehavior.state}")
        if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_COLLAPSED)
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
        else bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
    }

}