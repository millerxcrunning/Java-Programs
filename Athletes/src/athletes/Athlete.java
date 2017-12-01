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
public class Athlete <T extends Comparable<T>> implements Comparator <Athlete <T>> {
    
    private String name;
    private String sport;
    private T rank;
    
    public Athlete(String name, String sport, T rank)
    {
    this.name = name;
    this.sport = sport;
    this.rank = rank;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getSport()
    {
        return sport;
    }
    
    public void setSport(String sport)
    {
        this.sport = sport;
    }
    
    public T getRank()
    {
        return rank;
    }
    
    public void setRank(T rank)
    {
        this.rank = rank;
    }
    
    public int compareTo(Athlete athlete1)
    {
        String athlete1Sport = athlete1.getSport();
        int i = this.sport.compareTo(athlete1Sport);
        
        return i;
    }

    @Override
    public int compare(Athlete<T> o1, Athlete<T> o2) { {
        
        int i = o1.getSport().compareTo(o2.getSport());
        {
            if(i != 0)
            {
                //return i;
                if (i > 0)
                {
                    return 1;
                }
                else if (i<0)
                {
                    return -1;
                }
                return -1;
            }
            
            else return o1.getRank().compareTo(o2.getRank());
        }
    }
    }
    
}
