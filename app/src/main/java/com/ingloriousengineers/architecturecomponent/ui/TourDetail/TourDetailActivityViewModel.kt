package com.ingloriousengineers.architecturecomponent.ui.TourDetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ingloriousengineers.architecturecomponent.data.database.Tour

class TourDetailActivityViewModel: ViewModel() {

    private val tour: MutableLiveData<Tour> = MutableLiveData()

    fun getTour(): LiveData<Tour> {
        return tour
    }

    fun setTour(tourEntry: Tour) {
        tour.value = tourEntry
    }


}