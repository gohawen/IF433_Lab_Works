package oop_00000114726_Kurniawan.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}