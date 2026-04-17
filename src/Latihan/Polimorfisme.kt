package Latihan

// 1. Abstract Class (Induk yang umum)
abstract class Pembayaran(val jumlah: Double) {
    // Fungsi biasa (sudah ada isinya)
    fun tampilkanStruk() {
        println("Memproses pembayaran sebesar Rp$jumlah")
    }

    // Fungsi abstrak (WAJIB diisi oleh anaknya nanti)
    abstract fun prosesBayar()
}

// 2. Interface (Kemampuan tambahan)
interface Promo {
    fun gunakanVoucher()
}

// 3. Implementasi: Transfer Bank (Anak dari Pembayaran)
class TransferBank(jumlah: Double) : Pembayaran(jumlah) {
    override fun prosesBayar() {
        println("Silahkan transfer ke Virtual Account BCA: 123456")
    }
}

// 4. Implementasi: E-Wallet (Anak dari Pembayaran + Punya kemampuan Promo)
class EWallet(jumlah: Double) : Pembayaran(jumlah), Promo {
    override fun prosesBayar() {
        println("Scan QRIS untuk membayar dengan saldo E-Wallet.")
    }

    override fun gunakanVoucher() {
        println("Voucher diskon 10% berhasil dipasang!")
    }
}

fun main() {
    // POLIMORFISME: Menggunakan tipe data induk (Pembayaran) untuk objek yang berbeda
    val listPembayaran: List<Pembayaran> = listOf(
        TransferBank(50000.0),
        EWallet(75000.0)
    )

    for (item in listPembayaran) {
        item.tampilkanStruk()
        item.prosesBayar() // Hasilnya beda-beda meski perintahnya sama!

        if (item is Promo) {
            item.gunakanVoucher()
        }
        println("--------------------")
    }
}