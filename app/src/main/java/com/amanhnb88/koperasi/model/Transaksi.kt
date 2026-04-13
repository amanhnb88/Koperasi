package com.amanhnb88.koperasi.model

/**
 * Model data untuk merekam setiap pembayaran cicilan harian dari anggota.
 */
data class Transaksi(
    val idTransaksi: String = "",
    val idPinjaman: String = "",
    val nominalBayar: Double = 0.0,
    val tanggalBayar: Long = System.currentTimeMillis(),
    val namaKasir: String = ""
)
