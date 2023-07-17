fun main() {
    var firstName: String = "Diway"
    var lastName: String = "Afniwar"
    var namaTambah: String = "Raffasya"
    var fullName: String = "Diway Afniwar"
    var alamatRumah: String = """
        Jl. Burangkeng Kp. Cinyosog Rt 3/4 No 13
        Ds Burangkeng kec Setu  Kab Bekasi
        Jawa Barat
        Indonnesia
    """
    var alamatKontrak: String = """
        Jl. Burangkeng Kp. Cinyosog Rt 3/4 No 13
        Ds Burangkeng kec Setu  Kab Bekasi
        Jawa Barat
        Indonesia
    """.trimIndent()

    println(firstName)
    println(lastName)
    println(fullName)
    println(alamatRumah)
    println(alamatKontrak)

    // String trim margin

    var alamatSatu: String = """
        |Gg Haji Salam 2 No 54
        |Rt 04 Rw 01
        |Rawalumbu Pengasinan
        |Bekasi Jawa Barat
        |Indonesia
    """.trimMargin()

    var alamatDua: String = """
        >Gg Haji Salam 2 No 54
        >Rt 04 Rw 01
        >Rawalumbu Pengasinan
        >Bekasi Jawa Barat
        >Indonesia
    """.trimMargin(marginPrefix = ">")
    println(alamatSatu)
    println(alamatDua)

    // Menggabungkan string

    var fullName2: String = firstName + " " + lastName

    println(fullName2)

    var fullName3: String = "$firstName $namaTambah $lastName"
    println(fullName3)

    var desc : String = "total $fullName3 adalah = ${fullName3.length}"
    println(desc)

}