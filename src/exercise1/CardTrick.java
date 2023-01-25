package exercise1;
import java.util.Scanner;
import java.util.Random;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Fuwad Oladega
 * @author Fuwad Oladega Jan 25, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) 
    {
        Scanner keyboard= new Scanner(System.in);
        Random  random1=new Random();
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) 
        {
            Card card = new Card();
             
            //card.setValue(insert call to random number generator here)
            // 
            card.setValue(random1.nextInt(13)+1);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[(random1.nextInt(3))]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
             
            //       Don't worry about duplicates at this point
            hand[i]=card;
            
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        System.out.println("Please enter your card number ");
        int input= keyboard.nextInt();
        System.out.println("Please enter your suit deck: ");
        String suit=keyboard.next();
        
        for(int i=0; i<hand.length; i++)
        {
            if(hand[i].getValue()== input & hand[i].getSuit().equalsIgnoreCase(suit))
            {
             printInfo();
            }
        
        }
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Fuwad, but you can call me lekan, cool and nice");
        System.out.println();
        
        System.out.println("My career ambitions is to become a software developer:");
        System.out.println(" Developing mobile application");
        System.out.println(" Be a senior softwrae  developer");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println(" Coding");
        System.out.println(" Videogames ");
        System.out.println(" Reading");
        System.out.println( " relaxing");

        System.out.println();
        
    
    }

}
