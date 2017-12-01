/**
 * Lab 8 pre-lab program for CS1180
 * The purpose of this program is to practice using two-dimensional arrays
 * Program creates and randomly fills a two-dimensional array of boolean values
 * The program displays the array and then displays the number of neighbors
 * for each cell
 * May 2015
*/
package lab8_prelab;

/**
 * @author V. Starkey
 * CS1180L-01
 * TA: Colin Leong
 * Instructor: V. Starkey
 */
public class countNeighbors {

    //declare constants that may be used within all methods in this program
    static final int HEIGHT = 4;
    static final int WIDTH = 4;

     /**
     * creates a two-dimensional array of boolean values
     * fills the array randomly by generating a value to represent true or false
     * displays the array with X as true and O as false
     * displays the row, column, and number of neighbors for each cell
     * where a neighbor is defined to be a true value in any adjacent cell
     */
    public static void main(String args[])
    {
        boolean[][] array = new boolean[HEIGHT][WIDTH];

        initializeArray(array);
        
        printArray(array);
        
        //test countNeighbors
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count = countNeighbors(array, i, j);
                System.out.println("The neighbor count for cell [" + i + "]["
                        + j + "] is " + count);
            } // end for each cell in row
        } // end for each row of cells
        
        

    }


    /**
     * randomly initializes all cells to either true or false
     * @param array is a 2-dimensional array of boolean values 
     * this method randomly sets all cells to a true or false value
     */
    public static void initializeArray(boolean[][] array) {

        int randomValue;
        // Initialize board so that all cells are dead
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                //generate a 1 or a 2
                randomValue = (int)(Math.random() * 2);
                if (randomValue == 0)
                    array[i][j] = false;
                else
                    array[i][j] = true;
            } 
        } 
    }
    
    /**
     * prints an X for cells that are true and an ) if the cell is true
     * @param array is a 2-dimensional array of boolean values 
     */
    public static void printArray(boolean[][] array)
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                
                if (array[i][j])
                    System.out.print("X ");
                else
                    System.out.print("O ");
            } 
            System.out.println();
        } 
        System.out.println();
    }
   

    /**
     *
     * @param array is a 2-dimensional array of boolean values 
     * @param rowIndex The row position of the cell in the array whose
     * neighbors are to be counted.
     * @param colIndex The column position of the cell in the array whose
     * neighbors are to be counted.
     * @return the number of cells adjacent to the cell at the specified row and
     * column that contain a true value
     */
    public static int countNeighbors(boolean[][] gameBoard, int rowIndex, int colIndex) {
        
        int GAME_BOARD_WIDTH_IN_CELLS=gameBoard[0].length;
        int GAME_BOARD_HEIGHT_IN_CELLS=gameBoard.length;
         
        int lifeNeighborCount = 0;
        
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
                lifeNeighborCount++;
        
        //ll
        if(rowIndex<GAME_BOARD_HEIGHT_IN_CELLS-1 && colIndex>0)
            if(gameBoard[rowIndex+1][colIndex-1])
                lifeNeighborCount++;
        
        //l
        if(rowIndex<GAME_BOARD_HEIGHT_IN_CELLS-1)
            if(gameBoard[rowIndex+1][colIndex])
                lifeNeighborCount++;
        
        //lr
        if(rowIndex<GAME_BOARD_HEIGHT_IN_CELLS-1 && colIndex<GAME_BOARD_WIDTH_IN_CELLS-1)
            if(gameBoard[rowIndex+1][colIndex+1])
                lifeNeighborCount++;
        
	 return lifeNeighborCount;
        
    } // end method countNeighbors

} 
