/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181project3;

import java.util.ArrayList;

/**
 *
 * @author Michael Miller
 */
public class Hand{
    
    ArrayList<Card> hand;   

    public Hand() 
    {
        hand = new ArrayList<Card>();
    }

    public void clear() 
    {
        hand.clear();
    }

    /**
     * Add a card to the hand.  It is added at the end of the current hand.
     * @param c the non-null card to be added.
     * @throws NullPointerException if the parameter c is null.
     */
    public void addCard(Card card) 
    {
        if (card == null)
        {
            throw new NullPointerException("Can't add a null card to a hand.");
        }
        hand.add(card);
    }

    /**
     * Remove a card from the hand, if present.
     * @param c the card to be removed.  If c is null or if the card is not in 
     * the hand, then nothing is done.
     */
//    public Card removeCard(Card card) 
//    {
//        
//        return hand.
//    }

    /**
     * Remove the card in a specified position from the hand.
     * @param position the position of the card that is to be removed, where
     * positions are starting from zero.
     * @throws IllegalArgumentException if the position does not exist in
     * the hand, that is if the position is less than 0 or greater than
     * or equal to the number of cards in the hand.
     * @return Card that is removed from hand
     */
    public Card removeCard(int position) 
    {
        if (position < 0 || position >= hand.size())
        {
            throw new IllegalArgumentException("Position does not exist in hand: "
                    + position);
        }
        return hand.remove(position);
    }

    /**
     * Returns the number of cards in the hand.
     */
    public int getCardCount() 
    {
        return hand.size();
    }

    /**
     * Gets the card in a specified position in the hand.  (Note that this card
     * is not removed from the hand)
     * @param position the position of the card that is to be returned
     * @throws IllegalArgumentException if position does not exist in the hand
     */
    public Card getCard(int position) 
    {
        if (position < 0 || position >= hand.size())
        {
            throw new IllegalArgumentException("Position does not exist in hand: "
                    + position);
        }
        return hand.get(position);
    }

    /**
     * Sorts the cards in the hand so that cards of the same suit are
     * grouped together, and within a suit the cards are sorted by value.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortBySuit() 
    {
        ArrayList<Card> newHand = new ArrayList<Card>();
        
        while (hand.size() > 0) 
        {
            int pos = 0;  // Position of minimal card.
            Card c = hand.get(0);  // Minimal card.
            for (int i = 1; i < hand.size(); i++) 
            {
                Card c1 = hand.get(i);
                if ( c1.getSuit() < c.getSuit() ||
                        (c1.getSuit() == c.getSuit() && c1.getValue() < c.getValue()) ) 
                {
                    pos = i;
                    c = c1;
                }
            }
            hand.remove(pos);
            newHand.add(c);
        }
        hand = newHand;
    }

    /**
     * Sorts the cards in the hand so that cards of the same value are
     * grouped together.  Cards with the same value are sorted by suit.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortByValue() 
    {
        ArrayList<Card> newHand = new ArrayList<Card>();
        
        while (hand.size() > 0) 
        {
            int pos = 0;  // Position of minimal card.
            Card c = hand.get(0);  // Minimal card.
            for (int i = 1; i < hand.size(); i++) 
            {
                Card c1 = hand.get(i);//second card comparing with
                //if second card's value is less than the minimal card's value
                if ( c1.getValue() < c.getValue() ||
                        /*or if they both have the same value and the second card's 
                        suit is less than the minimal card's suit*/
                        (c1.getValue() == c.getValue() && c1.getSuit() < c.getSuit()) ) 
                {
                    pos = i;//then i is the position of the minimal card
                    c = c1;//and c1 is the minimal card
                }
            }
            //take the minimal card out of the old hand
            hand.remove(pos);
            //and put it in the new hand
            newHand.add(c);
        }
        //returning the hand sorted
        hand = newHand;
    }
    
    @Override
    public String toString()
    {
        String string = "";
        for(Card card : hand)
        {
            string += card.toString();
            string += "\n";
        }
        return string;
    }

    
}
