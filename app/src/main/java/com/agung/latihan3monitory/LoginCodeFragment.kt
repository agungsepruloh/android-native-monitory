package com.agung.latihan3monitory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.agung.latihan3monitory.databinding.FragmentLoginCodeBinding

/**
 * A simple [Fragment] subclass.
 * Use the [LoginCodeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginCodeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginCodeBinding>(
            inflater, R.layout.fragment_login_code, container, false
        )

        binding.signInBtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loginCodeFragment_to_biodataFragment)
        )

        return binding.root
    }
}