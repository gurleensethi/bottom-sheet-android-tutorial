package com.thetechnocafe.gurleensethi.bottomsheets

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.design.widget.BottomSheetDialogFragment
import android.support.design.widget.CoordinatorLayout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_bottom_sheet.view.*

/**
 * Created by gurleensethi on 15/01/18.
 */

class BottomSheetFragment : BottomSheetDialogFragment() {

    internal var dataPasser: OnDataPass? = null
    var data: ArrayList<Int> = ArrayList()
    @SuppressLint("RestrictedApi")
    override fun setupDialog(dialog: Dialog, style: Int) {
        super.setupDialog(dialog, style)

        //Set the custom view
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_bottom_sheet, null)
        dialog.setContentView(view)
        val btn_click = view.findViewById<Button>(R.id.btn_click)
        val recieveVariableFromActivity = (activity as BottomSheetFragmentActivity).passVariableFromActivityToFrag
        Log.d("LOGDATA", "Fragment recieveVariableFromActivity = $recieveVariableFromActivity")
        btn_click.setOnClickListener {
            if ( view.checkbox1.isChecked) data.add(1)
            if ( view.checkbox2.isChecked) data.add(2)
            if ( view.checkbox3.isChecked) data.add(3)
            if ( view.checkbox4.isChecked) data.add(4)
            passData("Clic1 Click 2 Clic 3")
            passDataHashSet(data)
            dismiss()
        }

    }

    fun passData(data: String) {
        dataPasser!!.onDataPass(data)
    }
    fun passDataHashSet(data: ArrayList<Int>) {
        dataPasser!!.onDataPass(data)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        dataPasser = context as OnDataPass
    }

}
