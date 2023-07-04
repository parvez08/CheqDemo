package com.example.expandcollapse.droid.rewards_header

import android.animation.AnimatorInflater
import android.animation.StateListAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expandcollapse.R
import com.example.expandcollapse.databinding.FragmentRewardsHeaderBinding
import com.example.expandcollapse.droid.BlankFragment
import com.example.expandcollapse.droid.explore_vouchers.ExploreVouchersFragment


class RewardsHeaderFragment : Fragment() {
    private lateinit var binding: FragmentRewardsHeaderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentRewardsHeaderBinding.inflate(layoutInflater).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setCta()
    }

    private fun setCta() {
        binding.clCtaGetCashInstant.setOnLongClickListener {
            val stateListAnimator: StateListAnimator =
                AnimatorInflater.loadStateListAnimator(
                    context,
                    R.animator.selector_item_animation
                )
            binding.clCtaGetCashInstant.stateListAnimator = stateListAnimator
            true
        }
        binding.clCtaGetCashInstant.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(
                    android.R.id.content,
                    BlankFragment.newInstance(),
                    BlankFragment.TAG2
                )
                ?.addToBackStack(ExploreVouchersFragment.TAG2)
                ?.commit()
        }

    }

    companion object {
        val TAG2: String? = RewardsHeaderFragment::class.java.canonicalName

        @JvmStatic
        fun newInstance() =
            RewardsHeaderFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}