package com.tahayasindogukan.studentclubapplication.ui.home.sksAdmin.requestFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tahayasindogukan.studentclubapplication.databinding.FragmentSksAdminRequestBinding


class SksAdminRequestFragment : Fragment() {

    private lateinit var binding: FragmentSksAdminRequestBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSksAdminRequestBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }


}