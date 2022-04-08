package com.example.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnsalvar = findViewById<Button>(R.id.button)
        var txtNome = findViewById<EditText>(R.id.editTextname)
        var txtIdade = findViewById<EditText>(R.id.editTextname2)


        btnsalvar.setOnClickListener {
            var sharedPreferences = getSharedPreferences("mySharedPreferences", MODE_PRIVATE)
            var editor = sharedPreferences.edit()
            editor.putString("nome", txtNome.text.toString())
            editor.putString("idade", txtIdade.text.toString())
            editor.commit()
            var trocarTela = Intent(this,SegundaTela ::class.java)
            startActivity(trocarTela)




        }


        }


    }