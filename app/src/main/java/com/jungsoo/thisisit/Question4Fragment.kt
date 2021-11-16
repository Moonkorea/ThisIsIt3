package com.jungsoo.thisisit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class Question4Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_question4, container, false)

        view.findViewById<Button>(R.id.categoryBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question4Fragment_to_categoryFragment)
        }

        view.findViewById<Button>(R.id.randomBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question4Fragment_to_randomFragment)
        }

        view.findViewById<Button>(R.id.lunchBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question4Fragment_to_question5Fragment)
        }

        view.findViewById<Button>(R.id.dinnerBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question4Fragment_to_question5Fragment)
        }

        view.findViewById<Button>(R.id.dateBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question4Fragment_to_question5Fragment)
        }

        view.findViewById<Button>(R.id.anniversaryBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question4Fragment_to_question5Fragment)
        }

        view.findViewById<Button>(R.id.relieveBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question4Fragment_to_question5Fragment)
        }

        view.findViewById<Button>(R.id.drunkBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question4Fragment_to_question5Fragment)
        }


        return view
    }

}