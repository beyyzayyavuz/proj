package com.tahayasindogukan.studentclubapplication.ui.home.clubManager.requestPages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.tahayasindogukan.studentclubapplication.R
import com.tahayasindogukan.studentclubapplication.databinding.FragmentClubManagerRequestBinding


class ClubManagerRequestFragment : Fragment() {
    private lateinit var binding: FragmentClubManagerRequestBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClubManagerRequestBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        binding.btnForms.setOnClickListener {
            navController.navigate(R.id.action_clubManagerRequestFragment_to_clubManagerFormsMainPage)

        }
        binding.btnPosts.setOnClickListener {
            navController.navigate(R.id.action_clubManagerRequestFragment_to_clubManagerPostsMainPage)
        }

    }

}