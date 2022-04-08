package com.example.sharedpreferences

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SegundaTela : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.segundatela)

        var textView = findViewById<TextView>(R.id.textView)
        var textView2 = findViewById<TextView>(R.id.textView2)

        var sharedPreferences = getSharedPreferences("mySharedPreferences", MODE_PRIVATE)
        var agencia = sharedPreferences.getString("nome", "nunhum")
        var conta = sharedPreferences.getString("idade", "nunhuma")
        textView.text = "Sua agência: $agencia"
        textView2.text = "Sua Conta: $conta"





    }
}