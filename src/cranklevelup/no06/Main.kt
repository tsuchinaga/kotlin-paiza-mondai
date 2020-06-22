package cranklevelup.no06

fun main() {
    var h = readLine()!!.toInt()
    val a = mutableListOf<Int>()
    val b = mutableListOf<Int>()
    var i = 0
    while (h > 0) {
        i++
        val ad = if (b.size >= 2) b[0] + b[1] else 1
        val bd = if (a.size >= 2) a[0] * 2 + a[1] else 1

        h -= bd
        a.add(0, ad)
        b.add(0, bd)
    }
    println(i)
}
