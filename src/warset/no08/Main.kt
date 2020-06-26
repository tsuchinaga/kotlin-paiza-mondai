package warset.no08

fun main() {
    val users = mutableListOf<String>()
    repeat(readLine()!!.toInt()) {
        val c = readLine()!!
        if (users.contains(c)) println("NO")
        else {
            println("YES")
            users.add(c)
        }
    }
}
