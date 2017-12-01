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
public class Sedan extends GasEngineAuto{
    
    private double trunkCapacity;
    
    //Constructor
    public Sedan()
    {
        super ();
        this.trunkCapacity = 0;
    }
    
    //Constructor
    public Sedan(String make, String model, double mpg, double trunkCapacity)
    {
        super (make, model, mpg);
        this.trunkCapacity = trunkCapacity;
    }
    
    //Getter
    public double getTrunkCapacity()
    {
        return trunkCapacity;
    }
    
    //Setter
    public void setTrunkCapacity(double trunkCapacity)
    {
        this.trunkCapacity= trunkCapacity;
    }

    @Override
    /*public String toString()
    {
        return String.format("%-20s %-20s %-20.1d %-20.1d", this.getMake(), this.getModel(), 
                this.getMpg(), this.getTrunkCapacity());
    }*/
    
    
    public String toString()
    {
        return this.getMake() + "\n" + this.getModel() + "\n" +
                this.getMpg() + "\n" + this.getTrunkCapacity() + "\n";
    }
    
}
