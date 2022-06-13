import java.util.List;
import java.util.ArrayList;
/**
 * This is a class that tests the Deck class.
 */

// DeckTester.java

public class Main {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
    String[] ranks = {"A", "B", "C"};
    String[] suits = {"Giraffes", "Lions"};
    int[] values = {2, 1, 6};
    /*String[] ranks = {"Ace", "King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two"};
    String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"}; 
    int[] values = {11, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2};*/

    
    Deck animals = new Deck(ranks, suits, values);
    
    System.out.println(animals);
    System.out.println("\nSize of deck: " + animals.size());
    
    System.out.println("\nIs it empty? " + animals.isEmpty());
    
    System.out.println("\nCard dealt: " + animals.deal());
    
    System.out.println("\nRemaining cards: " + animals.size());
	}
}
