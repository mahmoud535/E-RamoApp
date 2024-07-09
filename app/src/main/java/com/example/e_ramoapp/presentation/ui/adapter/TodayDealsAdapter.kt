package com.example.e_ramoapp.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.e_ramoapp.R
import com.example.e_ramoapp.data.ImageItem

class TodayDealsAdapter (private val imageList: List<ImageItem>) : RecyclerView.Adapter<TodayDealsAdapter.ImageDealsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageDealsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_today_deals, parent, false)
        return ImageDealsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageDealsViewHolder, position: Int) {
        holder.bind(imageList[position])
    }

    override fun getItemCount(): Int = imageList.size

    class ImageDealsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.iv_item_todayDeals_image)

        fun bind(imageItem: ImageItem) {
            imageView.setImageResource(imageItem.imageResId)
        }
    }
}