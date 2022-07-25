package com.example.turkata

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_tainitimactivity.*


class tainitimactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tainitimactivity)
        val intent = intent
        val secilenataisim = intent.getStringExtra("ataisim")
        textView1.text =secilenataisim
        val secilenataresim = intent.getIntExtra("atagoresel",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,secilenataresim)
        imageView2.setImageBitmap(bitmap)




    }

}