class Juego(private val player1: Jugador, private val player2: Jugador) {
    private val board = Tablero()
    private var currentPlayer = player1

    fun play() {
        println("¡Bienvenido al juego del 3 en raya!")
        board.display()

        while (true) {
            println("${currentPlayer.name}, es tu turno (símbolo: ${currentPlayer.symbol})")
            print("Ingresa la posición (0-8): ")
            val position = readLine()?.toIntOrNull() ?: continue

            if (currentPlayer.makeMove(board, position)) {
                board.display()

                if (board.hasWinner()) {
                    println("¡${currentPlayer.name} ha ganado!")
                    break
                } else if (board.isFull()) {
                    println("¡Es un empate!")
                    break
                }

                currentPlayer = if (currentPlayer == player1) player2 else player1
            } else {
                println("Movimiento inválido. Inténtalo de nuevo.")
            }
        }
    }
}