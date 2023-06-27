package com.example.expandcollapse.droid.deals

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expandcollapse.databinding.FragmentFeaturedDealsBinding


class FeaturedDealsFragment : Fragment() {
    private lateinit var binding: FragmentFeaturedDealsBinding

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