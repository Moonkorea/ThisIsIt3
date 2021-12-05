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

class Question5Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_question5, container, false)

        view.findViewById<Button>(R.id.categoryBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question5Fragment_to_categoryFragment)
        }

        view.findViewById<Button>(R.id.randomBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question5Fragment_to_randomFragment)
        }

        /*view.findViewById<Button>(R.id.HSBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question5Fragment_to_question6Fragment)
        }

        view.findViewById<Button>(R.id.SSBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question5Fragment_to_question6Fragment)
        }

        view.findViewById<Button>(R.id.otherBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question5Fragment_to_question6Fragment)
        }*/


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.HSBtn).setOnClickListener {

            val bundle = bundleOf("senderkey5.1" to 14)
            setFragmentResult("Question5.1", bundle)
            it.findNavController().navigate(R.id.action_question5Fragment_to_question6Fragment)
        }

        view.findViewById<Button>(R.id.SSBtn).setOnClickListener {

            val bundle = bundleOf("senderkey5.2" to 15)
            setFragmentResult("Question5.2", bundle)
            it.findNavController().navigate(R.id.action_question5Fragment_to_question6Fragment)
        }

        view.findViewById<Button>(R.id.otherBtn).setOnClickListener {

            val bundle = bundleOf("senderkey5.3" to 16)
            setFragmentResult("Question5.3", bundle)
            it.findNavController().navigate(R.id.action_question5Fragment_to_question6Fragment)
        }

    }


}