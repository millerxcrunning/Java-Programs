/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Convert extends JFrame
{

private JPanel convertFrom, convertTo;
private JLabel label1, label2, label3, label4;
private JTextField temperature1, temperature2;
private ButtonGroup radioFrom, radioTo;
private JRadioButton celciusBoxTo, fahrenheitBoxTo, kelvinBoxTo, celciusBoxFrom, fahrenheitBoxFrom, kelvinBoxFrom;

public Convert()
{

super("Convert Temperature");
fahrenheitBoxFrom = new JRadioButton("Fahrenheit", true);
celciusBoxFrom = new JRadioButton("Celcius", false);
kelvinBoxFrom = new JRadioButton( "Kelvin", false);
radioFrom = new ButtonGroup();
radioFrom.add(fahrenheitBoxFrom);
radioFrom.add(celciusBoxFrom);
radioFrom.add(kelvinBoxFrom);
fahrenheitBoxTo = new JRadioButton("Fahrenheit", false);
celciusBoxTo = new JRadioButton("Celcius", true);
kelvinBoxTo = new JRadioButton("Kelvin", false);
radioTo = new ButtonGroup();
radioTo.add(fahrenheitBoxTo);
radioTo.add(celciusBoxTo);
radioTo.add(kelvinBoxTo);
convertFrom = new JPanel();
convertFrom.setLayout(new GridLayout(1, 3));
convertFrom.add(fahrenheitBoxFrom);
convertFrom.add(celciusBoxFrom);
convertFrom.add(kelvinBoxFrom);
convertTo = new JPanel();
convertTo.setLayout(new GridLayout(1, 3));
convertTo.add(fahrenheitBoxTo);
convertTo.add(celciusBoxTo);
convertTo.add(kelvinBoxTo);
label1 = new JLabel("Convert from:");
label2 = new JLabel("Convert to:");
label3 = new JLabel("Enter Temperature: ");
label4 = new JLabel("Converted Temperature is: ");
temperature1 = new JTextField(10);
temperature1.addActionListener((ActionEvent event) -> {
    int convertTemp, temp;
    temp = Integer.parseInt(((JTextField) event.getSource()).getText());
    if (fahrenheitBoxFrom.isSelected() && celciusBoxTo.isSelected())  
    {
        convertTemp = (int) (5.0f/9.0f * (temp - 32));
        
        temperature2.setText(String.valueOf(convertTemp));
    }
    
    else if (fahrenheitBoxFrom.isSelected() && kelvinBoxTo.isSelected())
    {
        convertTemp = (int) (5.0f/9.0f * (temp - 32) + 273);
        
        temperature2.setText(String.valueOf(convertTemp));
    }
    
    else if (celciusBoxFrom.isSelected() && fahrenheitBoxTo.isSelected())
    {
        convertTemp = (int) (9.0f/5.0f * temp + 32);
        
        temperature2.setText( String.valueOf(convertTemp));
    }
    
    
    else if (celciusBoxFrom.isSelected() && kelvinBoxTo.isSelected())    
    {
        convertTemp = temp + 273;
   
        temperature2.setText( String.valueOf( convertTemp ) );
    }
 
    else if (kelvinBoxFrom.isSelected() && celciusBoxTo.isSelected())
    {
        
        convertTemp = temp - 273;
        
        temperature2.setText( String.valueOf( convertTemp ) );
        
    }
    
// kelvin to fahrenheit
    
    else if ( kelvinBoxFrom.isSelected() && fahrenheitBoxTo.isSelected() )
        
    {
        
        convertTemp = ( int ) ( 5.0f / 9.0f * ( temp - 273 ) + 32 );
        
        temperature2.setText( String.valueOf( convertTemp ) );
        
    }
}
);

temperature2 = new JTextField( 10 );
temperature2.setEditable(false);

Container container = getContentPane();
container.setLayout(new GridLayout(8, 1));
container.add(label1);
container.add(convertFrom);
container.add(label3);
container.add(temperature1);
container.add(label2);
container.add(convertTo);
container.add(label4);
container.add(temperature2);
setSize(250, 225);

setVisible(true);

} 

public static void main ( String args[] )

{

Convert application = new Convert(); application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

}

} 
    

