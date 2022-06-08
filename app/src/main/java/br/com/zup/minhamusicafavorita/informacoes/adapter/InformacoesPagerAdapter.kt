package br.com.zup.minhamusicafavorita.informacoes.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.zup.minhamusicafavorita.informacoes.albuns.AlbunsFragment
import br.com.zup.minhamusicafavorita.informacoes.historia.HistoriaFragment

class InformacoesPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private var listaTitulos: List<String>

) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = listaTitulos.size

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return HistoriaFragment()
            1 -> return AlbunsFragment()
        }

        return HistoriaFragment()
    }
}