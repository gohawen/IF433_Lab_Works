package oop_00000114726_Kurniawan.week01

fun main() {
    // Variable definition
    val radius = 7.0
    val pi = 3.14

    // Calculation
    val area = pi * radius * radius

    // Output Concatenation
    println("Radius: $radius, Area: $area")

    // Logic Check
    println(checkSize(area))
}

fun checkSize(area: Double): String =
    if (area > 100) "This is a Big Circle"
    else "This is a Small Circle"