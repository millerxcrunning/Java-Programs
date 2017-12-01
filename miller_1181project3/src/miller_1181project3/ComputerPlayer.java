/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181project3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Michael Miller
 */
public class ComputerPlayer extends Player{
    HumanPlayer humanPlayer;
    public ComputerPlayer() 
    {
        super();
        super.name= "computer Bob";
        
    }
    
    public ComputerPlayer(String name) 
    {
        super(name);
    }
    
    @Override
    public void initializeHand(Game game)
    {
        hand.addCard(game.deck.dealCard());
        hand.addCard(game.deck.dealCard());
        hand.addCard(game.deck.dealCard());
        hand.addCard(game.deck.dealCard());
    }
    
    public void initialTurn(Game game)
    {
        
    }
    
//    @Override
//    public void takeTurn(Game game) 
//    {
//        if((game.deck.peekTopOfDiscardPile().getValue()) != (this.hand.getCard(0).getValue())
//                || (game.deck.peekTopOfDiscardPile().getValue()) != (this.hand.getCard(1).getValue())
//                || (game.deck.peekTopOfDiscardPile().getValue()) != (this.hand.getCard(2).getValue())
//                || (game.deck.peekTopOfDiscardPile().getValue()) != (this.hand.getCard(3).getValue()))
//        {
//            System.out.println("I will draw a new card");
//            this.hand.addCard(game.takeCardFromDrawPileToHand());
//            this.discardCard(game, decideCardToDiscard(humanPlayer));
//        }
//        else
//            /*take the top card from the discardPile because the value is the same
//            as one of the cards in the hand*/
//        {
//            Card pickUpFromDiscardPile = game.takeCardFromDiscardPileToHand();
//            System.out.println("I will pick up the " + pickUpFromDiscardPile.toString());
//        this.hand.addCard(pickUpFromDiscardPile); 
//        this.discardCard(game, decideCardToDiscard(humanPlayer));
//        this.discardCard(game, decideCardToDiscard(humanPlayer));
//        }
//        this.hand.sortByValue();
//    }
    @Override
    public void takeTurn(Game game, HumanPlayer humanPlayer) 
    {
        System.out.println("Computer taking turn");
        //if computerPlayer hand has a card of same value as topOfDrawPile, draw topOfDrawPile
        if((game.showTopOfDrawPile().getValue()) == (this.hand.getCard(0).getValue())
                || (game.showTopOfDrawPile().getValue()) == (this.hand.getCard(1).getValue())
                || (game.showTopOfDrawPile().getValue()) == (this.hand.getCard(2).getValue())
                || (game.showTopOfDrawPile().getValue()) == (this.hand.getCard(3).getValue()))
        {
            System.out.println("I will draw a new card");
            this.hand.addCard(game.takeCardFromDrawPileToHand());
            this.discardCard(game, decideCardToDiscard(humanPlayer));
        }
        else
        {
            //if discard pile is not empty
            if(!(game.showTopOfDiscardPile().equals("null")))
            {
                //if computerPlayer hand has a card of same value as topOfDiscardPile, draw topOfDiscardPile
                if((game.showTopOfDiscardPile().getValue()) == (this.hand.getCard(0).getValue())
                    || (game.showTopOfDiscardPile().getValue()) == (this.hand.getCard(1).getValue())
                    || (game.showTopOfDiscardPile().getValue()) == (this.hand.getCard(2).getValue())
                    || (game.showTopOfDiscardPile().getValue()) == (this.hand.getCard(3).getValue()))
                {
                    Card pickUpFromDiscardPile = game.takeCardFromDiscardPileToHand();
                    System.out.println("I will pick up the " + pickUpFromDiscardPile.toString());
                    this.hand.addCard(pickUpFromDiscardPile); 
                }
                else 
                {
                    System.out.println("I will draw a new card");
                    this.hand.addCard(game.takeCardFromDrawPileToHand());
                    this.discardCard(game, decideCardToDiscard(humanPlayer));
                }
            }
        }
            //if humanPlayer hand has a card of same value as topOfDrawPile, draw topOfDrawPile
            if((game.showTopOfDrawPile().getValue()) == (humanPlayer.hand.getCard(0).getValue())
                || (game.showTopOfDrawPile().getValue()) == (humanPlayer.hand.getCard(1).getValue())
                || (game.showTopOfDrawPile().getValue()) == (humanPlayer.hand.getCard(2).getValue())
                || (game.showTopOfDrawPile().getValue()) == (humanPlayer.hand.getCard(3).getValue()))
            {
            System.out.println("I will draw a new card");
            this.hand.addCard(game.takeCardFromDrawPileToHand());
            this.discardCard(game, decideCardToDiscard(humanPlayer));
            }
        /*if human player accidentally put down a card with same value as in human 
        player's hand, draw topOfDiscardPile*/
            else if(!game.showTopOfDiscardPile().equals("null"))
            {
                if((game.showTopOfDiscardPile().getValue()) == (humanPlayer.hand.getCard(0).getValue())
                    || (game.showTopOfDiscardPile().getValue()) == (humanPlayer.hand.getCard(1).getValue())
                    || (game.showTopOfDiscardPile().getValue()) == (humanPlayer.hand.getCard(2).getValue())
                    || (game.showTopOfDiscardPile().getValue()) == (humanPlayer.hand.getCard(3).getValue()))
                {
                    Card pickUpFromDiscardPile = game.takeCardFromDiscardPileToHand();
                    System.out.println("I will pick up the " + pickUpFromDiscardPile.toString());
                    this.hand.addCard(pickUpFromDiscardPile); 
                }
                else 
                {
                    System.out.println("I will draw a new card");
                    this.hand.addCard(game.takeCardFromDrawPileToHand());
                    this.discardCard(game, decideCardToDiscard(humanPlayer));
                }
            }
            
            /*then, if card on topOfDiscardPile value is not same as any card in current
            hand, takeCardFromDrawPileToHand*/
            else if(!game.showTopOfDiscardPile().equals("null"))
            {
                if((game.deck.peekTopOfDiscardPile().getValue()) != (this.hand.getCard(0).getValue())
                || (game.deck.peekTopOfDiscardPile().getValue()) != (this.hand.getCard(1).getValue())
                || (game.deck.peekTopOfDiscardPile().getValue()) != (this.hand.getCard(2).getValue())
                || (game.deck.peekTopOfDiscardPile().getValue()) != (this.hand.getCard(3).getValue()))
                {
                    System.out.println("I will draw a new card");
                    this.hand.addCard(game.takeCardFromDrawPileToHand());
                    this.discardCard(game, decideCardToDiscard(humanPlayer));
                }
                else
                {
                    Card pickUpFromDiscardPile = game.takeCardFromDiscardPileToHand();
                    System.out.println("I will pick up the " + pickUpFromDiscardPile.toString());
                    this.hand.addCard(pickUpFromDiscardPile);
                }
            }
            else 
            {
                System.out.println("I will draw a new card");
                this.hand.addCard(game.takeCardFromDrawPileToHand());
                this.discardCard(game, decideCardToDiscard(humanPlayer));
            }
            this.hand.sortByValue();
    }
    
        
    @Override
    public int decideCardToDiscard(HumanPlayer humanPlayer)
    {
        System.out.println("computer deciding which card to discard");
        ArrayList<Integer> humanPlayerHandCardsValues = new ArrayList<>(4);
        for (int i = 0; i < 4; i++)
        {
            Card card = humanPlayer.hand.getCard(i);
            humanPlayerHandCardsValues.add(card.getValue());
        }
        
        ArrayList<Integer> computerPlayerHandsCardsValues = new ArrayList<>(5);
        for (int i = 0; i < 5; i++)
        {
            Card card = this.hand.getCard(i);
            computerPlayerHandsCardsValues.add(card.getValue());
        }
        //once for each of the four positions in humanPlayerHand
        for (int i=0;i<4;i++)
        {
            /*gets the value of the card in the "i" position of the humanPlayerHand 
            and sees if the computerPlayerHand contains that value, and if so, 
            stays in the while loop until computerPlayerHand does not contain 
            that value*/
            while (computerPlayerHandsCardsValues.contains(humanPlayerHandCardsValues.get((i))))
            {
                //removes the card in the computerPlayerHand that has the value of the card at the "i" position in humanPlayerHand
                computerPlayerHandsCardsValues.remove(humanPlayerHandCardsValues.get((i)));
            }
        }
        if (computerPlayerHandsCardsValues.isEmpty())
        {
            return 0;
//            int prev_value = humanPlayer.hand.getCard(0).getValue();
//            int prev_count = 0;
//            int index = 0;
//            int count = 1;
//            int min =1;
//            for(int i = 1; i < humanPlayer.hand.getCardCount(); i++)
//            {
//                if(humanPlayer.hand.getCard(i).getValue() != prev_value)
//                {
//                    if(count < min)
//                    {
//                        min = count;
//                        index = i-1;
//                        prev_value=humanPlayer.hand.getCard(i).getValue();
//                  
//                    }
//                    count=1;
//              
//                }
//                else
//               count++;
//            }
//        return index;
        }
        Random generator = new Random();
        int randomPositionToBeRemoved=0;
        try
        {
            //generates # [0 - size-1]
            randomPositionToBeRemoved = generator.nextInt(computerPlayerHandsCardsValues.size());
        }
        catch(Exception e)
        {
            System.out.println("No such number");
        }
        return randomPositionToBeRemoved;
//        int discard = computerPlayerHandsCardsValues.get(randomPositionToBeRemoved);
//        return discard;
//        
//        if (!Objects.equals(computerPlayerHandsCardsValues.get(0), humanPlayerHandCardsValues.get(0)) && 
//                !Objects.equals(computerPlayerHandsCardsValues.get(0), humanPlayerHandCardsValues.get(0)) &&
//                !Objects.equals(computerPlayerHandsCardsValues.get(0), humanPlayerHandCardsValues.get(0)) &&
//                !Objects.equals(computerPlayerHandsCardsValues.get(0), humanPlayerHandCardsValues.get(0)))
//        {
//            return computerPlayerHandsCardsValues.get(0);
//        }
//        if (!Objects.equals(computerPlayerHandsCardsValues.get(1), humanPlayerHandCardsValues.get(0)) && 
//                !Objects.equals(computerPlayerHandsCardsValues.get(1), humanPlayerHandCardsValues.get(0)) &&
//                !Objects.equals(computerPlayerHandsCardsValues.get(1), humanPlayerHandCardsValues.get(0)) &&
//                !Objects.equals(computerPlayerHandsCardsValues.get(1), humanPlayerHandCardsValues.get(0)))
//        {
//            return computerPlayerHandsCardsValues.get(1);
//        }
//        if (!Objects.equals(computerPlayerHandsCardsValues.get(2), humanPlayerHandCardsValues.get(0)) && 
//                !Objects.equals(computerPlayerHandsCardsValues.get(2), humanPlayerHandCardsValues.get(0)) &&
//                !Objects.equals(computerPlayerHandsCardsValues.get(2), humanPlayerHandCardsValues.get(0)) &&
//                !Objects.equals(computerPlayerHandsCardsValues.get(2), humanPlayerHandCardsValues.get(0)))
//        {
//            return computerPlayerHandsCardsValues.get(2);
//        }
//            if (!Objects.equals(computerPlayerHandsCardsValues.get(3), humanPlayerHandCardsValues.get(0)) && 
//                !Objects.equals(computerPlayerHandsCardsValues.get(3), humanPlayerHandCardsValues.get(0)) &&
//                !Objects.equals(computerPlayerHandsCardsValues.get(3), humanPlayerHandCardsValues.get(0)) &&
//                !Objects.equals(computerPlayerHandsCardsValues.get(3), humanPlayerHandCardsValues.get(0)))
//        {
//            return computerPlayerHandsCardsValues.get(3);
        
        //since the cards are always kept sorted,we will count which value is occuring lowest number of times
       //and discard one of the cards in that value
       
   }
    
    
    @Override
    public void discardCard(Game game, int position) 
    {
        System.out.println("computer discarding card\n");
        game.putCardInDiscardPileFromHand(hand.removeCard(position));        
    }
    
//    @Override
//    public Card discardCard(Card card)
//    {
//        hand.removeCard(card);
//        return card;
//    }

    
}
