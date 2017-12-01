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
public class GasEngineAuto extends Automobile{
    
    private double mpg;
    
    //constructors
    public GasEngineAuto()
    {
        this.mpg = 0;
    }
    
    public GasEngineAuto(String make, String model, double mpg)
    {
        super(make, model);
        this.mpg = mpg;
    }
   
    /**
     * This sets the mpg (miles per gallon) of the automobile
     * @param mpg
     */
    public void setMPG(double mpg){
       this.mpg = mpg;
    }
    
    /**
     * This will return the mpg of the automobile
     * @return the mpg
     */
    public double getMPG(){
        return mpg;    
    }
   
   
    /**
     * This will include all fields in the GasEngineAuto.
     * @return a String consisting of make, model, and mpg of the Automobile object
     */
    @Override
    public String toString() {
        return super.toString() + ", " + this.mpg + " mpg, ";
    }
    
    //end class
}