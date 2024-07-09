package com.example.e_ramoapp.presentation.ui.fragment.dashboard.viewmodel

import androidx.lifecycle.ViewModel
import com.example.e_ramoapp.R
import com.example.e_ramoapp.data.ImageItem

class DashboardViewModel : ViewModel() {

    fun getFakeData() = arrayListOf(
        ImageItem(R.drawable.category_image1),
        ImageItem(R.drawable.category_image2),
        ImageItem(R.drawable.category_image3)
    )

    fun getFakeCouponsData() = arrayListOf(
        ImageItem(R.drawable.img_cp1),
        ImageItem(R.drawable.img_cp2),
        ImageItem(R.drawable.img_cp3)
    )

    fun getFakeCouponsForYouData() = arrayListOf(
        ImageItem(R.drawable.img_foryou),
        ImageItem(R.drawable.img_foryou1),
        ImageItem(R.drawable.img_foryou2)
    )

    fun getFakeBestDealsData() = arrayListOf(
        ImageItem(R.drawable.deal_img1),
        ImageItem(R.drawable.deal_img2),
        ImageItem(R.drawable.deal_img3)
    )

    fun getFakeTodayDealsData() = arrayListOf(
        ImageItem(R.drawable.deal_img1),
        ImageItem(R.drawable.todat_img1)
    )

    fun getFakeFeaturedData() = arrayListOf(
        ImageItem(R.drawable.feature_deals_img),
        ImageItem(R.drawable.feature_deals_img1)
    )

    fun getFakeRecentCategoriesData() = arrayListOf(
        ImageItem(R.drawable.recent_categories1),
        ImageItem(R.drawable.recent_categories2),
        ImageItem(R.drawable.recent_categories3),
        ImageItem(R.drawable.recent_categories4)
    )

    fun getImageList() = arrayListOf(
        R.drawable.switch_image,
        R.drawable.img1,
        R.drawable.img2
    )

    fun getMoreOffersImageList() = arrayListOf(
        R.drawable.img2,
        R.drawable.img1,
        R.drawable.switch_image
    )

    fun getMoreOffers2ImageList() = arrayListOf(
        R.drawable.switch_image,
        R.drawable.img1,
        R.drawable.img2
    )
}