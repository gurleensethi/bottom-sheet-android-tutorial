package com.thetechnocafe.gurleensethi.bottomsheets

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomSheetsButton.setOnClickListener {
            Intent(this@MainActivity, BottomSheetActivity::class.java).apply { startActivity(this) }
        }
        bottomSheetsDialogFragmentButton.setOnClickListener {
            Intent(this@MainActivity, BottomSheetFragmentActivity::class.java).apply { startActivity(this) }
        }
    }
}
