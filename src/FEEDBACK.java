import java.util.*;

public class FEEDBACK {

// Ben, this is where you will find my overall feedback on your game so far. I will try to make suggestions of ways to implement the game, 
// but keep in mind these are just suggestions. Because the game does not work yet, it will be tricky to give specific feedback, but I will do my best.
// ~ Adam Bruce 

//////// PIECE CLASS FEEDBACK:

// First, you should consider making each piece object final. That way, if the user creates a King, they can't change it to a pawn or rook, which would get confusing. 

// The way you are deciding to make white versus black pieces seems logical and smooth. However, I have never heard of a man before and that might be 
// confusing to some players. Could you call this a "checker" instead and have it denoted with a "c" or "C"?

// Also, how would the user be able to play chess with this board if you only have pieces for man and king? You could make it plausible for a scanner
// entry to be any of "p" or "P" for pawn, "h" or "H" for horse and so on, while still having the basic checkers pieces if they want to play that.

// You have three methods for a piece, one of which is a set constructor, but the other two are a bit confusing. 

// How would a user know which Piece class to implement here? I would suggest getting rid of the first Piece with just the state, because the user can populate
// the board with the second constructor. If they accidently use the first version twice, then they will be deleting the previous piece placed in that corner.

public Piece(char state) { // Creates a piece with given a state
    this.state = state;

    if (Character.isUpperCase(state)) { // Places piece in bottom left corner if black, top right if white
        this.coords = "A1";
    } else {
        this.coords = "H8";
    }
}

public Piece(char state, String coords) { // Creates a piece with given a state and coords
    this.state = state;
    this.coords = coords;
}

// Good work on setCoords, I am assuming this is how you will change locations of the pieces during a users turn, which is clever. 



/////////// BOARD CLASS FEEDBACK:

// You could print the current board by utalizing a nested for loop structure similar to the one we used in PrettyPrint for our homework. 
// This way, the board would actually appear like a board on the screen, and not just an array of pieces. 

// Since you are going to play chess or checkers, and the standard board is 8 by 8, then you might consider making the board array final at 64:

private final Piece[] board = new Piece[64];

// Otherwise, the user could start making the game implementation tricky because they could change the board size meaning more pieces would 
// be needed to play.



/////////// CHECKERS IMPLEMENTATION CLASS: 


// Consider creating a counter for the computer and the user. The counter could keep track of how many moves each has had, or it could be used to count the 
// pieces each has taken in chess / jumped in checkers. 


// You might consider making a method that auto generates the AI's board. This would make it easier for the player so that they will not have to set the
// computers board each time they play. Also, you could use a while loop for making decisions.
// You could also let the user decide if they want to play 2 player or against the computer using something like this-

public static void main(String[] args) { 
    Piece piece = new Piece();
    System.out.println(piece); 
    while(true){ // My suggestion starts here:
    System.out.println("Would you like to play chess or checkers? "); 
    Scanner userInput = new Scanner(System.in);
    String chessCheckers = userInput.nextLine().toLowerCase();
    if(chessCheckers.equals("chess")){
        playChess() // Make this a method where they decide to play a computer or against another user
        break;
    } else if (chessCheckers.equals("checkers")){
        playCheckers() // Make this a method where they decide to play a computer or against another user
        break;
    }  else {
        System.out.println("Please enter either chess or checkers to play next time.");
        break;
    }
    }
}

    // An example of playCheckers
public static void playCheckers(){
    Scanner userInput = new Scanner(System.in);
    while(true){
        System.out.println("Would you like to play against a computer, or play 2 player mode? Enter C for computer or 2 for 2 player. ");
        String playComputer = userInput.nextLine().toLowerCase();
        if(playComputer.equals("c")){
            // autogenerate a board for the computer and then play. 
            break;
        } else if (playComputer.equals("2")){
            // implement 2 player checkers.
            break;
        }  else {
            System.out.println("Please enter either C or 2 to make a decision.");
            //While loop will now repeat the prompt. 
        }
    }
}

}


///////////////// OVERALL THOUGHTS:

// It is clear that you will have a solid game when this is over. I think the only real challenge is going to be deciding if a move is valid for each piece. 
// Playing checkers will be easier than chess, but it will inevitably be easier to figure out chess once you solve checkers. 

// I have 3 major questions for you to think about that I could not provide immediate feedback on because they are complex aspects of your game:

// 1. How will you implement the crowning of a King piece in checkers if the user makes it all the way down the board? How will the program know this happened,
// and how will the kind move? Will it be able to go backwards as in usual checkers?

// 2. What method will you create to implement a move? Will you set a range of spaces in the array that a piece can move so that the move is valid. If you do not
// limit the move space for each piece, then nothing stops the user from going from their starting position straight across the board to the king spot. 
// So, there will have to be some kind of specificity to movements, which could get tricky.

// 3. How will you implement a jump in checkers? If you set specifiers for move restrictions, then it is going to be difficult to let the computer know when it is
// okay to break the standard move restriction to say jump an opponent. This I think will be the trickiest part of your game. 



// Overall, great work so far on this game, Your piece objects idea was very clever, as it reminds me of how we implemented cards in our class.
// Hopefully you found some of these suggestions helpful!

// ~ Adam Bruce
// IHRTLUHC