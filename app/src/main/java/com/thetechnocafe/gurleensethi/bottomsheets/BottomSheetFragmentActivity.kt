package com.thetechnocafe.gurleensethi.bottomsheets

import android.support.design.widget.BottomSheetDialogFragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_bottom_sheet_fragment.*

class BottomSheetFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet_fragment)

        showSheetButton.setOnClickListener {
            val fragment = BottomSheetFragment()
            fragment.show(supportFragmentManager, TAG)
        }
    }

    companion object {

        val TAG = "bottom_sheet"
    }
}
