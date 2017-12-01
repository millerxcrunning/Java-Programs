/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181project3;

import java.util.InputMismatchException;

/**
 *
 * @author Michael Miller
 */
public class HumanPlayer extends Player{
    
    public HumanPlayer() {
    }
    
    public HumanPlayer(String name) 
    {
        super(name);
    }

    @Override
    public void initializeHand(Game game)
    {
        this.hand.addCard(game.deck.dealCard());
        this.hand.addCard(game.deck.dealCard());
        this.hand.addCard(game.deck.dealCard());
        this.hand.addCard(game.deck.dealCard());
        
        System.out.println("Your cards are:\n" + this.hand.toString());
        
    }
    @Override
    public void initialTurn(Game game)
    {
        System.out.println("The discard pile is currently empty -- you must draw a card");
        Card initialDrawCard = game.initialTurn();
        this.hand.addCard(initialDrawCard);
        System.out.println("You drew the " + initialDrawCard.toString());
        System.out.println("Now your cards are ");
        System.out.println(this.hand.toString());
        System.out.println("Which one do you want to discard? ");
        int choice = -1;
        try
        {
        choice = Integer.parseInt(input.nextLine());
        }catch (InputMismatchException e)
        {
            System.out.println("That is not a valid choice.");
        }
        while(choice < 1 || choice > 5)
            {
            System.out.println("Input '1', '2', '3', '4', or '5'");
            //convert from 1-5 to 0-4
            choice = (Integer.parseInt(input.nextLine()));
            }
        //convert from 1-5to 0-4
        discardCard(game, choice-1);
    }
    
    @Override
    public void discardCard(Game game, int position) 
    {
        game.putCardInDiscardPileFromHand(this.hand.removeCard(position));
    }
    
//    @Override
//    public Card discardCard(Card card)
//    {
//        hand.removeCard(card);
//        return card;
//    }
    
    public int decideCardToDiscard(HumanPlayer humanPlayer)
    {
        return 0;
    }
@Override
    public void takeTurn(Game game, HumanPlayer humanPlayer)  
    {
        int choice = 0;
        System.out.println(this.hand.toString());
        if(!game.showTopOfDiscardPile().equals("null"))
        {
            System.out.println("The top card in the discard pile is the " + 
                    game.showTopOfDiscardPile());
            System.out.println("Do you want to pick up the " +
                    game.showTopOfDiscardPile() + " (1) or draw a card (2)?");
            try
            {
                choice = Integer.parseInt(input.nextLine());
            }catch (InputMismatchException e)
            {
                System.out.println("That is not a valid choice.");
            }
            while(choice != 1 && choice !=2)
            {
                System.out.println("Input '1' or '2'");
                choice = Integer.parseInt(input.nextLine());
            }
            if (choice == 1)
            {
                this.hand.addCard(game.takeCardFromDiscardPileToHand());
            }
            else 
            {
                this.hand.addCard(game.takeCardFromDrawPileToHand());
            }
        }
        else
        {
            System.out.println("The discard pile is currently empty -- you must draw a card");
            this.hand.addCard(game.takeCardFromDrawPileToHand());
        }
        System.out.println("");
        System.out.println(this.hand.toString());
        System.out.println("Which one do you want to discard? ");
        int choiceForDiscard = -1;
        try
        {
        choiceForDiscard = Integer.parseInt(input.nextLine());
        }catch (InputMismatchException e)
        {
            System.out.println("That is not a valid choice.");
        }
        while(choiceForDiscard < 1 || choiceForDiscard > 5)
            {
            System.out.println("Input '1', '2', '3', '4', or '5'");
            //convert from 1-5to 0-4
            choiceForDiscard = (Integer.parseInt(input.nextLine()));
            }
        //convert from 1-5to 0-4
        discardCard(game, choiceForDiscard-1);
        
        this.hand.sortByValue();
       
    }


}
