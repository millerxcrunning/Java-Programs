/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1181lab4a;

import java.util.InputMismatchException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author alexisfletes
 */
public class CheckDivider extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Application.launch(args);
        
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label total = new Label("Total:");
        TextField totalField = new TextField();
        Label tip = new Label("Tip Percentage:");
        TextField tipField = new TextField();
        Label numberOfPeople = new Label("Number Of People:");
        TextField numberOfPeopleField = new TextField();
        Label pay = new Label("Each person pays:");
        Label calculate = new Label("<Enter the above informationand press Calculate>");
        Button calculateButton = new Button("Calculate"); 
        calculateButton.setOnAction(e->
        {
            
            //calculate.setText(Double.toString(((Double.parseDouble(totalField.getText()) +
            //        (Double.parseDouble(totalField.getText())*Double.parseDouble(tipField.getText())))/
            //        Double.parseDouble(numberOfPeopleField.getText()))));
            try{
            Double eachToPay = ((Double.parseDouble(totalField.getText()) +
                    (Double.parseDouble(totalField.getText())*(0.01*Double.parseDouble(tipField.getText()))))/
                    Double.parseDouble(numberOfPeopleField.getText()));
            String eachToPayAsString = String.format("$%.2f", eachToPay);
            calculate.setText(eachToPayAsString);
            }
            catch(InputMismatchException a)
                {
                    System.out.println(a.getStackTrace());
                }
        });
        
        GridPane gridPane = new GridPane();
        gridPane.add(total, 0, 0);
        gridPane.add(totalField, 0, 1);
        gridPane.add(tip, 0, 2);
        gridPane.add(tipField, 0, 3);
        gridPane.add(numberOfPeople, 0, 4);
        gridPane.add(numberOfPeopleField, 0, 5);
        gridPane.add(pay, 0, 6);
        gridPane.add(calculate, 0, 7);
        gridPane.add(calculateButton, 0, 8);
        
        Scene scene = new Scene(gridPane, 310, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Check Divider");
        primaryStage.show();
        
    }
}
