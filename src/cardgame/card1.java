
package cardgame;


import com.sun.jdi.Value;
import java.util.Random;
import java.util.Scanner;

public class card1 {

	public static void main(String arg[]){
            Scanner input = new Scanner(System.in);
            CardGame[] hand = new CardGame[7];
            Random random = new  Random();
            
            for(int i = 0 ;i<hand.length;i++){
                Value value = CardGame.Value.values()[random.nextInt(13)];
                System.out.println(value);
                Suit suit = CardGame.SUITS[random.nextInt(4)];
                
                CardGame card = new Card123(value,suit);
                hand[i]=card;
               
                }//end of for
            
            //print each card
            for(CardGame card: hand){
                System.out.println(card.getValue()+ " of "+card.getSuit());
            }
            
            //ask user for card
            System.out.println("please enter a suit");
            int suitIndex = input.nextInt();
            System.out.println("please enter a value");
            int valueIndex = input.nextInt();
            
            CardGame userGuess = new CardGame(valueIndex,CardGame.SUITS[suitIndex-1]);
            
            boolean match = false;
            
            for(CardGame card:hand){
                if(card.getValue()==userGuess.getValue() && 
                   (card.getSuit().equals(userGuess.getSuit()))){
                    match=true;
                    break;                    
                }
            }
            System.out.println("Did you guess it?" +match);            
        }// end of main
    
}//end of class

