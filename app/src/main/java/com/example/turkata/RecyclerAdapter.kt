package com.example.turkata

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class RecyclerAdapter(val atalist : ArrayList<String>,val ataresim : ArrayList<Int>) :RecyclerView.Adapter<RecyclerAdapter.TurkAtaVH>() {
    class TurkAtaVH (itemView: View): RecyclerView.ViewHolder(itemView){

var button1 : Button

init {
    button1 = itemView.findViewById(R.id.button1)


}
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TurkAtaVH {
var itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)





        return TurkAtaVH(itemView)

    }

    override fun onBindViewHolder(holder: TurkAtaVH, position: Int) {
       var button2 = holder.button1.findViewById<Button>(R.id.button1)
        button2.setOnClickListener {
            val intent = Intent(holder.itemView.context,tainitimactivity::class.java)
            intent.putExtra("ataisim",atalist.get(position))
            intent.putExtra("atagoresel",ataresim.get(position))
            holder.itemView.context.startActivity(intent)


        }
holder.button1.text= atalist[(position)]



    }

    override fun getItemCount(): Int {
        return atalist.size
    }


}