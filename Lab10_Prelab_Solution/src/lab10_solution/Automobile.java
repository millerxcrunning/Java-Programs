/**
 * Lab 10 pre-lab program for CS1180
 * The purpose of this program is to create a class hierarchy and to illustrate 
 * polymorphism through an ArrayList of objects in various subclasses
 * May 2015
*/
package lab10_solution;

/**
 * @author V. Starkey
 * CS1180L-01
 * Instructor: V. Starkey
 * TA: Colin Leong 
 */
public class Automobile {
    
    private String make;
    private String model;
    
    //constructors
    public Automobile()
    {
        this.make = "unknown";
        this.model = "unknown";
    }
    
    public Automobile(String make, String model)
    {
        this.make = make;
        this.model = model;
    }
   
    /**
     * This sets the make of the automobile
     * @param make
     */
    public void setMake(String make){
       this.make = make;
    }
    
    /**
     * This sets the vehicle model
     * @param model
     */
    public void setModel(String model){
       this.model = model;
    }
    
  
    /**
     * This will return the make of the automobile
     * @return the make
     */
    public String getMake(){
        return make;    
    }
    
    /**
     * This will return the model of the automobile
     * @return the model
     */
    public String getModel(){
        return model;    
    }
  
   
    /**
     * This will include all fields in the Automobile.
     * @return a String consisting of make and model of the Automobile object
     */
    @Override
    public String toString() {
        return make + " " + model;
    }
    
    //end class
}