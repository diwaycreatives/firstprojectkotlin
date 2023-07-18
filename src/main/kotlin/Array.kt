fun main() {
    // array di kotlin
    val anggota: Array<String> = arrayOf("diway", "angel", "raffa")

    // operasi array mengganti dan edit data di array
    println(anggota)
    println(anggota.size)
    println(anggota.get(0))
    println(anggota[0])
    println(anggota.set(1, "angeline nasution"))
    println(anggota[1])

    anggota[2] = "Raffasya"
    println(anggota[0])
    println(anggota[1])
    println(anggota[2])

    // array nullable

    val nama: Array<String?> = arrayOfNulls(5)
    nama.set(0, null)
    nama.set(1, "didi")
    nama.set(2, "dudu")
    nama.set(3, "dodo")
    nama.set(4, null)

    println(nama.size)
    println(nama[0])
    println(nama[1])
    println(nama[2])

    val nilai : Array<Byte> = arrayOf(100, 90, 67)
    val saldo : Array<Int> = arrayOf(10_000, 20_000, 30_000)

    println(nilai)
    println(saldo)



}