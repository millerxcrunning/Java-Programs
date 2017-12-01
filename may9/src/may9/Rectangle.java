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
public class Rectangle extends Shape{
    
    private int length;
    private int width;
    
    public Rectangle (int length, int width)
            {
                this.length = length;
                this.width = width;
            }
    
    @Override
    public void draw()
    {
        
    }
    
    public int getLength()
    {
        return length;
    }
    
    public void setLength(int length)
    {
        this.length = length;
    }
    
    public int getWidthth()
    {
        return width;
    }
    
    public void setWidth(int length)
    {
        this.width = length;
    }
    
    private int getArea()
    {
        return length*width;
    }

    @Override
    public String toString()
    {
        System.out.println("length = " + this.getLength() + ". Width = " + this.getWidthth());
        return "this rectangle has " + this.getArea() + " area";
    }

}
