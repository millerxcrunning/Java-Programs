package miller_1181_project2;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Card implements Serializable {
    
    private static int value;
    private static int suit;
    private static String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs", "Joker"};
    private static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }
    
    public void setValue(int value)
    {
        this.value = value;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void seSuit(int suit)
    {
        this.suit = suit;
    }
    
    public int getSuit()
    {
        return suit;
    }
    
    public String getStringRank()
    {
        return ranks[this.getValue()];
    }
    
    public String getStringSuit()
    {
        return suits[this.getSuit()];
    }
    
    @Override
    public String toString()
    {
        if(suit == 5) 
        {
            return "Joker";
        }//End of if statement that calls jokers
        
        return ranks[this.getValue()] + " of " + suits[this.getSuit()];
        //return "This card is the " + this.value + " of " + this.suit + "\n";
    }
    
}
    


