package com.example.expandcollapse.droid.credit_score

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.example.expandcollapse.R
import com.example.expandcollapse.databinding.FragmentCreditScoreBinding


class CreditScoreFragment : Fragment() {
    private lateinit var binding: FragmentCreditScoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentCreditScoreBinding.inflate(layoutInflater).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val animationSlideDown = AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.slide_up
        )
        binding.root.startAnimation(animationSlideDown)
    }

    companion object {
        val TAG2: String? = CreditScoreFragment::class.java.canonicalName

        @JvmStatic
        fun newInstance() =
            CreditScoreFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}