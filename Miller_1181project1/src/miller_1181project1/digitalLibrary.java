/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author alexisfletes
 */
public class digitalLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        createLibrary();
    }
    
    public static void createLibrary ()
    {
        ArrayList<Item> library = new ArrayList<>();
        Scanner reader = null;
        try {
            File inputFile = new File("library.txt");
            reader = new Scanner(inputFile);
        } catch (FileNotFoundException ex) {
            System.out.println("Could not open the file.");
            System.exit(0);
        }
        
        //This loop fills the ArrayList with the input from the autos.txt file
        for (int i =0; reader.hasNext(); i++)
        {
            Item a = new Item();
            a.setTitle(reader.nextLine());
            a.setFormat(reader.nextLine());
            a.setOnLoan(Boolean.parseBoolean(reader.nextLine()));
            a.setLoanedTo(reader.nextLine());
            String dateFormat = "dd/MM/yyyy";
            try 
            {
                a.setDateLoaned(new SimpleDateFormat(dateFormat).parse(reader.nextLine()));
            } 
            catch (ParseException ex) 
            {
                Logger.getLogger(digitalLibrary.class.getName()).log(Level.SEVERE, null, ex);
            }
            reader.nextLine();
            
            //This adds the library item with all the attributes to the ArrayList
            library.add(a);
        }   
    }
    
    
}
