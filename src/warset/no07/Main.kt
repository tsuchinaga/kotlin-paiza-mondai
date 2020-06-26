package warset.no07

fun main() {
    val list = mutableListOf<Int>()
    repeat(readLine()!!.toInt()) {
        val a = readLine()!!.toInt()
        if (a % 2 == 1) list.add(a)
    }
    list.sort()
    list.forEach { n -> println(n) }
}
