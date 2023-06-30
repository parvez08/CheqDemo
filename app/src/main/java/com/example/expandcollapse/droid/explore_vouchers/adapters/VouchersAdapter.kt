package com.example.expandcollapse.droid.explore_vouchers.adapters

import android.animation.AnimatorInflater
import android.animation.StateListAnimator
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.expandcollapse.R
import com.example.expandcollapse.databinding.RowVouchersCategoryItemBinding
import com.example.expandcollapse.droid.explore_vouchers.models.VouchersCategoryModel
import com.squareup.picasso.Picasso


internal class VouchersAdapter(
    private var selectedVouchers: ArrayList<VouchersCategoryModel>,
    private var context: Context,
    private var mOnSelectedListenerCallback: OnSelectedListenerCallback
) :
    RecyclerView.Adapter<VouchersAdapter.VouchersItemViewHolder>() {

    inner class VouchersItemViewHolder(private val vouchersBinding: RowVouchersCategoryItemBinding) :
        RecyclerView.ViewHolder(vouchersBinding.root) {

        fun bind(selectedNewsSource: VouchersCategoryModel) {
            vouchersBinding.apply {
                Picasso.get()
                    .load(selectedNewsSource.categoryImage)
                    .into(ivCategoryImage)
                tvCategory.text = selectedNewsSource.categoryName

                root.setOnLongClickListener {
                    val stateListAnimator: StateListAnimator =
                        AnimatorInflater.loadStateListAnimator(
                            context,
                            R.animator.selector_item_animation
                        )
                    itemView.stateListAnimator = stateListAnimator
                    true
                }
                root.setOnClickListener {
                    mOnSelectedListenerCallback.onSelected(adapterPosition)
                    val stateListAnimator: StateListAnimator =
                        AnimatorInflater.loadStateListAnimator(
                            context,
                            R.animator.selector_item_animation
                        )
                    itemView.stateListAnimator = stateListAnimator
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VouchersItemViewHolder {
        val vouchersBinding = RowVouchersCategoryItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return VouchersItemViewHolder(vouchersBinding)
    }


    override fun onBindViewHolder(holder: VouchersItemViewHolder, position: Int) {
        val vouchersItemModel = selectedVouchers[position]
        holder.bind(vouchersItemModel)
    }

    override fun getItemCount(): Int {
        return selectedVouchers.size
    }

    fun addItemAtLast(vouchersModel: VouchersCategoryModel) {
        selectedVouchers.add(vouchersModel)
        notifyItemInserted(selectedVouchers.size - 1)
    }

}

interface OnSelectedListenerCallback {
    fun onSelected(position: Int)
}