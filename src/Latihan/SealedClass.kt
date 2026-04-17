package Latihan

// 1. Definisikan Sealed Class (Induk Notifikasi)
sealed class Notifikasi {
    // Pesan Teks: Butuh data Pengirim dan Pesan
    data class PesanTeks(val pengirim: String, val isi: String) : Notifikasi()

    // Panggilan: Butuh data Penelepon dan Durasi
    data class Panggilan(val penelepon: String, val durasi: Int) : Notifikasi()

    // Update Sistem: Cukup status saja (pakai object karena tidak butuh data unik)
    object UpdateSistem : Notifikasi()
}

// 2. Fungsi untuk memproses notifikasi (Logika Program)
fun tampilkanNotifikasi(notif: Notifikasi) {
    // Di sini 'when' bekerja sangat sakti dengan Sealed Class
    when (notif) {
        is Notifikasi.PesanTeks -> {
            println("[PESAN BARU] ${notif.pengirim}: ${notif.isi}")
        }
        is Notifikasi.Panggilan -> {
            println("[PANGGILAN TAK TERJAWAB] Dari: ${notif.penelepon} (${notif.durasi} detik)")
        }
        is Notifikasi.UpdateSistem -> {
            println("[INFO SISTEM] Perangkat lunak Anda telah diperbarui ke versi terbaru.")
        }
        // Perhatikan: Tidak butuh 'else' karena semua tipe sudah tertutup (Sealed)
    }
}

fun main() {
    // 3. Membuat objek (Instance) dari tiap jenis notifikasi
    val pesanMasuk = Notifikasi.PesanTeks("Awen", "Halo, sudah siap UTS?")
    val panggilanMasuk = Notifikasi.Panggilan("Mama", 45)
    val infoUpdate = Notifikasi.UpdateSistem

    // 4. Jalankan program
    println("--- DAFTAR NOTIFIKASI ANDA ---")
    tampilkanNotifikasi(pesanMasuk)
    tampilkanNotifikasi(panggilanMasuk)
    tampilkanNotifikasi(infoUpdate)
}