package com.betelgeuse.corp.weatherapp2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.betelgeuse.corp.weatherapp2.adapters.WeatherModel

class MainViewModel :ViewModel(){
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}