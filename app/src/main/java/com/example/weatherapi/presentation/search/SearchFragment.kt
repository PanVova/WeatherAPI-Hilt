package com.example.weatherapi.presentation.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.weatherapi.App
import com.example.weatherapi.R
import com.example.weatherapi.databinding.FragmentSearchBinding
import javax.inject.Inject

class SearchFragment : Fragment() {

    @Inject
    protected lateinit var viewModel: SearchViewModel
    private lateinit var binding: FragmentSearchBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        App.component.inject(this)
        subscribeLiveData()
        setupView()
    }

    private fun setupView() {
        binding.root.setOnClickListener {
            findNavController().navigate(R.id.searchFragment_cityFragment)
        }
    }

    private fun subscribeLiveData() {
        viewModel.data.observe(viewLifecycleOwner) {}
    }
}