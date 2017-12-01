/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1181lab1b;

/**
 *
 * @author Michael Miller
 */
public class Adder {

    private int total;

    public Adder()
    {
        this.total = 0;
    }

    public void add(int value)
    {
        this.total +=value;
    }

    @Override
    public String toString()
    {
       return "Total: " + this.total;
    }
}
