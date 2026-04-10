package com.exemplo.luxreader // ATENÇÃO: Verifique o nome do seu pacote aqui também

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class TipsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Aqui ele liga com o arquivo activity_lanterna.xml
        setContentView(R.layout.activity_lanterna)
    }
}