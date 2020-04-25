package com.example.android.fragmentedcslab


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.android.fragmentedcslab.databinding.AboutFragmentBinding

/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val binding: AboutFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.about_fragment, container, false)
        setHasOptionsMenu(true)
        return binding.root
    }


}
