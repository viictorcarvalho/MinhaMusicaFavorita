package br.com.zup.minhamusicafavorita.detalhe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.ActivityHomeBinding

class DetalheActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setTitle(R.string.detalhe_album)
    }
}