package com.andriawan24.onboardtutorial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.onboarding_item_container.view.*

class OnBoardingItemsAdapter(private val onBoardingItems: List<OnBoardingItem>) :
RecyclerView.Adapter<OnBoardingItemsAdapter.OnBoardingItemViewHolder>() {

    inner class OnBoardingItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(onBoardingItem: OnBoardingItem) {
            itemView.imgOnBoarding.setImageResource(onBoardingItem.onBoardingImage)
            itemView.textTitle.text = onBoardingItem.title
            itemView.textDescription.text = onBoardingItem.description
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingItemViewHolder {
        return OnBoardingItemViewHolder(
                LayoutInflater.from(parent.context).inflate(
                        R.layout.onboarding_item_container,
                        parent,
                        false
                )
        )
    }

    override fun onBindViewHolder(holder: OnBoardingItemViewHolder, position: Int) {
        holder.bind(onBoardingItems.get(position))
    }

    override fun getItemCount(): Int {
        return onBoardingItems.size
    }

}