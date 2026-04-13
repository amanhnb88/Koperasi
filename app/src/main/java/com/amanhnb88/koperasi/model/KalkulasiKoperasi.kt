package com.amanhnb88.koperasi.utils

import com.amanhnb88.koperasi.model.Pinjaman

/**
 * Berisi logika bisnis dan perhitungan angka (Uang dan Hutang).
 * Objek ini mempermudah kita agar tidak perlu menulis ulang rumus matematika di banyak tempat.
 */
object KalkulasiKoperasi {

    /**
     * Sesuai Skenario A & B di dokumen rencanamu.
     * Mengembalikan data [Pinjaman] yang sudah dihitung beserta nominal uang yang cair ke tangan anggota.
     */
    fun buatPinjamanBaru(
        idAnggota: String,
        plafond: Double,
        admin: Double,
        bunga: Double,
        tenor: Int
    ): Pair<Pinjaman, Double> {
        
        // Skenario A: Uang tunai yang benar-benar diterima anggota (potong admin di depan)
        val uangCairKeAnggota = plafond - admin
        
        // Skenario B: Total kewajiban yang harus dibayar dan setoran per hari
        val totalHutang = plafond + bunga
        val setoranHarian = totalHutang / tenor
        
        // Membuat data pinjaman baru berdasarkan kalkulasi di atas
        val pinjamanBaru = Pinjaman(
            idPinjaman = "PINJ-" + System.currentTimeMillis(),
            idAnggota = idAnggota,
            plafond = plafond,
            potonganAdmin = admin,
            bunga = bunga,
            totalHutang = totalHutang,
            sisaHutang = totalHutang, // Sisa hutang di awal = total hutang
            tenorHari = tenor,
            setoranHarian = setoranHarian,
            status = "AKTIF"
        )
        
        return Pair(pinjamanBaru, uangCairKeAnggota)
    }
}
