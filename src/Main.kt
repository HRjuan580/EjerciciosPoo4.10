fun main() {
    println("Jugador 1, ingresa tu nombre:")
    val player1Name = readLine() ?: "Jugador 1"
    val player1 = Jugador(player1Name, 'X')

    println("Jugador 2, ingresa tu nombre:")
    val player2Name = readLine() ?: "Jugador 2"
    val player2 = Jugador(player2Name, 'O')

    val game = Juego(player1, player2)
    game.play()
}