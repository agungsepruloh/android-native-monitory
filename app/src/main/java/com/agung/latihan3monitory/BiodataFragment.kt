package com.agung.latihan3monitory

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.agung.latihan3monitory.databinding.FragmentBiodataBinding
import java.util.*

/**
 * A simple [Fragment] subclass.
 * Use the [BiodataFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BiodataFragment : Fragment() {
    private lateinit var binding: FragmentBiodataBinding

    private val nickname: String
        get() = binding.nicknameField.text.toString().capitalize(Locale.ROOT)

    private val age: Int
        get() = binding.ageField.text.toString().toInt()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentBiodataBinding>(
            inflater, R.layout.fragment_biodata, container, false)

        binding.nextBtn.setOnClickListener { view: View ->
            if (!isValid()) showError()
            else navigate(view)
        }

        return binding.root
    }

    private fun isValid(): Boolean {
        binding.apply {
            return nicknameField.text.trim().isNotEmpty() and ageField.text.trim().isNotEmpty()
        }
    }

    private fun showError() {
        Toast
            .makeText(context, resources.getString(R.string.error_message), Toast.LENGTH_SHORT)
            .show()
    }

    private fun navigate(view: View) {
        view.findNavController().navigate(
            BiodataFragmentDirections.actionBiodataFragmentToSayHaiFragment(nickname, age))
    }
}