
package cardgame;

public class CardGame {

	
    public enum SUITS {HEARTS,}  
     public enum Value{ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE}; 
    
     private Value value;
	private SUITS suit;
   
   
   

    public CardGame (Value value, SUITS suit) {
        this.value = value;
        this.suit = suit;
    }
     public Value getValue() {
		return this.value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public SUITS getSuit() {
		return this.suit;
	}
 
	public void setSuit(SUITS suit) {
		this.suit = suit;
	}
    
    

