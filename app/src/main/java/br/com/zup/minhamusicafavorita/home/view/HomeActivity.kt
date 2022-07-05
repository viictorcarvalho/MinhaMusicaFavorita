package br.com.zup.minhamusicafavorita.home.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minhamusicafavorita.ALBUM_KEY
import br.com.zup.minhamusicafavorita.detalhe.DetalheAlbumFragment
import br.com.zup.minhamusicafavorita.databinding.ActivityHomeBinding
import br.com.zup.minhamusicafavorita.informacoes.InformacoesActivity
import br.com.zup.minhamusicafavorita.home.model.Soad

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDetalhes.setOnClickListener {
            startActivity(Intent(this, InformacoesActivity::class.java))
        }
    }

    private fun irParaDetalhe(system: Soad) {
        val intent = Intent(this, DetalheAlbumFragment::class.java).apply {
            putExtra(ALBUM_KEY, system)
        }
        startActivity(intent)
    }
}