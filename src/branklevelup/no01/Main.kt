package branklevelup.no01

fun main() {
    val n = readLine()!!.toInt()
    var sum = 0
    repeat(n) {
        val a = readLine()!!.toInt()
        if (5 <= a) sum += a
    }
    println(sum)
}
