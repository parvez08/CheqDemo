package com.example.expandcollapse.droid.deals

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.expandcollapse.R
import com.example.expandcollapse.databinding.FragmentFeaturedDealsBinding
import com.example.expandcollapse.droid.deals.adapter.FeaturedDealsAdapter
import com.example.expandcollapse.droid.deals.adapter.OnDealSelectedListenerCallback
import com.example.expandcollapse.droid.deals.models.FeaturedDealsModel
import com.example.expandcollapse.droid.utils.RecyclerViewUtils


class FeaturedDealsFragment : Fragment() {
    private lateinit var binding: FragmentFeaturedDealsBinding
    private var featuredDealsList: ArrayList<FeaturedDealsModel> = arrayListOf()
    private lateinit var mDealsAdapter: FeaturedDealsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentFeaturedDealsBinding.inflate(layoutInflater).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        addVoucherCategoryData(
            R.drawable.swiggy_merch_logo,
            R.drawable.swiggy_merch_illustration,
            1000,
            R.color.cheq_white_a,
            R.color.cheq_yellow
        )
        addVoucherCategoryData(
            R.drawable.subway_merch_logo,
            R.drawable.subway_merch_illustration,
            150,
            R.color.cheq_white_a,
            R.color.cheq_green
        )
        addVoucherCategoryData(
            R.drawable.swiggy_merch_logo,
            R.drawable.swiggy_merch_illustration,
            2000,
            R.color.cheq_white_a,
            R.color.cheq_yellow
        )
        addVoucherCategoryData(
            R.drawable.subway_merch_logo,
            R.drawable.subway_merch_illustration,
            250,
            R.color.cheq_white_a,
            R.color.cheq_green
        )
        mDealsAdapter = FeaturedDealsAdapter(
            featuredDealsList,
            requireContext(),
            object : OnDealSelectedListenerCallback {
                override fun onSelected(position: Int) {

                }

            })
        binding.rvFeaturedDeals.apply {
            adapter = mDealsAdapter
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            RecyclerViewUtils.maximizeEfficiency(this)
        }
    }

    private fun addVoucherCategoryData(
        merchLogo: Int,
        merchIllustration: Int,
        dealPrice: Int,
        merchLogoBg: Int,
        merchIllustrationBg: Int
    ) {
        featuredDealsList.add(
            FeaturedDealsModel(
                merchLogo,
                merchIllustration,
                dealPrice,
                merchLogoBg,
                merchIllustrationBg
            )
        )
    }

    companion object {
        val TAG2: String? = FeaturedDealsFragment::class.java.canonicalName

        @JvmStatic
        fun newInstance() =
            FeaturedDealsFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}