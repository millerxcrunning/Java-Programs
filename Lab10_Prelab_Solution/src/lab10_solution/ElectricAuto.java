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
public class ElectricAuto extends Automobile{
    
    private double electricRange;
    private double trunkCapacity;
    
    //constructors
    public ElectricAuto()
    {
        this.electricRange = 0;
        this.trunkCapacity = 0;
    }
    
    public ElectricAuto(String make, String model, double range, double capacity)
    {
        super(make, model);
        this.electricRange = range;
        this.trunkCapacity = capacity;
    }

     /**
     * This will return the electric range of the automobile
     * @return the electric range
     */
    public double getElectricRange() {
        return electricRange;
    }

    /**
     * This sets the electric range of the automobile
     * @param electricRange
     */
    public void setElectricRange(double electricRange) {
        this.electricRange = electricRange;
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
     * This will include all fields in the GasEngineAuto.
     * @return a String consisting of make, model, electtric range and
     *  trunkCapacity of the Automobile object
     */
    @Override
    public String toString() {
        return super.toString() + ", " + this.electricRange + " mile electric range, " 
                + this.trunkCapacity + " sq. ft. trunk capacity";
    }
    
    //end class
}