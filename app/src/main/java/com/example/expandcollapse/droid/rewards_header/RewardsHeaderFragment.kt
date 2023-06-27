package com.example.expandcollapse.droid.rewards_header

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expandcollapse.databinding.FragmentRewardsHeaderBinding


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