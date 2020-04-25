package com.example.android.fragmentedcslab


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.android.fragmentedcslab.databinding.FragmentLoginBinding
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false)

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginButton.setOnClickListener {view: View ->
            login()

        }



    }

   private fun login (){

        if (mailAddress.text.toString().trim().isEmpty()) {
            mailAddress.error = "Please enter your Email"
            return
        }

        if (enterPassword.text.toString().trim().isEmpty()) {
            makeText(context, "Please enter your password", Toast.LENGTH_SHORT).show()
            view!!.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToAboutFragment())
            return

        }
    }



}

