/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1b.starting.code;

/**
 *
 * @author Michael Miller
 */
public class LuxuryProduct extends Product{

    public LuxuryProduct(String name, double price)
    {
        super(name, price);
    }
    
    @Override
    public double getTotalPrice() 
    {
        return (this.getPrice()*1.0575);
    }
    
}
