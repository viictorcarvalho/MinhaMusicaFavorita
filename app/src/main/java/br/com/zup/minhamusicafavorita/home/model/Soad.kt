package br.com.zup.minhamusicafavorita.home.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Soad(
    private var imagem: Int,
    private var nome: String,
   // private var detalhe: String

) : Parcelable {

    fun getImage() = this.imagem
    fun getNome() = this.nome
    // fun getDetalhe() = this.detalhe
}