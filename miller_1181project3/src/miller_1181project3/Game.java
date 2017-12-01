/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181project3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Michael Miller
 */
public class Game {
    
    Deck deck = new Deck();
    Player player1;
    Player player2;
    
    public void start()
    {
        System.out.println("1");
        deck.listDeck();
        System.out.println("Now shuffling...");
        deck.shuffle();
        System.out.println("3");
//        deck.displayDeck();
        System.out.println("Deck shuffled...");
        deck.listDeck();
        System.out.println("Dealing each player 4 cards...");
        
    }
    public Card initialTurn()
    {
        return deck.getTopOfDrawPile();
    }
    public void initializeDrawPile()
    {
        deck.convertDeckToDrawPile();
    }
    
    public void createDiscardPile()
    {
        deck.createDiscardPile();
    }
    
    public Card showTopOfDrawPile()
    {
        return deck.peekTopOfDiscardPile();
    }
    
    public Card showTopOfDiscardPile()
    {
        return deck.peekTopOfDiscardPile();
    }
    
    public Card takeCardFromDrawPileToHand()
    {
        if(deck.getDrawPile().isEmpty())
        {
            System.out.println("Draw pile is empty. ");
            reshuffleDeck();
        }
        return deck.getTopOfDrawPile();
    }
    
    public Card takeCardFromDiscardPileToHand() 
    { 
        return deck.getTopOfDiscardPile();
    }
    
    public void putCardInDiscardPileFromHand(Card card)
    {
        deck.putCardInDiscardPileFromHand(card);
    }
    
    public void reshuffleDeck()
    {
        System.out.println("Shuffling discard pile ");
        Collections.shuffle(deck.getDiscardPile());
        while(!(deck.getDiscardPile().isEmpty()))
        {
            deck.putInDrawPileFromDiscardPile();
        }
        Iterator it = deck.getDrawPile().iterator();
        while(it.hasNext())
        {
            System.out.println(it.next().toString());
        }
        System.out.println("Discard pile is now shuffled and the draw pile is replenished");
        
    }
    public void displayHumanPlayerHand(Player humanPlayer)
    {
        System.out.println("Your cards are: ");
        System.out.println(humanPlayer.hand.toString());
    }
    
    public boolean isOver(Game game, Player computerPlayer, Player humanPlayer)
    {
        boolean isOver = false;
        
        ArrayList<Integer> humanHandCardsValues = new ArrayList<>(4);
        for (int i = 0; i < 4; i++)
        {
            Card card = humanPlayer.hand.getCard(i);
            humanHandCardsValues.add(card.getValue());
        }
        
        if(Objects.equals(humanHandCardsValues.get(0), humanHandCardsValues.get(1)) && 
                Objects.equals(humanHandCardsValues.get(0), humanHandCardsValues.get(2)) &&
                Objects.equals(humanHandCardsValues.get(0), humanHandCardsValues.get(3)))
        {
            isOver = true;
            System.out.println(humanPlayer.getName() + " won.");
            return isOver;
        }
        
        ArrayList<Integer> computerHandCardsValues = new ArrayList<>(4);
        for (int i = 0; i < 4; i++)
        {
            Card card = computerPlayer.hand.getCard(i);
            computerHandCardsValues.add(card.getValue());
        }
        
        if(Objects.equals(computerHandCardsValues.get(0), computerHandCardsValues.get(1)) && 
                Objects.equals(computerHandCardsValues.get(0), computerHandCardsValues.get(2)) &&
                Objects.equals(computerHandCardsValues.get(0), computerHandCardsValues.get(3)))
        {
            isOver = true;
            System.out.println("Computer won.");
            return isOver;
        }
        
        
        return isOver;
    }
}
