/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package athletes;

import java.util.Comparator;

/**
 * @author Michael Miller
 * CS1181L-06
 * Instructor: C. Rodabough
 * TA: Steve Betts
 */
public class AthleteNameComparator <T extends Comparable<T>> implements Comparator <Athlete <T>> {
    
    public int compare(Athlete <T> t1, Athlete <T> t2)
    {
        return t1.getName().compareTo(t2.getName());
    }
}
