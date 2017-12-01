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
public class NecessaryProduct extends Product{
    
    public NecessaryProduct(String name, double price)
    {
        super(name, price);
    }

    @Override
    public double getTotalPrice() {
        return super.getPrice();
        
    }
    
}
