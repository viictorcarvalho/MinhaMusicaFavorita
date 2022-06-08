package br.com.zup.minhamusicafavorita.detalhe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.zup.minhamusicafavorita.R
// import br.com.zup.minhamusicafavorita.SOAD_KEY
import br.com.zup.minhamusicafavorita.databinding.ActivityDetalheBinding
// import br.com.zup.minhamusicafavorita.model.Soad

class DetalheActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalheBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle(R.string.detalhe_name)

        //  recuperarMarvel()
    }

//    private fun recuperarMarvel(){
//        val marvelHeroi = intent.getParcelableExtra<Soad>(SOAD_KEY)
//
//        if (marvelHeroi != null){
//            exibirInformacoes(marvelHeroi)
//        }
//    }

    //  private fun exibirInformacoes(soad: Soad){
//        binding.ivSystem.setImageResource(soad.getImage())
//        binding.tvHistoria.text = soad.getDetalhe()
//    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}