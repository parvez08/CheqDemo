package com.example.expandcollapse.droid.credit_score

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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