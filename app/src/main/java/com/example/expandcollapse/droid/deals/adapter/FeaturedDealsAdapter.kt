package com.example.expandcollapse.droid.deals.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.expandcollapse.databinding.RowFeaturedDealsItemBinding
import com.example.expandcollapse.droid.deals.models.FeaturedDealsModel
import com.squareup.picasso.Picasso


internal class FeaturedDealsAdapter(
    private var selectedDeals: ArrayList<FeaturedDealsModel>,
    private var context: Context,
    private var mOnSelectedListenerCallback: OnDealSelectedListenerCallback
) :
    RecyclerView.Adapter<FeaturedDealsAdapter.DealsItemViewHolder>() {

    inner class DealsItemViewHolder(private val dealsBinding: RowFeaturedDealsItemBinding) :
        RecyclerView.ViewHolder(dealsBinding.root) {

        fun bind(featuredDealsSource: FeaturedDealsModel) {
            dealsBinding.apply {
                Picasso.get()
                    .load(featuredDealsSource.merchLogo)
                    .into(ivMerchLogo)
                Picasso.get()
                    .load(featuredDealsSource.merchIllustration)
                    .into(ivMerchIllustration)
                vLogoBg.backgroundTintList = ContextCompat.getColorStateList(
                    context,
                    featuredDealsSource.merchLogoBg
                )
                vIllustrationBg.backgroundTintList = ContextCompat.getColorStateList(
                    context,
                    featuredDealsSource.merchIllustrationBg
                )
                tvPrice.text = featuredDealsSource.dealPrice.toString()

                root.setOnClickListener {
                    mOnSelectedListenerCallback.onSelected(adapterPosition)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DealsItemViewHolder {
        val dealsBinding = RowFeaturedDealsItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return DealsItemViewHolder(dealsBinding)
    }


    override fun onBindViewHolder(holder: DealsItemViewHolder, position: Int) {
        val dealsItemModel = selectedDeals[position]
        holder.bind(dealsItemModel)
    }

    override fun getItemCount(): Int {
        return selectedDeals.size
    }

    fun addItemAtLast(dealsModel: FeaturedDealsModel) {
        selectedDeals.add(dealsModel)
        notifyItemInserted(selectedDeals.size - 1)
    }

}

interface OnDealSelectedListenerCallback {
    fun onSelected(position: Int)
}