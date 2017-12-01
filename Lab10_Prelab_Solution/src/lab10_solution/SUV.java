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
public class SUV extends GasEngineAuto{
    
    private double cargoCapacity;
    
    //constructors
    public SUV()
    {
        this.cargoCapacity = 0;
    }
    
    public SUV(String make, String model, double mpg, double capacity)
    {
        super(make, model, mpg);
        this.cargoCapacity = capacity;
    }

     /**
     * This will return the cargo capacity of the automobile
     * @return the cargoCaqpacity
     */
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    /**
     * This sets the cargo capacity of the automobile
     * @param cargoCapacity
     */
    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
  
   
    /**
     * This will include all fields in the SUV.
     * @return a String consisting of make, model, mpg, and cargoCapacity of the Automobile object
     */
    @Override
    public String toString() {
        return super.toString() + this.cargoCapacity + " sq. ft. cargo capacity";
    }
    
    //end class
}