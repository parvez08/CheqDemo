package com.example.expandcollapse.droid.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expandcollapse.databinding.FragmentHomeBinding
import com.example.expandcollapse.droid.action_recommended.ActionRecommendedFragment
import com.example.expandcollapse.droid.credit_score.CreditScoreFragment
import com.example.expandcollapse.droid.total_due.TotalDueFragment

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentHomeBinding.inflate(layoutInflater).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        renderFragments()
    }

    private fun renderFragments() {

        val totalDueFragmentInstance = TotalDueFragment.newInstance()
        childFragmentManager.beginTransaction().replace(
            binding.flTotalDue.id,
            totalDueFragmentInstance,
            TotalDueFragment.TAG2
        ).commitAllowingStateLoss()

        val creditScoreFragmentInstance = CreditScoreFragment.newInstance()
        childFragmentManager.beginTransaction().replace(
            binding.flCreditScore.id,
            creditScoreFragmentInstance,
            CreditScoreFragment.TAG2
        ).commitAllowingStateLoss()

        val actionRecomFragmentInstance = ActionRecommendedFragment.newInstance()
        childFragmentManager.beginTransaction().replace(
            binding.flActionRecommended.id,
            actionRecomFragmentInstance,
            ActionRecommendedFragment.TAG2
        ).commitAllowingStateLoss()

    }

    companion object {
        val TAG2: String? = HomeFragment::class.java.canonicalName

        @JvmStatic
        fun newInstance() =
            HomeFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}