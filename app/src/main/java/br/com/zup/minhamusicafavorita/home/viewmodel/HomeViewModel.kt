package br.com.zup.minhamusicafavorita.home.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.zup.minhamusicafavorita.home.model.Soad
import br.com.zup.minhamusicafavorita.home.repository.HomeRepository
import java.lang.Exception

class HomeViewModel() : ViewModel() {
    private val repository = HomeRepository()
    private val _response: MutableLiveData<List<Soad>> = MutableLiveData()
    val response: LiveData<List<Soad>> = _response

    fun getAllAlbuns() {
        try {
            _response.value = repository.criarListaAlbum()

        }catch(e: Exception) {
            Log.i("Error", "-----> ${e.message}")

        }
    }
}