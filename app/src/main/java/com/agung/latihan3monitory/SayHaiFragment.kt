package com.agung.latihan3monitory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.agung.latihan3monitory.databinding.FragmentSayHaiBinding

/**
 * A simple [Fragment] subclass.
 * Use the [SayHaiFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SayHaiFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        
        val binding = DataBindingUtil.inflate<FragmentSayHaiBinding>(
            inflater, R.layout.fragment_say_hai, container, false
        )

        return binding.root
    }
}