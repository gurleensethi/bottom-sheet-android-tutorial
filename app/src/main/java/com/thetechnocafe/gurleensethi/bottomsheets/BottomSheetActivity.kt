package com.thetechnocafe.gurleensethi.bottomsheets

import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bottom_sheet.*

class BottomSheetActivity : AppCompatActivity() {

    private var mBottomSheetBehaviour: BottomSheetBehavior<*>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet)

        mBottomSheetBehaviour = BottomSheetBehavior.from(nestedScrollView)

        //Remove this line to disable peek
        mBottomSheetBehaviour!!.peekHeight = 200

        openBottomSheetButton.setOnClickListener { mBottomSheetBehaviour!!.state = BottomSheetBehavior.STATE_EXPANDED }

        closeBottomSheetButton.setOnClickListener { mBottomSheetBehaviour!!.state = BottomSheetBehavior.STATE_COLLAPSED }

        mBottomSheetBehaviour!!.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                var state = ""

                when (newState) {
                    BottomSheetBehavior.STATE_DRAGGING -> {
                        state = "DRAGGING"
                    }
                    BottomSheetBehavior.STATE_SETTLING -> {
                        state = "SETTLING"
                    }
                    BottomSheetBehavior.STATE_EXPANDED -> {
                        state = "EXPANDED"
                    }
                    BottomSheetBehavior.STATE_COLLAPSED -> {
                        state = "COLLAPSED"
                    }
                    BottomSheetBehavior.STATE_HIDDEN -> {
                        state = "HIDDEN"
                    }
                }

                Toast.makeText(this@BottomSheetActivity, "Bottom Sheet State Changed to: $state", Toast.LENGTH_SHORT).show()
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {

            }
        })
    }
}
