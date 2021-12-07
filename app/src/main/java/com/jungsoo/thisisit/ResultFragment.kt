package com.jungsoo.thisisit

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class ResultFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_result, container, false)


        view.findViewById<Button>(R.id.randomBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_resultFragment_to_randomFragment)
        }

        val shareBtn = view.findViewById<Button>(R.id.shareBtn)

        shareBtn.setOnClickListener {
            val Sharing_intent = Intent(Intent.ACTION_SEND)

            Sharing_intent.addCategory(Intent.CATEGORY_DEFAULT)
            Sharing_intent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.jungsoo.thisisit")
            val path = "image/png"
            Sharing_intent.putExtra(Intent.EXTRA_STREAM, Uri.parse(path))
            Sharing_intent.setPackage("com.kakao.talk")
            Sharing_intent.putExtra(Intent.EXTRA_TITLE, "제목")
            Sharing_intent.setType("image/png")
            startActivity(Intent.createChooser(Sharing_intent, "앱을 선택해 주세요"))
        }


        return view
    }

}