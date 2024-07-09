package com.example.e_ramoapp.domain.repository

import com.example.e_ramoapp.data.model.ImageItem

interface IFakeDataRepository {
    fun getFakeData(): List<ImageItem>
    fun getFakeCouponsData(): List<ImageItem>
    fun getFakeCouponsForYouData(): List<ImageItem>
    fun getFakeBestDealsData(): List<ImageItem>
    fun getFakeTodayDealsData(): List<ImageItem>
    fun getFakeFeaturedData(): List<ImageItem>
    fun getFakeRecentCategoriesData(): List<ImageItem>
    fun getImageList(): List<Int>
    fun getMoreOffersImageList(): List<Int>
    fun getMoreOffers2ImageList(): List<Int>
}