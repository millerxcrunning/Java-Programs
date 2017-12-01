/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic8ball;

import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Michael Miller
 * CS1181L-06
 * Instructor: C. Rodabough
 * TA: Steve Betts
 */
public class Magic8Ball extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        String [] answers = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely"
        , "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes"
        , "Reply hazy try again", "Ask again later", "Better not tell you now", "Cannot predict now"
        , "Concentrate and ask again", "Don't count on it", "My reply is no", "My sources say no"
        , "Outlook not so good", "Very doubtful"};
        Label question = new Label("What is your question?");
        TextField questionField = new TextField();
        Label generateResponse = new Label("<Type your question and press the button");
        Button ask = new Button();
        ask.setText("Ask the Magic 8-Ball'");
        ask.setOnAction(e->{
            if(!(questionField.getText().equals("")))
            {
               //System.out.println(questionField.getText());
               //generates a random number between 0 and 19 inclusive
               //int rand = (int)(Math.random() * ((20 - 1) + 1));
               //System.out.println(rand);
               generateResponse.setText(answers[((int)(Math.random() * ((20 - 1) + 1)))]);
            }
            if(questionField.getText().equals(""))
            {
            new Alert(Alert.AlertType.ERROR, "You have to ask a question first!").showAndWait(); 
            }
        });
        
        GridPane gridPane = new GridPane();
        gridPane.add(question, 0, 0);
        gridPane.add(questionField, 1, 0);
        gridPane.add(ask, 0, 1);
        gridPane.add(generateResponse, 0, 2);
        
        Scene scene = new Scene(gridPane, 450, 80);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Magic 8-Ball");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
