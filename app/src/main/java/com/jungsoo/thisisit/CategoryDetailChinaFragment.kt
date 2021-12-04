package com.jungsoo.thisisit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.findNavController

class CategoryDetailChinaFragment : Fragment() {

    private val foodlist = arrayOf("짜장면","짬뽕", "마라탕","볶음짬뽕", "쟁반짜장","볶음밥", "짜장밥","송이덮밥", "마파두부밥","잡채밥", "탕수육","꿔바로우", "깐풍기","라조기", "유산슬","팔보채", "양장피",
        "깐쇼새우", "난자완스","동파육", "멘보샤","양꼬치", "훠궈")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_category_detail_china, container, false)

        view.findViewById<Button>(R.id.randomBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryDetailChinaFragment_to_randomFragment)
        }

        view.findViewById<Button>(R.id.questionBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryDetailChinaFragment_to_questionFragment)
        }

        view.findViewById<Button>(R.id.categoryBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_categoryDetailChinaFragment_to_categoryFragment)
        }

        val searchView = view.findViewById<SearchView>(R.id.searchView)

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

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (foodlist.contains(query)) {
                    if (adapter != null) {
                        adapter.filter.filter(query)
                    }
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (adapter != null) {
                    adapter.filter.filter(newText)
                }
                return false
            }

        })

        return view
    }

}