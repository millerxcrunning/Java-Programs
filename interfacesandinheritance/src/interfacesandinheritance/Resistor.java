/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesandinheritance;

/**
 *
 * @author Michael Miller
 */
public class Resistor implements PowerDissipation{
    
    private double ohms;
    
    private double watts;
    
    private double tolerance;
    
    
    public Resistor(double ohms, double watts, double tolerance) throws Exception
    {
        this.ohms= ohms;
        this.watts= watts;
        this.tolerance= tolerance;
        
        if (ohms <= 0)
        throw new Exception("Resistance must be greater than 0 ohms.");
        
        if (watts <= 0)
        throw new Exception("Power must be greater than 0 watts.");
        
        if (tolerance <= 0 || tolerance >= 1)
        throw new Exception("The tolerance must be between 0 and 1.");
    }
    
    public double getWatts()
    {
            return watts;
    }
    
    public double getOhms()
    {
        return ohms;
    }
    
    public double getTolerance()
    {
        return tolerance;
    }
    
    public double minResistance()
    {
        return this.ohms - (this.ohms * this.tolerance);
    }
            
    public double maxResistance()
    {
        return this.ohms + (this.ohms * this.tolerance);
    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    /**
     *
     * @param volts
     * @return powerDissipation
     * @throws Exception
     */
    @Override
    public double powerFromVoltageDrop(double volts) throws Exception
    {
        double powerDissipation = volts * volts / this.minResistance();
        
        if (powerDissipation < this.minResistance())
        {
            throw new Exception("The power dissipation exceeds the resistor's"
                    + "power rating.");
        }
        
        return powerDissipation;
    }

    /**
     *
     * @param current
     * @return powerDissipation
     * @throws Exception
     */
    @Override
    public double powerFromCurrentDraw(double current) throws Exception
    {
        double powerDissipation = current * current * this.maxResistance();
        
        if (powerDissipation > this.maxResistance())
        {
            throw new Exception("The power dissipation exceeds the resistor's"
                    + "power rating.");
        }
        
        return powerDissipation;
    }
    
    @Override
    public String toString ()
    {
        return "The resistance is " + this.ohms+ " ohms. The power is " + 
                + this.watts + " watts. The tolerance is " + this.tolerance +
                         ".";     
    }
}
