/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexcercise_9_13_16;

/**
 *
 * @author alexisfletes
 */
public class InterfaceExcercise_9_13_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        payable [] array;
        array = new payable[4];
        array[0]= new Invoice("Home Depot", "ladder", 29.95);
        array[1]= new Employee("Bob Jones", 10.00, 10);
        array[2]= new Invoice("A.D. Farrow Harley Davidson", "2008 XL1200N Sportster", 15999.00);
        array[3]= new Employee("Barry Bonds", 25.00, 40);
        for (int i=0; i < array.length; i++)
        {
            payable pref = array[i];
            System.out.printf("Paying %s $%.2f.\n", pref.getPayeeInfo(), pref.getPaymentAmount());
        }
                
    }
    
}
