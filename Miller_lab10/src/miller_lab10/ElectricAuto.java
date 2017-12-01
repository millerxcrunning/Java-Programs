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
public class ElectricAuto extends Automobile{
    
    private double electricRange;
    
    private double trunkCapacity;
    
    //Constructor
    public ElectricAuto()
    {
        super ();
        this.electricRange = 0;
        this.trunkCapacity = 0;
    }
    
    //Constructor
    public ElectricAuto(String make, String model, double electricRange, double trunkCapacity)
    {
        super(make, model);
        this.electricRange = electricRange;
        this.trunkCapacity = trunkCapacity;
    }
    
    //Getter
    public double getElectricRange()
    {
        return electricRange;
    }
    
    //Setter
    public void setElectricRange(double electricRange)
    {
        this.electricRange = electricRange;
    }
    
    //Getter
    public double getTrunkCapacity()
    {
        return trunkCapacity;
    }
    
    //Setter
    public void setTrunkCapacity(double trunkCapacity)
    {
        this.trunkCapacity = trunkCapacity;
    }
    
    @Override
    public String toString()
    {
        return this.getMake() + "\n" + this.getModel() + "\n" + this.getElectricRange()
                + "\n" + this.getTrunkCapacity() + "\n";
    }
}
