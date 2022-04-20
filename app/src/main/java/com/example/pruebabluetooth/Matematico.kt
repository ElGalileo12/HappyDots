package com.example.pruebabluetooth

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pruebabluetooth.Panel.Companion.m_bluetoothSocket
import kotlinx.android.synthetic.main.activity_matematico.*
import java.io.IOException
import java.io.OutputStream

private var n = 5
var P: IntArray = IntArray(2)
var S = 0
var contMalas = 0
var contBuenas = 0
var ban1=0
var ban2=0

class Matematico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matematico)
        info_text.text = ""


        numAletorios()

        //Eventos de escucha de los botones
        button.setOnClickListener {
            if(ban1==0){
                if(button.text == S.toString()){
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show()
                    contBuenas = contBuenas + 1
                    contbuenas.text = contBuenas.toString()
                    EnviarComando("A1*")
                    confeti.visibility = View.VISIBLE
                    correcto.visibility = View.VISIBLE
                    incorrecto.visibility = View.GONE
                    ban1=1
                }else{
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show()
                    contMalas = contMalas + 1
                    contmalas.text = contMalas.toString()
                    EnviarComando("A0*")
                    correcto.visibility = View.GONE
                    confeti.visibility = View.GONE
                    incorrecto.visibility = View.VISIBLE
                    ban1=1
                }
            }else{
                Toast.makeText(this, "Por favor pase a la siguiente pregunta", Toast.LENGTH_SHORT).show()
            }

        }

        button2.setOnClickListener {
            if(ban1==0) {
                if (button2.text == S.toString()) {
                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show()
                    contBuenas = contBuenas + 1
                    contbuenas.text = contBuenas.toString()
                    EnviarComando("A1*")
                    confeti.visibility = View.VISIBLE
                    correcto.visibility = View.VISIBLE
                    incorrecto.visibility = View.GONE
                    ban1 = 1
                } else {
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show()
                    contMalas = contMalas + 1
                    contmalas.text = contMalas.toString()
                    EnviarComando("A0*")
                    confeti.visibility = View.GONE
                    correcto.visibility = View.GONE
                    incorrecto.visibility = View.VISIBLE
                    ban1 = 1
                }
            }else{
                Toast.makeText(this, "Por favor pase a la siguiente pregunta", Toast.LENGTH_SHORT).show()
            }
        }

        siguiente.setOnClickListener {
            if (ban1 == 1){
                ban1=0
                numAletorios()
                EnviarComando("BC*")
            }else{
                Toast.makeText(this, "Por favor contexta la pregunta", Toast.LENGTH_SHORT).show()
            }

        }
    }//fin del onCreate

    fun numAletorios(){

        confeti.visibility = View.GONE
        correcto.visibility = View.GONE
        incorrecto.visibility = View.GONE


        var C1: Double = (Math.random() * n) + 1
        var C2: Double = (Math.random() * n) + 1
        var C11: Double = (Math.random() * 2)
        var C22: Double = (Math.random() * 2)
        var N: Double = (Math.random() * n) + 1
        var E:String = C1.toInt().toString() + "+" + C2.toInt().toString()
        info_text.text = E
        S = C2.toInt() + C1.toInt()

        do {
            println("N==S")
            N = (Math.random() * n) + 1
            C11 = (Math.random() * 2)
            C22 = (Math.random() * 2)
        } while(N.toInt() == S || C11.toInt() == C22.toInt()) // numero < 1 || numero > 100

        println("C11 = ${C11.toInt()} - C22 = ${C22.toInt()}")
        P[0] = S
        P[1] = N.toInt()

        button2.text =  P[C11.toInt()].toString()
        button.text = P[C22.toInt()].toString()
    }

    private fun EnviarComando(bytes: String){

        if (m_bluetoothSocket != null){
            try {
                m_bluetoothSocket!!.outputStream.write(bytes.toByteArray())
            }catch (e: IOException){
                val C = e.printStackTrace()
                Toast.makeText(this, C.toString(), Toast.LENGTH_SHORT).show()
            }
        }

    }//Fin de la funcion enviar comando

}// fin del AppCompatActivity