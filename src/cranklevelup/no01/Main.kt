package cranklevelup.no01

fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val s = readLine()!!.split(" ")
        println("${s[0]} ${s[1].toInt() + 1}")
    }
}
