package cranklevelup.no03

fun main() {
    val nmk = readLine()!!.split(" ")
    repeat(nmk[0].toInt()) {
        println(readLine()!!.split(" ").map { a -> if (a == nmk[2]) 1 else 0 }.sum())
    }
}
