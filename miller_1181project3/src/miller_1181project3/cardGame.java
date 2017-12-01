/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181project3;

import java.util.Iterator;
import java.util.Scanner;
import javafx.event.ActionEvent;

/**
 *
 * @author Michael Miller
 */
public class cardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Game game = new Game();
        
        Player player1 = new HumanPlayer();
        Player player2 = new ComputerPlayer();
        System.out.println("Human vs. Computer");
        System.out.println("Enter the name for Human");
        player1.setName(input.nextLine());
        System.out.println("You are playing " + player2.getName());
        game.start();
        game.initializeDrawPile();
        game.createDiscardPile();
        player1.initializeHand(game);
        player2.initializeHand(game);
        player1.initialTurn(game);
        
        while(!(game.isOver(game,player2,player1)))
        {
            if(!(game.isOver(game,player2,player1)))
            {
                player2.takeTurn(game, (HumanPlayer) player1);
            }
            if(!(game.isOver(game,player2,player1)))
            {
                player1.takeTurn(game, (HumanPlayer) player1);
            }
        }
        
    }
    
}
