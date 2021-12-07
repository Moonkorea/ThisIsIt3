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


class Question6Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_question6, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.yesBtn).setOnClickListener {

            val bundle = bundleOf("senderkey6.1" to 17)
            setFragmentResult("Question6.1", bundle)
            it.findNavController().navigate(R.id.action_question6Fragment_to_howAboutThisFragment)
        }

        view.findViewById<Button>(R.id.noBtn).setOnClickListener {

            val bundle = bundleOf("senderkey6.2" to 18)
            setFragmentResult("Question6.2", bundle)
            it.findNavController().navigate(R.id.action_question6Fragment_to_howAboutThisFragment)
        }


    }

}