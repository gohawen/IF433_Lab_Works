package Latihan

class Robot(val nama: String) {

    // 1. Metode Tanpa Parameter (Hanya menjalankan aksi)
    fun perkenalkanDiri() {
        println("Halo, saya adalah robot $nama.")
    }

    // 2. Metode Dengan Parameter (Menerima data dari luar)
    fun jalan(jarak: Int) {
        println("$nama berjalan sejauh $jarak meter.")
    }

    // 3. Metode dengan Return Value (Mengembalikan hasil)
    fun hitungBaterai(persen: Int): String {
        return "Sisa baterai $nama adalah $persen%"
    }
}

fun main() {
    // Membuat objek dari class Robot
    val myRobot = Robot("Robo-UMN")

    // Memanggil metode-metode tersebut
    myRobot.perkenalkanDiri()
    myRobot.jalan(50)

    val status = myRobot.hitungBaterai(85)
    println(status)
}