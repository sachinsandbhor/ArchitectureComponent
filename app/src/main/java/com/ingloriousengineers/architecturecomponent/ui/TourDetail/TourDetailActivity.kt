package com.ingloriousengineers.architecturecomponent.ui.TourDetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ingloriousengineers.architecturecomponent.R

class TourDetailActivity : AppCompatActivity() {

    lateinit var tourDetailViewModel: TourDetailActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tour_detail)
        tourDetailViewModel = ViewModelProviders.of(this).get(TourDetailActivityViewModel::class.java)

        tourDetailViewModel.getTour().observe(this, Observer {

        })
    }
}
