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

        view.findViewById<Button>(R.id.alcoholBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryFragment_to_categoryDetailAlcoholFragment)
        }

        view.findViewById<Button>(R.id.asiaBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryFragment_to_categoryDetailAsiaFragment)
        }

        view.findViewById<Button>(R.id.chinaBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryFragment_to_categoryDetailChinaFragment)
        }

        view.findViewById<Button>(R.id.dessertBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryFragment_to_categoryDetailDessertFragment)
        }

        view.findViewById<Button>(R.id.japanBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryFragment_to_categoryDetailJapanFragment)
        }

        view.findViewById<Button>(R.id.koreaBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryFragment_to_categoryDetailKoreaFragment)
        }

        view.findViewById<Button>(R.id.totalBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryFragment_to_categoryDetailTotalFragment)
        }

        view.findViewById<Button>(R.id.westBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryFragment_to_categoryDetailWestFragment)
        }

        return view
    }



}