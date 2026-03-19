package com.example.meuprimeiroapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val edPeso = findViewById<EditText>(R.id.edPeso)
        val edAltura = findViewById<EditText>(R.id.edAltura)
        val btCalcularHomem = findViewById<Button>(R.id.btCalcularHomem)
        val btCalcularMulher = findViewById<Button>(R.id.btCalcularMulher)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btLimpar = findViewById<Button>(R.id.btLimpar)

        btCalcularHomem.setOnClickListener {

            val peso = edPeso.text.toString().toDouble()
            val altura = edAltura.text.toString().toDouble()
            val imc = peso / (altura * altura)
            val imcFormatado = String.format(java.util.Locale("pt", "BR"), "%.2f", imc)

            when {
                imc < 20.7 -> tvResultado.text = "Você está abaixo do peso\n IMC é de: $imcFormatado"
                imc > 20.7 && imc < 26.4 -> tvResultado.text = "Você está no peso normal\n IMC é de: $imcFormatado"
                imc > 26.4 && imc < 27.8 -> tvResultado.text = "Você está marginalmente acima do peso\n IMC é de: $imcFormatado"
                imc > 27.8 && imc < 31.1 -> tvResultado.text = "Você está acima do peso ideal\n IMC é de: $imcFormatado"
                imc > 31.1 -> tvResultado.text = "Você está marginalmente acima do peso\n IMC é de: $imcFormatado"
            }

        }

        btCalcularMulher.setOnClickListener {

            val peso = edPeso.text.toString().toDouble()
            val altura = edAltura.text.toString().toDouble()
            val imc = peso / (altura * altura)
            val imcFormatado = String.format(java.util.Locale("pt", "BR"), "%.2f", imc)

            when {
                imc < 19.1 -> tvResultado.text = "Você está abaixo do peso\n IMC é de: $imcFormatado"
                imc > 19.1 && imc < 25.8 -> tvResultado.text = "Você está no peso normal\n IMC é de: $imcFormatado"
                imc > 25.8 && imc < 27.3 -> tvResultado.text = "Você está marginalmente acima do peso\n IMC é de: $imcFormatado"
                imc > 27.3 && imc < 32.3 -> tvResultado.text = "Você está acima do peso ideal\n IMC é de: $imcFormatado"
                imc > 32.3 -> tvResultado.text = "Você está marginalmente acima do peso\n IMC é de: $imcFormatado"
            }

        }

        btLimpar.setOnClickListener {
            edPeso.text.clear()
            edAltura.text.clear()
            tvResultado.text = ""
        }

    }

}
