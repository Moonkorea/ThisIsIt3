package com.jungsoo.thisisit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class QuestionFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_question, container, false)


        view.findViewById<Button>(R.id.categoryBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_questionFragment_to_categoryFragment)
        }

        view.findViewById<Button>(R.id.randomBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_questionFragment_to_randomFragment)
        }

        view.findViewById<Button>(R.id.mealBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_questionFragment_to_question2Fragment)
        }

        view.findViewById<Button>(R.id.dessertBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_questionFragment_to_question2Fragment)
        }

        return view
    }




}