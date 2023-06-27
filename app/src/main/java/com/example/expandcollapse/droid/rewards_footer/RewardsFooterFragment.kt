package com.example.expandcollapse.droid.rewards_footer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expandcollapse.databinding.FragmentRewardsFooterBinding


class RewardsFooterFragment : Fragment() {
    private lateinit var binding: FragmentRewardsFooterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentRewardsFooterBinding.inflate(layoutInflater).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object {
        val TAG2: String? = RewardsFooterFragment::class.java.canonicalName

        @JvmStatic
        fun newInstance() =
            RewardsFooterFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}