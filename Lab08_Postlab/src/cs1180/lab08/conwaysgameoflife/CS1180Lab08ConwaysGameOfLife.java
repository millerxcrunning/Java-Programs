package cs1180.lab08.conwaysgameoflife;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Doom
 * @modified by V. Starkey changed cell type to boolean (rather than the wrapper
 * type Boolean) changed setupInitalGameState method so that each type of
 * lifeform is initialized within a separate method)
 */
public class CS1180Lab08ConwaysGameOfLife extends Application {

    // CS 1180 Note:  Feel free to change these values during testing, but 
    // return them to the initial provided values in your final program.
    public static final int GAME_BOARD_HEIGHT_IN_CELLS = 50;
    public static final int GAME_BOARD_WIDTH_IN_CELLS = 50;
    public static final int CELL_SIZE_IN_PIXELS = 10;
    public static int tickNum = 0;
    private static Rectangle[][] graphicCells = new Rectangle[GAME_BOARD_HEIGHT_IN_CELLS][GAME_BOARD_WIDTH_IN_CELLS];
    private static boolean[][] gameCellAlive = new boolean[GAME_BOARD_HEIGHT_IN_CELLS][GAME_BOARD_WIDTH_IN_CELLS];
    private static final double gameUpdatesPerSecond = 2;

    /**
     * This method updates the game board according to the rules: 1. If a live
     * cell has 0 or 1 live neighbors, it dies of loneliness 2. If a live cell
     * has four or more live neighbors, it dies of overcrowding 3. If a live
     * cell has 2 or 3 live neighbors it remains unchanged 4. If a dead cell has
     * exactly 3 live neighbors, it comes to life
     *
     * @param gameCellAlive a 2D boolean array which contains TRUE if the cell
     * at that board location is live and FALSE if the cell at that board
     * location is dead. This method updates this array for the next cycle of
     * the simulation according to rules for Conway's game of life (listed
     * above).
     *
     * CS1180 NOTE: YOU NEED TO IMPLEMENT THIS METHOD!
     */
    public static void updateLife(boolean[][] gameCellAlive) {
        //This creates a duplicate copy of gameCellAlive 2D array
        boolean[][] newGameCellAlive = new boolean[gameCellAlive.length][gameCellAlive[0].length];

        for (int i = 0; i < gameCellAlive.length; i++) // row
        {
            for (int j = 0; j < gameCellAlive[i].length; j++) // col
            {
                //This copies "true" or "false" to each position inside of 
                //newGameCellAlive 2D array.
                newGameCellAlive[i][j] = gameCellAlive[i][j];
            }
        }

        //update copy
        //This moves through the row
        /* 1. If a live cell has 0 or 1 live neighbors, it dies of loneliness
     * 2. If a live cell has four or more live neighbors, it dies of overcrowding
     * 3. If a live cell has 2 or 3 live neighbors it remains unchanged
     * 4. If a dead cell has exactly 3 live neighbors, it comes to life*/
        for (int i = 0; i < gameCellAlive.length; i++) {
            //This moves through each column position inside of row.
            for (int j = 0; j < gameCellAlive[i].length; j++) {
                int n = getLifeNeighborCount(newGameCellAlive, i, j);
                //System.out.print(n + " ");
                if (n <= 1) {
                    gameCellAlive[i][j] = false;
                }
                if (!newGameCellAlive[i][j] && n == 3) {
                    gameCellAlive[i][j] = true;
                }
                if (n >= 4) {
                    gameCellAlive[i][j] = false;
                }
            }
            //System.out.println("");
        }

        //set original to copy values
        for (int i = 0; i < GAME_BOARD_HEIGHT_IN_CELLS; i++) // row
        {
            for (int j = 0; j < GAME_BOARD_WIDTH_IN_CELLS; j++) // col
            {
                //This copies "true" or "false" to each position inside of 
                //newGameCellAlive 2D array.
                gameCellAlive[i][j] = newGameCellAlive[i][j];
            }
        }
    } // end method updateLife

    /**
     *
     * @param gameBoard A 2D boolean array containing the current life status of
     * each cell at each x,y coordinate on the board. true indicates that the
     * cell is alive. false indicates no life in that cell.
     * @param colIndex The x position of the cell in the game board whose
     * neighbors are to be counted.
     * @param rowIndex The y position of the cell in the game board whose
     * neighbors are to be counted.
     * @return the number of cells adjacent to the cell at the specified row and
     * column that contain life. This value ranges between 0 (no adjacent cells
     * contain life) and 8 (all adjacent cells contain life).
     *
     * CS1180 NOTE: YOU NEED TO IMPLEMENT THIS METHOD!
     */
    public static int getLifeNeighborCount(boolean[][] gameBoard, int rowIndex, int colIndex) {

        int lifeNeighborCount = 0;
        /*for (int i = rowIndex - 1; i <= rowIndex + 1; i++) {
            for (int j = colIndex - 1; j <= colIndex + 1; j++) 
            {
                if (i >= 0 
                        && j >= 0
                        && i < gameBoard.length 
                        && j < gameBoard.length
                        && !(i == rowIndex && j == colIndex))
                {
                    if(gameBoard[i][j])
                        lifeNeighborCount += 1;
                }
            }
        }*/
        
        for(int i = rowIndex - 1; i <= rowIndex + 1; i++) 
        {
            if (i >= 0 && i < gameBoard.length)
                for(int j = colIndex - 1; j <= colIndex + 1; j++) 
                {
                    if (j >= 0 && j < gameBoard[i].length && i != rowIndex && j != colIndex && gameBoard[i][j]) 
                                lifeNeighborCount++;
                }
        }
        
        System.out.println(lifeNeighborCount);
        return lifeNeighborCount;
    } // end method getLifeNeighborCount

    /**
     * Set up initial game state
     *
     * @param gameCellAlive A 2D boolean array representing the cells of the
     * game board. Live cells are set to true, dead cells are set to false. This
     * method sets a subset of gameCellAlive to true/alive to create the initial
     * life form for the simulation.
     *
     * CS 1180 Note: You may modify this method by commenting/uncommenting the
     * init configurations
     */
    private static void setupInitialGameState(boolean[][] gameCellAlive) {

        // Initialize board so that all cells are dead
        for (int i = 0; i < gameCellAlive.length; i++) {
            for (int j = 0; j < gameCellAlive[i].length; j++) {
                gameCellAlive[i][j] = false;
            } // end for each cell in row
        } // end for each row of cells

        //set up for the desired initial lifeform:        
        //initLifeformBlock(gameCellAlive);        
        //initLifeformBlinker(gameCellAlive);
        initLifeformGlider(gameCellAlive);        
        //initLifeformR_Pentomino(gameCellAlive);

    }  // end method setupInitialGameState

    /**
     * initializes lifeform to Block the lifeform will be centered on the game
     * board and will remain unchanged as the game runs
     *
     * @param gameCellAlive is a gameboard with all cells initially false
     *
     * CS 1180 note: You do not need to understand this method. Do not modify
     * this method.
     */
    private static void initLifeformBlock(boolean[][] gameCellAlive) {

        int x = GAME_BOARD_HEIGHT_IN_CELLS / 2;
        int y = GAME_BOARD_WIDTH_IN_CELLS / 2;

        // Place initial lifeform Block
        gameCellAlive[x][y] = true;
        gameCellAlive[x][y + 1] = true;
        gameCellAlive[x + 1][y] = true;
        gameCellAlive[x + 1][y + 1] = true;
    }

    /**
     * initializes lifeform to Blinker the lifeform will alternate before a
     * horizontal or vertical bar centered in the middle of the gameboard as the
     * game runs
     *
     * @param gameCellAlive is a gameboard with all cells initially false
     *
     * CS 1180 note: You do not need to understand this method. Do not modify
     * this method.
     */
    private static void initLifeformBlinker(boolean[][] gameCellAlive) {

        int x = GAME_BOARD_HEIGHT_IN_CELLS / 2;
        int y = GAME_BOARD_WIDTH_IN_CELLS / 2;
        gameCellAlive[x][y] = true;
        gameCellAlive[x][y + 1] = true;
        gameCellAlive[x][y + 2] = true;
    }

    /**
     * initializes lifeform to Glider the lifeform will appear in the upper left
     * of the gameboard and will transform through 4 generations back to its
     * original form and appear to move diagonally across the gameboard as the
     * game runs
     *
     * @param gameCellAlive is a gameboard with all cells initially false CS
     * 1180 note: You do not need to understand this method. Do not modify this
     * method.
     */
    private static void initLifeformGlider(boolean[][] gameCellAlive) {

        int x = 0;
        int y = 0;
        gameCellAlive[x][y + 1] = true;
        gameCellAlive[x + 1][y + 2] = true;
        gameCellAlive[x + 2][y] = true;
        gameCellAlive[x + 2][y + 1] = true;
        gameCellAlive[x + 2][y + 2] = true;
    }

    /**
     * initializes lifeform to r-Pentomino the lifeform initially has 5 cells
     * but grows in all directions a very active lifeform that separates into
     * separate forms --it releases a glider in generation 69 (and others)
     * --does not stabilize (become predictable) until generation 1103 ----may
     * have to increase board size and decrease speed to visualize
     *
     * @param gameCellAlive is a gameboard with all cells initially false
     *
     * CS 1180 note: You do not need to understand this method. Do not modify
     * this method.
     */
    private static void initLifeformR_Pentomino(boolean[][] gameCellAlive) {

        int x = GAME_BOARD_HEIGHT_IN_CELLS / 2;
        int y = GAME_BOARD_WIDTH_IN_CELLS / 2;
        gameCellAlive[x][y + 1] = true;
        gameCellAlive[x][y + 2] = true;
        gameCellAlive[x + 1][y] = true;
        gameCellAlive[x + 1][y + 1] = true;
        gameCellAlive[x + 2][y + 1] = true;

    }

    /**
     * This method sets up the graphics/window environment.
     *
     * CS1180 note: You do not need to understand this method. Do not modify
     * this method.
     */
    @Override
    public void start(Stage primaryStage) {

        // Display game window
        Pane window = new Pane();
        int windowWidth = GAME_BOARD_WIDTH_IN_CELLS * CELL_SIZE_IN_PIXELS;
        int windowHeight = GAME_BOARD_HEIGHT_IN_CELLS * CELL_SIZE_IN_PIXELS;
        Scene scene = new Scene(window, windowWidth, windowHeight);
        primaryStage.setTitle("CS 1180 Conway's Game Of Life");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Create cells for window/graphical visualization
        for (int x = 0; x < GAME_BOARD_HEIGHT_IN_CELLS; x++) {
            for (int y = 0; y < GAME_BOARD_WIDTH_IN_CELLS; y++) {
                Rectangle r = new Rectangle(x * CELL_SIZE_IN_PIXELS, y * CELL_SIZE_IN_PIXELS, CELL_SIZE_IN_PIXELS, CELL_SIZE_IN_PIXELS);
                graphicCells[x][y] = r;
                window.getChildren().add(r);
            } // end for each cell in row
        } // end for each row

        // Start animation
        KeyFrame speed = new KeyFrame(Duration.millis(1000 / gameUpdatesPerSecond), e -> gameTick());
        Timeline animation = new Timeline(speed);
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    } // end method start

    /**
     * This method is automatically called by the animation routine once every
     * game tick to update the graphical display. This method sets the cells in
     * the 2D graphical display to WHITE or BLACK based on the whether the
     * corresponding cell in the 2D boolean array gameCellAlive is TRUE or FALSE
     * (respectively).
     *
     * CS 1180 note: You do not need to understand this method. Do not modify
     * this method.
     */
    private void gameTick() {
        for (int x = 0; x < GAME_BOARD_HEIGHT_IN_CELLS; x++) {
            for (int y = 0; y < GAME_BOARD_WIDTH_IN_CELLS; y++) {
                if (gameCellAlive[x][y] == true) {
                    graphicCells[x][y].setFill(Color.WHITE);
                } else {
                    graphicCells[x][y].setFill(Color.BLACK);
                }
            } // end for each cell in row
        } // end for each row
        tickNum++;
        System.out.println("---- end of tick #" + tickNum + " ----");
        updateLife(gameCellAlive);
    } // end method gameTick

    /**
     *
     * CS 1180 Note: Do not modify this method.
     */
    public static void main(String[] args) {
        setupInitialGameState(gameCellAlive);
        launch(args);
    } // end method main

} // end class ConwaysGameOfLife
