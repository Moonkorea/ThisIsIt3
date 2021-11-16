package com.jungsoo.thisisit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class CategoryFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_category, container, false)

        view.findViewById<Button>(R.id.questionBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryFragment_to_questionFragment)
        }

        view.findViewById<Button>(R.id.randomBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryFragment_to_randomFragment)
        }

        return view
    }



}