/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animationexcercicse;

import java.awt.Graphics;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javax.swing.JPanel;


/**
 *
 * @author alexisfletes
 */
public class AnimationExcercicse extends JPanel{

    private Ellipse [] ellipse;
    private Color[] colors = {Color.BLUE, Color.YELLOW, Color.ORANGE};
    private final int NUMCOLORS = 3;
    private final int NUMBERELLIPSES = 20;
    private int width = 300;
    private int height = 300;
    
    public AnimationExcercicse(int width, int height, int numberEllipses)
    {
        Pane pane = new Pane();
        Graphics g = pane.getGraphics();
        drawCircles(g, 0, 0 );
        for (int ellipseNumber = NUMBERELLIPSES; ellipseNumber > 0; ellipseNumber--)
        {
            Ellipse ring = new Ellipse(width/2, height/2, NUMBERELLIPSES*
                    (0.5*width/ellipseNumber), numberEllipses*(0.5*height/ellipseNumber));
            ring.setFill(colors[ellipseNumber%NUMCOLORS]);
            getChildren().add(ring);
            ellipse(ellipseNumber)= ring;
        }
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        

    
        
    
    }

    
