package com.example.profilesekolah.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.profilesekolah.R


class FounderFragment : Fragment() {
    //onCreateView diisi dengan kode identifikasi layout
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_founder, container, false)
        return view
    }
}