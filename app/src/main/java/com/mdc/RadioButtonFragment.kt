package com.mdc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


/**
 * Created by Pranav Bhoraskar
 */
class RadioButtonFragment : Fragment() {

    companion object {
        val TAG = RadioButtonFragment::class.java.simpleName
        fun newInstance() = RadioButtonFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_radio_button, container, false)
    }
}