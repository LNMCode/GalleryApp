package com.lnmcode.galleryapp.presentation.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.bindables.BindingFragment
import com.lnmcode.galleryapp.databinding.FragmentDetailBinding

class DetailFragment : BindingFragment<FragmentDetailBinding>(R.layout.fragment_detail) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return binding {

        }.root
    }

}