package com.eas.placar.placar.ui.placar_aac

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.eas.placar.placar.R
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarAACActivity : AppCompatActivity() {

    lateinit var placarAACViewModel: PlacarAACViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar_aac)

        placarAACViewModel = ViewModelProviders
                .of(this)
                .get(PlacarAACViewModel::class.java)

        registraObservers()

        bt3PontosTimeA.setOnClickListener {
            placarAACViewModel.adicionaPontoTimeA(3)
        }

        bt2PontosTimeA.setOnClickListener {
            placarAACViewModel.adicionaPontoTimeA(2)
        }

        bt1PontosTimeA.setOnClickListener {
            placarAACViewModel.adicionaPontoTimeA(1)
        }

        bt3PontosTimeB.setOnClickListener {
            placarAACViewModel.adicionaPontoTimeB(3)
        }

        bt2PontosTimeB.setOnClickListener {
            placarAACViewModel.adicionaPontoTimeB(2)
        }

        bt1PontosTimeB.setOnClickListener {
            placarAACViewModel.adicionaPontoTimeB(1)
        }

        btReiniciar.setOnClickListener {
            placarAACViewModel.reiniciarJogo()
        }
    }

    private fun registraObservers() {
        placarAACViewModel.placarA.observe(this, Observer {
            tvPlacarTimeA.text = it.toString()
        })

        placarAACViewModel.placarB.observe(this, Observer {
            tvPlacarTimeB.text = it.toString()
        })
    }
}
