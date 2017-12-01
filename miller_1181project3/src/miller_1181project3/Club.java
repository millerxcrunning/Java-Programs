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
public class Club extends Card{
    
    public Club()
    {
        
    }
    
    public Club(int value, int suit)
    {
        super(value, suit);
    }
    
    @Override
    public String toString()
    {
        //return "super.getValue()" + "super.getSuit()";
        return super.toString();
    }
}
