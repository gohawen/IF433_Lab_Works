package oop_00000114726_Kurniawan.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName - E-Wallet] Pembayaran sebesar $amount berhasil. Sisa saldo: $balance")
        } else {
            println("[$accountName - E-Wallet] Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName - E-Wallet] Top up berhasil. Saldo saat ini: $balance")
    }
}