/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxevents;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.HPos;

/**
 *
 * @author alexisfletes
 */
public class JavaFXEvents extends Application implements EventHandler<ActionEvents>
{

    private Button first, second, third, fourth;
    private Label output;
    /**
     * @param args the command line arguments
     */
    
    @ Override
    public void start(Stage primaryStage) throws Exception {
        // TODO code application logic here
        
        GridPane pane = new GridPane();
        pane.setAlignment
        first = new Button("First Button");
        second = new Button("Second Button");
        third = new Button("Third Button");
        fourth = new Button("Fourth Button");
        Button fifth = new Button("Fifth Button");
        Button sixth = new Button("Sixth Button");
        Button seventh = new Button("Seventh Button");
        Button eighth = new Button("Eighth Button");
        

        pane.add(first, 0, 0);
        pane.add(second, 1, 0);
        pane.add(third, 0, 1);
        pane.add(fourth, 1, 1);
        pane.add(fifth, 0, 2);
        pane.add(sixth, 1, 2);
        pane.add(seventh, 0, 3);
        pane.add(eighth, 1, 3);
        
        output = new Label("Last button clicked: ?????");
        
        pane.add(output, 0, 4, 2, 1);
        
        GridPane.setHalignment(output, HPos.CENTER);
        
        first.setOnAction(this);
        second.setOnAction(this);
        myButtonHandler hdlr = new myButtonHandler();
        third.setOnAction(hdlr);
        fourth.setOnAction(hdlr);
        fifth.setOnAction(
        new EventHandler<ActionEvent> ()
                {
                  public void handle(ActionEvent event)
                {
                    output.setText("Last button clicked: fifth");
                }
                }
        );
                
        sixth.setOnAction(
        new EventHandler<ActionEvent> ()
                {
                  public void handle(ActionEvent event)
                {
                    output.setText("Last button clicked: sixth");
                }
                }
        );
        
        seventh.setOnAction( e ->
                output.setText("Last button clicked: seventh"));
        eighth.setOnAction( e ->
                output.setText("Last button clicked: eighth"));       
                
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Event Games");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    @Override
    public void handle(ActionEvent event)
    {
        if (event.getSource() == first)
        {
            output.setText("Last button clicked: first");
        }
        else 
        {
            output.setText("Last button clicked: second");
        }
    }
    
    private class myButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
    {
        if (event.getSource() == third)
        {
            output.setText("Last button clicked: third");
        }
        else 
        {
            output.setText("Last button clicked: fourth");
        }
    }
    }
    
}
