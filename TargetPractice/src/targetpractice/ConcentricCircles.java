/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetpractice;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Michael Miller
 */
public class ConcentricCircles extends JPanel {

    private int numberCircles = 8;
    private int width = 2;
    private int height = 4;
    private int r = 225;
    private int gr =100;
    private int b = 50;
            
// draw eight Circles separated by 10 pixels
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      // create 8 concentric circles
      for ( int i = 0; i < numberCircles; i++)
      {
        g.setColor(new Color(r, gr, b));
        int xPosition = i + width;
        int yPosition = 2*i + height;
        g.drawArc(i, i, WIDTH, HEIGHT, ABORT, HEIGHT);
      }
      
   }
}
