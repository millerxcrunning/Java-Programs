/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package athletes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;


/**
 * @author Michael Miller
 * CS1181L-06
 * Instructor: C. Rodabough
 * TA: Steve Betts
 */
public class Athletes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Athlete> athletes= new ArrayList <>();
        athletes.add(new Athlete("bob", "soccer", 0));
        athletes.add(new Athlete("matt", "baseball", 1));
        athletes.add(new Athlete("mike", "soccer", 2));
        athletes.add(new Athlete("steve", "basketball", 3));
        athletes.add(new Athlete("mark", "soccer", 4));
        
        System.out.println(athletes);
        Collections.sort(athletes);
        
        
        
        
    }
    
}
