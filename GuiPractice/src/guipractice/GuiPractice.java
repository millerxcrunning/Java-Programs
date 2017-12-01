/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipractice;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Michael Miller
 */
public class GuiPractice extends Application {

    private int rockCounter = 0;
    private int paperCounter = 0;
    private int scissorsCounter = 0;
    private int player1 = 0;
    private int player2 = 0;
    private Button player2Choose;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       
       player2 = 1 + (int)(Math.random() * ((3 - 1) + 1));
        
       Label label = new Label("Select Rock, Paper, or Scissors");
       Label whoWon = new Label();
       Label tf = new Label("I choose"); 
        
       Button rock = new Button();
       rock.setGraphic(new ImageView(new Image(new File("rock.jpeg").toURI().toString())));
       rock.setOnAction( event->
       { 
           player1 = 1;
           player2Choose.setVisible(true);
       
       if (player1 ==1 && player2 == 1)
       {
           whoWon.setText("We are evenly matched");
       }
       if (player1 == 1 && player2 == 2)
       {
           whoWon.setText("You have been vanquished!");
       }
       if (player1 ==1 && player2 == 3)
       {
           whoWon.setText("You have triumphed!");
       }
       if (player1 ==2 && player2 == 1)
       {
           whoWon.setText("You have triumphed!");
       }
       if (player1 ==2 && player2 == 2)
       {
           whoWon.setText("We are evenly matched");
       }
       if (player1 == 2 && player2 == 3)
       {
           whoWon.setText("You have been vanquished!");
       }
       if (player1 == 3 && player2 == 1)
       {
           whoWon.setText("You have been vanquished!");
       }
       if (player1 == 3 && player2 == 2)
       {
           whoWon.setText("You have triumphed!");
       }
       if (player1 == 3 && player2 == 3)
       {
           whoWon.setText("We are evenly matched");
       }
       });
               
       Button paper = new Button();
       paper.setGraphic(new ImageView(new Image(new File("paper.png").toURI().toString())));
       paper.setOnAction( event->
       {
           player1 = 2;
           player2Choose.setVisible(true);
           
       if (player1 ==1 && player2 == 1)
       {
           whoWon.setText("We are evenly matched");
       }
       if (player1 == 1 && player2 == 2)
       {
           whoWon.setText("You have been vanquished!");
       }
       if (player1 ==1 && player2 == 3)
       {
           whoWon.setText("You have triumphed!");
       }
       if (player1 ==2 && player2 == 1)
       {
           whoWon.setText("You have triumphed!");
       }
       if (player1 ==2 && player2 == 2)
       {
           whoWon.setText("We are evenly matched");
       }
       if (player1 == 2 && player2 == 3)
       {
           whoWon.setText("You have been vanquished!");
       }
       if (player1 == 3 && player2 == 1)
       {
           whoWon.setText("You have been vanquished!");
       }
       if (player1 == 3 && player2 == 2)
       {
           whoWon.setText("You have triumphed!");
       }
       if (player1 == 3 && player2 == 3)
       {
           whoWon.setText("We are evenly matched");
       }
       });
               
       Button scissors = new Button();
       scissors.setGraphic(new ImageView(new Image(new File("scissors.png").toURI().toString())));
       scissors.setOnAction( event->
       {
           player1 = 3;
           player2Choose.setVisible(true);
           
       if (player1 ==1 && player2 == 1)
       {
           whoWon.setText("We are evenly matched");
       }
       if (player1 == 1 && player2 == 2)
       {
           whoWon.setText("You have been vanquished!");
       }
       if (player1 ==1 && player2 == 3)
       {
           whoWon.setText("You have triumphed!");
       }
       if (player1 ==2 && player2 == 1)
       {
           whoWon.setText("You have triumphed!");
       }
       if (player1 ==2 && player2 == 2)
       {
           whoWon.setText("We are evenly matched");
       }
       if (player1 == 2 && player2 == 3)
       {
           whoWon.setText("You have been vanquished!");
       }
       if (player1 == 3 && player2 == 1)
       {
           whoWon.setText("You have been vanquished!");
       }
       if (player1 == 3 && player2 == 2)
       {
           whoWon.setText("You have triumphed!");
       }
       if (player1 == 3 && player2 == 3)
       {
           whoWon.setText("We are evenly matched");
       }
       });
       
       player2Choose = new Button();
       
       if (player2 == 1)
       {
           player2Choose.setGraphic(new ImageView(new Image(new File("rock.jpeg").toURI().toString())));
       }
       else if (player2 == 2)
       {
           player2Choose.setGraphic(new ImageView(new Image(new File("paper.png").toURI().toString())));
       }
       else if (player2 == 3)
       {
           player2Choose.setGraphic(new ImageView(new Image(new File("scissors.png").toURI().toString())));
       }
       
       GridPane container = new GridPane();
       container.add(label, 0, 0);
       container.add(rock, 0, 1);
       container.add(paper, 1, 1);
       container.add(scissors, 2, 1);
       container.add(player2Choose, 0, 3);
       container.add(whoWon, 0, 4);
       container.add(tf, 0, 2);
        
       Scene scene = new Scene(container, 800, 800);
       primaryStage.setScene(scene);
       primaryStage.show();
    }
    
}
