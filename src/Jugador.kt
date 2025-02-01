class Jugador(val name: String, val symbol: Char) {
    fun makeMove(board: Tablero, position: Int): Boolean {
        return board.placeSymbol(position, symbol)
    }
}