package uts_00000114726_Kurniawan

import java.util.Scanner

enum class OrderStatus{
    WAITING_LIST,
    COOKING,
    DELIVERED
}

abstract class CateringMenu(val name: String, val price: Double){
    open class namaMenu(val name: String, val price: Double)
}

class FoodMenu(name: String, price: Double) : CateringMenu(name, price) {
    val menu1 = namaMenu("Nasi Goreng Spesial", 25000.0)
    val menu2 = namaMenu("Ayam Bakar Madu", 35000.0)
}

class DrinkMenu(name: String, price: Double) : CateringMenu(name, price) {
    val menu3 = namaMenu("Es Teh Lemon", 8000.0)
}

fun main() {
    println("--- CUSTOMER DATA INPUT ---")
    println("Enter Customer Name: ")
    val name = Scanner(System.`in`).nextLine()
    println("Enter Phone Number: ")
    val phone = Scanner(System.`in`).nextLine()
    println("Enter Delivery Address: ")
    val address = Scanner(System.`in`).nextLine()

    println("\n--- MENU CATALOG ---")
    println("1. Nasi Goreng Spesial")
    println("2. Ayam Bakar Madu")
    println("3. Es Teh Lemon")
    println("Select Menu Number: ")
    val order = Scanner(System.`in`).nextLine()
    println("Enter Quantity: ")
    val quantity = Scanner(System.`in`).nextInt()
    print("Order Successfully added!")
    println("\nProcessing Checkout...")
    println("\n========== INVOICE ==========")
    println("Customer: $name ($phone)")
    println("Delivery Address: $address")
    println("Order Status: ${OrderStatus.COOKING}")

    when(order) {
        "1" -> println("$quantity Nasi Goreng Spesial")
        "2" -> println("$quantity Ayam Bakar Madu")
        "3" -> println("$quantity Es Teh Lemon")
    }

    var total: Double

    when(order) {
        "1" -> println("Grand Total = Rp ${quantity * 25000.0}")
        "2" -> println("Grand Total = Rp ${quantity * 35000.0}")
        "3" -> println("Grand Total = Rp ${quantity * 8000.0}")
    }
}