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


class Question1Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.mealBtn).setOnClickListener {

            val bundle = bundleOf("senderkey1.1" to 1)
            setFragmentResult("Question1.1", bundle)
            it.findNavController().navigate(R.id.action_question1Fragment_to_question2Fragment)
        }

        view.findViewById<Button>(R.id.dessertBtn).setOnClickListener {

            val bundle = bundleOf("senderkey1.2" to 2)
            setFragmentResult("Question1.2", bundle)
            it.findNavController().navigate(R.id.action_question1Fragment_to_question2Fragment)
        }

    }

}