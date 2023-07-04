package com.example.expandcollapse.droid.explore_vouchers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.expandcollapse.R
import com.example.expandcollapse.databinding.FragmentExploreVouchersBinding
import com.example.expandcollapse.droid.BlankFragment
import com.example.expandcollapse.droid.explore_vouchers.adapters.OnSelectedListenerCallback
import com.example.expandcollapse.droid.explore_vouchers.adapters.VouchersAdapter
import com.example.expandcollapse.droid.explore_vouchers.models.VouchersCategoryModel
import com.example.expandcollapse.droid.utils.RecyclerViewUtils


class ExploreVouchersFragment : Fragment() {
    private lateinit var binding: FragmentExploreVouchersBinding
    private var vouchersCategoryList: ArrayList<VouchersCategoryModel> = arrayListOf()
    private lateinit var mVouchersAdapter: VouchersAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentExploreVouchersBinding.inflate(layoutInflater).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        addVoucherCategoryData("Food", R.drawable.food)
        addVoucherCategoryData("Travel", R.drawable.travel)
        addVoucherCategoryData("Shopping", R.drawable.shopping)
        mVouchersAdapter = VouchersAdapter(vouchersCategoryList, requireContext(), object :
            OnSelectedListenerCallback {
            override fun onSelected(position: Int) {
                activity?.supportFragmentManager?.beginTransaction()
                    ?.replace(
                        android.R.id.content,
                        BlankFragment.newInstance(),
                        BlankFragment.TAG2
                    )
                    ?.addToBackStack(TAG2)
                    ?.commit()
            }
        })
        mVouchersAdapter.addItemAtLast(VouchersCategoryModel("See All", R.drawable.see_all))
        binding.rvVouchersCategory.apply {
            adapter = mVouchersAdapter
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            RecyclerViewUtils.maximizeEfficiency(this)
        }
    }

    private fun addVoucherCategoryData(categoryName: String, categoryDrawable: Int) {
        vouchersCategoryList.add(
            VouchersCategoryModel(
                categoryName,
                categoryDrawable
            )
        )
    }

    companion object {
        val TAG2: String? = ExploreVouchersFragment::class.java.canonicalName

        @JvmStatic
        fun newInstance() =
            ExploreVouchersFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}