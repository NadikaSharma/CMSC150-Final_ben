public class Board { // Represents an 8x8 game board used for checkers or chess, printed when it's the player's turn
    private Piece[] board;

    public Board() { // Creates a Piece[] that represents all spaces on the board, which is 64 for checkers or chess
        this.board = new Piece[64];
    }

    public Board(int spaces) { // Creates a Piece[] given the number of spaces it has
        this.board = new Piece[spaces];
    }
}