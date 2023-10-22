package com.alexandru.vladut.gabriel97.MiniCalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textViewEtiqueta: TextView
    lateinit var editTextNumero1: EditText
    lateinit var editTextNumero2: EditText
    var calculo: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewEtiqueta = findViewById(R.id.textViewEtiqueta)
        editTextNumero1 = findViewById<EditText>(R.id.editTextNumero1)
        editTextNumero2 = findViewById<EditText>(R.id.editTextNumero2)

        val buttonSuma = findViewById<Button>(R.id.buttonSuma)
        val buttonResta = findViewById<Button>(R.id.buttonResta)
        val buttonMultiplicacion = findViewById<Button>(R.id.buttonMultiplicacion)
        val buttonDivision = findViewById<Button>(R.id.buttonDivision)

        buttonSuma.setOnClickListener(operaciones)
        buttonResta.setOnClickListener(operaciones)
        buttonDivision.setOnClickListener(operaciones)
        buttonMultiplicacion.setOnClickListener(operaciones)
    }



    private val operaciones = View.OnClickListener { view ->
        when (view.id) {
            R.id.buttonSuma -> {
                calculo = editTextNumero1.text.toString().toDouble() + editTextNumero2.text.toString().toDouble()
                textViewEtiqueta.text = calculo.toString()
            }
            R.id.buttonResta -> {
                calculo = editTextNumero1.text.toString().toDouble() - editTextNumero2.text.toString().toDouble()
                textViewEtiqueta.text = calculo.toString()
            }
            R.id.buttonMultiplicacion -> {
                calculo = editTextNumero1.text.toString().toDouble() * editTextNumero2.text.toString().toDouble()
                textViewEtiqueta.text = calculo.toString()
            }
            R.id.buttonDivision -> {
                calculo = (((editTextNumero1.text.toString()).toDouble() / (editTextNumero2.text.toString()).toDouble()))
                textViewEtiqueta.text = String.format("%.2f",calculo)
            }else ->{
            textViewEtiqueta.text = "Boton erroneo"
            }
        }
    }

}