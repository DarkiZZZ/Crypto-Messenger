package ru.msokolov.cryptomessenger.crypto_list.presentation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.msokolov.cryptomessenger.crypto_list.R

class CryptoListFragment : Fragment() {

    companion object {
        fun newInstance() = CryptoListFragment()
    }

    private lateinit var viewModel: CryptoListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_crypto_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CryptoListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}