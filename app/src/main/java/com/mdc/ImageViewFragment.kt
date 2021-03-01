package com.mdc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_shapaeble_imageview.*


/**
 * Created by Pranav Bhoraskar
 */
class ImageViewFragment : Fragment() {

    companion object {
        val TAG: String = ImageViewFragment::class.java.simpleName
        fun newInstance() = ImageViewFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_shapaeble_imageview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpImageViews()
    }

    private fun setUpImageViews() {
        val imageUrl =
            "https://images.unsplash.com/photo-1519098901909-b1553a1190af?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2167&q=80"

        Glide.with(requireContext())
            .load(imageUrl)
            .into(img_view_1)

        Glide.with(requireContext())
            .load(imageUrl)
            .into(img_view_2)

        Glide.with(requireContext())
            .load(imageUrl)
            .into(img_view_3)

        Glide.with(requireContext())
            .load(imageUrl)
            .into(img_view_4)

        Glide.with(requireContext())
            .load(imageUrl)
            .into(img_view_5)
    }

}