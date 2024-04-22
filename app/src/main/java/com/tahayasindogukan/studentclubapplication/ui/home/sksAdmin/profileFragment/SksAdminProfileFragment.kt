package com.tahayasindogukan.studentclubapplication.ui.home.sksAdmin.profileFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tahayasindogukan.studentclubapplication.databinding.FragmentSksAdminProfileBinding


class SksAdminProfileFragment : Fragment() {
    private lateinit var binding: FragmentSksAdminProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSksAdminProfileBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

}

