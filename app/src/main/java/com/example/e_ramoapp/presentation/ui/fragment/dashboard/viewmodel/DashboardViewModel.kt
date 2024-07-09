package com.example.e_ramoapp.presentation.ui.fragment.dashboard.viewmodel

import androidx.lifecycle.ViewModel
import com.example.e_ramoapp.R
import com.example.e_ramoapp.data.FakeDataRepository
import com.example.e_ramoapp.data.ImageItem

class DashboardViewModel(private val repository: FakeDataRepository) : ViewModel() {

    fun getFakeData() = repository.getFakeData()

    fun getFakeCouponsData() = repository.getFakeCouponsData()

    fun getFakeCouponsForYouData() = repository.getFakeCouponsForYouData()

    fun getFakeBestDealsData() = repository.getFakeBestDealsData()

    fun getFakeTodayDealsData() = repository.getFakeTodayDealsData()

    fun getFakeFeaturedData() = repository.getFakeFeaturedData()

    fun getFakeRecentCategoriesData() = repository.getFakeRecentCategoriesData()

    fun getImageList() = repository.getImageList()

    fun getMoreOffersImageList() = repository.getMoreOffersImageList()

    fun getMoreOffers2ImageList() = repository.getMoreOffers2ImageList()
}