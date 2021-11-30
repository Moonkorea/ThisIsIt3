package com.jungsoo.thisisit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.navigation.findNavController


class CategoryDetailWestFragment : Fragment() {

    private val foodlist = arrayOf("피자", "햄버거","수제버거", "감바스","볼로네제", "아라비아따","로제파스타", "까르보나라","알리오올리오",
        "봉골레","뉴욕스트립", "포터하우스","T-bone스테이크", "L-bone스테이크","필레미뇽", "샤토브리앙","탑서로인", "캘리포니아 트라이팁","립아이", "백립","척아이롤", "샌드위치","샐러드",
        "크림스프","리조또", "타코","퀘사디아", "브리또","바비큐", "슈바인스학세","랍스타")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_category_detail_west, container, false)

        view.findViewById<Button>(R.id.randomBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryDetailWestFragment_to_randomFragment)
        }

        view.findViewById<Button>(R.id.questionBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryDetailWestFragment_to_questionFragment)
        }

        view.findViewById<Button>(R.id.categoryBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryDetailWestFragment_to_categoryFragment)
        }

        val adapter = activity?.let { ArrayAdapter(it, android.R.layout.simple_list_item_1, foodlist) }

        val listview = view.findViewById(R.id.foodListTotal) as ListView


        listview.adapter = adapter

        listview.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, v: View, position: Int, id: Long) {

                // get TextView's Text.
                val strText = parent.getItemAtPosition(position) as String

                // TODO : use strText
            }
        }

        return view
    }

}