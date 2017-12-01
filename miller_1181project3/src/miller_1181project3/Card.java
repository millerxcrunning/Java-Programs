/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181project3;

/**
 *
 * @author Michael Miller
 */
public class Card {
    
    private int value;
    private int suit;
    private static String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs", "Joker"};
    private static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
    
    public Card()
    {
        //This creates a joker card
        this.value = 0;
        this.suit = 5;
    }

    public Card(int value, int suit) 
    {
//        //if the entered suit is not right, it will not assign it as the suit.
//        if (!(suit.equalsIgnoreCase("SPADES")) && !(suit.equalsIgnoreCase("HEARTS")) && 
//                !(suit.equalsIgnoreCase("DIAMONDS")) && !(suit.equalsIgnoreCase("CLUBS")) && 
//                !(suit.equalsIgnoreCase("JOKER"))) {
//            throw new IllegalArgumentException("Cannot play card with this suit");
//        }
//        //if someone tries to assign a value to joker or enters a value lower than 
//        //1 or greater than 13, it will throw the exception.
//        if ((suit.equalsIgnoreCase("JOKER")) || (value < 1 || value > 13)) {
//            throw new IllegalArgumentException("Cannot play card with this value");
//        }
//        if (value == 1)
//        {
//            this.value = "Ace";
//        }
//        else if (value == 11)
//        {
//            this.value = "Jack";
//        }
//        else if (value == 12)
//        {
//            this.value = "Queen";
//        }
//        else if (value == 13)
//        {
//            this.value = "King";
//        }
//        else this.value = "" + value;
        //This creates a new card with a value and a suit
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
