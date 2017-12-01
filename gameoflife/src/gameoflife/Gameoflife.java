/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

/**
 *
 * @author alexisfletes
 */
public class Gameoflife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ul
        if(rowIndex>0 && colIndex>0)
            if(gameBoard[rowIndex-1][colIndex-1])
                lifeNeighborCount++;
        
        //u
        if (rowIndex>0)
            if(gameBoard[rowIndex-1][colIndex])
                lifeNeighborCount++;
        
        //ur
        if(rowIndex>0 && colIndex<GAME_BOARD_WIDTH_IN_CELLS-1)
            if(gameBoard[rowIndex-1][colIndex+1])
                lifeNeighborCount++;
        //l
        if(colIndex>0)
            if(gameBoard[rowIndex][colIndex-1])
                lifeNeighborCount++;
        
        //r
        if(colIndex<GAME_BOARD_WIDTH_IN_CELLS-1)
            if(gameBoard[rowIndex][colIndex+1])
                lifeNeighborsCount++;
        
        //ll
        if(rowIndex<GAME_BOARD_HEIGHT_IN_CELLS-1 && colIndex>0)
            if(gameBoard[rowIndex+1][colIndex-1])
                lifeNeighborsCount++;
        
        //l
        if(rowIndex<GAME_BOARD_HEIGHT_IN_CELLS-1)
            if(gameBoard[rowIndex+1][colIndex])
                lifeNeighborsCount++;
        
        //lr
        if(rowIndex<GAME_BOARD_HEIGHT_IN_CELLS-1 && colIndex<GAME_BOARD_WIDTH_IN_CELLS-1)
            if(gameBoard[rowIndex+1][colIndex+1])
                lifeNeighborsCount++;
           
                
                        
                        
        
    }
    
}
