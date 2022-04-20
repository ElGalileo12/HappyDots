package com.example.pruebabluetooth

import android.os.Bundle
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.example.pruebabluetooth.Panel.Companion.m_bluetoothSocket
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_dibujo_libre.*
import java.io.IOException

class DibujoLibre : AppCompatActivity() {
    private var a1=0
    private var a11=0
    private var a2=0
    private var a12=0
    private var a3=0
    private var a13=0
    private var a4=0
    private var a14=0
    private var a5=0
    private var a15=0
    private var a6=0
    private var a16=0
    private var a7=0
    private var a17=0
    private var a8=0
    private var a18=0

    private var b1=0
    private var b11=0
    private var b2=0
    private var b12=0
    private var b3=0
    private var b13=0
    private var b4=0
    private var b14=0
    private var b5=0
    private var b15=0
    private var b6=0
    private var b16=0
    private var b7=0
    private var b17=0
    private var b8=0
    private var b18=0

    private var c1=0
    private var c11=0
    private var c2=0
    private var c12=0
    private var c3=0
    private var c13=0
    private var c4=0
    private var c14=0
    private var c5=0
    private var c15=0
    private var c6=0
    private var c16=0
    private var c7=0
    private var c17=0
    private var c8=0
    private var c18=0

    private var d1=0
    private var d11=0
    private var d2=0
    private var d12=0
    private var d3=0
    private var d13=0
    private var d4=0
    private var d14=0
    private var d5=0
    private var d15=0
    private var d6=0
    private var d16=0
    private var d7=0
    private var d17=0
    private var d8=0
    private var d18=0

    private var e1=0
    private var e11=0
    private var e2=0
    private var e12=0
    private var e3=0
    private var e13=0
    private var e4=0
    private var e14=0
    private var e5=0
    private var e15=0
    private var e6=0
    private var e16=0
    private var e7=0
    private var e17=0
    private var e8=0
    private var e18=0

    private var f1=0
    private var f11=0
    private var f2=0
    private var f12=0
    private var f3=0
    private var f13=0
    private var f4=0
    private var f14=0
    private var f5=0
    private var f15=0
    private var f6=0
    private var f16=0
    private var f7=0
    private var f17=0
    private var f8=0
    private var f18=0

    private var g1=0
    private var g11=0
    private var g2=0
    private var g12=0
    private var g3=0
    private var g13=0
    private var g4=0
    private var g14=0
    private var g5=0
    private var g15=0
    private var g6=0
    private var g16=0
    private var g7=0
    private var g17=0
    private var g8=0
    private var g18=0

    private var h1=0
    private var h11=0
    private var h2=0
    private var h12=0
    private var h3=0
    private var h13=0
    private var h4=0
    private var h14=0
    private var h5=0
    private var h15=0
    private var h6=0
    private var h16=0
    private var h7=0
    private var h17=0
    private var h8=0
    private var h18=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dibujo_libre)
        title="Dibujemos"
        setup11()
        setup12()
        setup13()
        setup14()
        setup15()
        setup16()
        setup17()
        setup18()
        eraser()


    }

    private fun setup11(){
        bt11.setOnClickListener {
            a11 = if(a1==0){
                bt11.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B181*")
                1
            }else{
                bt11.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B180*")
                0
            }
            a1 = if(a11==1) {
                1
            }else{
                0
            }
        }

        bt12.setOnClickListener {
            a12 = if(a2==0){
                bt12.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B171*")
                1
            }else{
                bt12.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B170*")
                0
            }
            a2 = if(a12==1) {
                1
            }else{
                0
            }
        }

        bt13.setOnClickListener {
            a13 = if(a3==0){
                bt13.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B161*")
                1
            }else{
                bt13.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B160*")
                0
            }
            a3 = if(a13==1) {
                1
            }else{
                0
            }
        }

        bt14.setOnClickListener {
            a14 = if(a4==0){
                bt14.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B151*")
                1
            }else{
                bt14.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B150*")
                0
            }
            a4 = if(a14==1) {
                1
            }else{
                0
            }
        }

        bt15.setOnClickListener {
            a15 = if(a5==0){
                bt15.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B141*")
                1
            }else{
                bt15.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B140*")
                0
            }
            a5 = if(a15==1) {
                1
            }else{
                0
            }
        }

        bt16.setOnClickListener {
            a16 = if(a6==0){
                bt16.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B131*")
                1
            }else{
                bt16.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B130*")
                0
            }
            a6 = if(a16==1) {
                1
            }else{
                0
            }
        }

        bt17.setOnClickListener {
            a17 = if(a7==0){
                bt17.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B121*")
                1
            }else{
                bt17.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B120*")
                0
            }
            a7 = if(a17==1) {
                1
            }else{
                0
            }
        }

        bt18.setOnClickListener {
            a18 = if(a8==0){
                bt18.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B111*")
                1
            }else{
                bt18.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B110*")
                0
            }
            a8 = if(a18==1) {
                1
            }else{
                0
            }
        }

    }

    private fun setup12(){
        bt21.setOnClickListener {
            b11 = if(b1==0){
                bt21.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B281*")
                1
            }else{
                bt21.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B280*")
                0
            }
            b1 = if(b11==1) {
                1
            }else{
                0
            }
        }

        bt22.setOnClickListener {
            b12 = if(b2==0){
                bt22.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B271*")
                1
            }else{
                bt22.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B270*")
                0
            }
            b2 = if(b12==1) {
                1
            }else{
                0
            }
        }

        bt23.setOnClickListener {
            b13 = if(b3==0){
                bt23.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B261*")
                1
            }else{
                bt23.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B260*")
                0
            }
            b3 = if(b13==1) {
                1
            }else{
                0
            }
        }

        bt24.setOnClickListener {
            b14 = if(b4==0){
                bt24.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B251*")
                1
            }else{
                bt24.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B250*")
                0
            }
            b4 = if(b14==1) {
                1
            }else{
                0
            }
        }

        bt25.setOnClickListener {
            b15 = if(b5==0){
                bt25.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B241*")
                1
            }else{
                bt25.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B240*")
                0
            }
            b5 = if(b15==1) {
                1
            }else{
                0
            }
        }

        bt26.setOnClickListener {
            b16 = if(b6==0){
                bt26.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B231*")
                1
            }else{
                bt26.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B230*")
                0
            }
            b6 = if(b16==1) {
                1
            }else{
                0
            }
        }

        bt27.setOnClickListener {
            b17 = if(b7==0){
                bt27.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B221*")
                1
            }else{
                bt27.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B220*")
                0
            }
            b7 = if(b17==1) {
                1
            }else{
                0
            }
        }

        bt28.setOnClickListener {
            b18 = if(b8==0){
                bt28.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B211*")
                1
            }else{
                bt28.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B210*")
                0
            }
            b8 = if(b18==1) {
                1
            }else{
                0
            }
        }

    }

    private fun setup13(){
        bt31.setOnClickListener {
            c11 = if(c1==0){
                bt31.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B381*")
                1
            }else{
                bt31.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B380*")
                0
            }
            c1 = if(c11==1) {
                1
            }else{
                0
            }
        }

        bt32.setOnClickListener {
            c12 = if(c2==0){
                bt32.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B371*")
                1
            }else{
                bt32.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B370*")
                0
            }
            c2 = if(c12==1) {
                1
            }else{
                0
            }
        }

        bt33.setOnClickListener {
            c13 = if(c3==0){
                bt33.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B361*")
                1
            }else{
                bt33.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B360*")
                0
            }
            c3 = if(c13==1) {
                1
            }else{
                0
            }
        }

        bt34.setOnClickListener {
            c14 = if(c4==0){
                bt34.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B351*")
                1
            }else{
                bt34.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B350*")
                0
            }
            c4 = if(c14==1) {
                1
            }else{
                0
            }
        }

        bt35.setOnClickListener {
            c15 = if(c5==0){
                bt35.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B341*")
                1
            }else{
                bt35.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B340*")
                0
            }
            c5 = if(c15==1) {
                1
            }else{
                0
            }
        }

        bt36.setOnClickListener {
            c16 = if(c6==0){
                bt36.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B331*")
                1
            }else{
                bt36.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B330*")
                0
            }
            c6 = if(c16==1) {
                1
            }else{
                0
            }
        }

        bt37.setOnClickListener {
            c17 = if(c7==0){
                bt37.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B321*")
                1
            }else{
                bt37.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B320*")
                0
            }
            c7 = if(c17==1) {
                1
            }else{
                0
            }
        }

        bt38.setOnClickListener {
            c18 = if(c8==0){
                bt38.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B311*")
                1
            }else{
                bt38.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B310*")
                0
            }
            c8 = if(c18==1) {
                1
            }else{
                0
            }
        }

    }

    private fun setup14(){
        bt41.setOnClickListener {
            d11 = if(d1==0){
                bt41.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B481*")
                1
            }else{
                bt41.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B480*")
                0
            }
            d1 = if(d11==1) {
                1
            }else{
                0
            }
        }

        bt42.setOnClickListener {
            d12 = if(d2==0){
                bt42.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B471*")
                1
            }else{
                bt42.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B470*")
                0
            }
            d2 = if(d12==1) {
                1
            }else{
                0
            }
        }

        bt43.setOnClickListener {
            d13 = if(d3==0){
                bt43.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B461*")
                1
            }else{
                bt43.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B460*")
                0
            }
            d3 = if(d13==1) {
                1
            }else{
                0
            }
        }

        bt44.setOnClickListener {
            d14 = if(d4==0){
                bt44.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B451*")
                1
            }else{
                bt44.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B450*")
                0
            }
            d4 = if(d14==1) {
                1
            }else{
                0
            }
        }

        bt45.setOnClickListener {
            d15 = if(d5==0){
                bt45.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B441*")
                1
            }else{
                bt45.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B440*")
                0
            }
            d5 = if(d15==1) {
                1
            }else{
                0
            }
        }

        bt46.setOnClickListener {
            d16 = if(d6==0){
                bt46.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B431*")
                1
            }else{
                bt46.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B430*")
                0
            }
            d6 = if(d16==1) {
                1
            }else{
                0
            }
        }

        bt47.setOnClickListener {
            d17 = if(d7==0){
                bt47.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B421*")
                1
            }else{
                bt47.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B420*")
                0
            }
            d7 = if(d17==1) {
                1
            }else{
                0
            }
        }

        bt48.setOnClickListener {
            d18 = if(d8==0){
                bt48.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B411*")
                1
            }else{
                bt48.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B410*")
                0
            }
            d8 = if(d18==1) {
                1
            }else{
                0
            }
        }

    }

    private fun setup15(){
        bt51.setOnClickListener {
            e11 = if(e1==0){
                bt51.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B581*")
                1
            }else{
                bt51.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B580*")
                0
            }
            e1 = if(e11==1) {
                1
            }else{
                0
            }
        }

        bt52.setOnClickListener {
            e12 = if(e2==0){
                bt52.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B571*")
                1
            }else{
                bt52.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B570*")
                0
            }
            e2 = if(e12==1) {
                1
            }else{
                0
            }
        }

        bt53.setOnClickListener {
            e13 = if(e3==0){
                bt53.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B561*")
                1
            }else{
                bt53.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B560*")
                0
            }
            e3 = if(e13==1) {
                1
            }else{
                0
            }
        }

        bt54.setOnClickListener {
            e14 = if(e4==0){
                bt54.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B551*")
                1
            }else{
                bt54.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B550*")
                0
            }
            e4 = if(e14==1) {
                1
            }else{
                0
            }
        }

        bt55.setOnClickListener {
            e15 = if(e5==0){
                bt55.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B541*")
                1
            }else{
                bt55.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B540*")
                0
            }
            e5 = if(e15==1) {
                1
            }else{
                0
            }
        }

        bt56.setOnClickListener {
            e16 = if(e6==0){
                bt56.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B531*")
                1
            }else{
                bt56.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B530*")
                0
            }
            e6 = if(e16==1) {
                1
            }else{
                0
            }
        }

        bt57.setOnClickListener {
            e17 = if(e7==0){
                bt57.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B521*")
                1
            }else{
                bt57.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B520*")
                0
            }
            e7 = if(e17==1) {
                1
            }else{
                0
            }
        }

        bt58.setOnClickListener {
            e18 = if(e8==0){
                bt58.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B511*")
                1
            }else{
                bt58.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B510*")
                0
            }
            e8 = if(e18==1) {
                1
            }else{
                0
            }
        }

    }

    private fun setup16(){
        bt61.setOnClickListener {
            f11 = if(f1==0){
                bt61.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B681*")
                1
            }else{
                bt61.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B680*")
                0
            }
            f1 = if(f11==1) {
                1
            }else{
                0
            }
        }

        bt62.setOnClickListener {
            f12 = if(f2==0){
                bt62.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B671*")
                1
            }else{
                bt62.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B670*")
                0
            }
            f2 = if(f12==1) {
                1
            }else{
                0
            }
        }

        bt63.setOnClickListener {
            f13 = if(f3==0){
                bt63.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B661*")
                1
            }else{
                bt63.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B660*")
                0
            }
            f3 = if(f13==1) {
                1
            }else{
                0
            }
        }

        bt64.setOnClickListener {
            f14 = if(f4==0){
                bt64.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B651*")
                1
            }else{
                bt64.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B650*")
                0
            }
            f4 = if(f14==1) {
                1
            }else{
                0
            }
        }

        bt65.setOnClickListener {
            f15 = if(f5==0){
                bt65.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B641*")
                1
            }else{
                bt65.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B640*")
                0
            }
            f5 = if(f15==1) {
                1
            }else{
                0
            }
        }

        bt66.setOnClickListener {
            f16 = if(f6==0){
                bt66.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B631*")
                1
            }else{
                bt66.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B630*")
                0
            }
            f6 = if(f16==1) {
                1
            }else{
                0
            }
        }

        bt67.setOnClickListener {
            f17 = if(f7==0){
                bt67.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B621*")
                1
            }else{
                bt67.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B620*")
                0
            }
            f7 = if(f17==1) {
                1
            }else{
                0
            }
        }

        bt68.setOnClickListener {
            f18 = if(f8==0){
                bt68.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B611*")
                1
            }else{
                bt68.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B610*")
                0
            }
            f8 = if(f18==1) {
                1
            }else{
                0
            }
        }

    }

    private fun setup17(){
        bt71.setOnClickListener {
            g11 = if(g1==0){
                bt71.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B781*")
                1
            }else{
                bt71.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B780*")
                0
            }
            g1 = if(g11==1) {
                1
            }else{
                0
            }
        }

        bt72.setOnClickListener {
            g12 = if(g2==0){
                bt72.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B771*")
                1
            }else{
                bt72.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B770*")
                0
            }
            g2 = if(g12==1) {
                1
            }else{
                0
            }
        }

        bt73.setOnClickListener {
            g13 = if(g3==0){
                bt73.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B761*")
                1
            }else{
                bt73.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B760*")
                0
            }
            g3 = if(g13==1) {
                1
            }else{
                0
            }
        }

        bt74.setOnClickListener {
            g14 = if(g4==0){
                bt74.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B751*")
                1
            }else{
                bt74.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B750*")
                0
            }
            g4 = if(g14==1) {
                1
            }else{
                0
            }
        }

        bt75.setOnClickListener {
            g15 = if(g5==0){
                bt75.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B741*")
                1
            }else{
                bt75.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B740*")
                0
            }
            g5 = if(g15==1) {
                1
            }else{
                0
            }
        }

        bt76.setOnClickListener {
            g16 = if(g6==0){
                bt76.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B731*")
                1
            }else{
                bt76.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B730*")
                0
            }
            g6 = if(g16==1) {
                1
            }else{
                0
            }
        }

        bt77.setOnClickListener {
            g17 = if(g7==0){
                bt77.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B721*")
                1
            }else{
                bt77.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B720*")
                0
            }
            g7 = if(g17==1) {
                1
            }else{
                0
            }
        }

        bt78.setOnClickListener {
            g18 = if(g8==0){
                bt78.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B711*")
                1
            }else{
                bt78.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B710*")
                0
            }
            g8 = if(g18==1) {
                1
            }else{
                0
            }
        }

    }

    private fun setup18(){
        bt81.setOnClickListener {
            h11 = if(h1==0){
                bt81.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B881*")
                1
            }else{
                bt81.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B880*")
                0
            }
            h1 = if(h11==1) {
                1
            }else{
                0
            }
        }

        bt82.setOnClickListener {
            h12 = if(h2==0){
                bt82.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B871*")
                1
            }else{
                bt82.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B870*")
                0
            }
            h2 = if(h12==1) {
                1
            }else{
                0
            }
        }

        bt83.setOnClickListener {
            h13 = if(h3==0){
                bt83.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B861*")
                1
            }else{
                bt83.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B860*")
                0
            }
            h3 = if(h13==1) {
                1
            }else{
                0
            }
        }

        bt84.setOnClickListener {
            h14 = if(h4==0){
                bt84.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B851*")
                1
            }else{
                bt84.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B850*")
                0
            }
            h4 = if(h14==1) {
                1
            }else{
                0
            }
        }

        bt85.setOnClickListener {
            h15 = if(h5==0){
                bt85.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B841*")
                1
            }else{
                bt85.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B840*")
                0
            }
            h5 = if(h15==1) {
                1
            }else{
                0
            }
        }

        bt86.setOnClickListener {
            h16 = if(h6==0){
                bt86.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B831*")
                1
            }else{
                bt86.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B830*")
                0
            }
            h6 = if(h16==1) {
                1
            }else{
                0
            }
        }

        bt87.setOnClickListener {
            h17 = if(h7==0){
                bt87.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B821*")
                1
            }else{
                bt87.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B820*")
                0
            }
            h7 = if(h17==1) {
                1
            }else{
                0
            }
        }

        bt88.setOnClickListener {
            h18 = if(h8==0){
                bt88.background = ResourcesCompat.getDrawable(resources, R.drawable.disenored, null)
                EnviarComando("B811*")
                1
            }else{
                bt88.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
                EnviarComando("B810*")
                0
            }
            h8 = if(h18==1) {
                1
            }else{
                0
            }
        }

    }

    private fun eraser(){

        eraser.setOnClickListener {
            EnviarComando("BC*")

            bt11.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt12.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt13.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt14.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt15.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt16.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt17.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt18.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)

            a1=0
            a2=0
            a3=0
            a4=0
            a5=0
            a6=0
            a7=0
            a8=0

            bt21.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt22.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt23.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt24.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt25.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt26.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt27.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt28.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)

            b1=0
            b2=0
            b3=0
            b4=0
            b5=0
            b6=0
            b7=0
            b8=0

            bt31.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt32.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt33.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt34.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt35.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt36.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt37.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt38.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)

            c1=0
            c2=0
            c3=0
            c4=0
            c5=0
            c6=0
            c7=0
            c8=0

            bt41.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt42.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt43.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt44.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt45.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt46.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt47.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt48.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)

            d1=0
            d2=0
            d3=0
            d4=0
            d5=0
            d6=0
            d7=0
            d8=0

            bt51.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt52.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt53.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt54.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt55.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt56.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt57.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt58.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)

            e1=0
            e2=0
            e3=0
            e4=0
            e5=0
            e6=0
            e7=0
            e8=0

            bt61.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt62.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt63.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt64.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt65.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt66.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt67.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt68.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)

            f1=0
            f2=0
            f3=0
            f4=0
            f5=0
            f6=0
            f7=0
            f8=0

            bt71.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt72.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt73.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt74.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt75.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt76.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt77.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt78.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)

            g1=0
            g2=0
            g3=0
            g4=0
            g5=0
            g6=0
            g7=0
            g8=0

            bt81.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt82.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt83.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt84.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt85.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt86.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt87.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)
            bt88.background = ResourcesCompat.getDrawable(resources, R.drawable.diseno, null)

            h1=0
            h2=0
            h3=0
            h4=0
            h5=0
            h6=0
            h7=0
            h8=0

        }

    }

    private fun EnviarComando(bytes: String){

        if (Panel.m_bluetoothSocket != null){
            try {
                Panel.m_bluetoothSocket!!.outputStream.write(bytes.toByteArray())
            }catch (e: IOException){
                val C = e.printStackTrace()
                Toast.makeText(this, C.toString(), Toast.LENGTH_SHORT).show()
            }
        }

    }//Fin de la funcion enviar comando
}