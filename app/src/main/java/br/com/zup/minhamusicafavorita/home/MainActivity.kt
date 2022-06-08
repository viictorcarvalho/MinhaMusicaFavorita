package br.com.zup.minhamusicafavorita.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.SOAD_KEY
import br.com.zup.minhamusicafavorita.databinding.ActivityMainBinding
import br.com.zup.minhamusicafavorita.detalhe.DetalheActivity
import br.com.zup.minhamusicafavorita.informacoes.InformacoesActivity
import br.com.zup.minhamusicafavorita.model.Soad

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDetalhes.setOnClickListener {
            startActivity(Intent(this, InformacoesActivity::class.java))
        }
    }

    private fun irParaDetalhe(system: Soad) {
        val intent = Intent(this, DetalheActivity::class.java).apply {
            putExtra(SOAD_KEY, system)
        }
        startActivity(intent)
    }
}