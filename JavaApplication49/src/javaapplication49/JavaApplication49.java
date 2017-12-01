/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49;

/**
 *
 * @author alexisfletes
 */
public class JavaApplication49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] integerArray = new int[4];
        
        for(int i=0; i<=integerArray.length; i++)
        {
            integerArray[i]=i;
        }
        System.out.println(integerArray);
        
    }
    
    public static int numberOfPositiveValues(int [] integerArray)
    {
        int count = 0;
        for(int i: integerArray)
            if (i>0) {
                count ++;
            }
        return count;
    }
}
