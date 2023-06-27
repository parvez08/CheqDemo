package com.example.expandcollapse.droid.action_recommended

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expandcollapse.databinding.FragmentActionRecommendedBinding


class ActionRecommendedFragment : Fragment() {
    private lateinit var binding: FragmentActionRecommendedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentActionRecommendedBinding.inflate(layoutInflater).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object {
        val TAG2: String? = ActionRecommendedFragment::class.java.canonicalName

        @JvmStatic
        fun newInstance() =
            ActionRecommendedFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}