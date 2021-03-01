package com.mdc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


/**
 * Created by Pranav Bhoraskar
 */
class CardViewFragment : Fragment() {

    companion object {
        val TAG: String = CardViewFragment::class.java.simpleName
        fun newInstance() = CardViewFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_card_view, container, false)
    }
}