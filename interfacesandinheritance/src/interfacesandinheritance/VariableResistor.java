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
public class VariableResistor extends Resistor{
    
    private double controlSetting;
    
    public VariableResistor(double ohms, double watts, double tolerance, double 
            controlSetting) throws Exception 
    {
        super(ohms, watts, tolerance);
        this.controlSetting = controlSetting;
        
        if (controlSetting < 0 || controlSetting >1)
            throw new IllegalArgumentException("Control setting must be between 0 and 1 inclusive.");
    }
    
    public double getcontrolSetting()
    {
        return controlSetting;
    }
    
    public void setControlSetting(double controlSetting) throws Exception
    {
        if (controlSetting < 0 || controlSetting >1)
            throw new Exception("Control setting must be between 0 and 1 inclusive.");
        
        this.controlSetting = controlSetting;
    }
    
    @Override
    public double getOhms()
    {
        return (super.getOhms() * this.controlSetting);
    }
    
    @Override
    public double minResistance()
    {
        return (super.getOhms() - (super.getOhms() * super.getTolerance()) * 
                this.controlSetting);
    }
            
    @Override
    public double maxResistance()
    {
        return (super.getOhms() + (super.getOhms() * super.getTolerance()) *
                this.controlSetting);
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
    public String toString()
    {
        return super.toString() + "The control setting is " + this.controlSetting 
                + ".";
    }
    
}
