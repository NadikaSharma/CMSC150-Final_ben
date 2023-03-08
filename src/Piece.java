public class Piece { // Represents a game piece used for checkers or chess
    private char state; // Capital letter if black, lowercase if white, m if man, k if king
    private String coords; // Coordinates of piece on an 8x8 board where A-H is left to right and 1-8 is bottom to top

    public Piece() { // Creates a black man piece in the bottom left corner
        this.state = 'M';
        this.coords = "A1"; 
    }

    public Piece(char state) { // Creates a piece with given a state
        this.state = state;

        if (Character.isUpperCase(state)) { // Places piece in bottom left corner if black, top right if white
            this.coords = "A1"; //This is a really interesting way to place the piece. nice work
        } else {
            this.coords = "H8";
        }
    }

    public Piece(char state, String coords) { // Creates a piece with given a state and coords
        this.state = state;
        this.coords = coords;
    }

    public String getCoords() {
        return this.coords;
    }

    public void setCoords(String coords) {
        this.coords = coords;
    }

    public String toString() { // Returns state as a string if it is a valid piece, returns "?" otherwise
        if (Character.toLowerCase(this.state) == 'm' || Character.toLowerCase(this.state) == 'k') {
            return "" + this.state;
        }
        return "?"; //you could make this more specific like an error saying that its invalid.
    }
}