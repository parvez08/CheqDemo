package com.example.expandcollapse.droid.total_due

import android.animation.ValueAnimator
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.expandcollapse.R
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

        setSlideDownAnimation()
        Handler().postDelayed({
            binding.incTotalDue.tvTotalDue.visibility = View.VISIBLE
            binding.incTotalDue.tvTotalDueText.visibility = View.VISIBLE
            startCounterAnimation()
        }, 1000)
    }

    private fun setSlideDownAnimation() {
        val animationSlideDown = AnimationUtils.loadAnimation(
            requireContext(),
            R.anim.slide_down_a
        )
        binding.root.startAnimation(animationSlideDown)
        binding.incTotalDue.tvTotalDue.visibility = View.GONE
        binding.incTotalDue.tvTotalDueText.visibility = View.GONE
    }

    private fun startCounterAnimation() {
        val textViewRoll: TextView = binding.incTotalDue.tvTotalDue

        val startValue = 0
        val endValue = 60000
        val animationDurationInSeconds = 1

        val animator = ValueAnimator.ofInt(startValue, endValue)
        animator.duration = animationDurationInSeconds * 1000L // Convert seconds to milliseconds
        animator.addUpdateListener { animation ->
            val currentValue = animation.animatedValue as Int
            textViewRoll.text = buildString {
                append("₹")
                append(currentValue)
            }
        }
        animator.start()

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