package Latihan

// 1. Menggunakan 'object' bukan 'class'
object AppSettings {
    var theme: String = "Light"
    var language: String = "Indonesia"

    fun showInfo() {
        println("Tema saat ini: $theme, Bahasa: $language")
    }
}

fun main() {
    // 2. Akses langsung menggunakan nama object-nya (Tanpa tanda kurung ())
    AppSettings.showInfo()

    // 3. Ubah nilainya di satu tempat
    AppSettings.theme = "Dark"

    // 4. Di bagian lain program, nilainya tetap yang terbaru
    checkStatus()
}

fun checkStatus() {
    println("Status di fungsi lain: ${AppSettings.theme}") // Output: Dark
}