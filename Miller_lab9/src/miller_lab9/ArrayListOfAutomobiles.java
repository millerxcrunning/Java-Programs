/*
 * This is Lab 7 for CS 1180
 *
 */
package miller_lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Michael Miller
 * CS1180L
 * Instructor: V. Starkey
 * TA: Cogan Shimizu
 */
public class ArrayListOfAutomobiles {

    /**
     * 
     */
    public static void main(String[] args) {
              
        Scanner reader = null;
        
        Scanner keyboard = new Scanner(System.in);
        
        //This is the declaration of the variable
        String desiredVehicleMake;
        
        ArrayList <Automobile> listOfAutomobiles = new ArrayList<>();

        fillListOfAutomobiles(reader, listOfAutomobiles);
        
        displayListOfAutomobiles(listOfAutomobiles);
        
        System.out.println("Please enter a vehicle make: ");
        desiredVehicleMake = keyboard.nextLine();
        
        displayDesiredVehicleMake(listOfAutomobiles, desiredVehicleMake);
        
        reader.close();
    }
    
    /**
     * This method opens the autos.txt file and fills the ArrayList with Automobile 
     * objects with make, model, number of cylinders, and estimated MPG
     * @param reader
     * @param listOfAutomobiles 
     */
    public static void fillListOfAutomobiles(Scanner reader, ArrayList listOfAutomobiles)
    {
        try {
            File inputFile = new File("autos.txt");
            reader = new Scanner(inputFile);
        } catch (FileNotFoundException ex) {
            System.out.println("Could not open the file.");
            System.exit(0);
        }
        
        //This loop fills the ArrayList with the input from the autos.txt file
        for (int i =0; reader.hasNext(); i++)
        {
            Automobile a = new Automobile();
            a.setVehicleMake(reader.nextLine());
            a.setVehicleModel(reader.nextLine());
            a.setNumberCylinders(reader.nextInt());
            a.setEstMPG(reader.nextDouble());
            reader.nextLine();
            
            //This adds the automobile with all the attributes to the ArrayLis.t
            listOfAutomobiles.add(a);
        }   
    }
    
    /**
     * This prints out the list of automobiles with the toString method.
     * @param listOfAutomobiles 
     */
    public static void displayListOfAutomobiles(ArrayList listOfAutomobiles)
    {
        System.out.println(" Make\t\tModel\t\tNum of cylinders\t\tEstimated MPG");

        System.out.println(listOfAutomobiles.toString());
    }
    
    /**
     * 
     * @param listOfAutomobiles
     * @param desiredVehicleMake
     * @return 
     */
    public static void displayDesiredVehicleMake(ArrayList listOfAutomobiles,
            String desiredVehicleMake)
    {
        
        for (int i = 0; i < listOfAutomobiles.size(); i++)
        {
            
            if (listOfAutomobiles.get(i).equals(desiredVehicleMake));
            System.out.println(listOfAutomobiles.get(i));
                   //vehicleMake;
                   //listOfAutomobiles.get(i);
        }
    }
            

}

