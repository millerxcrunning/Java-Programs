/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_lab9;

/**
 *
 * 
 */
public class Automobile {

    private String vehicleMake;
    
    private String vehicleModel;
    
    private int numberCylinders;
    
    private double estMPG;
    
    public Automobile()
    {
        this.vehicleMake = "unknown";
        this.vehicleModel = "unknown";
        this.numberCylinders = 0;
        this.estMPG = 0;
    }
    
    public Automobile(String vehicleMake, String vehicleModel)
    {
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
    }
    
    public Automobile(String vehicleMake, String vehicleModel, int numberCylinders, double estMPG)
    {
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.numberCylinders = numberCylinders;
        this.estMPG = estMPG;
    }
    
    /**
     * 
     * @param vehicleMake 
     */
    public void setVehicleMake(String vehicleMake)
    {
        this.vehicleMake = vehicleMake;
    }
    
    /**
     * 
     * @return 
     */
    public String getVehicleMake()
    {
       return vehicleMake; 
    }
    
    /**
     * 
     * @param vehicleModel 
     */
    public void setVehicleModel(String vehicleModel)
    {
        this.vehicleModel = vehicleModel;
    }
    
    /**
     * 
     * @return 
     */
    public String getVehicleModel()
    {
        return vehicleModel;
    }
    
    /**
     * 
     * @param numberCylinders 
     */
    public void setNumberCylinders(int numberCylinders)
    {
        this.numberCylinders = numberCylinders; 
    }
    
    /**
     * 
     * @return 
     */
    public int getNumberCylinders()
    {
        return numberCylinders;
    }
    
    public void setEstMPG(double estMPG)
    {
        this.estMPG = estMPG;
    }
    
    public double getEstMPG()
    {
    return estMPG;    
    }
    
    public String toString()
    {
        return this.getVehicleMake() + " " + this.getVehicleModel() + "."
                + "\n It has " + this.getNumberCylinders() + " cylinders. \n It gets "
                        + this.getEstMPG() + " miles per gallon.\n"; 
    }
}
