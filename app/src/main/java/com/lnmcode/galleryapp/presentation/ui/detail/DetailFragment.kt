package com.lnmcode.galleryapp.presentation.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.bindables.BindingFragment
import com.lnmcode.galleryapp.databinding.FragmentDetailBinding
import timber.log.Timber

class DetailFragment : BindingFragment<FragmentDetailBinding>(R.layout.fragment_detail) {

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<View>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return binding {}.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding {
            bottomSheetBehavior = getBottomSheetBehavior(bottomSheet)
            textView2.setOnClickListener {
                showAndHideBottomSheet()
            }
        }
    }

    private fun getBottomSheetBehavior(bottomSheet: View): BottomSheetBehavior<View> {
        return BottomSheetBehavior.from(bottomSheet).apply {
            state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }

    private fun showAndHideBottomSheet() {
        Timber.d("${bottomSheetBehavior.state}")
        if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_COLLAPSED)
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
        else bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
    }

}