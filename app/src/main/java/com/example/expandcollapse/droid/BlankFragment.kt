package com.example.expandcollapse.droid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expandcollapse.R
import com.example.expandcollapse.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
    private lateinit var binding: FragmentBlankBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentBlankBinding.inflate(layoutInflater).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivCtaBack.setOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }
    }

    companion object {
        val TAG2: String? = BlankFragment::class.java.canonicalName

        @JvmStatic
        fun newInstance() =
            BlankFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}