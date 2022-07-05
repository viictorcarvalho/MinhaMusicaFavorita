package br.com.zup.minhamusicafavorita.informacoes.albuns.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.zup.minhamusicafavorita.databinding.AlbumItemBinding
import br.com.zup.minhamusicafavorita.home.model.Soad

class AlbumAdapter(
    private var listaAlbum: MutableList<Soad>,
    private val clickAlbum: (album: Soad) -> Unit
) : RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AlbumItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }
// ponte entre a classe viewHolder e ?
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val album = listaAlbum[position]
        holder.adicionarInformacoesView(album)
        holder.binding.cvAlbum.setOnClickListener {
            clickAlbum(album)
        }
    }

    override fun getItemCount() = listaAlbum.size

    fun atualizarListaAlbum(novaListaAlbum: MutableList<Soad>) {
        if (listaAlbum.size == 0) {
            listaAlbum = novaListaAlbum
        } else {
            listaAlbum.addAll(novaListaAlbum)
        }

        notifyDataSetChanged()
    }

    class ViewHolder(val binding: AlbumItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun adicionarInformacoesView(album: Soad) {
            binding.ivAlbum.setImageResource(album.getImage())
        }
    }





}