package com.example.beerapp.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.beerapp.models.BeersItem
import com.example.beerapp.repository.BeerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BeerViewModel @Inject constructor (repository: BeerRepository): ViewModel() {



    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getBeerDetails()
        }
    }

}