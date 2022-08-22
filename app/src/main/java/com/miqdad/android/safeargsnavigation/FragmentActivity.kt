package com.miqdad.android.safeargsnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs

class FragmentActivity : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val safeArgs : FragmentActivityArgs by navArgs()
        val flowStep = safeArgs.flowStep


        return  when (flowStep){
            1 -> inflater.inflate(R.layout.fragment_first, container, false)
            else -> inflater.inflate(R.layout.fragment_second, container, false)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<View>(R.id.btnNext).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.next_action)
        )
    }

}