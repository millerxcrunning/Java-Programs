/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1_miller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexisfletes
 */
public class dvdRentalSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner keyboard = new Scanner(System.in);
        
        String format;
        String title;
        String inputFile;
        
        inputFile = keyboard.nextLine();
        File inFile = new File(inputFile);
        Scanner reader;
        try {
            reader = new Scanner(inFile);
        } catch (FileNotFoundException ex) {
            System.out.println("Could not open " + inputFile);
        }
        ArrayList Collection = new ArrayList<>();
         
        
    }
    
}
