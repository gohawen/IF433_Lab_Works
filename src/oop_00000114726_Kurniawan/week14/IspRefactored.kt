package oop_00000114726_Kurniawan.week14

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String)
}

class ModernSimplePrinter : Printable {
    override fun print(doc: String) = println("Printing securely: $doc")
}