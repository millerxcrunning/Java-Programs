/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181project3;

import java.util.Scanner;

/**
 *
 * @author Michael Miller
 */
public abstract class Player {
    
    Scanner input = new Scanner(System.in);
    String name;
    Hand hand;
  
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
    
    public Player() 
    {
        System.out.println("In the Player constructor");
        hand = new Hand();
    }
    
    public Player(String name) 
    {
        System.out.println("In the Player constructor");
        this.name = name;
        hand = new Hand();
    }
    
    
    public void setHand(Hand hand)
    {
        this.hand = hand;
    }
    
    public Hand getHand()
    {
        return this.hand;
    }
    
    public String toString() 
    {
        return "I am " + name;
    }
    
    public abstract void initializeHand(Game game);
    
    public abstract void initialTurn(Game game);
    
    public abstract void takeTurn(Game game, HumanPlayer humanPlayer);
  
    public abstract void discardCard(Game game, int position);
    
    public abstract int decideCardToDiscard(HumanPlayer humanPlayer);
   
//    public abstract Card discardCard(Card card);

    
   
   
   
   
   
   
}
