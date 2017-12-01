/*
 * This is Lab 4 for CS1180
 *This lab searches and outputs instances of objects in an ArrayList and practices
 * the use of classes.
 */
package miller_lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Michael Miller
 * CS1180L
 * Instructor: V. Starkey
 * TA: Cogan Shimizu
 */
public class HierarchyOfAutomobiles {

    /**
     * @param args the command line arguments
     * This program reads from multiple input .txt files, and creates objects of 
     * different types with attributes of each type stored with them(using classes, 
     * subclasses, constructors, accessors, mutators, and toString methods then stores
     * the objects and attributes in an ArrayList. This ArrayList is then searched
     * to match the user input and displays all of the objects that match.
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String desiredTypeOfAutomobile;
        
        ArrayList listOfAutomobiles = new ArrayList<>();
        
        fillListOfSedans(listOfAutomobiles);
        fillListOfSUVS(listOfAutomobiles);
        fillListOfElectricAutos(listOfAutomobiles);
        fillListOfHybrids(listOfAutomobiles);
        
        for (int i = 0; i < listOfAutomobiles.size(); i ++)
        {
         System.out.println(listOfAutomobiles.get(i).toString());
        }
        
        System.out.println(String.format("Enter one of these types of automobile:\n"
                + "SUV %10s %12s %10s %18s\n", "Sedan", "Electric", "Hybrid", 
                "GasEngineAuto"));
        
        desiredTypeOfAutomobile = keyboard.nextLine();
        
        displayInstanceOfAutomobile(listOfAutomobiles, desiredTypeOfAutomobile);
        
    }
    
    /**
     * 
     * @param listOfAutomobiles 
     */
    public static void fillListOfSedans(ArrayList listOfAutomobiles)
    {
        Scanner reader = null;
        
        try {
            File inputFile = new File("gas_sedans.txt");
            reader = new Scanner(inputFile);
        } catch (FileNotFoundException ex) {
            System.out.println("Could not open the file 1.");
            System.exit(0);
        }
     
        //This loop fills the ArrayList with the input from the autos.txt file
        for (int i =0; reader.hasNextLine(); i++)
        {
            String make = reader.nextLine();
            String model = reader.nextLine();
            double mpg = reader.nextDouble();
            reader.nextLine();
            double trunkCapacity = reader.nextDouble();
            reader.nextLine();
            Sedan mySedan = new Sedan(make, model, mpg, trunkCapacity);
            
            //This adds the sedan with all the attributes to the ArrayLis.t
            listOfAutomobiles.add(mySedan);
        }  
    }
    
    /**
     * 
     * @param listOfAutomobiles 
     */
    public static void fillListOfSUVS(ArrayList listOfAutomobiles)
    {
        Scanner reader = null;
        
        try {
            File inputFile = new File("gas_SUVs.txt");
            reader = new Scanner(inputFile);
        } catch (FileNotFoundException ex) {
            System.out.println("Could not open the file 2.");
            System.exit(0);
        }
     
        //This loop fills the ArrayList with the input from the autos.txt file
        for (int i =0; reader.hasNextLine(); i++)
        {
            String make = reader.nextLine();
            String model = reader.nextLine();
            double mpg = reader.nextDouble();
            reader.nextLine();
            double cargoCapacity = reader.nextDouble();
            reader.nextLine();
            SUV mySUV = new SUV(make, model, mpg, cargoCapacity);
            
            //This adds the SUV with all the attributes to the ArrayLis.t
            listOfAutomobiles.add(mySUV);
        }
    }
    
    /**
     * 
     * @param listOfAutomobiles 
     */
    public static void fillListOfElectricAutos(ArrayList listOfAutomobiles)
    {
        Scanner reader = null;
        
        try {
            File inputFile = new File("electrics.txt");
            reader = new Scanner(inputFile);
        } catch (FileNotFoundException ex) {
            System.out.println("Could not open the file 3.");
            System.exit(0);
        }
     
        //This loop fills the ArrayList with the input from the autos.txt file
        for (int i =0; reader.hasNextLine(); i++)
        {
            String make = reader.nextLine();
            String model = reader.nextLine();
            double electricRange = reader.nextDouble();
            reader.nextLine();
            double trunkCapacity = reader.nextDouble();
            reader.nextLine();
            ElectricAuto myElectricAuto = new ElectricAuto(make, model, electricRange,
                    trunkCapacity);
            
            //This adds the electricAuto with all the attributes to the ArrayLis.t
            listOfAutomobiles.add(myElectricAuto);
        }
    }
    
    /**
     * 
     * @param listOfAutomobiles 
     */
    public static void fillListOfHybrids(ArrayList listOfAutomobiles)
    {
        Scanner reader = null;
        
        try {
            File inputFile = new File("hybrids.txt");
            reader = new Scanner(inputFile);
        } catch (FileNotFoundException ex) {
            System.out.println("Could not open the file 4.");
            System.exit(0);
        }
     
        //This loop fills the ArrayList with the input from the autos.txt file
        for (int i =0; reader.hasNextLine(); i++)
        {
            String make = reader.nextLine();
            String model = reader.nextLine();
            double electricRange = reader.nextDouble();
            reader.nextLine();
            double trunkCapacity = reader.nextDouble();
            reader.nextLine();
            double mpg = reader.nextDouble();
            reader.nextLine();
                    
            Hybrid myHybrid = new Hybrid(make, model, electricRange, trunkCapacity,
            mpg);
            
            //This adds the hybrid with all the attributes to the ArrayLis.t
            listOfAutomobiles.add(myHybrid);
        }
    }
    
    /**
     * 
     * @param listOfAutomobiles
     * @param desiredTypeOfAutomobile 
     */
    public static void displayInstanceOfAutomobile(ArrayList<Automobile> listOfAutomobiles, 
            String desiredTypeOfAutomobile)
    {
        System.out.println();
        
        //This ensures the user input was one of the required vehicle types.
        if (!desiredTypeOfAutomobile.equalsIgnoreCase("GasEngineAuto") && 
        !desiredTypeOfAutomobile.equalsIgnoreCase("Hybrid") && 
        !desiredTypeOfAutomobile.equalsIgnoreCase("Electric") && 
        !desiredTypeOfAutomobile.equalsIgnoreCase("Sedan") && 
        !desiredTypeOfAutomobile.equalsIgnoreCase("SUV"))
            
            System.out.println("This type of vehicle was not found.");
                                        
        //This searches the arraylist for the instance of the type of vehicle the
        //user entered, then displays all instances of the object if it is in the 
        //ArrayList.
        for (int i = 0; i< listOfAutomobiles.size(); i++)
        {
            //The instance of the automobile
            Automobile a = listOfAutomobiles.get(i);
            
            if (desiredTypeOfAutomobile.equalsIgnoreCase("GasEngineAuto")
                    && listOfAutomobiles.get(i) instanceof GasEngineAuto)
                    //a.getMake().equalsIgnoreCase(desiredTypeOfAutomobile))
                System.out.println(listOfAutomobiles.get(i));
            
            else if (desiredTypeOfAutomobile.equalsIgnoreCase("Hybrid")
                    && listOfAutomobiles.get(i) instanceof Hybrid)
                System.out.println(listOfAutomobiles.get(i));
            
            else if (desiredTypeOfAutomobile.equalsIgnoreCase("Electric")
                    && listOfAutomobiles.get(i) instanceof ElectricAuto)
                System.out.println(listOfAutomobiles.get(i));
            
            else if (desiredTypeOfAutomobile.equalsIgnoreCase("Sedan")
                    && listOfAutomobiles.get(i) instanceof Sedan)
                System.out.println(listOfAutomobiles.get(i));
            
            else if (desiredTypeOfAutomobile.equalsIgnoreCase("SUV")
                    && listOfAutomobiles.get(i) instanceof SUV)
                System.out.println(listOfAutomobiles.get(i));
            
        }
    }
}


