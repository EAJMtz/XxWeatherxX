package com.example.xxweatherxx

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {

    private val _city = MutableLiveData<String>()
    val city: LiveData<String> = _city

    private val _temperature = MutableLiveData<String>()
    val temperature: LiveData<String> = _temperature

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    fun loadWeather() {
        _isLoading.value = true

        viewModelScope.launch {
            delay(2000) // Simula una llamada a red

            _city.value = "Ciudad de México"
            _temperature.value = "22°C"
            _isLoading.value = false
        }
    }
}
