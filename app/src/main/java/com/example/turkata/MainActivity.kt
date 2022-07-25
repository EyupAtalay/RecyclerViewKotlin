package com.example.turkata

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


val turkataIsimleri = ArrayList<String>()
        turkataIsimleri.add("Atilla")
        turkataIsimleri.add("Fatih Sultan Mehmet")
        turkataIsimleri.add("Mete Han")
        turkataIsimleri.add("Timur")
        turkataIsimleri.add("Mustafa Kemal Atatürk")
        turkataIsimleri.add("Yavuz Sultan Selim")
        turkataIsimleri.add("Bumin Kağan")




        val atillaimage =R.drawable.atilla
        val fatihimage = R.drawable.fatihsultanmehmet
        val meteimage = R.drawable.metehan
        val timurimage = R.drawable.timur
        val ataturkimage = R.drawable.ataturk
        val selimimage = R.drawable.selim
        val buminimage = R.drawable.buminkagan



        val turkatagorsel = ArrayList<Int>()
        turkatagorsel.add(atillaimage)
        turkatagorsel.add(fatihimage)
        turkatagorsel.add(meteimage)
        turkatagorsel.add(timurimage)
        turkatagorsel.add(ataturkimage)
        turkatagorsel.add(selimimage)
        turkatagorsel.add(buminimage)


        val adapter = RecyclerAdapter(turkataIsimleri,turkatagorsel)

        val layoutManager = LinearLayoutManager(this)

      var rview = RecyclerView(applicationContext)

        rview = findViewById(R.id.recyclerView3)
        rview.layoutManager = LinearLayoutManager(this)
        rview.adapter = adapter





    }
}