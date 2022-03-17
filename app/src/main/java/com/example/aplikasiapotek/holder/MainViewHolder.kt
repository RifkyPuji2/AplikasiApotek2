package com.example.aplikasiapotek.holder

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasiapotek.R

class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    @JvmField
    var namaBarang: TextView

    @JvmField
    var merkBarang: TextView

    @JvmField
    var hargaBarang: TextView

    @JvmField
    var view: CardView

    init {
        namaBarang = itemView.findViewById(R.id.nama_obat)
        merkBarang = itemView.findViewById(R.id.jenis_obat)
        hargaBarang = itemView.findViewById(R.id.harga_obat)
        view = itemView.findViewById(R.id.cvMain)
    }
}