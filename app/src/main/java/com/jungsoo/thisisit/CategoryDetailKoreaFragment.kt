package com.jungsoo.thisisit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.findNavController

class CategoryDetailKoreaFragment : Fragment() {

    private val foodlist = arrayOf("김치찌개","된장찌개", "부대찌개","순두부찌개", "비지찌개","뼈해장국", "선짓국","순대국밥", "콩나물국밥","돼지국밥", "떡국","떡만두국", "미역국","청국장",
        "갈비탕", "감자탕", "곰탕","닭곰탕", "닭볶음탕","매운탕", "삼계탕","설렁탕", "알탕","육개장","조개탕","추어탕", "아구찜","해물찜", "갈비찜","곱창전골", "불고기","육회", "돼지갈비","삼겹살",
        "제육볶음", "돼지두루치기", "보쌈","편육", "족발","닭갈비", "닭발","오리고기", "소고기","대하구이", "닭국수","막국수", "비빔국수","잔치국수", "콩국수","물냉면", "비빔냉면","밀면",
        "잡채","칼국수", "수제비","김밥", "충무김밥","떡볶이", "순대","튀김", "오뎅","쫄면", "라면","밥버거", "김치볶음밥","곤드레밥", "돌솥비빔밥","전주비빔밥",
        "오므라이스","닭죽", "전복죽","팥죽", "계란말이","계란찜", "김치전","파전", "감자전","육전", "생선전","동그랑땡", "생선조림","양념게장",
        "간장게장","오징어볶음", "장어구이","생선구이", "만두")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_category_detail_korea, container, false)

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