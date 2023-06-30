package com.example.expandcollapse.droid.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expandcollapse.databinding.FragmentRewardsBinding
import com.example.expandcollapse.droid.deals.FeaturedDealsFragment
import com.example.expandcollapse.droid.deals.OtherFeaturedDealsFragment
import com.example.expandcollapse.droid.explore_vouchers.ExploreVouchersFragment
import com.example.expandcollapse.droid.rewards_footer.RewardsFooterFragment
import com.example.expandcollapse.droid.rewards_header.RewardsHeaderFragment

class RewardsFragment : Fragment() {
    private lateinit var binding: FragmentRewardsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentRewardsBinding.inflate(layoutInflater).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        renderFragments()
    }

    private fun renderFragments() {
        val rewardsHeaderInstance = RewardsHeaderFragment.newInstance()
        childFragmentManager.beginTransaction().replace(
            binding.flRewardsHeader.id,
            rewardsHeaderInstance,
            RewardsHeaderFragment.TAG2
        ).commitAllowingStateLoss()

        val exploreVouchersInstance = ExploreVouchersFragment.newInstance()
        childFragmentManager.beginTransaction().replace(
            binding.flExploreVouchers.id,
            exploreVouchersInstance,
            ExploreVouchersFragment.TAG2
        ).commitAllowingStateLoss()

        val featuredDealsInstance = FeaturedDealsFragment.newInstance()
        childFragmentManager.beginTransaction().replace(
            binding.flFeaturedDeals.id,
            featuredDealsInstance,
            FeaturedDealsFragment.TAG2
        ).commitAllowingStateLoss()

        val otherFeaturedDealsInstance = OtherFeaturedDealsFragment.newInstance()
        childFragmentManager.beginTransaction().replace(
            binding.flOtherFeaturedDeals.id,
            otherFeaturedDealsInstance,
            OtherFeaturedDealsFragment.TAG2
        ).commitAllowingStateLoss()

        val rewardsFooterInstance = RewardsFooterFragment.newInstance()
        childFragmentManager.beginTransaction().replace(
            binding.flRewardsFooter.id,
            rewardsFooterInstance,
            RewardsFooterFragment.TAG2
        ).commitAllowingStateLoss()

    }

    companion object {
        val TAG2: String? = RewardsFragment::class.java.canonicalName

        @JvmStatic
        fun newInstance() =
            RewardsFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}