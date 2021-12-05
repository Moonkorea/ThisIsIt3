package com.jungsoo.thisisit

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.findNavController
import org.json.JSONArray
import java.util.*

class HowAboutThisFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_how_about_this, container, false)

        view.findViewById<Button>(R.id.categoryBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_howAboutThisFragment_to_categoryFragment)
        }

        view.findViewById<Button>(R.id.randomBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_howAboutThisFragment_to_randomFragment)
        }

        /*view.findViewById<Button>(R.id.chooseBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_howAboutThisFragment_to_resultFragment)
        }*/


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val assetManager = resources.assets
        val inputStream= assetManager.open("fooddata.json")
        val jsonString = inputStream.bufferedReader().use { it.readText() }
        val jsonArray = JSONArray(jsonString)
        val foodarray = arrayOfNulls<String>(jsonArray.length())// 알레르기정보를 제외한 음식 정보 배열로 저장, 제외된 음식자리는 NULL로 대체




        setFragmentResultListener("Question1.1") { key, bundle ->
            bundle.getInt("senderKey1.1").let { value ->
                var value1 = value

                setFragmentResultListener("Question2.1") { key, bundle ->
                    bundle.getInt("senderKey2.1").let { value ->
                        var value1 = value

                        setFragmentResultListener("Question3.1") { key, bundle ->
                            bundle.getInt("senderKey3.1").let { value ->
                                var value1 = value

                                setFragmentResultListener("Question4.1") { key, bundle ->
                                    bundle.getInt("senderKey4.1").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                        val userallergy = arrayOf(0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
                                                        for(index in 0 until jsonArray.length()){
                                                            val jsonObject = jsonArray.getJSONObject(index)
                                                            val allergy = jsonObject.getJSONArray("allergy")
                                                            var j = 0
                                                            for (i in 0 until 21) {
                                                                if((allergy[i] == userallergy[i])&&(allergy[i]==1)){
                                                                    j += 1
                                                                }
                                                            }
                                                            if(j==0){
                                                                foodarray[index] = jsonObject.toString()
                                                            }
                                                        }
                                                        Log.d("foodarray", Arrays.toString(foodarray))

                                                    }



                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.2") { key, bundle ->
                                    bundle.getInt("senderKey4.2").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.3") { key, bundle ->
                                    bundle.getInt("senderKey4.3").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.4") { key, bundle ->
                                    bundle.getInt("senderKey4.4").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.5") { key, bundle ->
                                    bundle.getInt("senderKey4.5").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.6") { key, bundle ->
                                    bundle.getInt("senderKey4.6").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                            setFragmentResultListener("Question3.2") { key, bundle ->
                                bundle.getInt("senderKey3.2").let { value ->
                                    var value1 = value

                                    setFragmentResultListener("Question4.1") { key, bundle ->
                                        bundle.getInt("senderKey4.1").let { value ->
                                            var value1 = value

                                            setFragmentResultListener("Question5.1") { key, bundle ->
                                                bundle.getInt("senderKey5.1").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.2") { key, bundle ->
                                                bundle.getInt("senderKey5.2").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.3") { key, bundle ->
                                                bundle.getInt("senderKey5.3").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                    setFragmentResultListener("Question4.2") { key, bundle ->
                                        bundle.getInt("senderKey4.2").let { value ->
                                            var value1 = value

                                            setFragmentResultListener("Question5.1") { key, bundle ->
                                                bundle.getInt("senderKey5.1").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.2") { key, bundle ->
                                                bundle.getInt("senderKey5.2").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.3") { key, bundle ->
                                                bundle.getInt("senderKey5.3").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                    setFragmentResultListener("Question4.3") { key, bundle ->
                                        bundle.getInt("senderKey4.3").let { value ->
                                            var value1 = value

                                            setFragmentResultListener("Question5.1") { key, bundle ->
                                                bundle.getInt("senderKey5.1").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.2") { key, bundle ->
                                                bundle.getInt("senderKey5.2").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.3") { key, bundle ->
                                                bundle.getInt("senderKey5.3").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                    setFragmentResultListener("Question4.4") { key, bundle ->
                                        bundle.getInt("senderKey4.4").let { value ->
                                            var value1 = value

                                            setFragmentResultListener("Question5.1") { key, bundle ->
                                                bundle.getInt("senderKey5.1").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.2") { key, bundle ->
                                                bundle.getInt("senderKey5.2").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.3") { key, bundle ->
                                                bundle.getInt("senderKey5.3").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                    setFragmentResultListener("Question4.5") { key, bundle ->
                                        bundle.getInt("senderKey4.5").let { value ->
                                            var value1 = value

                                            setFragmentResultListener("Question5.1") { key, bundle ->
                                                bundle.getInt("senderKey5.1").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.2") { key, bundle ->
                                                bundle.getInt("senderKey5.2").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.3") { key, bundle ->
                                                bundle.getInt("senderKey5.3").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                    setFragmentResultListener("Question4.6") { key, bundle ->
                                        bundle.getInt("senderKey4.6").let { value ->
                                            var value1 = value

                                                setFragmentResultListener("Question5.1") { key, bundle ->
                                                    bundle.getInt("senderKey5.1").let { value ->
                                                        var value1 = value

                                                        setFragmentResultListener("Question6.1") { key, bundle ->
                                                            bundle.getInt("senderKey6.1").let { value ->
                                                                var value1 = value

                                                            }

                                                        }

                                                        setFragmentResultListener("Question6.2") { key, bundle ->
                                                            bundle.getInt("senderKey6.2").let { value ->
                                                                var value1 = value

                                                            }

                                                        }

                                                    }

                                                }

                                            setFragmentResultListener("Question5.2") { key, bundle ->
                                                bundle.getInt("senderKey5.2").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.3") { key, bundle ->
                                                bundle.getInt("senderKey5.3").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                            setFragmentResultListener("Question3.3") { key, bundle ->
                                bundle.getInt("senderKey3.3").let { value ->
                                    var value1 = value

                                    setFragmentResultListener("Question4.1") { key, bundle ->
                                        bundle.getInt("senderKey4.1").let { value ->
                                            var value1 = value

                                            setFragmentResultListener("Question5.1") { key, bundle ->
                                                bundle.getInt("senderKey5.1").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.2") { key, bundle ->
                                                bundle.getInt("senderKey5.2").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.3") { key, bundle ->
                                                bundle.getInt("senderKey5.3").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                    setFragmentResultListener("Question4.2") { key, bundle ->
                                        bundle.getInt("senderKey4.2").let { value ->
                                            var value1 = value

                                            setFragmentResultListener("Question5.1") { key, bundle ->
                                                bundle.getInt("senderKey5.1").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.2") { key, bundle ->
                                                bundle.getInt("senderKey5.2").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.3") { key, bundle ->
                                                bundle.getInt("senderKey5.3").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                    setFragmentResultListener("Question4.3") { key, bundle ->
                                        bundle.getInt("senderKey4.3").let { value ->
                                            var value1 = value

                                            setFragmentResultListener("Question5.1") { key, bundle ->
                                                bundle.getInt("senderKey5.1").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.2") { key, bundle ->
                                                bundle.getInt("senderKey5.2").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.3") { key, bundle ->
                                                bundle.getInt("senderKey5.3").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                    setFragmentResultListener("Question4.4") { key, bundle ->
                                        bundle.getInt("senderKey4.4").let { value ->
                                            var value1 = value

                                            setFragmentResultListener("Question5.1") { key, bundle ->
                                                bundle.getInt("senderKey5.1").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.2") { key, bundle ->
                                                bundle.getInt("senderKey5.2").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.3") { key, bundle ->
                                                bundle.getInt("senderKey5.3").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                    setFragmentResultListener("Question4.5") { key, bundle ->
                                        bundle.getInt("senderKey4.5").let { value ->
                                            var value1 = value

                                            setFragmentResultListener("Question5.1") { key, bundle ->
                                                bundle.getInt("senderKey5.1").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.2") { key, bundle ->
                                                bundle.getInt("senderKey5.2").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.3") { key, bundle ->
                                                bundle.getInt("senderKey5.3").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                    setFragmentResultListener("Question4.6") { key, bundle ->
                                        bundle.getInt("senderKey4.6").let { value ->
                                            var value1 = value

                                            setFragmentResultListener("Question5.1") { key, bundle ->
                                                bundle.getInt("senderKey5.1").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.2") { key, bundle ->
                                                bundle.getInt("senderKey5.2").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                            setFragmentResultListener("Question5.3") { key, bundle ->
                                                bundle.getInt("senderKey5.3").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }
                }

                setFragmentResultListener("Question2.2") { key, bundle ->
                    bundle.getInt("senderKey2.2").let { value ->
                        var value1 = value

                        setFragmentResultListener("Question3.1") { key, bundle ->
                            bundle.getInt("senderKey3.1").let { value ->
                                var value1 = value

                                setFragmentResultListener("Question4.1") { key, bundle ->
                                    bundle.getInt("senderKey4.1").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.2") { key, bundle ->
                                    bundle.getInt("senderKey4.2").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.3") { key, bundle ->
                                    bundle.getInt("senderKey4.3").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.4") { key, bundle ->
                                    bundle.getInt("senderKey4.4").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.5") { key, bundle ->
                                    bundle.getInt("senderKey4.5").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.6") { key, bundle ->
                                    bundle.getInt("senderKey4.6").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                        setFragmentResultListener("Question3.2") { key, bundle ->
                            bundle.getInt("senderKey3.2").let { value ->
                                var value1 = value

                                setFragmentResultListener("Question4.1") { key, bundle ->
                                    bundle.getInt("senderKey4.1").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.2") { key, bundle ->
                                    bundle.getInt("senderKey4.2").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.3") { key, bundle ->
                                    bundle.getInt("senderKey4.3").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.4") { key, bundle ->
                                    bundle.getInt("senderKey4.4").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.5") { key, bundle ->
                                    bundle.getInt("senderKey4.5").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.6") { key, bundle ->
                                    bundle.getInt("senderKey4.6").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                        setFragmentResultListener("Question3.3") { key, bundle ->
                            bundle.getInt("senderKey3.3").let { value ->
                                var value1 = value

                                setFragmentResultListener("Question4.1") { key, bundle ->
                                    bundle.getInt("senderKey4.1").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.2") { key, bundle ->
                                    bundle.getInt("senderKey4.2").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.3") { key, bundle ->
                                    bundle.getInt("senderKey4.3").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.4") { key, bundle ->
                                    bundle.getInt("senderKey4.4").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.5") { key, bundle ->
                                    bundle.getInt("senderKey4.5").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.6") { key, bundle ->
                                    bundle.getInt("senderKey4.6").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

        setFragmentResultListener("Question1.2") { key, bundle ->
            bundle.getInt("senderKey1.2").let { value ->
                var value1 = value

                setFragmentResultListener("Question2.1") { key, bundle ->
                    bundle.getInt("senderKey2.1").let { value ->
                        var value1 = value

                        setFragmentResultListener("Question3.1") { key, bundle ->
                            bundle.getInt("senderKey3.1").let { value ->
                                var value1 = value

                                setFragmentResultListener("Question4.1") { key, bundle ->
                                    bundle.getInt("senderKey4.1").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.2") { key, bundle ->
                                    bundle.getInt("senderKey4.2").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value



                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.3") { key, bundle ->
                                    bundle.getInt("senderKey4.3").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.4") { key, bundle ->
                                    bundle.getInt("senderKey4.4").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.5") { key, bundle ->
                                    bundle.getInt("senderKey4.5").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.6") { key, bundle ->
                                    bundle.getInt("senderKey4.6").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                        setFragmentResultListener("Question3.2") { key, bundle ->
                            bundle.getInt("senderKey3.2").let { value ->
                                var value1 = value

                                setFragmentResultListener("Question4.1") { key, bundle ->
                                    bundle.getInt("senderKey4.1").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.2") { key, bundle ->
                                    bundle.getInt("senderKey4.2").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.3") { key, bundle ->
                                    bundle.getInt("senderKey4.3").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.4") { key, bundle ->
                                    bundle.getInt("senderKey4.4").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.5") { key, bundle ->
                                    bundle.getInt("senderKey4.5").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.6") { key, bundle ->
                                    bundle.getInt("senderKey4.6").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                        setFragmentResultListener("Question3.3") { key, bundle ->
                            bundle.getInt("senderKey3.3").let { value ->
                                var value1 = value

                                setFragmentResultListener("Question4.1") { key, bundle ->
                                    bundle.getInt("senderKey4.1").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.2") { key, bundle ->
                                    bundle.getInt("senderKey4.2").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.3") { key, bundle ->
                                    bundle.getInt("senderKey4.3").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.4") { key, bundle ->
                                    bundle.getInt("senderKey4.4").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.5") { key, bundle ->
                                    bundle.getInt("senderKey4.5").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.6") { key, bundle ->
                                    bundle.getInt("senderKey4.6").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

                setFragmentResultListener("Question2.2") { key, bundle ->
                    bundle.getInt("senderKey2.2").let { value ->
                        var value1 = value

                        setFragmentResultListener("Question3.1") { key, bundle ->
                            bundle.getInt("senderKey3.1").let { value ->
                                var value1 = value

                                setFragmentResultListener("Question4.1") { key, bundle ->
                                    bundle.getInt("senderKey4.1").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.2") { key, bundle ->
                                    bundle.getInt("senderKey4.2").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.3") { key, bundle ->
                                    bundle.getInt("senderKey4.3").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.4") { key, bundle ->
                                    bundle.getInt("senderKey4.4").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.5") { key, bundle ->
                                    bundle.getInt("senderKey4.5").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.6") { key, bundle ->
                                    bundle.getInt("senderKey4.6").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                        setFragmentResultListener("Question3.2") { key, bundle ->
                            bundle.getInt("senderKey3.2").let { value ->
                                var value1 = value

                                setFragmentResultListener("Question4.1") { key, bundle ->
                                    bundle.getInt("senderKey4.1").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.2") { key, bundle ->
                                    bundle.getInt("senderKey4.2").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.3") { key, bundle ->
                                    bundle.getInt("senderKey4.3").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.4") { key, bundle ->
                                    bundle.getInt("senderKey4.4").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.5") { key, bundle ->
                                    bundle.getInt("senderKey4.5").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.6") { key, bundle ->
                                    bundle.getInt("senderKey4.6").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                        setFragmentResultListener("Question3.3") { key, bundle ->
                            bundle.getInt("senderKey3.3").let { value ->
                                var value1 = value

                                setFragmentResultListener("Question4.1") { key, bundle ->
                                    bundle.getInt("senderKey4.1").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.2") { key, bundle ->
                                    bundle.getInt("senderKey4.2").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.3") { key, bundle ->
                                    bundle.getInt("senderKey4.3").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.4") { key, bundle ->
                                    bundle.getInt("senderKey4.4").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.5") { key, bundle ->
                                    bundle.getInt("senderKey4.5").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                                setFragmentResultListener("Question4.6") { key, bundle ->
                                    bundle.getInt("senderKey4.6").let { value ->
                                        var value1 = value

                                        setFragmentResultListener("Question5.1") { key, bundle ->
                                            bundle.getInt("senderKey5.1").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.2") { key, bundle ->
                                            bundle.getInt("senderKey5.2").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                        setFragmentResultListener("Question5.3") { key, bundle ->
                                            bundle.getInt("senderKey5.3").let { value ->
                                                var value1 = value

                                                setFragmentResultListener("Question6.1") { key, bundle ->
                                                    bundle.getInt("senderKey6.1").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }



    }
}