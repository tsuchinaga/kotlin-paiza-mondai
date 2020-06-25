package branklevelup.no09

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    if (readLine()!! in x..y) println("true") else println("false")
}
