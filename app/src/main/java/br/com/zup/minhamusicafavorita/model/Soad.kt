package br.com.zup.minhamusicafavorita.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Soad (
    private var imagem: Int,
    private var detalhe: String
) : Parcelable {

    fun getImage() = this.imagem
    fun getDetalhe() = this.detalhe
}