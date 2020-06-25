package branklevelup.no06

fun main() {
    val c = readLine()!!
    val s = readLine()!!
    var sum = 0
    repeat(s.length - c.length + 1) { if (s.substring(it, it + c.length) == c) sum++ }
    println(sum)
}
