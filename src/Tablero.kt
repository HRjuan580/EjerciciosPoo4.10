class Tablero {
    private val cells = Array(9) { ' ' }

    fun placeSymbol(position: Int, symbol: Char): Boolean {
        if (position < 0 || position >= 9 || cells[position] != ' ') {
            return false
        }
        cells[position] = symbol
        return true
    }

    fun isFull(): Boolean = cells.all { it != ' ' }

    fun hasWinner(): Boolean {
        val winningCombinations = listOf(
            listOf(0, 1, 2), listOf(3, 4, 5), listOf(6, 7, 8), // Rows
            listOf(0, 3, 6), listOf(1, 4, 7), listOf(2, 5, 8), // Columns
            listOf(0, 4, 8), listOf(2, 4, 6) // Diagonals
        )

        return winningCombinations.any { (a, b, c) ->
            cells[a] != ' ' && cells[a] == cells[b] && cells[b] == cells[c]
        }
    }

    fun display() {
        println(" ${cells[0]} | ${cells[1]} | ${cells[2]} ")
        println("---+---+---")
        println(" ${cells[3]} | ${cells[4]} | ${cells[5]} ")
        println("---+---+---")
        println(" ${cells[6]} | ${cells[7]} | ${cells[8]} ")
    }
}