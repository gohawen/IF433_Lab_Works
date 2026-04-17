package Latihan

class AkunBank(val namaPemilik: String, saldoAwal: Double) {

    // 1. Private Property
    private var saldo: Double = saldoAwal

    // 2. Public Method untuk melihat saldo (Getter)
    fun cekSaldo() {
        println("Saldo $namaPemilik saat ini: Rp$saldo")
    }

    // 3. Public Method untuk mengubah data dengan validasi (Setter)
    fun tarikTunai(jumlah: Double) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah
            println("Berhasil menarik Rp$jumlah")
        } else {
            println("Transaksi Gagal: Saldo tidak cukup atau jumlah tidak valid!")
        }
    }
}

fun main() {
    val akunAwen = AkunBank("Goh Awen", 1000000.0)

    akunAwen.cekSaldo()
    akunAwen.tarikTunai(500000.0)

    // akunAwen.saldo = 50000000.0 // ERROR! Tidak bisa diakses karena private

    akunAwen.cekSaldo()
}