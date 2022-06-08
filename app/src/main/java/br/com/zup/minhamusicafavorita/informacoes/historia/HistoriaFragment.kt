package br.com.zup.minhamusicafavorita.informacoes.historia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.minhamusicafavorita.databinding.FragmentHistoriaBinding

class HistoriaFragment : Fragment() {

    private lateinit var binding: FragmentHistoriaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoriaBinding.inflate(inflater, container, false)
        return binding.root
    }
}