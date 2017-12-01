/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181project3;

/**
 *
 * @author Michael Miller
 */
public class Heart extends Card{
        
    public Heart()
    {
        
    }
    
    public Heart(int value, int suit)
    {
        super(value, suit);
        System.out.println("heart");
    }
  
    @Override
    public String toString()
    {
        //return "super.getValue()" + "super.getSuit()";
        
        return super.toString();
    }
}
