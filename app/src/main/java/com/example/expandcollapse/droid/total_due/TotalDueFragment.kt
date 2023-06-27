package com.example.expandcollapse.droid.total_due

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expandcollapse.databinding.FragmentTotalDueBinding


class TotalDueFragment : Fragment() {
    private lateinit var binding: FragmentTotalDueBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentTotalDueBinding.inflate(layoutInflater).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object {
        val TAG2: String? = TotalDueFragment::class.java.canonicalName

        @JvmStatic
        fun newInstance() =
            TotalDueFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}