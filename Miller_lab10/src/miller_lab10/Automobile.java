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
public class Automobile {
    
    private String make;
    
    private String model;
   
    public Automobile()
    {
            this.make="unknown";
            this.model="unknown";
    }
    
    public Automobile(String make, String model)
    {
        this.make = make;
        this.model = model;
    }
    
    public String getMake()
    {
        return make;
    }
    public void setMake(String make)
    {
        this.make = make;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public void setModel(String model)
    {
        this.model = model;
    }
    
    @Override
    public String toString()
    {
        return this.make + "\n" + this.model + "\n";
    }
}
