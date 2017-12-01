/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181project1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexisfletes
 */
public class Library {
    
    private Scanner keyboard = new Scanner(System.in);
    
    public Library()
    {
        
    }
    
    public String getDesiredTitle()
    {
        System.out.println("What is the title of the item that was loaned?");
        String desiredTitle = keyboard.nextLine();
        return desiredTitle;
    }
    
    public String getWhoLoaned()
    {
        System.out.println("Who was the title loaned to?");
        String whoLoaned = keyboard.nextLine();
        return whoLoaned;
    }
    public Date getTheDateLoaned()
    {
        System.out.println("What day was it loaned out in dd/MM/yyyy format?");
        String dateFormat = "dd/MM/yyyy";
        Scanner scanner = new Scanner(System.in);
        try 
        {
            return new SimpleDateFormat(dateFormat).parse(scanner.nextLine());
        } 
        catch (ParseException ex) 
        {
            System.out.println("This was not in the right format. The format"
                    + "needs to be dd/MM/yyyy");
        }
    return null;
    }
    
    public void addItem(ArrayList<Item> digitalLibrary)
    {
       Item a = new Item();
       a.setTitle(keyboard.nextLine());
       a.setFormat(keyboard.nextLine());
       a.setOnLoan(Boolean.parseBoolean(keyboard.nextLine()));
       a.setLoanedTo(keyboard.nextLine());
       String dateFormat = "dd/MM/yyyy";
       try 
       {
           a.setDateLoaned(new SimpleDateFormat(dateFormat).parse(keyboard.nextLine()));
       }
        catch (ParseException ex) 
        {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loanItem()
    {
        
    }
    
    public void returnItem()
    {
    
    }
}

