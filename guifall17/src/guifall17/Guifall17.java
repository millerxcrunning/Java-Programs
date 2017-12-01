/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guifall17;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Michael Miller
 */
public class Guifall17 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button rock = new Button();
        rock.setText("rock'");
        rock.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("rock");
            }
        });
        Button paper = new Button();
        paper.setText("paper'");
        paper.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("paper");
            }
        });
        Button scissors = new Button();
        scissors.setText("scissors'");
        scissors.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("scissors");
            }
        });
        
        
        FlowPane root = new FlowPane();
        root.getChildren().add(rock);
        root.getChildren().add(paper);
        root.getChildren().add(scissors);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Play rock, paper, scissors");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
