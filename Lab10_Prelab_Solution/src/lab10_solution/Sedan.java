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
public class Sedan extends GasEngineAuto{
    
    private double trunkCapacity;
    
    //constructors
    public Sedan()
    {
        this.trunkCapacity = 0;
    }
    
    public Sedan(String make, String model, double mpg, double capacity)
    {
        super(make, model, mpg);
        this.trunkCapacity = capacity;
    }

     /**
     * This will return the trunk capacity of the automobile
     * @return the trunkCaqpacity
     */
    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    /**
     * This sets the trunk capacity of the automobile
     * @param trunkCapacity
     */
    public void setTrunkCapacity(double trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }
  
   
    /**
     * This will include all fields in the Sedan.
     * @return a String consisting of make, model, mpg, and trunkCapacity of the Sedan
     */
    @Override
    public String toString() {
        return super.toString() + this.trunkCapacity + " sq. ft. trunk capacity";
    }
    
    //end class
}