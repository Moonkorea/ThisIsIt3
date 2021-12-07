package com.jungsoo.thisisit

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class CategoryFragmentStateAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){
    // var fragments : ArrayList<Fragment> = ArrayList()

    override fun getItemCount(): Int {
        return 8
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> CategoryDetailTotalFragment()
            1 -> CategoryDetailKoreaFragment()
            2 -> CategoryDetailJapanFragment()
            3 -> CategoryDetailChinaFragment()
            4 -> CategoryDetailWestFragment()
            5 -> CategoryDetailAsiaFragment()
            6 -> CategoryDetailAlcoholFragment()
            7 -> CategoryDetailDessertFragment()
            else -> CategoryDetailTotalFragment()
        }
    }
}