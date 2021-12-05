package com.jungsoo.thisisit

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.ActivityNavigator
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import org.json.JSONArray
import java.util.Random

class RandomFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_random, container, false)



        view.findViewById<Button>(R.id.questionBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_randomFragment_to_questionFragment)
        }

        view.findViewById<Button>(R.id.categoryBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_randomFragment_to_categoryFragment)
        }



        return view


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val randomSelectBtn = view?.findViewById<Button>(R.id.randomSelectBtn)

        randomSelectBtn?.setOnClickListener {

            val intent = Intent(context, RandomHowAboutThisActivity::class.java)
            startActivity(intent)

        }
    }

}