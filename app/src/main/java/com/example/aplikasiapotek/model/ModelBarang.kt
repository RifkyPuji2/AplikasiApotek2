package com.example.aplikasiapotek.model

class ModelBarang {

    var key: String? = null
    var nama: String? = null
    var jenis: String? = null
    var harga: String? = null

    constructor() {}

    constructor(namaObat: String?, jenisObat: String?, hargaObat: String?) {
        nama = namaObat
        jenis = jenisObat
        harga = hargaObat
    }
}