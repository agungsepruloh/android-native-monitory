package com.agung.latihan3monitory

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
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

        val args = SayHaiFragmentArgs.fromBundle(requireArguments())
        binding.apply {
            successTxt.text = resources.getString(
                R.string.success_message,
                args.nickname, args.nickname, args.nickname
            )
        }

        binding.okBtn.setOnClickListener {
            quitApp()
        }

        return binding.root
    }

    private fun quitApp() {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        intent.addCategory(Intent.CATEGORY_HOME)
        startActivity(intent)
    }
}