fun main() {
    // range di array
    val range = 0..1000
    println(range)
    println(range.count())
    println(range.contains(39))
    println(range.contains(2000))
    println(range.first)
    println(range.last)
    println(range.step)

    //range dengan perhitungan terbalik

    val nilai = 2000 downTo 1
    println(nilai)
    println(nilai.count())
    println(nilai.contains(39))
    println(nilai.contains(2000))
    println(nilai.first)
    println(nilai.last)
    println(nilai.step)


}