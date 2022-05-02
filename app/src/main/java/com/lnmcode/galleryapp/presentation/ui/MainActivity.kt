package com.lnmcode.galleryapp.presentation.ui

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.lnmcode.galleryapp.R
import com.lnmcode.galleryapp.bindables.BindingActivity
import com.lnmcode.galleryapp.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        //applyExitMaterialTransform()
        super.onCreate(savedInstanceState)
        binding {
            vm = getViewModel()
        }
    }
}