package Latihan

// Parent Class (Umum)
open class Pengguna(val nama: String) {
    fun login() {
        println("$nama berhasil login ke sistem.")
    }
}

// Child Class (Spesifik: Mahasiswa)
class Mahasiswa(nama: String, val nim: String) : Pengguna(nama) {
    fun cekKRS() {
        println("$nama sedang mengecek KRS.")
    }
}

// Child Class (Spesifik: Dosen)
class Dosen(nama: String, val nip: String) : Pengguna(nama) {
    fun inputNilai() {
        println("Dosen $nama sedang menginput nilai UTS.")
    }
}

fun main() {
    val mhs = Mahasiswa("Awen", "00000012345")
    val dsn = Dosen("Pak Budi", "19880101")

    // Keduanya bisa login karena mewarisi dari 'Pengguna'
    mhs.login()
    dsn.login()

    // Tapi mereka punya fungsi spesifik masing-masing
    mhs.cekKRS()
    dsn.inputNilai()
}