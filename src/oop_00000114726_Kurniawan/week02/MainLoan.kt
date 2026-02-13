package oop_00000114726_Kurniawan.week02

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    println("=== SISTEM DENDA PERPUSTAKAAN ===")

    print("Masukkan Judul Buku   : ")
    val judul = input.nextLine()

    print("Masukkan Nama Peminjam : ")
    val peminjam = input.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var durasi = input.nextInt()

    if (durasi < 0) {
        println("[Peringatan] Durasi tidak boleh minus. Otomatis diubah ke 1 hari.")
        durasi = 1
    }

    val dataPinjam = Loan(judul, peminjam, durasi)

    println("\n--- Detail Peminjaman ---")
    println("Judul Buku    : ${dataPinjam.bookTitle}")
    println("Nama Peminjam : ${dataPinjam.borrower}")
    println("Lama Pinjam   : ${dataPinjam.loanDuration} hari")
    println("Total Denda   : Rp ${dataPinjam.calculateFine()}")
}