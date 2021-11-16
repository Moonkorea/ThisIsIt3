package com.jungsoo.thisisit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.jungsoo.thisisit.QuestionFragment

class Question2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_question2, container, false)

        view.findViewById<Button>(R.id.categoryBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question2Fragment_to_categoryFragment)
        }

        view.findViewById<Button>(R.id.randomBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question2Fragment_to_randomFragment)
        }

        view.findViewById<Button>(R.id.yesBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question2Fragment_to_question3Fragment)
        }

        view.findViewById<Button>(R.id.noBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question2Fragment_to_question3Fragment)
        }

        return view
    }


}