package com.amanhnb88.koperasi.model

/**
 * Model data untuk menyimpan informasi pencairan pinjaman,
 * termasuk skenario potongan admin di awal dan rincian hutang.
 */
data class Pinjaman(
    val idPinjaman: String = "",
    val idAnggota: String = "",
    val plafond: Double = 0.0,
    val potonganAdmin: Double = 0.0,
    val bunga: Double = 0.0,
    val totalHutang: Double = 0.0,
    val sisaHutang: Double = 0.0,
    val tenorHari: Int = 30,
    val setoranHarian: Double = 0.0,
    val status: String = "AKTIF", // "AKTIF" atau "LUNAS"
    val tanggalPencairan: Long = System.currentTimeMillis()
)
