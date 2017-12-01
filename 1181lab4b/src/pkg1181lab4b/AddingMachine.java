/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1181lab4b;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Michael Miller
 */
public class AddingMachine extends Application{

    private int runningTotal = 0;
    //private double operand1 = 0;
    //private double operand2 = 0;
    private boolean startNewNumber = true;
        
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Application.launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        TextField outputField = new TextField("0");
        Button one = new Button("1");
        one.setPrefWidth(70);
        one.setOnAction(e->
        {
            /*if output textfield has data already, something has to be done with
            the data already there before putting "1" there
            
            if(!(output.getText() == null))
                    {
                        //if operand1 has no value already
                        if (operand1 == 0)
                        {
                            //store value in output textfield as operand1
                            operand1 = Double.parseDouble(output.getText());
                        }
                        //if operand2 has no value already
                        else if (operand2 ==0)
                        {
                            operand2 = Double.parseDouble(output.getText());
                        }
                    }
            
            //Now we can add "1" to output textfield
            output.appendText("1");*/
            /*while(Double.parseDouble(outputField.getText()) == 0)
                    {
                        output = "1";
                        
                    }*/
            
            if (Integer.parseInt(outputField.getText()) == 0 || startNewNumber)
                    {
                        outputField.clear();                        
                    }
            
            outputField.appendText("1");
            startNewNumber = false;
            
        });
        Button two = new Button("2");
        two.setPrefWidth(70);
        two.setOnAction(e->
        {
            
            if (Integer.parseInt(outputField.getText()) == 0 || startNewNumber)
                    {
                        outputField.clear();                        
                    }
            
            outputField.appendText("2");
            startNewNumber = false;
        });
        Button three = new Button("3");
        three.setPrefWidth(70);
        three.setOnAction(e->
        {
            if (Integer.parseInt(outputField.getText()) == 0 || startNewNumber)
                    {
                        outputField.clear();                        
                    }
            
            outputField.appendText("3");
            startNewNumber = false;

        });
        Button four = new Button("4");
        four.setPrefWidth(70);
        four.setOnAction(e->
        {
            
            if (Integer.parseInt(outputField.getText()) == 0 || startNewNumber)
                    {
                        outputField.clear();                        
                    }
            
            outputField.appendText("4");
            startNewNumber = false;
        });
        Button five = new Button("5");
        five.setPrefWidth(70);
        five.setOnAction(e->
        {
            
            if (Integer.parseInt(outputField.getText()) == 0 || startNewNumber)
                    {
                        outputField.clear();                        
                    }
            
            outputField.appendText("5");
            startNewNumber = false;
        });
        Button six = new Button("6");
        six.setPrefWidth(70);
        six.setOnAction(e->
        {
            if (Integer.parseInt(outputField.getText()) == 0 || startNewNumber)
                    {
                        outputField.clear();                        
                    }
            
            outputField.appendText("6");
            startNewNumber = false;
        });
        Button seven = new Button("7");
        seven.setPrefWidth(70);
        seven.setOnAction(e->
        {
            if (Integer.parseInt(outputField.getText()) == 0 || startNewNumber)
                    {
                        outputField.clear();                        
                    }
            
            outputField.appendText("7");
            startNewNumber = false;
        });
        Button eight = new Button("8");
        eight.setPrefWidth(70);
        eight.setOnAction(e->
        {
            if (Integer.parseInt(outputField.getText()) == 0 || startNewNumber)
                    {
                        outputField.clear();                        
                    }
            
            outputField.appendText("8");
            startNewNumber = false;
        });
        Button nine = new Button("9");
        nine.setPrefWidth(70);
        nine.setOnAction(e->
        {
            if (Integer.parseInt(outputField.getText()) == 0 || startNewNumber)
                    {
                        outputField.clear();                        
                    }
            
            outputField.appendText("9");
            startNewNumber = false;
        });
        Button plus = new Button("+");
        plus.setPrefWidth(70);
        plus.setOnAction(e->
        {   
            runningTotal +=Integer.parseInt(outputField.getText());
            outputField.setText(Integer.toString(runningTotal));
            startNewNumber = true;
            
        });
        Button zero = new Button("0");
        zero.setPrefWidth(70);
        zero.setOnAction(e->
        {
            if (Integer.parseInt(outputField.getText()) == 0 || startNewNumber)
                    {
                        outputField.clear();                        
                    }
            
            outputField.appendText("0");
            startNewNumber = false;
        });
        Button c = new Button("C");
        c.setPrefWidth(70);
        c.setOnAction(e->
        {
            runningTotal = 0;
            outputField.setText("0");
        });
        
        
        GridPane calculator = new GridPane();
        calculator.add(outputField, 0, 0, 3, 1);
        calculator.add(one, 0, 1);
        calculator.add(two, 1, 1);
        calculator.add(three, 2, 1);
        calculator.add(four, 0, 2);
        calculator.add(five, 1, 2);
        calculator.add(six, 2, 2);
        calculator.add(seven, 0, 3);
        calculator.add(eight, 1, 3);
        calculator.add(nine, 2, 3);
        calculator.add(plus, 0, 4);
        calculator.add(zero, 1, 4);
        calculator.add(c, 2, 4);
        
        Scene scene = new Scene(calculator, 200, 135);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Adding Machine");
        primaryStage.show();
    }
    
}
