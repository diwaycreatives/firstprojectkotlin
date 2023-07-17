import javax.print.attribute.standard.PrinterInfo

fun main() {

    // underscore in number
    var age : Byte = 80
    var height : Int = 170
    var distance: Short = 2000
    var balance : Long = 100000000L


    println(age)
    println(height)
    println(distance)
    println(balance)

    // floating point number
    var value : Float = 89.99F
    var radius : Double = 234212423432435.567656753
    println(value)
    println(radius)

    // literals

    var decimalLiteral : Int = 100
    var hexadecimalLiteral : Int = 0xFF
    var binaryLiteral: Int = 0b0001

    println(decimalLiteral)
    println(hexadecimalLiteral)
    println(binaryLiteral)


    // underscore in number
    // underscore di gunakan hanya untuk pemisah angka dan tidak ada dampak apapun dalam perhitungan di kotlin

    var umur : Byte = 3_0
    var berat : Int = 1_7_0
    var jarak : Short = 2_000
    var saldo : Long = 100_000_000L

    println(umur)
    println(berat)
    println(jarak)
    println(saldo)

    // conversion

    var number: Int = 100
    // di conversion ke satuam number lain
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long : Long =number.toLong()
    var float : Float = number.toFloat()
    var double : Double = number.toDouble()

    println(byte)
    println(short)
    println(int)
    println(long)
    println(float)
    println(double)
}