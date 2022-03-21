package com.example.aplikasiapotek.holder

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasiapotek.R

class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    @JvmField
    var namaObat: TextView

    @JvmField
    var jenisObat: TextView

    @JvmField
    var hargaObat: TextView

    @JvmField
    var view: CardView

    init {
        namaObat = itemView.findViewById(R.id.nama_obat)
        jenisObat = itemView.findViewById(R.id.jenis_obat)
        hargaObat = itemView.findViewById(R.id.harga_obat)
        view = itemView.findViewById(R.id.cvMain)
    }
}