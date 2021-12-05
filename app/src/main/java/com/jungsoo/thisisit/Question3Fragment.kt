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

       /* view.findViewById<Button>(R.id.oilBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question3Fragment_to_question4Fragment)
        }

        view.findViewById<Button>(R.id.notOilBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question3Fragment_to_question4Fragment)
        }

        view.findViewById<Button>(R.id.noMatterBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_question3Fragment_to_question4Fragment)
        }*/

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.oilBtn).setOnClickListener {

            val bundle = bundleOf("senderkey3.1" to 5)
            setFragmentResult("Question3.1", bundle)
            it.findNavController().navigate(R.id.action_question3Fragment_to_question4Fragment)
        }

        view.findViewById<Button>(R.id.notOilBtn).setOnClickListener {

            val bundle = bundleOf("senderkey3.2" to 6)
            setFragmentResult("Question3.2", bundle)
            it.findNavController().navigate(R.id.action_question3Fragment_to_question4Fragment)
        }

        view.findViewById<Button>(R.id.noMatterBtn).setOnClickListener {

            val bundle = bundleOf("senderkey3.3" to 7)
            setFragmentResult("Question3.3", bundle)
            it.findNavController().navigate(R.id.action_question3Fragment_to_question4Fragment)
        }

    }

}