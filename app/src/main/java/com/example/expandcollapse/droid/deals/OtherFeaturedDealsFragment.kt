package com.example.expandcollapse.droid.deals

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expandcollapse.databinding.FragmentOtherFeaturedDealsBinding


class OtherFeaturedDealsFragment : Fragment() {
    private lateinit var binding: FragmentOtherFeaturedDealsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentOtherFeaturedDealsBinding.inflate(layoutInflater).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object {
        val TAG2: String? = OtherFeaturedDealsFragment::class.java.canonicalName

        @JvmStatic
        fun newInstance() =
            OtherFeaturedDealsFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}