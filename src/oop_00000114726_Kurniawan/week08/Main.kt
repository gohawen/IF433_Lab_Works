package oop_00000114726_Kurniawan.week08

fun main() {
    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

    for(item in mixedData) {
        val text = item as? String

        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast + fallback: $safeString")

    val apiResponse: Map<String, String?> = mapOf("status" to "200", "token" to null)
    try {
        val token = requireNotNull(apiResponse["token"]) {
            "CRITICAL EXCEPTION: Token otentikasi tidak ditemukan dari server!"
        }
    }
    catch(e: IllegalArgumentException) {
        println(e.message)
    }
}