/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_lab10;

/**
 *
 * @author alexisfletes
 */
public class Hybrid extends ElectricAuto{
    
    private double mpg;
    
    //Constructor
    public Hybrid()
    {
        super();
        this.mpg = 0;
    }
    
    //Constructor
    public Hybrid(String make, String model, double electricRange, double 
            trunkCapacity, double mpg)
    {
        super(make, model, electricRange, trunkCapacity);
        this.mpg = mpg;       
    }
    
    //Getter
    public double getMpg()
    {
        return this.mpg;
    }
    
    //Setter
    public void setMpg(double mpg)
    {
        this.mpg = mpg;
    }
           
    public String toString()
    {
        return this.getMake()+ "\n" + this.getModel()+ "\n" + this.getElectricRange()
                + "\n" + this.getTrunkCapacity()+ "\n" + this.getMpg() + "\n";
    }
}
