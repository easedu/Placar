package com.eas.placar.placar.ui.placar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.eas.placar.placar.R
import com.eas.placar.placar.utils.*
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarActivity : AppCompatActivity() {

    private var placarA = 0
    private var placarB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("TAG", "onCreate")

        setContentView(R.layout.activity_placar)

        if (savedInstanceState != null) {
            placarA = savedInstanceState.getInt(PLACAR_CASA)
            placarB = savedInstanceState.getInt(PLACAR_VISITANTE)

            tvPlacarTimeA.text = placarA.toString()
            tvPlacarTimeB.text = placarB.toString()
        }

        tvTimeA.text = intent.extras.getString(KEY_EXTRA_TIME_A)
        tvTimeB.text = intent.extras.getString(KEY_EXTRA_TIME_B)

        bt3PontosTimeA.setOnClickListener { adicionaPontoTimeA(3) }
        bt2PontosTimeA.setOnClickListener { adicionaPontoTimeA(2) }
        bt1PontosTimeA.setOnClickListener { adicionaPontoTimeA(1) }

        bt3PontosTimeB.setOnClickListener { adicionaPontoTimeB(3) }
        bt2PontosTimeB.setOnClickListener { adicionaPontoTimeB(2) }
        bt1PontosTimeB.setOnClickListener { adicionaPontoTimeB(1) }

    }

    private fun adicionaPontoTimeA(ponto: Int) {
        placarA += ponto
        tvPlacarTimeA.text = placarA.toString()
    }

    private fun adicionaPontoTimeB(ponto: Int) {
        placarB += ponto
        tvPlacarTimeB.text = placarB.toString()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putInt(PLACAR_CASA, placarA)
        outState?.putInt(PLACAR_VISITANTE, placarB)
    }
}
