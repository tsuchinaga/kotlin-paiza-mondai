package branklevelup.no02

fun main() {
    val n = readLine()!!.toInt()
    var sum = 0
    repeat(n) {
        val ab = readLine()!!.split(" ").map { it.toInt() }
        sum += if (ab[0] == ab[1]) ab[0] * ab[1] else ab[0] + ab[1]
    }
    println(sum)
}
