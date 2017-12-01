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
public class GenericLinearSearch <E extends Comparable<E>>
{
    
    public int genericLinearSearch(E[] array, E target, int beginning, int end)
    {
        
    int point;
     
     for (point = beginning; point <= end; point++)

     {
          if (array[point].compareTo(target) == 0)

              //Return position

              return point;

     }

     return -1;
    }
}
    
