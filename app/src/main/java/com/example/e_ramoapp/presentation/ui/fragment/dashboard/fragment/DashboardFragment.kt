package com.example.e_ramoapp.presentation.ui.fragment.dashboard.fragment

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.e_ramoapp.data.repository.FakeDataRepository
import com.example.e_ramoapp.databinding.FragmentDashboardBinding
import com.example.e_ramoapp.presentation.ui.adapter.*
import com.example.e_ramoapp.presentation.ui.fragment.dashboard.viewmodel.DashboardViewModel
import com.example.e_ramoapp.presentation.ui.fragment.dashboard.viewmodel.DashboardViewModelFactory
import kotlin.math.abs

class DashboardFragment : Fragment() {

    private lateinit var binding: FragmentDashboardBinding
    private lateinit var dashboardViewModel: DashboardViewModel
    private val repository: FakeDataRepository by lazy { FakeDataRepository() }
    private val dashboardViewModelFactory: DashboardViewModelFactory by lazy { DashboardViewModelFactory(repository) }
    private lateinit var handler: Handler
    private val imageAdapter: ImageAdapter by lazy { ImageAdapter(dashboardViewModel.getFakeData()) }
    private val recentCategoriesAdapter: ImageAdapter by lazy { ImageAdapter(dashboardViewModel.getFakeRecentCategoriesData()) }
    private val couponsAdapter: CouponsAdapter by lazy { CouponsAdapter(dashboardViewModel.getFakeCouponsData()) }
    private val couponsForYouAdapter: CouponsAdapter by lazy { CouponsAdapter(dashboardViewModel.getFakeCouponsForYouData()) }
    private val dealsAdapter: DealsAdapter by lazy { DealsAdapter(dashboardViewModel.getFakeBestDealsData()) }
    private val todayDealsAdapter: TodayDealsAdapter by lazy { TodayDealsAdapter(dashboardViewModel.getFakeTodayDealsData()) }
    private val featuredAdapter: FeaturedAdapter by lazy { FeaturedAdapter(dashboardViewModel.getFakeFeaturedData()) }
    private val newYearOfferAdapter: CouponsAdapter by lazy { CouponsAdapter(dashboardViewModel.getFakeBestDealsData()) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dashboardViewModel = ViewModelProvider(this, dashboardViewModelFactory).get(DashboardViewModel::class.java)
        actions()
    }

    private fun actions(){
        setupRecyclerViews()
        setupViewPager()
    }
    private fun setupRecyclerViews() {
        setupCarouselRecyclerView()
        setupRecentRecyclerView()
        setupCouponsRecyclerView()
        setupCouponsForYouRecyclerView()
        setupBestDealsRecyclerView()
        setupTodaysDealsRecyclerView()
        setupFeaturedRecyclerView()
        setupNewYearOfferRecyclerView()
    }

    private fun setupCarouselRecyclerView() {
        binding.carouselRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = imageAdapter
        }
    }

    private fun setupRecentRecyclerView() {
        binding.recentRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = recentCategoriesAdapter
        }
    }

    private fun setupCouponsRecyclerView() {
        binding.couponsRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = couponsAdapter
        }
    }

    private fun setupCouponsForYouRecyclerView() {
        binding.couponsForYouRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = couponsForYouAdapter
        }
    }

    private fun setupBestDealsRecyclerView() {
        binding.bestDealsRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = dealsAdapter
        }
    }

    private fun setupTodaysDealsRecyclerView() {
        binding.todaysDealsRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = todayDealsAdapter
        }
    }

    private fun setupFeaturedRecyclerView() {
        binding.featuredRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = featuredAdapter
        }
    }

    private fun setupNewYearOfferRecyclerView() {
        binding.newYearOfferRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = newYearOfferAdapter
        }
    }

    private fun setupViewPager() {
        handler = Handler(Looper.getMainLooper())
        binding.vpAutoscroll.apply {
            adapter = ImageAdapterAutoImageSlider(
                dashboardViewModel.getImageList(),
                this,
                binding.SliderDots
            )
            offscreenPageLimit = 3
            clipToPadding = false
            clipChildren = false
            getChildAt(0).overScrollMode = View.OVER_SCROLL_NEVER

            setUpTransformer()
        }
        moreOffers()
        moreOffers2()
    }

    private fun ViewPager2.setUpTransformer() {
        val transformer = CompositePageTransformer().apply {
            addTransformer(MarginPageTransformer(30))
            addTransformer { page, position ->
                val r = 1 - abs(position)
                page.scaleY = 0.85f + r * 0.14f
            }
        }
        setPageTransformer(transformer)
    }

    private val runnable = Runnable {
        binding.vpAutoscroll.currentItem += 1
    }

    private fun moreOffers() {
        binding.vpAutoscrollMoreOffers.apply {
            adapter = ImageAdapterAutoImageSlider(
                dashboardViewModel.getMoreOffersImageList(),
                this,
                binding.SliderDots
            )
            offscreenPageLimit = 3
        }
    }

    private fun moreOffers2() {
        binding.vpAutoscrollMoreOffers2.apply {
            adapter = ImageAdapterAutoImageSlider(
                dashboardViewModel.getMoreOffers2ImageList(),
                this,
                binding.SliderDots
            )
            offscreenPageLimit = 3
            clipToPadding = false
            clipChildren = false
            getChildAt(0).overScrollMode = View.OVER_SCROLL_NEVER
        }
    }
    override fun onResume() {
        super.onResume()
        handler.postDelayed(runnable, 3000)
    }
}