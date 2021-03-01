package com.mdc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*


/**
 * Created by Pranav Bhoraskar
 */
class MainFragment : Fragment() {

    companion object {
        val TAG: String = MainFragment::class.java.simpleName
        fun newInstance() = MainFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_radio_button.setOnClickListener {
            navigateToFragment(RadioButtonFragment.TAG)
        }

        button_card_view.setOnClickListener {
            navigateToFragment(CardViewFragment.TAG)
        }

        button_shapeable_image_view.setOnClickListener {
            navigateToFragment(ImageViewFragment.TAG)
        }
    }

    private fun navigateToFragment(tag: String) {
        when (tag) {
            RadioButtonFragment.TAG -> {
                performFragmentTransactionn(
                    RadioButtonFragment.newInstance(),
                    RadioButtonFragment.TAG
                )
            }
            CardViewFragment.TAG -> {
                performFragmentTransactionn(CardViewFragment.newInstance(), CardViewFragment.TAG)
            }
            ImageViewFragment.TAG -> {
                performFragmentTransactionn(ImageViewFragment.newInstance(), ImageViewFragment.TAG)
            }
        }
    }

    private fun performFragmentTransactionn(fragment: Fragment, tag: String) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.main_container, fragment, tag)
            .addToBackStack(null)
            .commit()
    }

}