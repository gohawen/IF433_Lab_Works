package Latihan

// 1. Mendefinisikan Enum Class
enum class StatusPaket {
    DIKEMAS,
    DIKIRIM,
    DITERIMA,
    DIBATALKAN
}

fun main() {
    // 2. Menggunakan nilai Enum
    val statusSaatIni = StatusPaket.DIKIRIM

    println("Status Paket Anda saat ini: $statusSaatIni")

    // 3. Enum dengan When (Sangat sering keluar di UTS)
    val pesan = when (statusSaatIni) {
        StatusPaket.DIKEMAS -> "Penjual sedang menyiapkan barangmu."
        StatusPaket.DIKIRIM -> "Paket sedang dalam perjalanan bersama kurir."
        StatusPaket.DITERIMA -> "Paket sudah sampai! Jangan lupa beri rating."
        StatusPaket.DIBATALKAN -> "Maaf, pesanan Anda telah dibatalkan."
    }

    println("Info: $pesan")
}