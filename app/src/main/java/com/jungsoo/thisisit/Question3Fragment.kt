package com.jungsoo.thisisit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class Question3Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_question3, container, false)

        view.findViewById<Button>(R.id.categoryBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question3Fragment_to_categoryFragment)
        }

        view.findViewById<Button>(R.id.randomBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question3Fragment_to_randomFragment)
        }

        view.findViewById<Button>(R.id.time1Btn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question3Fragment_to_question4Fragment)
        }

        view.findViewById<Button>(R.id.time2Btn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question3Fragment_to_question4Fragment)
        }

        view.findViewById<Button>(R.id.time3Btn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question3Fragment_to_question4Fragment)
        }

        return view
    }

}