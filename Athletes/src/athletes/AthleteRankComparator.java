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
public class AthleteRankComparator <T extends Comparable<T>> implements Comparator <Athlete <T>> {
    
    public int compare(Athlete <T> t1, Athlete <T> t2)
    {
        //<T> compare(Athlete <T>, Athlete <T>)
        //{
        //    return <T>.compare(t1.getRank(), t2.getRank())
        //}
        String athlete1Sport = t1.getSport();
        int i = t1.getSport().compareTo(t2.getSport());
        {
            if(i != 0)
            {
                return i;
            }
            else return t1.getRank().compareTo(t2.getRank());

    }
}}
