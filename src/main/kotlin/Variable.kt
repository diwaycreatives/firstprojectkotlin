fun main() {
    // varibale mutable menggunakan var
    // artinya isi data bisa langsung di rubah

    var firstName: String = "Diway"
    var lastName: String = "Afniwar"

    // mengubah variable
    lastName = "Diway Alfariq Afniwar"
    println(lastName)

    //==============================================================//

    // variable Immutable menggunakan val
    //artinya variable yg di buat untuk tidak bisa di rubah

    val namaPertama: String = "Angeline"
    val namaKedua: String = "Nasution"

    // akan error jika data tsb di ganti
    //namaKedua = "Alfariq"//error
    //println(namaKedua)

    var dataPertama : String? = "Eko"
    dataPertama = null

    // error karena dataPertama bisa null
    //println(dataPertama.length)

    //cara mengakses yg benar agar null bisa di panggil adalah dengan tambahan tanda ?
    println(dataPertama?.length)

    //====================================================================//

    // variable constant
    // adalah sebuah data yang disetting untuk keperluan GLOBAL
    // Global artinya bisa diakses dimanapun

    println("Selamat datang di $APP version $VERSION")


}

// ini adalah varibel constant global
const val APP = "Aplikasi Kotlin"
const val VERSION = "1.0.0"
