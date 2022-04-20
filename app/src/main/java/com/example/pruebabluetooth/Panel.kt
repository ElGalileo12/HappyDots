package com.example.pruebabluetooth

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.ProgressDialog
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothSocket
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.AsyncTask
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_panel.*
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.util.*
import kotlin.concurrent.thread

private var btSocket:BluetoothSocket? = null
private var meInStream: InputStream? = null
private var msOuStream: OutputStream? = null
private var mensaje = ""
private var A=0

class Panel : AppCompatActivity() {

    var booleano: Boolean = true

    companion object{
        var m_myUUID: UUID = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb")
        var m_bluetoothSocket: BluetoothSocket? = null
        lateinit var m_progress: ProgressDialog
        lateinit var m_bluetoothAdapter: BluetoothAdapter
        var m_isconnected: Boolean = false
        lateinit var m_address: String
    }

    @RequiresApi(Build.VERSION_CODES.P)
    @SuppressLint("ResourceType")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panel)

        m_address = intent.getStringExtra(MainActivity.EXTRA_ADDRESS).toString()
        ConnectToDevice(this).execute()

        title = "Menú principal"

        register()

        thread(start = true) {
            while (booleano) {
                Thread.sleep(200)
                runOnUiThread {
                    if(A==1){
                        booleano=false
                        A=0
                        basicAlert()
                    }else if(A==2){
                        Toast.makeText(this, "Se pudo conectar", Toast.LENGTH_SHORT).show()
                        A=0
                        booleano=false
                    }

                }
            }
        }

    }//Fin del Oncreate

    private class ConnectToDevice(c: Context): AsyncTask<Void, Void, String>(){

        private var connectSucces: Boolean = true
        private var context: Context

        init {
            this.context = c
        }

        override fun onPreExecute(){
            super.onPreExecute()
            m_progress = ProgressDialog.show(context,"Conectando...","Espere por favor.")
        }

        override fun doInBackground(vararg p0: Void?): String?{
            try {
                if (m_bluetoothSocket == null || !m_isconnected){
                    m_bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
                    val device: BluetoothDevice = m_bluetoothAdapter.getRemoteDevice(m_address)
                    println(device)
                    m_bluetoothSocket = device.createInsecureRfcommSocketToServiceRecord(m_myUUID)
                    println(m_bluetoothSocket)
                    btSocket=m_bluetoothSocket
                    BluetoothAdapter.getDefaultAdapter().cancelDiscovery()
                    m_bluetoothSocket!!.connect()
                    connectedThread( btSocket)
                }

            }catch (e: IOException){
                connectSucces = false
                e.printStackTrace()
            }
            return null
        }

        private fun connectedThread(socket: BluetoothSocket?){
            var DatosIn: InputStream? = null
            var DatosOut: OutputStream? = null
            try {
                DatosIn = socket!!.inputStream
                DatosOut = socket.outputStream
            } catch (var6: IOException) {
            }
            meInStream = DatosIn
            msOuStream = DatosOut
        }

        override fun onPostExecute(result: String?){
            super.onPostExecute(result)
            if (!connectSucces){
                Log.i("data","No se pudo conectar")
                A=1

            }else{
                m_isconnected = true
                Log.i("data","Se conecto bien")
                A=2
            }

            m_progress.dismiss()
        }

    }//Fin de la clase ConnectToDevice

    private fun register(){

        Matematic.setOnClickListener {
            EnviarComando("AA*")
            val intent1 = Intent(this,  Matematico::class.java)
            startActivity(intent1)
        }
        
        Dibujo.setOnClickListener {
            EnviarComando("BB*")
            val intent2 = Intent(this, DibujoLibre::class.java)
            startActivity(intent2)
        }

        LedOn.setOnClickListener {
            EnviarComando("I1*")
            showAlert()
        }

        LedOf.setOnClickListener {
            EnviarComando("I0*")
            showAlert1()
        }

    }

    private fun basicAlert(){

        val builder = AlertDialog.Builder(this)
        A=0
        with(builder)
        {
            setTitle("Atencion!!")
            setMessage("No se pudo conectar")
            setPositiveButton("OK", DialogInterface.OnClickListener(function = positiveButtonClick))
            show()
        }


    }

    private val positiveButtonClick = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext, "No se pudo conectar", Toast.LENGTH_SHORT).show()
        finish()
    }

    private fun EnviarComando(bytes: String){

        if (m_bluetoothSocket != null){
            try {
                m_bluetoothSocket!!.outputStream.write(bytes.toByteArray())
            }catch (e:IOException){
                val C = e.printStackTrace()
                Toast.makeText(this, C.toString(), Toast.LENGTH_SHORT).show()
            }
        }

    }//Fin de la funcion enviar comando

    private fun showAlert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("ATENCIÓN")
        builder.setMessage("Ha aumentado la intensidad de los leds.")
        builder.setPositiveButton("Aceptar",null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
    private fun showAlert1(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("ATENCIÓN")
        builder.setMessage("Ha disminuido la intensidad de los leds.")
        builder.setPositiveButton("Aceptar",null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}//Fin de la activity