package br.com.zup.minhamusicafavorita.home.repository

import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.home.model.Soad

class HomeRepository {

    fun criarListaAlbum() : List<Soad>{
        val listaAlbum = mutableListOf<Soad>()

        listaAlbum.add(Soad(R.drawable.systemofadown, "System of a Down"))

        listaAlbum.add(Soad(R.drawable.toxicity, "Toxicity"))

        listaAlbum.add(Soad(R.drawable.steal, "Steal This Album!"))

        listaAlbum.add(Soad(R.drawable.mezmerize, "Mezmerize"))

        listaAlbum.add(Soad(R.drawable.hypnotize, "Hypnotize"))

        return listaAlbum
    }
}