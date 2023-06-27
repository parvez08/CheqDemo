package com.example.expandcollapse.droid.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expandcollapse.databinding.FragmentHomeHeaderBinding

class HomeHeaderFragment : Fragment() {
    private lateinit var binding: FragmentHomeHeaderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentHomeHeaderBinding.inflate(layoutInflater).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object {
        val TAG2: String? = HomeHeaderFragment::class.java.canonicalName

        @JvmStatic
        fun newInstance() =
            HomeHeaderFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}