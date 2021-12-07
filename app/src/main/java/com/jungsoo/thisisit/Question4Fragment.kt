package com.jungsoo.thisisit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.findNavController

class Question4Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_question4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.lunchBtn).setOnClickListener {

            val bundle = bundleOf("senderkey4.1" to 8)
            setFragmentResult("Question4.1", bundle)
            it.findNavController().navigate(R.id.action_question4Fragment_to_question5Fragment)
        }

        view.findViewById<Button>(R.id.dinnerBtn).setOnClickListener {

            val bundle = bundleOf("senderkey4.2" to 9)
            setFragmentResult("Question4.2", bundle)
            it.findNavController().navigate(R.id.action_question4Fragment_to_question5Fragment)
        }

        view.findViewById<Button>(R.id.dateBtn).setOnClickListener {

            val bundle = bundleOf("senderkey4.3" to 10)
            setFragmentResult("Question4.3", bundle)
            it.findNavController().navigate(R.id.action_question4Fragment_to_question5Fragment)
        }

        view.findViewById<Button>(R.id.anniversaryBtn).setOnClickListener {

            val bundle = bundleOf("senderkey4.4" to 11)
            setFragmentResult("Question4.4", bundle)
            it.findNavController().navigate(R.id.action_question4Fragment_to_question5Fragment)
        }

        view.findViewById<Button>(R.id.relieveBtn).setOnClickListener {

            val bundle = bundleOf("senderkey4.5" to 12)
            setFragmentResult("Question4.5", bundle)
            it.findNavController().navigate(R.id.action_question4Fragment_to_question5Fragment)
        }

        view.findViewById<Button>(R.id.drunkBtn).setOnClickListener {

            val bundle = bundleOf("senderkey4.6" to 13)
            setFragmentResult("Question4.6", bundle)
            it.findNavController().navigate(R.id.action_question4Fragment_to_question5Fragment)
        }

    }

}