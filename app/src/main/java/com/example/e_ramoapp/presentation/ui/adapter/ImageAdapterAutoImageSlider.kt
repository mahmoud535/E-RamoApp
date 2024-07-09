package com.example.e_ramoapp.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.e_ramoapp.R

class ImageAdapterAutoImageSlider(
    private val imageList: ArrayList<Int>,
    private val viewPager2: ViewPager2,
    private val dotsContainer: LinearLayout
) : RecyclerView.Adapter<ImageAdapterAutoImageSlider.ImageViewHolder>() {

    private var dots = mutableListOf<ImageView>()

    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.image_container, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.imageView.setImageResource(imageList[position])
        setupDots(position)
        if (position == imageList.size - 1) {
            viewPager2.post(runnable)
        }
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    private fun setupDots(currentPosition: Int) {
        dots.forEach { dotsContainer.removeView(it) }
        dots.clear()

        for (i in imageList.indices) {
            val dot = ImageView(dotsContainer.context)
            val params = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            params.setMargins(8, 0, 8, 0)
            dot.layoutParams = params
            dot.setImageResource(if (i == currentPosition) R.drawable.dot_active else R.drawable.dot_inactive)
            dotsContainer.addView(dot)
            dots.add(dot)
        }
    }

    private val runnable = Runnable {
        imageList.addAll(imageList)
        notifyDataSetChanged()
    }
}