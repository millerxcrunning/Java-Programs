/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1181lab5a;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

 
 *
 * @author alexisfletes
 */
public class interactiveTicTacToeGUI extends Application {

    /**
     * @param args the command line arguments
     */
    private int count;
    
    public static void main(String[] args) {
        // 
        Application.launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //count is for keeping track of whether an X or an O should be put in the button
        count = 0;
      
        TextField output = new TextField();
        Button one = new Button("1");
        one.setOnAction(e-> {
            /*
            Makes sure there is no X or O marked there already, then if it is 
            untouched, an "X" will be put there if it is a count 0, 2, 4... turn, 
            and "O" if it is a count 1, 3, 5... even turn.
            
            This makes sure that count will not be incremented unless this button 
            has not been pressed. Therefore, the X or O that is there will not 
            change
            */
            if (((count % 2) == 1) && !(one.getText().equals("X"))
                    && !(one.getText().equals("O"))) 
            {
                count++;
                one.setText("O");
            } else if(!(one.getText().equals("X"))
                    && !(one.getText().equals("O")))
            {
                count++;
                one.setText("X");
            }
        });
        one.setPrefSize(70, 70);
        Button two = new Button("2");
        two.setOnAction(e-> {
            if (((count % 2) == 1) && !(two.getText().equals("X"))
                    && !(two.getText().equals("O"))) 
            {
                count++;
                two.setText("O");
            } else if(!(two.getText().equals("X"))
                    && !(two.getText().equals("O")))
            {
                count++;
                two.setText("X");
            }
        });
        two.setPrefSize(70, 70);
        Button three = new Button("3");
        three.setOnAction(e-> {
            if (((count % 2) == 1) && !(three.getText().equals("X"))
                    && !(three.getText().equals("O"))) {
                count++;
                three.setText("O");
            } else if (!(three.getText().equals("X"))
                    && !(three.getText().equals("O"))) {
                count++;
                three.setText("X");
            }
        });
        three.setPrefSize(70, 70);
        Button four = new Button("4");
        four.setOnAction(e-> {
            if (((count % 2) == 1) && !(four.getText().equals("X"))
                    && !(four.getText().equals("O"))) {
                count++;
                four.setText("O");
            } else if (!(four.getText().equals("X"))
                    && !(four.getText().equals("O"))) {
                count++;
                four.setText("X");
            }
        });
        four.setPrefSize(70, 70);
        Button five = new Button("5");
        five.setPrefSize(70, 70);
        Button six = new Button("6");
        six.setPrefSize(70, 70);
        Button seven = new Button("7");
        seven.setPrefSize(70, 70);
        Button eight = new Button("8");
        eight.setPrefSize(70, 70);
        Button nine = new Button("9");
        nine.setPrefSize(70, 70);
        Label gameStatus = new Label("Game Status");
        gameStatus.setPrefSize(210, 70);
        GridPane calculator = new GridPane();
        calculator.add(output, 0, 0, 3, 1);
        calculator.add(one, 0, 1);
        calculator.add(two, 1, 1);
        calculator.add(three, 2, 1);
        calculator.add(four, 0, 2);
        calculator.add(five, 1, 2);
        calculator.add(six, 2, 2);
        calculator.add(seven, 0, 3);
        calculator.add(eight, 1, 3);
        calculator.add(nine, 2, 3);
        calculator.add(gameStatus, 0, 4);
        
        Scene scene = new Scene(calculator, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();
    }
    
}
