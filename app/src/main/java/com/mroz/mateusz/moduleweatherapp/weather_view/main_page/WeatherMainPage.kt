package com.mroz.mateusz.moduleweatherapp.weather_view.main_page


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

import com.mroz.mateusz.moduleweatherapp.R
import com.mroz.mateusz.moduleweatherapp.dagger.Injectable
import timber.log.Timber
import javax.inject.Inject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class WeatherMainPage : Fragment(), Injectable {

    private lateinit var connectServer: Button
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var weatherViewModel: WeatherMainPageViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weather_main_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        weatherViewModel = ViewModelProviders.of(this, viewModelFactory)
            .get(WeatherMainPageViewModel::class.java)

        connectServer = view.findViewById(R.id.request)
        connectServer.setOnClickListener {
            connectToServer()
        }
    }


    private fun connectToServer() {
        val coordinates = WeatherMainPageViewModel.Coordinates(50.090269, 19.962549)
        weatherViewModel.setLocation(coordinates)
        weatherViewModel.weather.observe(this, Observer {
            Timber.i("value " + it.data?.latitude)
        })
    }
}
