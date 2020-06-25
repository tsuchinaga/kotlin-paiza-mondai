package branklevelup.no10

fun main() {
    val eyes: MutableList<Int> = mutableListOf()
    repeat(5) {
        readLine()!!.split("").filter { c -> c != "" }.map { eye ->
            eyes.add(
                when (eye) {
                    "O" -> 1
                    "X" -> -1
                    else -> 0
                }
            )
        }
    }

    listOf(
        listOf(0, 1, 2, 3, 4),
        listOf(5, 6, 7, 8, 9),
        listOf(10, 11, 12, 13, 14),
        listOf(15, 16, 17, 18, 19),
        listOf(20, 21, 22, 23, 24),
        listOf(0, 5, 10, 15, 20),
        listOf(1, 6, 11, 16, 21),
        listOf(2, 7, 12, 17, 22),
        listOf(3, 8, 13, 18, 23),
        listOf(4, 9, 14, 19, 24),
        listOf(0, 6, 12, 18, 24),
        listOf(4, 8, 12, 16, 20)
    ).forEach { line ->
        when (line.map { eyes[it] }.sum()) {
            5 -> {
                println("O")
                return
            }
            -5 -> {
                println("X")
                return
            }
        }
    }
    println("D")
}
