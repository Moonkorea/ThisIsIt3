package com.jungsoo.thisisit

import android.content.Intent
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
        return inflater.inflate(R.layout.fragment_how_about_this, container, false)
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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111111", 111111)
                                                            startActivity(intent)

                                                        }



                                                    }



                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111112", 111112)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111121", 111121)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111122", 111122)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111131", 111131)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111132", 111132)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111211", 111211)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111212", 111212)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111221", 111221)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111222", 111222)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111231", 111231)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111232", 111232)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111311", 111311)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111312", 111312)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111321", 111321)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111322", 111322)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111331", 111331)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111332", 111332)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111411", 111411)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111412", 111412)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111421", 111421)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111422", 111422)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111431", 111431)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111432", 111432)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111511", 111511)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111512", 111512)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111521", 111521)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111522", 111522)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111531", 111531)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111532", 111532)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111611", 111611)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111612", 111612)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111621", 111621)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111622", 111622)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111631", 111631)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("111632", 111632)
                                                            startActivity(intent)

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

                                    val three = 1
                                    Log.d("pzx3", three.toString())

                                    setFragmentResultListener("Question4.1") { key, bundle ->
                                        bundle.getInt("senderKey4.1").let { value ->
                                            var value1 = value

                                            val three = 1
                                            Log.d("pzx4", three.toString())

                                            setFragmentResultListener("Question5.1") { key, bundle ->
                                                bundle.getInt("senderKey5.1").let { value ->
                                                    var value1 = value

                                                    setFragmentResultListener("Question6.1") { key, bundle ->
                                                        bundle.getInt("senderKey6.1").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112111", 112111)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112112", 112112)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112121", 112121)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112122", 112122)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112131", 112131)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112132", 112132)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112211", 112211)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112212", 112212)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112221", 112221)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112222", 112222)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112231", 112231)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112232", 112232)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112311", 112311)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112312", 112312)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112321", 112321)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112322", 112322)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112331", 112331)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112332", 112332)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112411", 112411)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112412", 112412)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112421", 112421)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112422", 112422)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112431", 112431)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112432", 112432)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112511", 112511)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112512", 112512)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112521", 112521)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112522", 112522)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112531", 112531)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112532", 112532)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112611", 112611)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112612", 112612)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112621", 112621)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112622", 112622)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112631", 112631)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("112632", 112632)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113111", 113111)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113112", 113112)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113121", 113121)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113122", 113122)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113131", 113131)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113132", 113132)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113211", 113211)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113212", 113212)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113221", 113221)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113222", 113222)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113231", 113231)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113232", 113232)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113311", 113311)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113312", 113312)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113321", 113321)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113322", 113322)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113331", 113331)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113332", 113332)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113411", 113411)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113412", 113412)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113421", 113421)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113422", 113422)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113431", 113431)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113432", 113432)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113511", 113511)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113512", 113512)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113521", 113521)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113522", 113522)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113531", 113531)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113532", 113532)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113611", 113611)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113612", 113612)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113621", 113621)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113622", 113622)
                                                                startActivity(intent)

                                                            }

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

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113631", 113631)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                    setFragmentResultListener("Question6.2") { key, bundle ->
                                                        bundle.getInt("senderKey6.2").let { value ->
                                                            var value1 = value

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("113632", 113632)
                                                                startActivity(intent)

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121111", 121111)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121112", 121112)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121121", 121121)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121122", 121122)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121131", 121131)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121132", 121132)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121211", 121211)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121212", 121212)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121221", 121221)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121222", 121222)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121231", 121231)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121232", 121232)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121311", 121311)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121312", 121312)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121321", 121321)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121322", 121322)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121331", 121331)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121332", 121332)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121411", 121411)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121412", 121412)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121421", 121421)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121422", 121422)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121431", 121431)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121432", 121432)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121511", 121511)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121512", 121512)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121521", 121521)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121522", 121522)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121531", 121531)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121532", 121532)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121611", 121611)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121612", 121612)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121621", 121621)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121622", 121622)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121631", 121631)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("121632", 121632)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122111", 122111)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122112", 122112)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122121", 122121)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122122", 122122)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122131", 122131)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122132", 122132)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122211", 122211)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122212", 122212)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122221", 122221)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122222", 122222)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122231", 122231)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122232", 122232)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122311", 122311)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122312", 122312)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122321", 122321)
                                                            startActivity(intent)

                                                            val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                            goBtn.setOnClickListener {
                                                                val intent = Intent(context, HowAboutThisActivity::class.java)
                                                                intent.putExtra("122321", 122321)
                                                                startActivity(intent)

                                                            }

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122322", 122322)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122331", 122331)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122332", 122332)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122411", 122411)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122412", 122412)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122421", 122421)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122422", 122422)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122431", 122431)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122432", 122432)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122511", 122511)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122512", 122512)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122521", 122521)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122522", 122522)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122531", 122531)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122532", 122532)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122611", 122611)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122612", 122612)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122621", 122621)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122622", 122622)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122631", 122631)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("122632", 122632)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123111", 123111)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123112", 123112)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123121", 123121)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123122", 123122)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123131", 123131)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123132", 123132)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123211", 123211)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123212", 123212)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123221", 123221)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123222", 123222)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123231", 123231)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123232", 123232)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123311", 123311)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123312", 123312)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123321", 123321)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123322", 123322)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123331", 123331)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123332", 123332)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123411", 123411)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123412", 123412)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123421", 123421)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123422", 123422)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123431", 123431)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123432", 123432)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123511", 123511)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123512", 123512)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123521", 123521)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123522", 123522)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123531", 123531)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123532", 123532)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123611", 123611)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123612", 123612)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123621", 123621)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123622", 123622)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123631", 123631)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("123632", 123632)
                                                            startActivity(intent)

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211111", 211111)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211112", 211112)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211121", 211121)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211122", 211122)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211131", 211131)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211132", 211132)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211211", 211211)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211212", 211212)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211221", 211221)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211222", 211222)
                                                            startActivity(intent)

                                                        }



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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211231", 211231)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211232", 211232)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211311", 211311)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211312", 211312)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211321", 211321)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211322", 211322)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211331", 211331)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211332", 211332)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211411", 211411)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211412", 211412)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211421", 211421)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211422", 211422)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211431", 211431)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211432", 211432)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211511", 211511)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211512", 211512)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211521", 211521)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211522", 211522)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211531", 211531)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211532", 211532)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211611", 211611)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211612", 211612)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211621", 211621)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211622", 211622)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211631", 211631)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("211632", 211632)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212111", 212111)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212112", 212112
                                                            )
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212121", 212121)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212122", 212122)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212131", 212131)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212132", 212132)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212211", 212211)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212212", 212212)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212221", 212221)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212222", 212222)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212231", 212231)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212232", 212232)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212311", 212311)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212312", 212312)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212321", 212321)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212322", 212322)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212331", 212331)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212332", 212332)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212411", 212411)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212412", 212412)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212421", 212421)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212422", 212422)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212431", 212431)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212432", 212432)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212511", 212511)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212512", 212512)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212521", 212521)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212522", 212522)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212531", 212531)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212532", 212532)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212611", 212611)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212612", 212612)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212621", 212621)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212622", 212622)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212631", 212631)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("212632", 212632)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213111", 213111)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213112", 213112)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213121", 213121)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213122", 213122)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213131", 213131)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213132", 213132)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213211", 213211)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213212", 213212)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213221", 213221)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213222", 213222)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213231", 213231)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213232", 213232)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213311", 213311)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213312", 213312)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213321", 213321)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213322", 213322)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213331", 213331)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213332", 213332)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213411", 213411)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213412", 213412)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213421", 213421)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213422", 213422)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213431", 213431)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213432", 213432)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213511", 213511)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213512", 213512)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213521", 213521)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213522", 213522)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213531", 213531)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213532", 213532)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213611", 213611)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213612", 213612)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213621", 213621)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213622", 213622)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213631", 213631)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("213632", 213632)
                                                            startActivity(intent)

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221111", 221111)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221112", 221112)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221121", 221121)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221122", 221122)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221131", 221131)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221132", 221132)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221211", 221211)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221212", 221212)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221221", 221221)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221222", 221222)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221231", 221231)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221232", 221232)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221311", 221311)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221312", 221312)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221321", 221321)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221322", 221322)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221331", 221331)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221332", 221332)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221411", 221411)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221412", 221412)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221421", 221421)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221422", 221422)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221431", 221431)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221432", 221432)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221511", 221511)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221512", 221512)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221521", 221521)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221522", 221522)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221531", 221531)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221532", 221532)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221611", 221611)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221612", 221612)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221621", 221621)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221622", 221622)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221631", 221631)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("221632", 221632)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222111", 222111)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222112", 222112)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222121", 222121)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222122", 222122)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222131", 222131)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222132", 222132)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222211", 222211)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222212", 222212)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222221", 222221)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222222", 222222)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222231", 222231)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222232", 222232)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222311", 222311)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222312", 222312)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222321", 222321)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222322", 222322)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222331", 222331)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222332", 222332)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222411", 222411)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222412", 222412)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222421", 222421)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222422", 222422)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222431", 222431)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222432", 222432)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222511", 222511)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222512", 222512)
                                                            startActivity(intent)

                                                        }

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
                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222521", 222521)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222522", 222522)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222531", 222531)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222532", 222532)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222611", 222611)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222612", 222612)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222621", 222621)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222622", 222622)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222631", 222631)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("222632", 222632)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223111", 223111)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223112", 223112)
                                                            startActivity(intent)

                                                        }

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
                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223121", 223121)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223122", 223122)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223131", 223131)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223132", 223132)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223211", 223211)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223212", 223212)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223221", 223221)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223222", 223222)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223231", 223231)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223232", 223232)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223311", 223311)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223312", 223312)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223321", 223321)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223322", 223322)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223331", 223331)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223332", 223332)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223411", 223411)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223412", 223412)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223421", 223421)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223422", 223422)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223431", 223431)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223432", 223432)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223511", 223511)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223512", 223512)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223521", 223521)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223522", 223522)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223531", 223531)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223532", 223532)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223611", 223611)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223612", 223612)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223621", 223621)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223622", 223622)
                                                            startActivity(intent)

                                                        }

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

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223631", 223631)
                                                            startActivity(intent)

                                                        }

                                                    }

                                                }

                                                setFragmentResultListener("Question6.2") { key, bundle ->
                                                    bundle.getInt("senderKey6.2").let { value ->
                                                        var value1 = value

                                                        val goBtn = view.findViewById<Button>(R.id.goBtn)
                                                        goBtn.setOnClickListener {
                                                            val intent = Intent(context, HowAboutThisActivity::class.java)
                                                            intent.putExtra("223632", 223632)
                                                            startActivity(intent)

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
}