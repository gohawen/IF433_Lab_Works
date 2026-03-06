package oop_00000114726_Kurniawan.week05

fun main() {
    val myWallet = EWallet("Budi", 50000.0)
    val myCard = CreditCard("Budi", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(myWallet, myCard)

    val bayar75k = 75000.0

    println("===================")
    for (payment in paymentList) {
        payment.processPayment(bayar75k)
    }
}