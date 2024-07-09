package com.example.e_ramoapp.data

import com.example.e_ramoapp.R

class FakeDataRepository {
    fun getFakeData(): List<ImageItem> = arrayListOf(
        ImageItem(R.drawable.category_image1),
        ImageItem(R.drawable.category_image2),
        ImageItem(R.drawable.category_image3),
        ImageItem(R.drawable.category_image1),
        ImageItem(R.drawable.category_image2),
        ImageItem(R.drawable.category_image3)
    )

    fun getFakeCouponsData(): List<ImageItem> = arrayListOf(
        ImageItem(R.drawable.img_cp1),
        ImageItem(R.drawable.img_cp2),
        ImageItem(R.drawable.img_cp3),
        ImageItem(R.drawable.img_cp1),
        ImageItem(R.drawable.img_cp2),
        ImageItem(R.drawable.img_cp3)
    )

    fun getFakeCouponsForYouData(): List<ImageItem> = arrayListOf(
        ImageItem(R.drawable.img_foryou),
        ImageItem(R.drawable.img_foryou1),
        ImageItem(R.drawable.img_foryou2),
        ImageItem(R.drawable.img_foryou),
        ImageItem(R.drawable.img_foryou1),
        ImageItem(R.drawable.img_foryou2)
    )

    fun getFakeBestDealsData(): List<ImageItem> = arrayListOf(
        ImageItem(R.drawable.deal_img1),
        ImageItem(R.drawable.deal_img2),
        ImageItem(R.drawable.deal_img3),
        ImageItem(R.drawable.deal_img1),
        ImageItem(R.drawable.deal_img2),
        ImageItem(R.drawable.deal_img3)
    )

    fun getFakeTodayDealsData(): List<ImageItem> = arrayListOf(
        ImageItem(R.drawable.deal_img1),
        ImageItem(R.drawable.todat_img1),
        ImageItem(R.drawable.deal_img1),
        ImageItem(R.drawable.todat_img1)
    )

    fun getFakeFeaturedData(): List<ImageItem> = arrayListOf(
        ImageItem(R.drawable.feature_deals_img),
        ImageItem(R.drawable.feature_deals_img1),
        ImageItem(R.drawable.feature_deals_img),
        ImageItem(R.drawable.feature_deals_img1)
    )

    fun getFakeRecentCategoriesData(): List<ImageItem> = arrayListOf(
        ImageItem(R.drawable.recent_categories1),
        ImageItem(R.drawable.recent_categories2),
        ImageItem(R.drawable.recent_categories3),
        ImageItem(R.drawable.recent_categories4),
        ImageItem(R.drawable.recent_categories1),
        ImageItem(R.drawable.recent_categories2)
    )

    fun getImageList() = arrayListOf(
        R.drawable.switch_image,
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.switch_image,
        R.drawable.img1
    )

    fun getMoreOffersImageList() = arrayListOf(
        R.drawable.img2,
        R.drawable.img1,
        R.drawable.switch_image,
        R.drawable.img2,
        R.drawable.img1
    )

    fun getMoreOffers2ImageList() = arrayListOf(
        R.drawable.switch_image,
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.switch_image,
        R.drawable.img1
    )
}