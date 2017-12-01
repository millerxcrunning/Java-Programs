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
public class GasEngineAuto extends Automobile {
    
    private double mpg;
    
    //Constructor
    public GasEngineAuto()
    {
        super ();
        this.mpg = 0;
    }
    
    //Constructor
    public GasEngineAuto(String make, String model, double mpg)
    {
        super(make, model);
        this.mpg = mpg;
    }
    
    //Getter
    public double getMpg ()
    {
        return this.mpg;
    }
    
    //Setter
    public void setMpg(double mpg)
    {
        this.mpg = mpg;
    }
    
    @Override
    public String toString()
    {
        return this.getMake() + "\n" + this.getModel() + "\n" + this.getMpg() + "\n";
    }
}
