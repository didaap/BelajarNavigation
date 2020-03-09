package com.dida.arnessia.jetpacknavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 */
class HasilFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hasil, container, false)
    }
overide fun onViewCreated(View: savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        val hasilTangkap = arguments?.getString(:"args")
        textHasil.text = hasilTangkap
    }
