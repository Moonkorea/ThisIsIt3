package com.jungsoo.thisisit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.findNavController


class CategoryDetailDessertFragment : Fragment() {

    private val foodlist = arrayOf("초코케이크", "딸기케이크","슈톨렌", "마카롱","도넛", "아이스크림","티라미수",
        "브라우니","팥빙수","젤라토","타꼬야끼","나쵸","화채","카나페")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_category_detail_dessert, container, false)

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