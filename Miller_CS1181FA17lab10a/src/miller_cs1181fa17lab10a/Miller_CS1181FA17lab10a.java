/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_cs1181fa17lab10a;

/**
 *
 * @author Michael Miller
 */
public class Miller_CS1181FA17lab10a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        //Test cases of the selectionSort method are in the Test package
        
    }
    
    public static <T extends Comparable<T>> T[] selectionSort(T[] array)
    {
        int length = array.length;
        
        for (int i = 0; i < length - 1; i++)
	    {
	        int index = i;
	        for (int j = i + 1; j < length; j++)
                {
	            if (array[j].compareTo(array[index]) < 0) 
	                index = j;
                }
	        T smallerNumber = array[index];  
	        array[index] = array[i];
	        array[i] = smallerNumber;
	    }
        return array;
    }
    
}
