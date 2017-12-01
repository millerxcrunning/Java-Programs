/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181project3;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Michael Miller
 */
public class Deck {
    
 private ArrayList<Card> collection = new ArrayList<Card>();;
 private Queue<Card> drawPile;
 private Stack<Card> discardPile;
 private int cardsUsed;
 private int cardsDealt;
    
//    private ObservableList<Card> deck = FXCollections.observableArrayList();

//    public ObservableList<Card> getDeck() {
//        return deck;
 //   }
    
    public Deck()
    {
        for (int suit=0; suit<=3; suit++)
        {
            for (int rank=0; rank<=12; rank++)
            {
                Card temp = null;
                temp = new Card(rank, suit);
                collection.add(temp);
//                collection.add(new Card(rank, suit));
            }
        }
//        Card twoOfHearts = new Heart(0, 0);
//        Card threeOfHearts = new Heart(1, 0);
//        Card fourOfHearts = new Heart(2, 0);
//        Card fiveOfHearts = new Heart(3, 0);
//        Card sixOfHearts = new Heart(4, 0);
//        Card sevenOfHearts = new Heart(5, 0);
//        Card eightOfHearts = new Heart(6, 0);
//        Card nineOfHearts = new Heart(7, 0);
//        Card tenOfHearts = new Heart(8, 0);
//        Card jackOfHearts = new Heart(9, 0);
//        Card queenOfHearts = new Heart(10, 0);
//        Card kingOfHearts = new Heart(11, 0);
//        Card aceOfHearts = new Heart(12, 0);
//        Card twoOfSpades = new Spade(0, 1);
//        Card threeOfSpades = new Spade(1, 1);
//        Card fourOfSpades = new Spade(2, 1);
//        Card fiveOfSpades = new Spade(3, 1);
//        Card sixOfSpades = new Spade(4, 1);
//        Card sevenOfSpades = new Spade(5, 1);
//        Card eightOfSpades = new Spade(6, 1);
//        Card nineOfSpades = new Spade(7, 1);
//        Card tenOfSpades = new Spade(8, 1);
//        Card jackOfSpades = new Spade(9, 1);
//        Card queenOfSpades = new Spade(10, 1);
//        Card kingOfSpades = new Spade(11, 1);
//        Card aceOfSpades = new Spade(12, 1);
//        Card twoOfDiamonds = new Diamond(0, 2);
//        Card threeOfDiamonds = new Diamond(1, 2);
//        Card fourOfDiamonds = new Diamond(2, 2);
//        Card fiveOfDiamonds = new Diamond(3, 2);
//        Card sixOfDiamonds = new Diamond(4, 2);
//        Card sevenOfDiamonds = new Diamond(5, 2);
//        Card eightOfDiamonds = new Diamond(6, 2);
//        Card nineOfDiamonds = new Diamond(7, 2);
//        Card tenOfDiamonds = new Diamond(8, 2);
//        Card jackOfDiamonds = new Diamond(9, 2);
//        Card queenOfDiamonds= new Diamond(10, 2);
//        Card kingOfDiamonds = new Diamond(11, 2);
//        Card aceOfDiamonds = new Diamond(12, 2);
//        Card twoOfClubs = new Club(0, 3);
//        Card threeOfClubs = new Club(1, 3);
//        Card fourOfClubs = new Club(2, 3);
//        Card fiveOfClubs = new Club(3, 3);
//        Card sixOfClubs = new Club(4, 3);
//        Card sevenOfClubs = new Club(5, 3);
//        Card eightOfClubs = new Club(6, 3);
//        Card nineOfClubs = new Club(7, 3);
//        Card tenOfClubs = new Club(8, 3);
//        Card jackOfClubs = new Club(9, 3);
//        Card queenOfClubs = new Club(10, 3);
//        Card kingOfClubs = new Club(11, 3);
//        Card aceOfClubs = new Club(12, 3);
        Card joker = new Card(0, 5);
//        collection.add(twoOfHearts);
//        collection.add(threeOfHearts);
//        collection.add(fourOfHearts);
//        collection.add(fiveOfHearts);
//        collection.add(sixOfHearts);
//        collection.add(sevenOfHearts);
//        collection.add(eightOfHearts);
//        collection.add(nineOfHearts);
//        collection.add(tenOfHearts);
//        collection.add(jackOfHearts);
//        collection.add(queenOfHearts);
//        collection.add(kingOfHearts);
//        collection.add(aceOfHearts);
//        collection.add(twoOfSpades);
//        collection.add(threeOfSpades);
//        collection.add(fourOfSpades);
//        collection.add(fiveOfSpades);
//        collection.add(sixOfSpades);
//        collection.add(sevenOfSpades);
//        collection.add(eightOfSpades);
//        collection.add(nineOfSpades);
//        collection.add(tenOfSpades);
//        collection.add(jackOfSpades);
//        collection.add(queenOfSpades);
//        collection.add(kingOfSpades);
//        collection.add(aceOfSpades);
//        collection.add(twoOfDiamonds);
//        collection.add(threeOfDiamonds);
//        collection.add(fourOfDiamonds);
//        collection.add(fiveOfDiamonds);
//        collection.add(sixOfDiamonds);
//        collection.add(sevenOfDiamonds);
//        collection.add(eightOfDiamonds);
//        collection.add(nineOfDiamonds);
//        collection.add(tenOfDiamonds);
//        collection.add(jackOfDiamonds);
//        collection.add(queenOfDiamonds);
//        collection.add(kingOfDiamonds);
//        collection.add(aceOfDiamonds);
//        collection.add(twoOfClubs);
//        collection.add(threeOfClubs);
//        collection.add(fourOfClubs);
//        collection.add(fiveOfClubs);
//        collection.add(sixOfClubs);
//        collection.add(sevenOfClubs);
//        collection.add(eightOfClubs);
//        collection.add(nineOfClubs);
//        collection.add(tenOfClubs);
//        collection.add(jackOfClubs);
//        collection.add(queenOfClubs);
//        collection.add(kingOfClubs);
//        collection.add(aceOfClubs);
        collection.add(joker);
        
        cardsUsed = 0;
        cardsDealt = 0;
    }
    
    public void fillDeck()
    {
        
//        for (int rank=0; rank<=12; rank++)
//        {
//            Card temp = null;
//            temp = new Heart(rank, 0); 
//            collection.add(temp);
//        }
//        for (int rank=0; rank<=12; rank++)
//        {
//            Card temp = null;
//            temp = new Spade(rank, 1);
//            collection.add(temp); 
//        }
//        for (int rank=0; rank<=12; rank++)
//        {
//            Card temp = null;
//            temp = new Diamond(rank, 2);
//            collection.add(temp); 
//        }
//        for (int rank=0; rank<=12; rank++)
//        {
//            Card temp = null;
//            temp = new Club(rank, 3);
//            collection.add(temp); 
//        }
//        int jokerValue = 0;
//        int jokerSuit = 5;
//        deck.add(new Card(jokerValue, jokerSuit));
//        deck.add(new Card());
//        System.out.println();
        
    }
    public Stack getDiscardPile()
    {
        return this.discardPile;
    }
    
    public Queue getDrawPile()
    {
        return this.drawPile;
    }
    
    public int cardsLeft() {
        return collection.size() - cardsUsed;
    }
    
    public Card dealCard() 
    {
        if(collection.size() > 0)
        {
            Random generator = new Random();
            int randomPositionToDeal=0;
            try
            {
                //generates # [0 - size-1]
                randomPositionToDeal = generator.nextInt(collection.size());
            }catch(Exception e)
            {
                System.out.println("No such number");
            }
            return collection.get(randomPositionToDeal);
        }
        throw new IllegalStateException("No cards are left in the deck.");
    }
    
    public void shuffle() {
        
        Collections.shuffle(collection);
    }
    
    public void convertDeckToDrawPile()
    {
        drawPile = new ConcurrentLinkedQueue<>();
        collection.stream().forEach((card) -> {
            drawPile.offer(card);
     });   
    }
    
    public void createDiscardPile()
    {
        discardPile = new Stack<>();   
    }
    
    public Card peekTopOfDrawPile()
    {
        return this.drawPile.peek();
    }
    
    public Card peekTopOfDiscardPile()
    {
        return this.discardPile.peek();
    }
    
    public Card getTopOfDrawPile()
    {
        return drawPile.poll();
    }
    
    public Card getTopOfDiscardPile()
    {
        return this.discardPile.pop();
    }
    
    public void putCardInDiscardPileFromHand(Card card)
    {
        discardPile.push(card);
    }
    
    public void listDrawPile()
    {
        for (Card card : discardPile) {
            System.out.println("\t" + card);
        }
        System.out.println("");
    }
    
    public void listDeck() {
        System.out.println("Your Deck of Cards");
        for (Card card : collection) {
            System.out.println("\t" + card);
        }
        System.out.println("");
    }
    
    public void putInDrawPileFromDiscardPile()
    {
        this.drawPile.offer(this.getTopOfDiscardPile());
    }
    
    public void displayDeck()
    {
        Iterator it = collection.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next().toString());
        }
        System.out.println(collection.size());
    }
    
    @Override
    public String toString()
    {
        return collection.toString();
    }
    
}
