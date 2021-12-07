package com.jungsoo.thisisit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.findNavController
import com.jungsoo.thisisit.QuestionFragment

class Question2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_question2, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.yesBtn).setOnClickListener {

            val bundle = bundleOf("senderkey2.1" to 3)
            setFragmentResult("Question2.1", bundle)
            it.findNavController().navigate(R.id.action_question2Fragment_to_question3Fragment)
        }

        view.findViewById<Button>(R.id.noBtn).setOnClickListener {

            val bundle = bundleOf("senderkey2.2" to 4)
            setFragmentResult("Question2.2", bundle)
            it.findNavController().navigate(R.id.action_question2Fragment_to_question3Fragment)
        }

    }

}