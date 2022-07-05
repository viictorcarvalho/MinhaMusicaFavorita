package br.com.zup.minhamusicafavorita.informacoes.albuns

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.GridLayoutManager
import br.com.zup.minhamusicafavorita.ALBUM_KEY
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.FragmentAlbunsBinding
import br.com.zup.minhamusicafavorita.informacoes.albuns.adapter.AlbumAdapter
import br.com.zup.minhamusicafavorita.home.model.Soad

class AlbumFragment : Fragment() {
    private lateinit var binding: FragmentAlbunsBinding

    private val albumAdapter: AlbumAdapter by lazy {
        AlbumAdapter(arrayListOf(), ::irParaDetalheAlbum)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlbunsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        criarListaAlbum()
    }

    private fun exibirRecycleView() {
        binding.rvListaAlbuns.adapter = albumAdapter
        binding.rvListaAlbuns.layoutManager = GridLayoutManager(context, 2)

    }

    private fun criarListaAlbum() {
        val listaAlbum = mutableListOf<Soad>()

        listaAlbum.add(Soad(R.drawable.systemofadown, "System of a Down"))

        listaAlbum.add(Soad(R.drawable.toxicity, "Toxicity"))

        listaAlbum.add(Soad(R.drawable.steal, "Steal This Album!"))

        listaAlbum.add(Soad(R.drawable.mezmerize, "Mezmerize"))

        listaAlbum.add(Soad(R.drawable.hypnotize, "Hypnotize"))

        albumAdapter.atualizarListaAlbum(listaAlbum)
        exibirRecycleView()
    }

    private fun irParaDetalheAlbum(album: Soad) {
        val bundle = bundleOf(ALBUM_KEY to album)

        NavHostFragment.findNavController(this).navigate(
            R.id.action_albunsFragment_to_detalheAlbumFragment, bundle
        )
    }
}