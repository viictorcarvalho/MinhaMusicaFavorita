package br.com.zup.minhamusicafavorita.informacoes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minhamusicafavorita.home.MainActivity
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.ActivityInformacoesBinding
import br.com.zup.minhamusicafavorita.informacoes.adapter.InformacoesPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class InformacoesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInformacoesBinding
    private val listaTitulos = listOf("História", "Álbuns")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformacoesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        exibirAppBarCustomizada()
        exibirViewPagerTabLayout()
    }

    private fun exibirAppBarCustomizada() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle(R.string.informacoes_name)
    }

    private fun exibirViewPagerTabLayout() {
        val informacoesPagerAdapter =
            InformacoesPagerAdapter(supportFragmentManager, lifecycle, listaTitulos)
        binding.vpInformacoes.adapter = informacoesPagerAdapter

        TabLayoutMediator(binding.tlInformacoes, binding.vpInformacoes) { tab, posicao ->
            tab.text = listaTitulos[posicao]
        }.attach()

    }
}