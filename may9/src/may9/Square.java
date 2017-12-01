/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package may9;

/**
 *
 * @author Michael Miller
 */
public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }
    
    @Override
    public void draw()
    {
        
    }
    
    @Override
    public String toString()
    {
        return "side = " + super.getLength();
    }
            
    
    
}
