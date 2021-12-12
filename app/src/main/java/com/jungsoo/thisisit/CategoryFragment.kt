package com.jungsoo.thisisit

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_category.*
import kotlinx.android.synthetic.main.fragment_question.*

class CategoryFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

        override fun onActivityCreated(savedInstanceState: Bundle?) {
            super.onActivityCreated(savedInstanceState)

            totalBtn.setOnClickListener {
                activity?.let{
                    val intent = Intent(context, CategoryHomeActivity::class.java)
                    startActivity(intent)
                }
            }

            koreaBtn.setOnClickListener {
                activity?.let{
                    val intent = Intent(context, CategoryHomeActivity::class.java)
                    intent.putExtra("korea", 1)
                    startActivity(intent)
                }
            }

            japanBtn.setOnClickListener {
                activity?.let{
                    val intent = Intent(context, CategoryHomeActivity::class.java)
                    intent.putExtra("japan", 2)
                    startActivity(intent)
                }
            }

            chinaBtn.setOnClickListener {
                activity?.let{
                    val intent = Intent(context, CategoryHomeActivity::class.java)
                    startActivity(intent)
                }
            }

            westBtn.setOnClickListener {
                activity?.let{
                    val intent = Intent(context, CategoryHomeActivity::class.java)
                    startActivity(intent)
                }
            }

            asiaBtn.setOnClickListener {
                activity?.let{
                    val intent = Intent(context, CategoryHomeActivity::class.java)
                    startActivity(intent)
                }
            }

            alcoholBtn.setOnClickListener {
                activity?.let{
                    val intent = Intent(context, CategoryHomeActivity::class.java)
                    startActivity(intent)
                }
            }

            dessertBtn.setOnClickListener {
                activity?.let{
                    val intent = Intent(context, CategoryHomeActivity::class.java)
                    startActivity(intent)
                }
            }


    }
}