package com.amanhnb88.koperasi.model

/**
 * Model data untuk menyimpan informasi detail setiap Anggota koperasi.
 */
data class Anggota(
    val idAnggota: String = "",
    val nama: String = "",
    val noHp: String = "",
    val alamat: String = "",
    val tanggalDaftar: Long = System.currentTimeMillis()
)
