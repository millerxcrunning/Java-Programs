/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181lab9a;

/**
 *
 * @author Michael Miller
 */
public class GenericBinarySearch<E extends Comparable<E>> 
{

    public int genericBinarySearch(E[] array, E target, int beginning, int end) 
    {

        if (beginning < end) {

            int middle = (beginning + end) / 2;

            int otherNumber = array[middle].compareTo(target);

            if (otherNumber > 0) 
            {
                return genericBinarySearch(array, target, beginning, middle - 1);
            }

            if (otherNumber < 0) 
            {
                return genericBinarySearch(array, target, middle + 1, end);
            }

            return middle;

        }

        return -1;

    }
}
