package com.jungsoo.thisisit

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerFragmentStateAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){
    // var fragments : ArrayList<Fragment> = ArrayList()

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> QuestionFragment()
            1 -> CategoryFragment()
            2 -> RandomFragment()
            else -> QuestionFragment()
        }
    }
}