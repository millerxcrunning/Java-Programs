/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package may9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michael Miller
 */
public class May9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r1 = new Rectangle(5,5);
        //System.out.println(r1);
        Square s1 = new Square(4);
        //System.out.println(s1);
        
        Square r2 = new Square(10);
        //System.out.println(r2);
        
        //r2.toString();
        //System.out.println(((Rectangle) r2).getArea());
        
        List<Shape> shapes = new ArrayList<>();
        shapes.add(r1);
        shapes.add(s1);
        shapes.add(r2);
        for(Shape a : shapes)
        {
            System.out.println("\n" + a.toString() + "\n");
        }
        
    }
    
}
