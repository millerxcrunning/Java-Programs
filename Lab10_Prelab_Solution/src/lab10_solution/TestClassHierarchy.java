/**
 * Lab 10 pre-lab program for CS1180
 * The purpose of this program is to create a class hierarchy and to illustrate 
 * polymorphism through an ArrayList of objects in various subclasses
 * May 2015
*/
package lab10_solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author V. Starkey
 * CS1180L-01
 * Instructor: V. Starkey
 * TA: Colin Leong 
 */
public class TestClassHierarchy {

    /**
     * Declares an object for each type of automobile in the hierarchy
     * (sedan, SUV, electric, and hybrid).
     * Tests accessors and mutators for each class.
     * Creates an ArrayList of Automobiles and reads data for each type of vehicle
     * from files; creates an object for each record and stores it in the ArrayList
     * Displays the list
     */
    public static void main(String[] args) {
        
        //test constructors, accessors, and mutators for Sedan
        Sedan sedan1 = new Sedan();        
        sedan1.setMake("Toyota");
        sedan1.setModel("Corolla");
        sedan1.setMPG(33);
        sedan1.setTrunkCapacity(17.3);        
        System.out.println("Make for sedan1: " + sedan1.getMake());
        System.out.println("Model for sedan1: " + sedan1.getModel());
        System.out.println("MPG for sedan1: " + sedan1.getMPG());
        System.out.println("Trunk capacity for sedan1: " + sedan1.getTrunkCapacity());
        System.out.println(sedan1);
        System.out.println();
        
        //test constructors, accessors, and mutators for SUV
        SUV suv1 = new SUV();        
        suv1.setMake("Honda");
        suv1.setModel("CRV");
        suv1.setMPG(30);
        suv1.setCargoCapacity(27.8);        
        System.out.println("Make for suv1: " + suv1.getMake());
        System.out.println("Model for suv1: " + suv1.getModel());
        System.out.println("MPG for suv1: " + suv1.getMPG());
        System.out.println("Carago capacity for suv1: " + suv1.getCargoCapacity());
        System.out.println(suv1);
        System.out.println();
        
        //test constructors, accessors, and mutators for ElectricAuto
        ElectricAuto electricAuto1 = new ElectricAuto();        
        electricAuto1.setMake("Nissan");
        electricAuto1.setModel("Leaf");
        electricAuto1.setElectricRange(24);
        electricAuto1.setTrunkCapacity(84);        
        System.out.println("Make for elecricAuto1: " + electricAuto1.getMake());
        System.out.println("Model for elecricAuto1: " + electricAuto1.getModel());
        System.out.println("ElectricRange for elecricAuto1: " + electricAuto1.getElectricRange());
        System.out.println("Trunk capacity for elecricAuto1: " + electricAuto1.getTrunkCapacity());
        System.out.println(electricAuto1);
        System.out.println();
        
        //test constructors, accessors, and mutators for Hybrid
        Hybrid hybrid1 = new Hybrid();        
        hybrid1.setMake("Toyota");
        hybrid1.setModel("Prius");
        hybrid1.setMPG(50);
        hybrid1.setElectricRange(11);
        hybrid1.setTrunkCapacity(21.6);        
        System.out.println("Make for hybrid1: " + hybrid1.getMake());
        System.out.println("Model for hybrid1: " + hybrid1.getModel());
        System.out.println("ElectricRange for hybrid1: " + hybrid1.getElectricRange());
        System.out.println("MPG for hybrid1: " + hybrid1.getMPG());
        System.out.println("Trunk capacity for hybrid1: " + hybrid1.getTrunkCapacity());
        System.out.println(hybrid1);
        System.out.println();
        
    }
   
}
