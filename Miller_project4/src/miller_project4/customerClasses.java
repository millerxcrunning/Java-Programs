/*
 * This project reads from a file, searches and outputs instances of objects in an ArrayList and practices
 * the use of classes.
 */
package miller_project4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Michael Miller
 * CS1180L
 * Instructor: V. Starkey
 * TA: Cogan Shimizu
 */
public class customerClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        ArrayList<Customer> customerList = new ArrayList();

        readFromFile(customerList);

        System.out.println("Please select one of the following options:");
        System.out.println("1. View entire Customer list");
        System.out.println("2. View Preferred Customers only");
        System.out.println("3. Add a new Customer to the list");
        System.out.println("4. Remover a Customer from the list");
        System.out.println("5. Save updates to file and exit program");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        customerClasses customerClass = new customerClasses();

        int k = 0;
        try {
            k = br.read();
        } catch (IOException ex) {
            Logger.getLogger(customerClasses.class.getName()).log(Level.SEVERE, null, ex);
        }

        customerClass.viewList(customerList);

        customerClass.viewPreferredCustomers(customerList);
        {
            try {
                customerClass.addNewCustomer(customerList);
            } catch (IOException ex) {
                Logger.getLogger(customerClasses.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        {
            try {
                customerClass.removeCustomer(customerList);
            } catch (IOException ex) {
                Logger.getLogger(customerClasses.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println(
                    "Please select one of the following options:");
            System.out.println(
                    "1. View entire Customer list");
            System.out.println(
                    "2. View Preferred Customers only");
            System.out.println(
                    "3. Add a new Customer to the list");
            System.out.println(
                    "4. Remover a Customer from the list");
            System.out.println(
                    "5. Save updates to file and exit program");
            try {
                k = br.read();
            } catch (IOException ex) {
                Logger.getLogger(customerClasses.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

    /**
     *
     * @param custList
     * @throws java.io.FileNotFoundException
     */
    public static void readFromFile(ArrayList<Customer> customerList) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("customer.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(customerClasses.class.getName()).log(Level.SEVERE, null, ex);
        }

        int k = 0;
        try {
            k = fis.read();
        } catch (IOException ex) {
            Logger.getLogger(customerClasses.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (k != -1) {
            String name = "";
            String email = "";
            customerList.add(new Customer());

        }
        try {
            fis.close();
        } catch (IOException ex) {
            Logger.getLogger(customerClasses.class.getName()).log(Level.SEVERE, null, ex);
        }

        Collections.sort(customerList);

    }
/**
 * 
 * @param custList 
 */
    public void viewList(ArrayList<Customer> custList) {
        int size = custList.size();
        System.out.println("The following customers are in the list:");
        for (int i = 0; i < size; i++) {
            System.out.println(custList.get(i));
        }
    }
/**
 * 
 * @param custList 
 */
    public void viewPreferredCustomers(ArrayList<Customer> custList) {
        int size = custList.size();
        System.out.println("The following Preferred Customers are in the list:");
        for (int i = 0; i < size; i++) {
            if (custList.get(i) instanceof Preferred_Customer) {
                System.out.println(custList.get(i));
            }
        }
    }
/**
 * 
 * @param custList
 * @throws IOException 
 */
    public void addNewCustomer(ArrayList<Customer> custList) throws IOException {
        System.out.println("Enter a 'C' to add a Customer or a 'P' to add a Preffered Customer:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        while (!s.equals("C") && !s.equals("P")) {
            System.out.println("You must enter 'C' or 'P'. Please re-enter.");
            s = br.readLine();
        }
        System.out.println("Enter the customer's first name");
        String fname = br.readLine();
        System.out.println("Enter the customer's last name");
        String lname = br.readLine();

        if (s.equals("P")) {
            System.out.println("Enter the customer's email address");
            String email = br.readLine();
            custList.add(new Preferred_Customer(fname, lname, email));
        } else {
            custList.add(new Customer(fname, lname));
        }
        System.out.println("The customer has been added to the list");
        Collections.sort(custList);
    }
/**
 * 
 * @param custList
 * @throws IOException 
 */
    public void removeCustomer(ArrayList<Customer> custList) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the customer's first name");
        String fname = br.readLine();
        System.out.println("Enter the customer's last name");
        String lname = br.readLine();

        int size = custList.size();

        for (int i = 0; i < size; i++) {
            if (custList.get(i).firstName.equals(fname) && custList.get(i).lastName.equals(lname)) {
                custList.remove(i);
                System.out.println("The customer has been removed from the list");
            } else {
                System.out.println("The customer could not be found in the list");
            }
        }
        Collections.sort(custList);
    }
/**
 * 
 * @param custList
 * @throws IOException 
 */
    public void saveAndExit(ArrayList<Customer> custList) throws IOException {
        FileWriter fos = new FileWriter("customer.txt", false);
        int size = custList.size();

        for (int i = 0; i < size; i++) {
            if (custList.get(i) instanceof Preferred_Customer) {
                String pc = "" + custList.get(i);
                String[] pcs = pc.split(" ");
                String[] names = pcs[0].split(",");
                fos.write("P\n" + names[0] + " " + names[1] + "\n" + pcs[1] + "\n");
            } else {
                fos.write("C\n" + custList.get(i).firstName + " " + custList.get(i).lastName + "\n");
            }
        }
        fos.close();
    }
}
