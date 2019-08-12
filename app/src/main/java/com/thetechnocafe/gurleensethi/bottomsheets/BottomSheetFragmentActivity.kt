package com.thetechnocafe.gurleensethi.bottomsheets

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_bottom_sheet_fragment.*

class BottomSheetFragmentActivity : AppCompatActivity(), OnDataPass {


    var passVariableFromActivityToFrag: Int = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet_fragment)
        showSheetButton.setOnClickListener {
            val fragment = BottomSheetFragment()
            fragment.show(supportFragmentManager, TAG)
        }
    }

    override fun onDataPass(data: String) {
        Log.d("LOGDATA", "hello $data")
    }
    override fun onDataPass(data: ArrayList<Int>) {
        data.forEach { Log.d("LOGDATA", "hello $it") }
    }

    companion object {

        val TAG = "bottom_sheet"
    }
}
