package com.example.e_ramoapp.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.e_ramoapp.R
import com.example.e_ramoapp.data.model.ImageItem

class CouponsAdapter(private val imageList: List<ImageItem>) : RecyclerView.Adapter<CouponsAdapter.ImageCouponsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageCouponsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_coupons_in_egypt, parent, false)
        return ImageCouponsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageCouponsViewHolder, position: Int) {
        holder.bind(imageList[position])
    }

    override fun getItemCount(): Int = imageList.size

    class ImageCouponsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.iv_item_Coupons_image)

        fun bind(imageItem: ImageItem) {
            imageView.setImageResource(imageItem.imageResId)
        }
    }
}