package warset.no05

fun main() {
    val m = readLine()!!.toInt()
    when {
        m <= 5 -> println("raw")
        m <= 7 -> println("soft boiled")
        else -> println("hard boiled")
    }
}
