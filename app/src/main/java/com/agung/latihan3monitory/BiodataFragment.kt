package com.agung.latihan3monitory

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.agung.latihan3monitory.databinding.FragmentBiodataBinding

/**
 * A simple [Fragment] subclass.
 * Use the [BiodataFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BiodataFragment : Fragment() {
    private lateinit var binding: FragmentBiodataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentBiodataBinding>(
            inflater, R.layout.fragment_biodata, container, false
        )

        binding.nextBtn.setOnClickListener { view: View ->
            submit()
            view.findNavController().navigate(R.id.action_biodataFragment_to_sayHaiFragment)
        }

        return binding.root
    }

    private fun submit() {
        binding.apply {
            Log.d("Biodata.Nickname", nicknameField.text.toString())
            Log.d("Biodata.Age", ageField.text.toString())
        }
    }
}