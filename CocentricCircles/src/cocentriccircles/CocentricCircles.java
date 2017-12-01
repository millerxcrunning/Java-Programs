/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocentriccircles;


import java.awt.Graphics;
import javafx.scene.paint.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
/**
 *
 * @author alexisfletes
 */
public class CocentricCircles extends JPanel
{
     
    private Color[] colors = {Color.BLUE, Color.YELLOW, Color.ORANGE};
    private final int NUMCOLORS = 3;
    private final int NUMBERELLIPSES = 20;
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); 
        
        int width = getWidth();
        int height = getHeight();       
        
        //calculates the centre of the panel
        int xPoint = width / 2;
        int yPoint = height / 2;
        
        //draw the 20 concentric ovals
        for(int ellipseNumber = 20; ellipseNumber < NUMBERELLIPSES; ellipseNumber--)
        {
            //g.drawOval(width/2, height/2, NUMBERELLIPSES*(0.5*width/ellipseNumber), NUMBERELLIPSES*(0.5*height/ellipseNumber));
            //g.setColor(colors[i%NUMCOLORS]);
        }
    }
    
    
    public static void main(String[] args) {
        
        CocentricCircles ellipse = new CocentricCircles();
        JFrame newFrame = new JFrame();
        newFrame.add(ellipse);
        newFrame.setSize(300,300);
    }
    
}
