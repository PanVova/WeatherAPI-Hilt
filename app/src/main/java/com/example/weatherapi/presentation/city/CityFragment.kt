package com.example.weatherapi.presentation.city

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapi.App
import com.example.weatherapi.databinding.FragmentCityBinding
import com.example.weatherapi.domain.model.WeatherCity
import com.example.weatherapi.utils.Constants
import javax.inject.Inject

class CityFragment : Fragment() {

    private lateinit var binding: FragmentCityBinding
    private lateinit var cityAdapter: CityAdapter

    @Inject
    lateinit var viewModel: CityViewModel

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?,
    ): View {
        binding = FragmentCityBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        App.component.inject(this)
        setupRecyclerView()
        setupObservers()
        val cityId = arguments?.getInt(Constants.CITY_ID)!!
        viewModel.getCity(cityId)
    }

    private fun setupObservers() {
        viewModel.data.observe(viewLifecycleOwner) {
            onCityLoad(it)
        }
    }

    private fun setupRecyclerView() {
        cityAdapter = CityAdapter()
        with(binding) {
            weatherRecyclerView.layoutManager = LinearLayoutManager(context)
            weatherRecyclerView.adapter = cityAdapter
        }
    }

    private fun onCityLoad(weatherCity: WeatherCity) {
        binding.cityName.text = weatherCity.title
        cityAdapter.setData(weatherCity.consolidatedWeather)
    }
}