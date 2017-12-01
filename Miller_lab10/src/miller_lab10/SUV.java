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
public class SUV extends GasEngineAuto{
    
    private double cargoCapacity;
    
    //Constructor
    public SUV()
    {
        super ();
        this.cargoCapacity = 0;
    }
    
    //Constuctor
    public SUV(String make, String model, double mpg, double cargoCapacity)
    {
        super(make, model, mpg);
        this.cargoCapacity = cargoCapacity;
    }
    
    //Getter
    public double getCargoCapacity()
    {
        return cargoCapacity;
    }
    
    //Setter
    public void setCargoCapacity(double cargoCapacity)
    {
        this.cargoCapacity = cargoCapacity;
    }
    
    @Override
    public String toString()
    {
        return this.getMake() + "\n" + this.getModel()+ "\n" + this.getMpg()+ "\n"
                + this.getCargoCapacity() + "\n";
    }
}
